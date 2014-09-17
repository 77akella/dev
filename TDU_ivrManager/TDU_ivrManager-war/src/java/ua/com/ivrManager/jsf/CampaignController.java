package ua.com.ivrManager.jsf;

import java.io.Serializable;
import java.util.*;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.model.SelectItem;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;
import org.primefaces.model.TreeNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.com.ivrManager.ejb.entity.*;
import ua.com.ivrManager.ejb.session.CampaignFacade;
import ua.com.ivrManager.jsf.util.JsfUtil;

@ManagedBean(name = "campaignController")
@SessionScoped
public class CampaignController implements Serializable {
    private static final Logger logger = LoggerFactory.getLogger(CampaignController.class);
    private Campaign current;
    private LazyDataModel<Campaign> lazyModel = null;
    @EJB
    private CampaignFacade ejbFacade;

    private String incomNumber="";
    private int tempVarId=0;

    public static final String CALL_BUSY="BUSY";
    public static final String CALL_NO_ANSWER="No_Answer";
    public static final String CALL_NOT_IN_SERVICE="Not_In_Service";

    public static final String MAIL_SENT="Mail_Sent";
    public static final String MAIL_NOT_SENT="Mail_Not_Sent";

    public static final String ACTION_TYPE_NOACTION="noAction";
    public static final String ACTION_TYPE_CALL="call";
    public static final String ACTION_TYPE_MAIL="email";

    private TreeNode root=null;
    private TreeNode selectedNode;

    private int actionCounter=1;

    public CampaignController() {
    }

    public String getIncomNumber() {
        return incomNumber;
    }

    public void setIncomNumber(String incomNumber) {
        this.incomNumber = incomNumber;
    }

    public boolean canAddNumber(){
        if(incomNumber==null||incomNumber.trim().isEmpty()){
            return false;
        }
        for(PhoneNumber in:current.getIncommingNumbers()){
            if(in.getNumber().equals(incomNumber.trim())){
                return false;
            }
        }
        return true;
    }

    public void addNumber(){
        logger.info( "[CampaignController] addNumber: incomNumber='{}'", incomNumber);
        PhoneNumber number = new PhoneNumber();
        number.setNumber(incomNumber.trim());
        incomNumber="";
        current.getIncommingNumbers().add(number);
    }

    public boolean canRemoveNumber(){
        if(incomNumber==null||incomNumber.isEmpty()){
            return false;
        }
        return true;
    }

    public void removeNumber(){

        for (Iterator<PhoneNumber> iter = current.getIncommingNumbers().iterator(); iter.hasNext(); ) {
            PhoneNumber in = iter.next();
            if(in.getNumber().equals(incomNumber)){
                iter.remove();
            }
        }
        incomNumber=null;
    }

    public void loadData() {
        lazyModel = new LazyDataModel<Campaign>() {

            @Override
            public List<Campaign> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, String> filters) {

                logger.info( "[CampaignController] Loading data from lazyModel : sortField='{}'| sortOrder='{}'| filters: '{}'", new Object[]{sortField, sortOrder.name(), filters});
                List<Campaign> result = new ArrayList<Campaign>();
                try {
                    result = getFacade().load(first, pageSize, sortField, sortOrder==SortOrder.DESCENDING, filters);
                    lazyModel.setRowCount(getFacade().loadCount(filters));
                    lazyModel.setPageSize(pageSize);
                } catch (Exception e) {
                    logger.error("[CampaignController] Error Loading data from lazyModel: ",e);
                    JsfUtil.addErrorMessage(e, "PersistenceErrorOccured");
                }
                return result;
            }
        };
    }
    public LazyDataModel<Campaign> getLazyModel() {
        if(lazyModel==null){
            loadData();
        }
        return lazyModel;
    }

    public Campaign getSelected() {
        if (current == null) {
            current = new Campaign();
        }
        return current;
    }

    public TreeNode getSelectedNode() {
        return selectedNode;
    }

    public void setSelectedNode(TreeNode selectedNode) {
        if(this.selectedNode!=null) this.selectedNode.setSelected(false);
        this.selectedNode = selectedNode;
        this.selectedNode.setSelected(true);
    }

    public String getNodeName(Object node){
        if(node instanceof String){
            String actionNodeName = (String) node;
            if(actionNodeName.equalsIgnoreCase(CALL_BUSY)||
                    actionNodeName.equalsIgnoreCase(CALL_NOT_IN_SERVICE)||
                    actionNodeName.equalsIgnoreCase(CALL_NO_ANSWER)||
                    actionNodeName.equalsIgnoreCase(MAIL_SENT)||
                    actionNodeName.equalsIgnoreCase(MAIL_NOT_SENT)){
                return JsfUtil.translate("Campaign_Action_IF");
            }else{
                return JsfUtil.translate("Campaign_Action")+" "+actionNodeName;
            }
        }
        if(node instanceof ActionNode){
            String actionNodeName = ((ActionNode) node).getName();
            return JsfUtil.translate("Campaign_Action")+" "+actionNodeName;
        }else{
            return node.toString();
        }
    }

    public String getNodeType(Object node){
        if(node instanceof ActionNode){
            ActionNode actionNode = (ActionNode) node;
            return "Campaign_ActionType_"+actionNode.getType();
        }else{
            return node.toString();
        }
    }


    public TreeNode getRoot() {
        if(root==null){
            root=new DefaultTreeNode("root", null);
        }
        if(root.isLeaf()){
            addChildAction(root,ACTION_TYPE_CALL);
        }
        return root;
    }

    public void addChildAction(TreeNode parent,String type){
        logger.info( "[CampaignController] addChildAction: parent='{}', type='{}'", new Object[]{parent.toString(), type});
        ActionNode actionNode=new ActionNode();
        actionNode.setParent(current);
        if((parent!=root)&& (parent.getData() instanceof ActionNode) ){
            actionNode.setParentAction(((ActionNode) parent.getData()));
//            if(type.equals(ACTION_TYPE_CALL)){
                if(getSelectedNode().toString().equals(CALL_BUSY)){
                    ((ActionNode) parent.getData()).setBusyAction(actionNode);
                    TreeNode newActionNode = new DefaultTreeNode(actionNode, getSelectedNode());
                    setSelectedNode(newActionNode);
                    setSelectedNodeType(type);
                }
                if(getSelectedNode().toString().equals(CALL_NOT_IN_SERVICE)){
                    ((ActionNode) parent.getData()).setNisAction(actionNode);
                    TreeNode newActionNode = new DefaultTreeNode(actionNode, getSelectedNode());
                    setSelectedNode(newActionNode);
                    setSelectedNodeType(type);
                }
                if(getSelectedNode().toString().equals(CALL_NO_ANSWER)){
                    ((ActionNode) parent.getData()).setNaAction(actionNode);
                    TreeNode newActionNode = new DefaultTreeNode(actionNode, getSelectedNode());
                    setSelectedNode(newActionNode);
                    setSelectedNodeType(type);
                }
//            }
//            if(type.equals(ACTION_TYPE_MAIL)){
                if(getSelectedNode().toString().equals(MAIL_SENT)){
                    ((ActionNode) parent.getData()).setMailSentAction(actionNode);
                    TreeNode newActionNode = new DefaultTreeNode(actionNode, getSelectedNode());
                    setSelectedNode(newActionNode);
                    setSelectedNodeType(type);
                }
                if(getSelectedNode().toString().equals(MAIL_NOT_SENT)){
                    ((ActionNode) parent.getData()).setMailNotSentAction(actionNode);
                    TreeNode newActionNode = new DefaultTreeNode(actionNode, getSelectedNode());
                    setSelectedNode(newActionNode);
                    setSelectedNodeType(type);
                }
//            }
        }else{
            TreeNode newActionNode = new DefaultTreeNode(actionNode, parent);
            setSelectedNode(newActionNode);
            setSelectedNodeType(type);
        }

    }

    public void addAction(){
        logger.info( "[CampaignController] addAction: to parent: '{}'", getSelectedNode().getParent());
        addChildAction(getSelectedNode().getParent(), ACTION_TYPE_CALL);
    }

    public boolean isRemoveActionDesibled(){
        return getSelectedNode().getParent().equals(root);
    }

    public void removeAction(){
        try {
            logger.info( "[CampaignController] removeAction for node '{}'", getSelectedNode());
            selectedNode.getChildren().clear();
            ((ActionNode) selectedNode.getData()).setBusyAction(null);
            ((ActionNode) selectedNode.getData()).setNaAction(null);
            ((ActionNode) selectedNode.getData()).setNisAction(null);
            ((ActionNode) selectedNode.getData()).setMailNotSentAction(null);
            ((ActionNode) selectedNode.getData()).setMailSentAction(null);
            String type= selectedNode.getParent().toString();
            if(type.equals(CALL_BUSY)){
                ((ActionNode) selectedNode.getParent().getParent().getData()).setBusyAction(null);
            }
            if(type.equals(CALL_NOT_IN_SERVICE)){
                ((ActionNode) selectedNode.getParent().getParent().getData()).setNisAction(null);
            }
            if(type.equals(CALL_NO_ANSWER)){
                ((ActionNode) selectedNode.getParent().getParent().getData()).setNaAction(null);
            }
            if(type.equals(MAIL_NOT_SENT)){
                ((ActionNode) selectedNode.getParent().getParent().getData()).setMailNotSentAction(null);
            }
            if(type.equals(MAIL_SENT)){
                ((ActionNode) selectedNode.getParent().getParent().getData()).setMailSentAction(null);
            }
            selectedNode.getParent().getChildren().remove(selectedNode);
            selectedNode.setParent(null);

            setSelectedNode(selectedNode.getParent());
        } catch (Exception e) {
            logger.error("[CampaignController] removeAction",e);
        }

    }

    public boolean isActionNode(){
        return (getSelectedNode() != null)&&(getSelectedNode().getData() instanceof ActionNode);
    }

    public boolean isCallActionNode(){
        return (getSelectedNode() != null)&&(getSelectedNode().getData() instanceof ActionNode)&&(((ActionNode) getSelectedNode().getData()).getType().equals(ACTION_TYPE_CALL));
    }

    public boolean isMailActionNode(){
        return (getSelectedNode() != null)&&(getSelectedNode().getData() instanceof ActionNode)&&(((ActionNode) getSelectedNode().getData()).getType().equals(ACTION_TYPE_MAIL));
    }

    public String getSelectedNodeType(){
        return ((ActionNode) getSelectedNode().getData()).getType();
    }

    public void setSelectedNodeType(String type){
        logger.info( "[CampaignController] called setSelectedNodeType, type='{}'", type);
        if(((ActionNode) getSelectedNode().getData()).getType().equals(type)){
            logger.info( "[CampaignController] getSelectedNode().getData()).getType().equals(type), type='{}'", type);
            return;
        }
        getSelectedNode().getChildren().clear();


        if(type.equals(ACTION_TYPE_NOACTION)){
            ((ActionNode) getSelectedNode().getData()).setName(type+" "+actionCounter++);
            ((ActionNode) getSelectedNode().getData()).setType(type);
            return;
        }

        if(type.equals(ACTION_TYPE_CALL)){
            ((ActionNode) getSelectedNode().getData()).getVars().clear();
            ((ActionNode) getSelectedNode().getData()).getVars().add(new Var("phone", "phone", "", true, tempVarId++));
            ((ActionNode) getSelectedNode().getData()).setName(type+" "+actionCounter++);
            ((ActionNode) getSelectedNode().getData()).setType(type);
            TreeNode Busy =new DefaultTreeNode(CALL_BUSY, getSelectedNode());
            TreeNode NoAnswer =new DefaultTreeNode(CALL_NO_ANSWER, getSelectedNode());
            TreeNode NotInService =new DefaultTreeNode(CALL_NOT_IN_SERVICE, getSelectedNode());
        }

        if(type.equals(ACTION_TYPE_MAIL)){
            ((ActionNode) getSelectedNode().getData()).getVars().clear();
            ((ActionNode) getSelectedNode().getData()).getVars().add(new Var("toAddress", "mail", "", true, tempVarId++));
            ((ActionNode) getSelectedNode().getData()).setName(type+" "+actionCounter++);
            ((ActionNode) getSelectedNode().getData()).setType(type);
            TreeNode mailSent =new DefaultTreeNode(MAIL_SENT, getSelectedNode());
            TreeNode mailNotSent =new DefaultTreeNode(MAIL_NOT_SENT, getSelectedNode());
        }
        getSelectedNode().setExpanded(true);
    }

    public void calculateVarMapping(){
        if(current.getContactList()==null){
            return;
        }
        logger.info("[CampaignController] calculateVarMapping: starting");
//        List<CampVarMap> currentCampVarMaps=new ArrayList<CampVarMap>();
//        current.getCampVarMaps().clear();
        List<Var> vars= new ArrayList<Var>();
        if(current.isOutgoing()){
                current.setOutAction(((ActionNode) root.getChildren().get(0).getData()));
        }
        if(current.getOutAction()!=null&&current.isOutgoing()){
            vars.addAll(current.getOutAction().getVarsRecursively());
            logger.info( "[CampaignController] calculateVarMapping: current.isOutgoing()=true; vars='{}'", vars);
        }
        if(current.getIncommingCallFlow()!=null&&current.isIncomming()){
            vars.addAll(current.getIncommingCallFlow().getFlowNode().getVarsRecursively());
            logger.info( "[CampaignController] calculateVarMapping: current.isIncomming()=true; vars='{}'", vars);
        }
        for(Var var:vars){
//            logger.info("[CampaignController] selected ContactList is "+getSelected().getContactList());
            logger.info( "[CampaignController] calculateVarMapping: processing var='{}'", var.toString());
            if(var.isValueFromContactList()){
                if(!mapContains(var, current.getContactList())){
                    logger.info( "[CampaignController] calculateVarMapping: added: var='{}' conList='{}'", new Object[]{var.getName(), current.getContactList().getName()});
                    current.getCampVarMaps().add(new CampVarMap(var, current.getContactList(), current));
                }
            }
        }
//        current.setCampVarMaps(currentCampVarMaps);
    }

    public boolean mapContains(Var var, ContactList contactsList){
        for(CampVarMap mapping:current.getCampVarMaps()){
            if(mapping.getContactList().equals(contactsList)&&mapping.getVar().equals(var)){
                return true;
            }
        }
        return false;
    }

    public SelectItem[] itemsContactListNames(String[] cln){
        try {
            logger.info( "[CampaignController] getContactListNames: cln='{}'", cln);
        if(cln!=null&&cln.length>0){
            SelectItem[] si=new SelectItem[cln.length];
            for(int i=0; i<cln.length; i++){
                si[i]=new SelectItem(i, cln[i]);
            }
            return si;
        }else{
            SelectItem[] si=new SelectItem[1];
            si[0]=new SelectItem("-1", "None", "This Contact List doesn't have records", true);
            return si;
        }
        } catch (Exception e) {
            logger.error("[CampaignController] itemsContactListNames",e);
            return null;
        }

    }

    public List<ContactList> getAllContactLists(){
        return getFacade().findAllContactList();
    }

    private CampaignFacade getFacade() {
        return ejbFacade;
    }

    public String prepareList() {
        recreateModel();
        return "List";
    }

    public void prepareStart(){
        try{
            current = (Campaign) getLazyModel().getRowData();
            for(CampVarMap vm:current.getCampVarMaps()){
                if(vm.getConListColumn()==-1){
                    JsfUtil.addErrorMessage("Variable_mapping_not_set_for",vm.getVar().getName(),"");
                    return;
                }
            }
            if(current.isIncomming()&&current.getIncommingCallFlow()==null){
                JsfUtil.addErrorMessage("Campaign_do_not_have_Incomming_Call_Flow");
                return;
            }
            getFacade().run(current);

            JsfUtil.addSuccessMessage("Campaign",current.getName(),"campaignHasBeenStarted");
        }catch(Exception e){
            JsfUtil.addErrorMessage(e, "PersistenceErrorOccured");
        }
    }

    public void prepareStop(){
        current=null;
        try{
            logger.info("[CampaignController] prepareStop:");
            current = (Campaign) getLazyModel().getRowData();
        }catch(Exception e){
            JsfUtil.addErrorMessage(e, "PersistenceErrorOccured");
        }
    }

    public void stop(){
        try{
            logger.info( "[CampaignController] Stop: '{}'", current.getName());
            getFacade().stop(current);
            JsfUtil.addSuccessMessage("Campaign",current.getName(),"campaignHasBeenStopped");
        }catch(Exception e){
            JsfUtil.addErrorMessage(e, "PersistenceErrorOccured");
        }
    }

    public void ActionNodeToTreeNode(TreeNode node,ActionNode an){
        if(an==null){
            root=null;
            return;
        }
        actionCounter++;
        TreeNode newActionNode=new DefaultTreeNode(an, node);
        newActionNode.setExpanded(true);
        if(an.getType().equals(ACTION_TYPE_CALL)){
            TreeNode Busy =new DefaultTreeNode(CALL_BUSY, newActionNode);
            if(an.getBusyAction()!=null){
                ActionNodeToTreeNode(Busy, an.getBusyAction());
            }
            TreeNode NoAnswer =new DefaultTreeNode(CALL_NO_ANSWER, newActionNode);
            if(an.getNaAction()!=null){
                ActionNodeToTreeNode(NoAnswer, an.getNaAction());
            }
            TreeNode NotInService =new DefaultTreeNode(CALL_NOT_IN_SERVICE, newActionNode);
            if(an.getNisAction()!=null){
                ActionNodeToTreeNode(NotInService, an.getNisAction());
            }
        }
        if(an.getType().equals(ACTION_TYPE_MAIL)){
            TreeNode MailSent =new DefaultTreeNode(MAIL_SENT, newActionNode);
            if(an.getMailSentAction()!=null){
                ActionNodeToTreeNode(MailSent, an.getMailSentAction());
            }
            TreeNode MailNotSent =new DefaultTreeNode(MAIL_NOT_SENT, newActionNode);
            if(an.getMailNotSentAction()!=null){
                ActionNodeToTreeNode(MailNotSent, an.getMailNotSentAction());
            }
        }
    }

    public String prepareCreate() {
        current = new Campaign();
        actionCounter=1;
        root=null;
        return "Edit";
    }

    public String prepareEdit() {
        current = (Campaign) getLazyModel().getRowData();
        actionCounter=1;
        root=new DefaultTreeNode("root", null);
        ActionNodeToTreeNode(root,current.getOutAction());
        if(root!=null&&root.getChildren().size()>0){
            setSelectedNode(root.getChildren().get(0));
        }
        return "Edit";
    }

    public String update() {
        try {
            if(current.isOutgoing()){
                current.setOutAction(((ActionNode) root.getChildren().get(0).getData()));
            }
            for(CampVarMap cvm:current.getCampVarMaps()){
                if(cvm.getConListColumn()==null||cvm.getConListColumn()==-1){
                    throw new IllegalArgumentException("Please, set mapping value to Variable "+cvm.getVar().getName()+", Contact List "+cvm.getContactList().getName());
                }
            }
            current.setModDate(new Date());
            getFacade().edit(current);
            JsfUtil.addSuccessMessage("RecordUpdated");
            recreateModel();
            return "List";
        } catch (Exception e) {
            logger.error("[CampaignController] update():",e);
            JsfUtil.addErrorMessage(e, "PersistenceErrorOccured");
            return null;
        }
    }

    public void prepareDestroy(){
        current = (Campaign) getLazyModel().getRowData();
    }


    public String destroy() {
        performDestroy();
        recreateModel();
        return "List";
    }

    private void performDestroy() {
        try {
            current.setDeleted(true);
            getFacade().stop(current);
            getFacade().edit(current);
            JsfUtil.addSuccessMessage("RecordDeleted");
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, "PersistenceErrorOccured");
        }
    }

    private void recreateModel() {
        lazyModel = null;
    }

    public SelectItem[] getItemsAvailableSelectMany() {
        return JsfUtil.getSelectItems(ejbFacade.findAll(), false);
    }

    public SelectItem[] getItemsAvailableSelectOne() {
        return JsfUtil.getSelectItems(ejbFacade.findAll(), true);
    }

    public SelectItem[] getItemsAvailableSelectDelAny() {
        List<Campaign> entities = getFacade().findAllDelAny();
        SelectItem[] items = new SelectItem[entities.size()];
        int i = 0;
        for (Campaign cf : entities) {
            items[i++] = new SelectItem(cf, cf.isDeleted()?(cf.getName()+" *"):cf.getName());
        }
        return items;
    }

    @FacesConverter(forClass = Campaign.class,value="campaignConverter")
    public static class CampaignControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            CampaignController controller = (CampaignController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "campaignController");
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
            if (object instanceof Campaign) {
                Campaign o = (Campaign) object;
                return getStringKey(o.getId());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + CampaignController.class.getName());
            }
        }
    }
}
