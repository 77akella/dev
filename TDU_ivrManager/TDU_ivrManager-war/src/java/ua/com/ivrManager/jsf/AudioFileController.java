package ua.com.ivrManager.jsf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.model.SelectItem;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.com.ivrManager.ejb.entity.AudioFile;
import ua.com.ivrManager.ejb.session.AudioFileFacade;
import ua.com.ivrManager.jsf.util.JsfUtil;

@ManagedBean(name = "audioFileController")
@SessionScoped
public class AudioFileController implements Serializable {

    private static final Logger logger = LoggerFactory.getLogger(AudioFileController.class);
    private AudioFile current;
    private LazyDataModel<AudioFile> lazyModel = null;
    @EJB
    private ua.com.ivrManager.ejb.session.AudioFileFacade ejbFacade;

    public AudioFileController() {
    }

    public void loadData() {
        lazyModel = new LazyDataModel<AudioFile>() {

            @Override
            public List<AudioFile> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {

                logger.info("[AudioFileController] Loading data from lazyModel : sortField='{}'| sortOrder='{}'| filters: '{}'", new Object[]{sortField, sortOrder.name(), filters});
                List<AudioFile> result = new ArrayList<AudioFile>();

                try {
                    result = getFacade().load(first, pageSize, sortField, sortOrder == SortOrder.DESCENDING, filters);
                    lazyModel.setRowCount(getFacade().loadCount(filters));
                    lazyModel.setPageSize(pageSize);
                } catch (Exception e) {
                    logger.error("[AudioFileController] Error Loading data from lazyModel: ", e);
                    FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: " + e.getMessage(), e.getLocalizedMessage());
                    FacesContext.getCurrentInstance().addMessage(null, msg);
                }
                return result;
            }
        };
    }

    public LazyDataModel<AudioFile> getLazyModel() {
        if (lazyModel == null) {
            loadData();
        }
        return lazyModel;
    }

    public AudioFile getSelected() {
        if (current == null) {
            current = new AudioFile();
        }
        return current;
    }

    private AudioFileFacade getFacade() {
        return ejbFacade;
    }

    public void handleAudioUpload(FileUploadEvent event) {
        try {
//            UploadedFile file=event.getFile();
//            file.setFile(IOUtils.toByteArray(Basic.convertAudio(new BufferedInputStream(event.getFile().getInputstream()))));
            getSelected().setFileData(event.getFile().getContents());
            getSelected().setName(FilenameUtils.removeExtension(event.getFile().getFileName()));
            getSelected().setContentType(event.getFile().getContentType());
            getSelected().setContentLength((int) event.getFile().getSize());
            getSelected().setModDate(new Date());
            JsfUtil.addSuccessMessage(event.getFile().getFileName() + " " + JsfUtil.translate("File_isUploaded"));
        } catch (Exception e) {
            logger.error("[AudioFileController] handleAudioUpload: ", e);
            JsfUtil.addErrorMessage(e, JsfUtil.translate("File_ErrorUpload " + event.getFile().getFileName()));
        }
    }

    public String formatFileSize(int size) {
        return FileUtils.byteCountToDisplaySize(size);
    }

    public String prepareList() {
        recreateModel();
        return "List";
    }

    public void prepareCreate() {
        current = new AudioFile();
    }

    public void prepareEdit() {
        current = (AudioFile) getLazyModel().getRowData();
    }

    public String update() {
        try {
            getFacade().edit(current);
            JsfUtil.addSuccessMessage("RecordUpdated");
            return "View";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "PersistenceErrorOccured");
            return null;
        }
    }

    public void prepareDestroy() {
        current = (AudioFile) getLazyModel().getRowData();
    }

    public String destroy() {
        performDestroy();
        recreateModel();
        return "List";
    }

    private void performDestroy() {
        try {
            current.setDeleted(true);
            getFacade().edit(current);
            JsfUtil.addSuccessMessage("RecordDeleted");
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "PersistenceErrorOccured");
        }
    }

    private void recreateModel() {
        lazyModel = null;
    }

    public SelectItem[] getItemsAvailableSelect() {
        List<AudioFile> entities = getFacade().findAll();
        SelectItem[] items = new SelectItem[entities.size()];
        int i = 0;
        for (AudioFile cf : entities) {
            items[i++] = new SelectItem(cf.getId(), cf.getName());
        }
        return items;
    }
//
//    public SelectItem[] getItemsAvailableSelectAudio() {
//        List<AudioFile> entities = getFacade().findAllAudio();
//        SelectItem[] items = new SelectItem[entities.size()];
//        int i = 0;
//        for (AudioFile cf : entities) {
//            items[i++] = new SelectItem(cf.getId(), cf.getName());
//        }
//        return items;
//    }

    @FacesConverter(forClass = AudioFile.class)
    public static class AudioFileConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            AudioFileController controller = (AudioFileController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "audioFileController");
            return controller.ejbFacade.find(getKey(value));
        }

        java.lang.Long getKey(String value) {
            java.lang.Long key;
            key = Long.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Long value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof AudioFile) {
                AudioFile o = (AudioFile) object;
                return getStringKey(o.getId());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + AudioFileController.class.getName());
            }
        }
    }
}
