/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.com.ivrManager.jsf.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import org.eobjects.metamodel.data.DataSet;

public abstract class NestedDataModel extends DataModel implements Serializable {

    private List<List<String>> nestedDataModel;
    private int index;




    private List<List<String>> populateModel(DataSet dataSet) {
        List<List<String>> list = new ArrayList<List<String>>();
        List<Object[]> listObjArr = dataSet.toObjectArrays();
        for(Object[] objArr:listObjArr) {
                List<String> nestedTableData = new ArrayList<String>();
                for(int i=0; i<objArr.length; i++) {
                        nestedTableData.add(objArr[i].toString());
                }
                list.add(nestedTableData);
        }
        return list;
    }

    @Override
    public int getRowCount() {
        return nestedDataModel.size();
    }

    @Override
    public Object getRowData() {
        List<String> list = nestedDataModel.get(index);
        return new ListDataModel(list);
    }

    @Override
    public int getRowIndex() {
        return index;
    }

    @Override
    public Object getWrappedData() {
        return nestedDataModel;
    }

    @Override
    public boolean isRowAvailable() {
        return index >= 0 && index < nestedDataModel.size();
    }

    @Override
    public void setRowIndex(int arg0) {
        index = arg0;
    }


    public void setWrappedData(DataSet dataSet) {

        List<List<String>> list = new ArrayList<List<String>>();
        List<Object[]> listObjArr = dataSet.toObjectArrays();
        for(Object[] objArr:listObjArr) {
                List<String> nestedTableData = new ArrayList<String>();
                for(int i=0; i<objArr.length; i++) {
                        nestedTableData.add(objArr[i].toString());
                }
                list.add(nestedTableData);
        }
        this.nestedDataModel=list;
    }



}
