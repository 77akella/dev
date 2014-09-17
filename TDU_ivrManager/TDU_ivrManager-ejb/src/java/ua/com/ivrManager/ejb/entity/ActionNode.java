/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.ivrManager.ejb.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Artem
 */
@Entity
public class ActionNode implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //values: {'call','email','sms'}
    private String type="noAction";
    private String name;
    private int timeOffset=0;
    @OneToMany(cascade= CascadeType.ALL,fetch= FetchType.EAGER)
    private List<Var> vars=new ArrayList<Var>();
    @OneToOne
    private ActionNode parentAction;
    @ManyToOne
    private Campaign parent;
    private int actionNodeId;

    //fields for type 'call'
    private int timeout=40;
    private boolean useCCA=true;
    @OneToOne
    private CallFlow humanCallFlow;
    @OneToOne
    private CallFlow machineCallFlow;
    @OneToOne
    private CallFlow faxCallFlow;
    @OneToOne(fetch= FetchType.EAGER,cascade= CascadeType.ALL)
    private ActionNode busyAction;
    @OneToOne(fetch= FetchType.EAGER,cascade= CascadeType.ALL)
    private ActionNode naAction;
    @OneToOne(fetch= FetchType.EAGER,cascade= CascadeType.ALL)
    private ActionNode nisAction;
    @ManyToOne
    private OutgoingNumberPool outgoingNumberPool;
    private String outgoingNumber;

    //fields for e-mail
    @ManyToOne(cascade= CascadeType.ALL)
    private EmailTemplate emailMessageTemplate;
    @OneToOne(fetch= FetchType.EAGER,cascade= CascadeType.ALL)
    private ActionNode mailSentAction;
    @OneToOne(fetch= FetchType.EAGER,cascade= CascadeType.ALL)
    private ActionNode mailNotSentAction;

    private boolean deleted;

    public ActionNode() {
    }

    public List<Var> getVarsRecursively(){
        List<Var> listVars =new ArrayList<Var>(vars);
        if(type.equals("call")){
            if(humanCallFlow!=null){
                listVars.addAll(humanCallFlow.getFlowNode().getVarsRecursively());
            }
            if(machineCallFlow!=null){
                listVars.addAll(machineCallFlow.getFlowNode().getVarsRecursively());
            }
            if(faxCallFlow!=null){
                listVars.addAll(faxCallFlow.getFlowNode().getVarsRecursively());
            }
            if(busyAction!=null){
                listVars.addAll(busyAction.getVarsRecursively());
            }
            if(naAction!=null){
                listVars.addAll(naAction.getVarsRecursively());
            }
            if(nisAction!=null){
                listVars.addAll(nisAction.getVarsRecursively());
            }
        }
        if(type.equals("email")){
            if(emailMessageTemplate!=null){
                listVars.addAll(emailMessageTemplate.getVars());
            }
            if(mailNotSentAction!=null){
                listVars.addAll(mailNotSentAction.getVarsRecursively());
            }
            if(mailSentAction!=null){
                listVars.addAll(mailSentAction.getVarsRecursively());
            }
        }

        return listVars;
    }

    public ActionNode getMailNotSentAction() {
        return mailNotSentAction;
    }

    public void setMailNotSentAction(ActionNode mailNotSentAction) {
        this.mailNotSentAction = mailNotSentAction;
    }

    public ActionNode getMailSentAction() {
        return mailSentAction;
    }

    public void setMailSentAction(ActionNode mailSentAction) {
        this.mailSentAction = mailSentAction;
    }

    public EmailTemplate getEmailMessageTemplate() {
        return emailMessageTemplate;
    }

    public void setEmailMessageTemplate(EmailTemplate emailMessageTemplate) {
        this.emailMessageTemplate = emailMessageTemplate;
    }

    public String getOutgoingNumber() {
        return outgoingNumber;
    }

    public void setOutgoingNumber(String outgoingNumber) {
        this.outgoingNumber = outgoingNumber;
    }

    public OutgoingNumberPool getOutgoingNumberPool() {
        return outgoingNumberPool;
    }

    public void setOutgoingNumberPool(OutgoingNumberPool outgoingNumberPool) {
        this.outgoingNumberPool = outgoingNumberPool;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getActionNodeId() {
        return actionNodeId;
    }

    public void setActionNodeId(int actionNodeId) {
        this.actionNodeId = actionNodeId;
    }

    public ActionNode getBusyAction() {
        return busyAction;
    }

    public void setBusyAction(ActionNode busyAction) {
        this.busyAction = busyAction;
    }

    public CallFlow getFaxCallFlow() {
        return faxCallFlow;
    }

    public void setFaxCallFlow(CallFlow faxCallFlow) {
        this.faxCallFlow = faxCallFlow;
    }

    public CallFlow getHumanCallFlow() {
        return humanCallFlow;
    }

    public void setHumanCallFlow(CallFlow humanCallFlow) {
        this.humanCallFlow = humanCallFlow;
    }

    public CallFlow getMachineCallFlow() {
        return machineCallFlow;
    }

    public void setMachineCallFlow(CallFlow machineCallFlow) {
        this.machineCallFlow = machineCallFlow;
    }

    public ActionNode getNaAction() {
        return naAction;
    }

    public void setNaAction(ActionNode naAction) {
        this.naAction = naAction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        for(Var v:vars){
            v.setName(name);
        }
        this.name = name;
    }

    public ActionNode getNisAction() {
        return nisAction;
    }

    public void setNisAction(ActionNode nisAction) {
        this.nisAction = nisAction;
    }

    public Campaign getParent() {
        return parent;
    }

    public void setParent(Campaign parent) {
        this.parent = parent;
    }

    public ActionNode getParentAction() {
        return parentAction;
    }

    public void setParentAction(ActionNode parentAction) {
        this.parentAction = parentAction;
    }

    public int getTimeOffset() {
        return timeOffset;
    }

    public void setTimeOffset(int timeOffset) {
        this.timeOffset = timeOffset;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isUseCCA() {
        return useCCA;
    }

    public void setUseCCA(boolean useCCA) {
        this.useCCA = useCCA;
    }

    public List<Var> getVars() {
        return vars;
    }

    public void setVars(List<Var> vars) {
        this.vars = vars;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ActionNode)) {
            return false;
        }
        ActionNode other = (ActionNode) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ActionNode[ id=" + id + ", type="+type+" ]";
    }

}
