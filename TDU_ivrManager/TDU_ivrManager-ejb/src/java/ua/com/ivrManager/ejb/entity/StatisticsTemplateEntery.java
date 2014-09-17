/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.ivrManager.ejb.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Artem
 */
@Entity
public class StatisticsTemplateEntery implements Serializable {
    private static final long serialVersionUID = 1L;
    public static final String CHART_MODE_PIECHART_VALUES_FIRST_RESULT="pieChartValuesFirstResult";
    public static final String CHART_MODE_PIECHART_VALUES_ALL_RESULTS="pieChartValuesAllResults";
    public static final String CHART_MODE_PIECHART_VALUES_NO_MATCH="pieChartValuesNoMatch";
    public static final String CHART_MODE_PIECHART_VALUES_NO_INPUT="pieChartValuesNoInput";
    public static final String CHART_MODE_BARCHART_STEP_TIME_FIRST_RESULT="barChartStepTimeFirstResult";
    public static final String CHART_MODE_BARCHART_STEP_TIME_ALL_RESULTS="barChartStepTimeAllResults";

    public static final List<String> CHART_MODES;
    static {
        CHART_MODES=new ArrayList<String>();
        CHART_MODES.add(CHART_MODE_PIECHART_VALUES_FIRST_RESULT);
        CHART_MODES.add(CHART_MODE_PIECHART_VALUES_ALL_RESULTS);
        CHART_MODES.add(CHART_MODE_PIECHART_VALUES_NO_INPUT);
        CHART_MODES.add(CHART_MODE_PIECHART_VALUES_NO_INPUT);
        CHART_MODES.add(CHART_MODE_BARCHART_STEP_TIME_FIRST_RESULT);
        CHART_MODES.add(CHART_MODE_BARCHART_STEP_TIME_ALL_RESULTS);
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Var var;
    private String chartMode;

    private int columnIndex=-1;
    private int rowIndex=-1;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date modDate=new Date();
    private boolean deleted;

    public StatisticsTemplateEntery() {
    }

    public StatisticsTemplateEntery(Var var, String chartMode) {
        this.var = var;
        this.chartMode = chartMode;
    }

    public String getChartMode() {
        return chartMode;
    }

    public void setChartMode(String chartMode) {
        if(!CHART_MODES.contains(chartMode)) throw new IllegalArgumentException(chartMode + "is not supported");
        this.chartMode = chartMode;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Date getModDate() {
        return modDate;
    }

    public void setModDate(Date modDate) {
        this.modDate = modDate;
    }

    public Var getVar() {
        return var;
    }

    public void setVar(Var var) {
        this.var = var;
    }

    public int getColumnIndex() {
        return columnIndex;
    }

    public void setColumnIndex(int columnIndex) {
        this.columnIndex = columnIndex;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof StatisticsTemplateEntery)) {
            return false;
        }
        StatisticsTemplateEntery other = (StatisticsTemplateEntery) object;
        if (((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))||!this.var.equals(other.var)) {
            System.out.println(".equals: "+this.toString()+"!="+other.toString());
            return false;
        }
        if(this.var.equals(other.var)){
            System.out.println(".equals: "+this.toString()+"!="+other.toString());
            return (this.chartMode == null ? other.chartMode == null : this.chartMode.equals(other.chartMode));
        }
        System.out.println(".equals: "+this.toString()+"=="+other.toString());
        return true;
    }

    @Override
    public String toString() {
        return "StatisticsTemplateEntery[ id=" + id + ", chartMode=" + chartMode +", var=" + var + " ]";
    }

}
