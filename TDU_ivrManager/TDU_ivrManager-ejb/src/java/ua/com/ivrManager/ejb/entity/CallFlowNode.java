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
public class CallFlowNode implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String type;
    // Used for creating unique names of form ID's per script
    private int flowCountId;
    @OneToOne(mappedBy = "flowNode")
    private CallFlow parentCallFlow;
    @ManyToOne
    private CallFlowNode parent;
    @OneToMany(fetch= FetchType.EAGER,cascade= CascadeType.ALL)
    private List<CallFlowNode> children=new ArrayList<CallFlowNode>();
    @OneToMany(fetch= FetchType.EAGER,cascade= CascadeType.ALL)
    private List<Var> vars=new ArrayList<Var>();
    @OneToMany(fetch= FetchType.EAGER,cascade= CascadeType.ALL)
    private List<Attribute> attributes=new ArrayList<Attribute>();
    private boolean deleted;

    @Transient
    private List<String> childTypes=new ArrayList<String>();
    @Transient
    private int maxChilds;

    public CallFlowNode() {
    }

    public CallFlowNode(int flowCountId) {
        this.flowCountId=flowCountId;
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

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public List<CallFlowNode> getChildren() {
        return children;
    }

    public void setChildren(List<CallFlowNode> children) {
        this.children = children;
    }

    public int getFlowCountId() {
        return flowCountId;
    }

    public void setFlowCountId(int flowCountId) {
        this.flowCountId = flowCountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        for(Var v:this.vars){
            v.setName(name);
        }
    }

    public CallFlowNode getParent() {
        return parent;
    }

    public void setParent(CallFlowNode parent) {
        this.parent = parent;
    }

    public CallFlow getParentCallFlow() {
        return parentCallFlow;
    }

    public void setParentCallFlow(CallFlow parentCallFlow) {
        this.parentCallFlow = parentCallFlow;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Var> getVars() {
        return vars;
    }

    public List<Var> getVarsRecursively(){
        List<Var> listVars=new ArrayList<Var>(vars);
        for(CallFlowNode cfn:children){
            listVars.addAll(cfn.getVarsRecursively());
        }
        return listVars;
    }

    public void setVars(List<Var> vars) {
        this.vars = vars;
    }

    public List<String> getChildTypes() {
        return childTypes;
    }

    public void setChildTypes(List<String> childTypes) {
        this.childTypes = childTypes;
    }

    public int getMaxChilds() {
        return maxChilds;
    }

    public void setMaxChilds(int maxChilds) {
        this.maxChilds = maxChilds;
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
        if (!(object instanceof CallFlowNode)) {
            return false;
        }
        CallFlowNode other = (CallFlowNode) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CallFlowNode[ id=" + id + ", type="+type+", name="+name+", children="+children+" ]";
    }

}
