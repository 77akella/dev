package ua.com.ivrManager.jsf;

import java.io.Serializable;
import java.util.*;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.model.SelectItem;
import org.primefaces.event.DragDropEvent;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;
import org.primefaces.model.TreeNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.com.ivrManager.ejb.entity.Attribute;
import ua.com.ivrManager.ejb.entity.CallFlow;
import ua.com.ivrManager.ejb.entity.CallFlowNode;
import ua.com.ivrManager.ejb.session.CallFlowFacade;
import ua.com.ivrManager.jsf.util.JsfUtil;
import ua.com.ivrManager.util.BasicVXML;

@ManagedBean(name = "callFlowController")
@SessionScoped
public class CallFlowController implements Serializable {

    private static final Logger logger = LoggerFactory.getLogger(CallFlowController.class);
    private CallFlow current;
    private LazyDataModel<CallFlow> lazyModel = null;
    @EJB
    private ua.com.ivrManager.ejb.session.CallFlowFacade ejbFacade;
    @EJB
    private ua.com.ivrManager.ejb.session.AudioFileFacade f;
    private TreeNode root;
    private TreeNode selectedNode;
    private TreeNode prevSelectedNode;
    private TreeNode bufferNode;
    private static final Comparator<CallFlowNode> comparatorByAttrValue = new Comparator<CallFlowNode>() {

        @Override
        public int compare(CallFlowNode o1, CallFlowNode o2) {
            return o1.getAttributes().get(0).getVal().compareTo(o2.getAttributes().get(0).getVal());
        }
    };
    private static final Comparator<Attribute> comparatorByAttrType = new Comparator<Attribute>() {

        @Override
        public int compare(Attribute o1, Attribute o2) {
            return o1.getType().compareTo(o2.getType());
        }
    };

    public CallFlowController() {
    }

    public void loadData() {
        lazyModel = new LazyDataModel<CallFlow>() {

            @Override
            public List<CallFlow> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {

                logger.info("[CallFlowController] Loading data from lazyModel : sortField='{}'| sortOrder='{}'| filters: '{}'", new Object[]{sortField, sortOrder.name(), filters});
                List<CallFlow> result = new ArrayList<CallFlow>();

                try {
                    result = getFacade().load(first, pageSize, sortField, sortOrder == SortOrder.DESCENDING, filters);
                    lazyModel.setRowCount(getFacade().loadCount(filters));
                    lazyModel.setPageSize(pageSize);
                } catch (Exception e) {
                    logger.error("[CallFlowController] Error Loading data from lazyModel: ", e);
                    FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error: " + e.getMessage(), e.getLocalizedMessage());
                    FacesContext.getCurrentInstance().addMessage(null, msg);
                }

                return result;
            }
        };
    }

    public LazyDataModel<CallFlow> getLazyModel() {
        if (lazyModel == null) {
            loadData();
        }
        return lazyModel;
    }

    public String getIcon(String type) {
        if (type.isEmpty()) {
            return "";
        }
        return JsfUtil.translate("NodeIcon_" + type);
    }

    public String getName(CallFlowNode node) {
        if (node == null || node.getType() == null) {
            return "";
        }
        try {
            if (node.getType().equals(BasicVXML.TYPE_BASIC_MENU_OPTION_NAME)) {
                return node.getAttributes().get(0).getVal();
            }
//            if(node.getType().equals(BasicVXML.TYPE_BASIC_GOTO_NAME)){
//                List<CallFlowNode> list = nodePrimaryToList(null);
//                for(CallFlowNode cfn:list){
//                    logger.info("[CallFlowController] getName: [node="+node+",attr"+node.getAttributes()+" , cfn="+cfn);
//                    if(node.getAttributes().get(0).getVal()!=null&&!node.getAttributes().get(0).getVal().isEmpty()
//                            &&
//                            node.getAttributes().get(0).getVal().equals(cfn.getType()+"_"+cfn.getFlowCountId())
//                            ){
//                        return cfn.getName();
//                    }
//                }
//            }
            if (node.getType().equals(BasicVXML.TYPE_BASIC_WRAPUP_NAME) && !node.getAttributes().get(0).getVal().isEmpty()) {
                return getFacade().findWrapUpCode(Long.valueOf(node.getAttributes().get(0).getVal())).getName();
            }
        } catch (Exception e) {
            logger.warn("[CallFlowController] getName:", e);
        }
        return node.getName();
    }

    public String tanslateHelp(Attribute attr) {
        if (attr == null || selectedNode == null) {
            return "";
        }
        return JsfUtil.translate("help_" + ((CallFlowNode) selectedNode.getData()).getType() + "_" + attr.getName());
    }

    public boolean isEmptyRendered(String end) {
        return end.equals(BasicVXML.TYPE_BASIC_END_NAME);
    }

    public boolean isAttrTimeoutRendered(String type) {
        return type.equals(BasicVXML.ATTR_TYPE_TIMEOUT);
    }

    public boolean isAttrCountRendered(String type) {
        return type.equals(BasicVXML.ATTR_TYPE_COUNT);
    }

    public boolean isAttrDtmfRendered(String type) {
        return type.equals(BasicVXML.ATTR_TYPE_DTMF);
    }

    public boolean isAttrAudioRendered(String type) {
        return type.equals(BasicVXML.ATTR_TYPE_AUDIO);
    }

    public boolean isAttrAudioRowRendered(Attribute a) {
        return a.getType().equals(BasicVXML.ATTR_TYPE_AUDIO);
    }

    public void onAudioChange() {
        try {
            if (((CallFlowNode) selectedNode.getData()).getName() == null || ((CallFlowNode) selectedNode.getData()).getName().isEmpty()) {
                String audioName = "";
                for (Attribute a : ((CallFlowNode) selectedNode.getData()).getAttributes()) {
                    if (a.getName().equals(BasicVXML.ATTRIBUTE_AUDIO_PROMPT) && (a.getVal() != null)) {
                        audioName = f.find(Long.valueOf(a.getVal())).getName();
                    }
                }
                ((CallFlowNode) selectedNode.getData()).setName(audioName);
            }
        } catch (Exception e) {
        }
    }

    public boolean isAttrTextRendered(String type) {
        return type.equals(BasicVXML.ATTR_TYPE_TEXT);
    }

    public boolean isAttrGotoRendered(String type) {
        return type.equals(BasicVXML.ATTR_TYPE_ID);
    }

    public boolean isAttrWrapUpCodeRendered(String type) {
        return type.equals(BasicVXML.ATTR_TYPE_WRAPUP_CODE);
    }

    public boolean isAttrTextAreaRendered(String type) {
        return type.equals(BasicVXML.ATTR_TYPE_TEXTAREA);
    }

    public boolean isAttrBundleLanguageRendered(String type) {
        return type.equals(BasicVXML.ATTR_TYPE_LANGUAGE);
    }

    public boolean isAttrBundleMoneyType(String type) {
        return type.equals(BasicVXML.ATTR_TYPE_MONEY) && (!getBundleLanguageSelected().isEmpty());
    }

    private String getBundleLanguageSelected() {
        CallFlowNode cfn = (CallFlowNode) selectedNode.getData();
        for (Attribute a : cfn.getAttributes()) {
            if (a.getType().equals(BasicVXML.ATTR_TYPE_LANGUAGE) && (a.getVal() != null)) {
                return a.getVal();
            }
        }
        return "";
    }

//    public void setAttrTextArea(String text){
//        for(Attribute a:((CallFlowNode) selectedNode.getData()).getAttributes()){
//            if(a.getType().equals(BasicVXML.ATTR_TYPE_TEXTAREA)){
//                a.setVal(text.replace("\"", "\\'"+"\\'").replace("'", "\\'").replace("<", "{").replace(">", "}"));
//            }
//        }
//    }
//
//    public String getAttrTextArea(){
//        for(Attribute a:((CallFlowNode) selectedNode.getData()).getAttributes()){
//            if(a.getType().equals(BasicVXML.ATTR_TYPE_TEXTAREA)){
//                return a.getVal().replace("\\'"+"\\'","\"").replace("\\'","'").replace("{","<").replace("}",">");
//            }
//        }
//        return "";
//    }
    public List<SelectItem> getSelectItemsGoto() {
        List<CallFlowNode> list = nodePrimaryToList(null);
        List<SelectItem> options = new ArrayList<SelectItem>();
        for (CallFlowNode cfn : list) {
            options.add(new SelectItem(cfn.getType() + "_" + cfn.getFlowCountId(), (cfn.getName() == null ? "" : cfn.getName()) + " [" + JsfUtil.translate(cfn.getType()) + "]"));
        }
        return options;
    }

    public SelectItem[] getSelectItemsBundleLanguage() {
        SelectItem[] options = new SelectItem[BasicVXML.BUNDLE_LANGUAGES.length];
        for (int i = 0; i < options.length; i++) {
            options[i] = new SelectItem(BasicVXML.BUNDLE_LANGUAGES[i], JsfUtil.translate(BasicVXML.BUNDLE_LANGUAGES[i]));
        }
        return options;
    }

    public SelectItem[] getSelectItemsBundleMoneyType() {
        SelectItem[] options = new SelectItem[BasicVXML.BUNDLE_MONEY_TYPE.length];
        for (int i = 0; i < options.length; i++) {
            options[i] = new SelectItem(BasicVXML.BUNDLE_MONEY_TYPE[i], JsfUtil.translate(BasicVXML.BUNDLE_MONEY_TYPE[i] + "_" + getBundleLanguageSelected()));
        }
        return options;
    }

    public List<CallFlowNode> nodePrimaryToList(CallFlowNode node) {
        try {
            if (node == null) {
                node = convertTreeToNodeRecursively(root);
            }
            List<CallFlowNode> list = new ArrayList<CallFlowNode>();
            for (CallFlowNode cfn : node.getChildren()) {
                if (BasicVXML.TYPES_BASIC_PRIMARY.contains(cfn.getType()) && !cfn.getType().equals(BasicVXML.TYPE_BASIC_GOTO_NAME)) {
                    list.add(cfn);
                }
                list.addAll(nodePrimaryToList(cfn));
            }
            return list;
        } catch (Exception e) {
            logger.error("[CallFlowController] nodePrimaryToList: node=" + node.toString(), e);
            return new ArrayList<CallFlowNode>();
        }
    }

    public void removeEmptyNodes(TreeNode node) {
        try {
            if (((CallFlowNode) node.getData()).getType().equals(BasicVXML.TYPE_BASIC_END_NAME)) {
                return;
            }

            for (ListIterator<TreeNode> iTree = node.getChildren().listIterator(); iTree.hasNext();) {
                TreeNode tn = iTree.next();
                if (((CallFlowNode) tn.getData()).getType().equals(BasicVXML.TYPE_BASIC_END_NAME)) {
                    iTree.remove();
                }
            }
        } catch (Exception e) {
            logger.warn("[CallFlowController] removeEmptyNodes ", e);
        }

    }

    public void copyNode() {
        this.bufferNode = this.selectedNode;
        JsfUtil.addSuccessMessage("Copyed");
    }

    public void pasteNode() {
        selectedNode.getChildren().add(bufferNode);
        setSelectedNode(this.bufferNode);
        selectedNode.getParent().getChildren().add(selectedNode);
        JsfUtil.addSuccessMessage("Pasted");
    }

    public void deleteNode() {
        selectedNode.getChildren().clear();
        logger.info("[CallFlowController] deleteNode: before Delete selectedNode.getParent()'{}'", selectedNode.getParent());
        boolean remove = ((CallFlowNode) selectedNode.getParent().getData()).getChildren().remove((CallFlowNode) selectedNode.getData());
        logger.info("[CallFlowController] remove='{}'", remove);
        logger.info("[CallFlowController] selectedNode.getParent().getChildren().remove(selectedNode)='{}'", selectedNode.getParent().getChildren().remove(selectedNode));
        logger.info("[CallFlowController] deleteNode: after Delete selectedNode.getParent()'{}'", selectedNode.getParent());
        selectedNode.setParent(null);
        setSelectedNode(root);
        JsfUtil.addSuccessMessage("Node_Deleted");
    }

    public void onNodeDrop(DragDropEvent event) {
        try {
            logger.info("[CallFlowController] onNodeDrop ---- dropped '{}'", event.toString());
            String droppedType = event.getData().toString();
            CallFlowNode newNode = BasicVXML.editMode(
                    new CallFlowNode(getLastId()), droppedType, current.getEditMode());
            TreeNode newDropped = new DefaultTreeNode(newNode, getSelectedNode());
            logger.info("[CallFlowController] created new node  type='{}', vxmlId='{}'", new Object[]{newNode.getType(), newNode.getFlowCountId()});
//            if(((CallFlowNode)newDropped.getData()).getType().equals(BasicVXML.TYPE_BASIC_MENU_OPTION_NAME)){
////                List<String> existingOptions=new ArrayList<String>();
////                for(CallFlowNode options:((CallFlowNode)getSelectedNode().getData()).getChildren()){
////                    for(Attribute dtmf:options.getAttributes()){
////                        if(dtmf.getName().equals(BasicVXML.ATTRIBUTE_DTMF_OPTION)&&(dtmf.getVal()!=null&&!dtmf.getVal().isEmpty())){
////                            existingOptions.add(dtmf.getVal());
////                        }
////                    }
////                }
//                String newOption=BasicVXML.ATTR_TYPE_DTMF_VALUES.get(
//                        BasicVXML.ATTR_TYPE_DTMF_VALUES.indexOf(
//                            ((CallFlowNode)getSelectedNode().getData()).getChildren().get(
//                                ((CallFlowNode)getSelectedNode().getData()).getChildren().size()-1)
//                            .getAttributes().get(0).getVal()));
//                ((CallFlowNode)newDropped.getData()).getAttributes().get(0).setVal(newOption);
//            }

            removeEmptyNodes(getSelectedNode());
            removeEmptyNodes(getPrevSelectedNode());

            if (((CallFlowNode) getSelectedNode().getData()).getMaxChilds() > getSelectedNode().getChildCount()) {
                TreeNode empty = new DefaultTreeNode(
                        BasicVXML.editMode(new CallFlowNode(getLastId()),
                        BasicVXML.TYPE_BASIC_END_NAME,
                        current.getEditMode()),
                        getSelectedNode());
                empty.setSelectable(false);
            } else {
                TreeNode empty = new DefaultTreeNode(
                        BasicVXML.editMode(new CallFlowNode(getLastId()),
                        BasicVXML.TYPE_BASIC_END_NAME,
                        current.getEditMode()),
                        newDropped);
                empty.setSelectable(false);
                selectedNode.setSelected(false);
                selectedNode = newDropped;
                selectedNode.setSelected(true);
                newDropped.setExpanded(true);
            }
        } catch (Exception e) {
            logger.error("[CallFlowController] onNodeDrop", e);
        }
    }

    public TreeNode getRoot() {
        return root;
    }

    private TreeNode getPrevSelectedNode() {
        if (prevSelectedNode == null) {
            return getSelectedNode();
        } else {
            return prevSelectedNode;
        }
    }

    public TreeNode getSelectedNode() {
        if (selectedNode != null) {
            Collections.sort(((CallFlowNode) selectedNode.getData()).getAttributes(), comparatorByAttrType);
        }
        return selectedNode;
    }

    public void setSelectedNode(TreeNode selectedNode) {
        if (selectedNode == null) {
            return;
        }
        try {
            this.selectedNode.setSelected(false);
            this.prevSelectedNode = this.selectedNode;
            this.selectedNode = selectedNode;
            this.selectedNode.setExpanded(true);
            removeEmptyNodes(this.selectedNode);
            removeEmptyNodes(prevSelectedNode);
            if (((CallFlowNode) this.selectedNode.getData()).getMaxChilds() > this.selectedNode.getChildCount()) {
                TreeNode empty = new DefaultTreeNode(
                        BasicVXML.editMode(new CallFlowNode(current.getLastFlowCountId()),
                        BasicVXML.TYPE_BASIC_END_NAME,
                        current.getEditMode()),
                        this.selectedNode);
                empty.setSelectable(false);
            }
        } catch (Exception e) {
            logger.warn("[CallFlowController] setSelectedNode ", e);
        } finally {
            logger.info("[CallFlowController] selected node '{}'", this.selectedNode);
        }

    }

//    public List<Attribute> setSelectedNodeAttributes(){
//        Collections.sort(, f);
//    }
    public TreeNode getBufferNode() {
        return bufferNode;
    }

    public void setBufferNode(TreeNode bufferNode) {
        this.bufferNode = bufferNode;
    }

//    public void displaySelectedSingle(ActionEvent event) {
//        if(selectedNode != null) {
//            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Selected", selectedNode.getData().toString());
//            FacesContext.getCurrentInstance().addMessage(null, message);
//        }
//    }
    public CallFlowNode convertTreeToNodeRecursively(TreeNode treeNode) {
        try {
            removeEmptyNodes(treeNode);
            CallFlowNode ret = (CallFlowNode) treeNode.getData();
            if (treeNode == root) {
                ret.setParentCallFlow(current);
            }
            List<CallFlowNode> newChilds = new ArrayList<CallFlowNode>();
            for (TreeNode tn : treeNode.getChildren()) {
                CallFlowNode node = (CallFlowNode) tn.getData();
                if (node.getFlowCountId() == 0) {
                    FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN, "During Converting found node with id=0", "Please, check");
                    FacesContext.getCurrentInstance().addMessage(null, message);
                }
                //                logger.info("[CallFlowController] ------------Processing node "+node.getType()+" [VXMLid="+node.getFlowCountId()+"]");
                CallFlowNode tmpNode = convertTreeToNodeRecursively(tn);
                tmpNode.setParent(ret);
                newChilds.add(tmpNode);
            }
            ret.setChildren(newChilds);
            return ret;
        } catch (Exception e) {
            logger.error("[CallFlowController] convertTreeToNodeRecursively: treeNode=" + treeNode, e);
            return null;
        }
    }

    public static TreeNode setVXMLNodesRecursively(TreeNode root, CallFlowNode cfn, TreeNode parent, CallFlow current) {
        if (parent == null) {
            root = new DefaultTreeNode(BasicVXML.editMode(cfn, cfn.getType(), current.getEditMode()), null);
            root.setExpanded(true);
            parent = root;
        }
        if (cfn.getType().equals(BasicVXML.TYPE_BASIC_MENU_NAME)) {
            Collections.sort(cfn.getChildren(), comparatorByAttrValue);
        }
        for (CallFlowNode node : cfn.getChildren()) {
            if (node.getFlowCountId() == 0) {
                continue;
            }
            CallFlowNode cfnForTree = BasicVXML.editMode(node, node.getType(), current.getEditMode());
            cfn.setChildren(new ArrayList<CallFlowNode>());

            TreeNode tnTmp = new DefaultTreeNode(cfnForTree, parent);
            tnTmp.setExpanded(true);
            root = setVXMLNodesRecursively(root, node, tnTmp, current);
        }
        return root;
    }

    public TreeNode getTreeNodeRoot(CallFlow callFlow) {
        root = setVXMLNodesRecursively(null, callFlow.getFlowNode(), null, callFlow);
        return root;
    }

    public int getLastId() {
        current.setLastFlowCountId(current.getLastFlowCountId() + 1);
        return current.getLastFlowCountId();
    }

    public CallFlow getSelected() {
        if (current == null) {
            current = new CallFlow();
        }
        return current;
    }

    public void setSelected(CallFlow current) {
        this.current = current;
    }

    private CallFlowFacade getFacade() {
        return ejbFacade;
    }

    public String prepareList() {
        recreateModel();
        return "List";
    }

    public String prepareCreate() {
        logger.info("[CallFlowController] I am in prepareCreate");
        current = new CallFlow();
        root = new DefaultTreeNode(
                BasicVXML.editMode(new CallFlowNode(getLastId()), BasicVXML.TYPE_BASIC_ROOT_NAME, current.getEditMode()), null);
        TreeNode empty = new DefaultTreeNode(
                BasicVXML.editMode(new CallFlowNode(getLastId()), BasicVXML.TYPE_BASIC_END_NAME, current.getEditMode()), root);
        empty.setSelectable(false);
        selectedNode = root;
        prevSelectedNode = root;
        return "Edit";
    }
//
//        public String prepareCreateInWin() {
//        logger.info("[CallFlowController] I am in prepareCreate");
//        current = new CallFlow();
//        root = new DefaultTreeNode(
//                BasicVXML.editMode(new CallFlowNode(getLastId()), BasicVXML.TYPE_BASIC_ROOT_NAME, current.getEditMode())
//                , null);
//        TreeNode empty = new DefaultTreeNode(
//                BasicVXML.editMode(new CallFlowNode(getLastId()), BasicVXML.TYPE_BASIC_END_NAME, current.getEditMode())
//                , root);
//        empty.setSelectable(false);
//        selectedNode=root;
//        return "createCallFlowWin";
//    }

    public String prepareEdit() {
        logger.info("[CallFlowController] I am in prepareEdit");
        current = (CallFlow) getLazyModel().getRowData();
        root = setVXMLNodesRecursively(root, current.getFlowNode(), null, current);
        selectedNode = root;
        return "Edit";
    }

    public String update() {
        try {
            current.setFlowNode(convertTreeToNodeRecursively(root));
            current.setModDate(new Date());
            //Check for data. Some vasrs may have id==null
            BasicVXML.generateVXML(current);
            //Now data entered currectly. There is no vars with id==null.
            logger.info("[CallFlowController] Update: vxml='{}'", BasicVXML.generateVXML(current));
            current = getFacade().edit(current);
            //Generate VXML
            current.setVxmlText(BasicVXML.generateVXML(current));
            current = getFacade().edit(current);
            JsfUtil.addSuccessMessage("RecordUpdated");
            return prepareList();
        } catch (Exception e) {
            logger.error("[CallFlowController] update: " + e.getMessage(), e);
            JsfUtil.addErrorMessage(e, "PersistenceErrorOccured");
            return null;
        }
    }

    public void prepareDestroy() {
        current = (CallFlow) getLazyModel().getRowData();
    }

    public String destroy() {
        performDestroy();
        recreateModel();
        return prepareList();
    }

    private void performDestroy() {
        try {
            current.setDeleted(true);
            getFacade().edit(current);
            JsfUtil.addSuccessMessage("CallFlowDeleted");
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "PersistenceErrorOccured");
        }
    }

    private void recreateModel() {
        lazyModel = null;
    }

    public SelectItem[] getItemsAvailableSelect() {
        List<CallFlow> entities = getFacade().findAll();
        SelectItem[] items = new SelectItem[entities.size()];
        int i = 0;
        for (CallFlow cf : entities) {
            items[i++] = new SelectItem(cf, cf.getName());
        }
        return items;
    }

    public SelectItem[] getItemsAvailableSelectDelAny() {
        List<CallFlow> entities = getFacade().findAllDelAny();
        SelectItem[] items = new SelectItem[entities.size()];
        int i = 0;
        for (CallFlow cf : entities) {
            items[i++] = new SelectItem(cf, cf.isDeleted() ? (cf.getName() + " *") : cf.getName());
        }
        return items;
    }

    @FacesConverter(forClass = CallFlow.class, value = "callFlowConverter")
    public static class CallFlowControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            CallFlowController controller = (CallFlowController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "callFlowController");
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
            if (object instanceof CallFlow) {
                CallFlow o = (CallFlow) object;
                return getStringKey(o.getId());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + CallFlowController.class.getName());
            }
        }
    }

    @FacesConverter(forClass = CallFlowNode.class, value = "callFlowNodeConverter")
    public static class CallFlowNodeConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            CallFlowController controller = (CallFlowController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "callFlowController");
            return controller.ejbFacade.findCallFlowNode(getKey(value));
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
//            if((object instanceof String)&&((String) object).isEmpty()){
//                return null;
//            }

            if (object instanceof CallFlowNode) {
                CallFlowNode o = (CallFlowNode) object;
                return getStringKey(o.getId());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + CallFlowController.class.getName());
            }
        }
    }
}
