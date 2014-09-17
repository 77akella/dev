package ua.com.aacc.webChat.admin.war.mBean;

import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.com.aacc.webChat.admin.war.mBean.util.JsfUtil;
import ua.com.aacc.webChat.admin.war.mBean.util.UTF8Control;
import ua.com.aacc.webChat.ejb.AdministratorFacade;
import ua.com.aacc.webChat.ejb.GlobalConfigurationSingletonFacade;
import ua.com.aacc.webChat.entity.Administrator;
import ua.com.aacc.webChat.entity.enums.GlobalConfigurationPropertyEnum;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.*;


@ManagedBean(name = "administratorController")
@SessionScoped
public class AdministratorController implements Serializable {

    private static final Logger logger = LoggerFactory.getLogger(AdministratorController.class);
    private Administrator current;
    private Administrator selected;
    private List<String> toTranslate = new ArrayList<String>();
    private String oldPassword = "";
    private String newPassword = "";
    private LazyDataModel<Administrator> lazyModel = null;
    @EJB
    private AdministratorFacade ejbFacade;

    public AdministratorController() {
    }

    public void loadData() {
        lazyModel = new LazyDataModel<Administrator>() {
            @Override
            public List<Administrator> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {

                logger.info("[AdministratorController]  Loading data from lazyModel : sortField='{}', sortOrder='{}', filters: {}, pageSize", new Object[]{sortField, sortOrder.name(), filters, pageSize});
                List<Administrator> result = new ArrayList<Administrator>();

                try {
                    result = getFacade().load(first, pageSize, sortField, sortOrder == SortOrder.DESCENDING, filters);
                    lazyModel.setRowCount(getFacade().loadCount(filters));
                    lazyModel.setPageSize(pageSize);
                } catch (Exception e) {
                    logger.error("[AdministratorController]  Error Loading data from lazyModel: ", e);
                    JsfUtil.addErrorMessage(e, "PersistenceErrorOccured");
                }

                return result;
            }

            @Override
            public void setRowIndex(int rowIndex) {
        /*
         * The following is in ancestor (LazyDataModel):
         * this.rowIndex = rowIndex == -1 ? rowIndex : (rowIndex % pageSize);
         */
                if (rowIndex == -1 || getPageSize() == 0) {
                    super.setRowIndex(-1);
                } else
                    super.setRowIndex(rowIndex % getPageSize());
            }
        };
    }

    public LazyDataModel<Administrator> getLazyModel() {
        if (lazyModel == null) {
            loadData();
        }
        return lazyModel;
    }

    /**
     * Format the duration of a media in a string of two consecutive units to
     * best express the duration of a media, e.g.:
     * <ul>
     * <li>1 hr 42 min</li>
     * <li>2 min 25 sec</li>
     * <li>10 sec</li>
     * <li>0 sec</li>
     * </ul>
     *
     * @param durationObj a Float, Double, Integer, Long or String instance
     *                    representing a duration in seconds
     * @return the formatted string
     */
    public String formatDuration(Object durationObj) {
        double duration = 0.0;
        if (durationObj instanceof Float) {
            duration = ((Float) durationObj).doubleValue();
        } else if (durationObj instanceof Double) {
            duration = ((Double) durationObj).doubleValue();
        } else if (durationObj instanceof Integer) {
            duration = ((Integer) durationObj).doubleValue();
        } else if (durationObj instanceof Long) {
            duration = ((Long) durationObj).doubleValue();
        } else if (durationObj instanceof String) {
            duration = Double.parseDouble((String) durationObj);
        }
        if (duration == 0.0) {
            return "";
        }
        int days = (int) Math.floor(duration / (24 * 60 * 60));
        int hours = (int) Math.floor(duration / (60 * 60)) - days * 24;
        int minutes = (int) Math.floor(duration / 60) - days * 24 * 60 - hours
                * 60;
        int seconds = (int) Math.floor(duration) - days * 24 * 3600 - hours
                * 3600 - minutes * 60;

        int[] components = {days, hours, minutes, seconds};
        String[] units = {"days", "hours", "minutes", "seconds"};
        String[] defaultLabels = {"d", "hr", "min", "sec"};

        String representation = null;
        for (int i = 0; i < components.length; i++) {
            if (components[i] != 0 || i == components.length - 1) {
                String i18nLabel = translate("duration_"
                        + units[i]);
                if (i18nLabel == null) {
                    i18nLabel = defaultLabels[i];
                }
                representation = String.format("%d %s", components[i],
                        i18nLabel);
                if (i < components.length - 1) {
                    i18nLabel = translate("duration_"
                            + units[i + 1]);
                    if (i18nLabel == null) {
                        i18nLabel = defaultLabels[i + 1];
                    }
                    representation += String.format(" %d %s",
                            components[i + 1], i18nLabel);
                }
                break;
            }
        }
        return representation;
    }

    public String translate(String text) {
        if (text == null || text.trim().isEmpty()) {
            return "";
        }
        if (text.trim().contains(" ")) {
            return text;
        }
        try {
//            if (getCurrent() != null) {
//                return ResourceBundle.getBundle("/" + current.getLang()).getString(text);
//            } else {
            return ResourceBundle.getBundle("/bundleRUS", new UTF8Control()).getString(text);
//            }
        } catch (Exception e) {
            if (!toTranslate.contains(text + "=")) {
                toTranslate.add(text + "=");
            }
            return text;
        }
    }

//    public String accountGroupsToString(List<AdministratorGroup> ags) {
//        if (ags == null) {
//            return null;
//        }
//        StringBuilder ret = new StringBuilder();
//        for (AdministratorGroup ac : ags) {
//            ret.append(translate(ac.getName())).append("\n");
//        }
//        return ret.toString();
//    }

    public boolean isFailedTranslationsRendered() {
        return !toTranslate.isEmpty();
    }

    public String getToTransLate() {
        StringBuilder sb = new StringBuilder();
        for (String line : toTranslate) {
            sb.append(line).append("\n");
        }
        return sb.toString();
    }

    public Administrator getCurrent() {
        if (current == null) {
            try {
                current = ejbFacade.findByName(((HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest()).getUserPrincipal().getName());
            } catch (Exception e) {
                logger.error("Can't get current user. Logging out.", e);
                logout();
            }

        }
        return current;
    }

    public String getStyleTheme() {
        if (current == null || current.getStyleTheme() == null || current.getStyleTheme().isEmpty()) {
            return "aristo";
        } else {
            return current.getStyleTheme();
        }
    }

    protected Administrator findByName(String userName) {
        return getFacade().findByName(userName);
    }

    protected Administrator updatePass(Administrator administrator, String newPass) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        Administrator aaccSystem = new Administrator();
        aaccSystem.setUserName("AACC System");
        administrator.setPassword(JsfUtil.hash(administrator.getUserName(), newPass));
        return getFacade().edit(administrator, aaccSystem);
    }

    public void logout() {
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        logger.info("[AdministratorController] logout");
        if (session != null) {
            logger.info("Session is null.");
            session.invalidate();
        }
        FacesContext.getCurrentInstance().getApplication().getNavigationHandler().handleNavigation(FacesContext.getCurrentInstance(), null, "/redirect.jsp");
    }

    public Administrator getSelected() {
        return selected;
    }

    public void setSelected(Administrator selected) {
        this.selected = selected;
    }

    private AdministratorFacade getFacade() {
        return ejbFacade;
    }

    public String prepareList() {
        recreateModel();
        return "Administrators";
    }

    public void prepareCreate() {
        logger.info("[AdministratorController] I am in prepareCreate");
        selected = new Administrator();
    }

    public void prepareEdit() {
        logger.info("[AdministratorController] I am in prepareEdit");
        selected = (Administrator) getLazyModel().getRowData();
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public boolean isAdministratorsEmpty() {
        return ejbFacade.isAdministratorsEmpty();
//        return true;
    }

    public void createAdminAdministrator() {
        try {
            assert ejbFacade.isAdministratorsEmpty();
            Administrator adminAdministrator = new Administrator();
//            adminAdministrator.setLang(LanguageEnum.RUS);
            adminAdministrator.setUserName("artem");
            adminAdministrator.setPassword(JsfUtil.hash("artem", "P@ssw0rd"));
            logger.error("PASSWORD is '{}'", adminAdministrator.getPassword());
//            List<AdministratorGroup> accountGroups = new ArrayList<AdministratorGroup>();
//            AdministratorGroup initGroups = new AdministratorGroup();
//            initGroups.setName("admin");
//            accountGroups.add(initGroups);
//            adminAdministrator.setAdministratorGroups(accountGroups);
            ejbFacade.create(adminAdministrator);
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "PersistenceErrorOccured");
        }
    }

    public String updateCurrent() {
        try {
            if (JsfUtil.hash(current.getUserName(), oldPassword).equals(current.getPassword())) {
                current.setModDate(new Date());
                if (!newPassword.isEmpty()) {
                    current.setPassword(JsfUtil.hash(current.getUserName(), newPassword));
                }
                getFacade().edit(current, current);
                JsfUtil.addSuccessMessage("YourAdministratorUpdated");
                return null;
            } else {
                //Reset to default settings
                current = null;
                JsfUtil.addErrorMessage("WrongPassword");
                return null;
            }
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "PersistenceErrorOccured");
            return null;
        }
    }

    public String updateSelected() {
        try {
//            for (AdministratorGroup ag : current.getAdministratorGroups()) {
//                if (ag.getName().equals("admin")) {
            if (selected == null) {
                JsfUtil.addErrorMessage("PersistenceErrorOccured");
                return null;
            }

            if (selected.getPassword() == null || selected.getPassword().isEmpty()) {
                JsfUtil.addErrorMessage("PleaseSetPassword");
                return null;
            }
            selected.setModDate(new Date());
            selected.setPassword(JsfUtil.hash(selected.getUserName(), selected.getPassword()));
            getFacade().edit(selected, current);
            JsfUtil.addSuccessMessage("AdministratorUpdated");
            return prepareList();
//                }
//            }
//            JsfUtil.addErrorMessage("PermissionDenied");
//            return null;
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "PersistenceErrorOccured");
            return null;
        }
    }

    public void prepareDestroy() {
        selected = (Administrator) getLazyModel().getRowData();
    }

    public String destroy() {
        performDestroy();
        recreateModel();
        return prepareList();
    }

    private void performDestroy() {
        try {
            //current.setDeleted(true);
            //getFacade().edit(current);
//            for (AdministratorGroup ag : current.getAdministratorGroups()) {
//                if (ag.getName().equals("admin")) {
            getFacade().remove(selected);
            JsfUtil.addSuccessMessage(translate("AdministratorDeleted"));
            return;
//                }
//            }
//            JsfUtil.addErrorMessage(translate("PermissionDenied"));
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, translate("PersistenceErrorOccured"));
        }
    }

    private void recreateModel() {
        lazyModel = null;
        loadData();
    }

    public SelectItem[] getItemsStyleThemesSelect() {
        Map<String, String> themes = new TreeMap<>();
        themes.put("Afterdark", "afterdark");
        themes.put("Afternoon", "afternoon");
        themes.put("Afterwork", "afterwork");
        themes.put("Aristo", "aristo");
        themes.put("Black-Tie", "black-tie");
        themes.put("Blitzer", "blitzer");
        themes.put("Bluesky", "bluesky");
//        themes.put("Bootstrap", "bootstrap");
        themes.put("Casablanca", "casablanca");
        themes.put("Cupertino", "cupertino");
        themes.put("Cruze", "cruze");
        themes.put("Dark-Hive", "dark-hive");
        themes.put("Dot-Luv", "dot-luv");
        themes.put("Eggplant", "eggplant");
        themes.put("Excite-Bike", "excite-bike");
        themes.put("Flick", "flick");
        themes.put("Glass-X", "glass-x");
        themes.put("Hot-Sneaks", "hot-sneaks");
        themes.put("Home", "home");
        themes.put("Humanity", "humanity");
        themes.put("Le-Frog", "le-frog");
        themes.put("Midnight", "midnight");
        themes.put("Mint-Choc", "mint-choc");
        themes.put("Overcast", "overcast");
        themes.put("Pepper-Grinder", "pepper-grinder");
        themes.put("Redmond", "redmond");
        themes.put("Rocket", "rocket");
        themes.put("Sam", "sam");
        themes.put("Smoothness", "smoothness");
        themes.put("South-Street", "south-street");
        themes.put("Start", "start");
        themes.put("Sunny", "sunny");
        themes.put("Swanky-Purse", "swanky-purse");
        themes.put("Trontastic", "trontastic");
        themes.put("UI-Darkness", "ui-darkness");
        themes.put("UI-Lightness", "ui-lightness");
        themes.put("Vader", "vader");
        SelectItem[] items = new SelectItem[themes.size()];
        int i = 0;
        for (Map.Entry<String, String> theme : themes.entrySet()) {
            items[i++] = new SelectItem(theme.getValue(), theme.getKey());
        }
        return items;
    }

    @EJB
    private GlobalConfigurationSingletonFacade configurationFacade;
    private String aaccHostName;
    private String refreshPeriod;
    private Long closedRcSkillsetNotInService;
    private Long closedRcNotWorkTime;
    private String externalAddress;

    public String getAaccHostName() {
        if(aaccHostName==null){
            aaccHostName=configurationFacade.getAaccHostName();
        }
        return aaccHostName;
    }

    public void setAaccHostName(String aaccHostName) {
        this.aaccHostName = aaccHostName;
    }

    public String getRefreshPeriod() {
        if(refreshPeriod==null){
            refreshPeriod=configurationFacade.getRefreshPeriod();
        }
        return refreshPeriod;
    }

    public void setRefreshPeriod(String refreshPeriod) {
        this.refreshPeriod = refreshPeriod;
    }

    public Long getClosedRcSkillsetNotInService() {
        if(closedRcSkillsetNotInService ==null){
            try{
            closedRcSkillsetNotInService = Long.valueOf(configurationFacade.getProperty(GlobalConfigurationPropertyEnum.SkillsetNotInService));
            }catch (Throwable e){
                closedRcSkillsetNotInService =1L;
            }
        }
        return closedRcSkillsetNotInService;
    }

    public void setClosedRcSkillsetNotInService(Long closedRcSkillsetNotInService) {
        this.closedRcSkillsetNotInService = closedRcSkillsetNotInService;
    }

    public Long getClosedRcNotWorkTime() {
        if(closedRcNotWorkTime ==null){
            try{
                closedRcNotWorkTime = Long.valueOf(configurationFacade.getProperty(GlobalConfigurationPropertyEnum.NotWorkTime));
            }catch (Throwable e){
                closedRcNotWorkTime =2L;
            }
        }
        return closedRcNotWorkTime;
    }

    public void setClosedRcNotWorkTime(Long closedRcNotWorkTime) {
        this.closedRcNotWorkTime = closedRcNotWorkTime;
    }

    public String getExternalAddress() {
        if(externalAddress==null){
            externalAddress=configurationFacade.getProperty(GlobalConfigurationPropertyEnum.ExternalAddress);
        }
        return externalAddress;
    }

    public void setExternalAddress(String externalAddress) {
        this.externalAddress = externalAddress;
    }

//    public String getAllowedAddressPattern(){
//        return "127.0.0.1";
//    }

    public void updateConfigs() {
        try{
            configurationFacade.setProperty(GlobalConfigurationPropertyEnum.AACC_HOSTNAME,aaccHostName);
            configurationFacade.setProperty(GlobalConfigurationPropertyEnum.CHAT_HISTORY_REFRESH_PERIOD,refreshPeriod);
            configurationFacade.setProperty(GlobalConfigurationPropertyEnum.SkillsetNotInService, closedRcSkillsetNotInService.toString());
            configurationFacade.setProperty(GlobalConfigurationPropertyEnum.NotWorkTime, closedRcNotWorkTime.toString());
            configurationFacade.setProperty(GlobalConfigurationPropertyEnum.ExternalAddress, externalAddress);
            JsfUtil.addSuccessMessage("RecordUpdated");
        }catch (Exception e){
            JsfUtil.addErrorMessage(translate("PersistenceErrorOccured"));
        }
    }

    @FacesConverter(forClass = Administrator.class, value = "accountConverter")
    public static class AdministratorGroupConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            AdministratorController controller = (AdministratorController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "accountController");
            return controller.ejbFacade.find(getKey(value));
        }

        Long getKey(String value) {
            Long key;
            key = Long.valueOf(value);
            return key;
        }

        String getStringKey(String value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Administrator) {
                Administrator o = (Administrator) object;
                return getStringKey(o.getId());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + AdministratorController.class.getName());
            }
        }
    }
}
