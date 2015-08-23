/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.a_d.exceptions.helpers;

import java.util.List;
import java.util.Map;
import javax.faces.model.ListDataModel;
import org.primefaces.model.SelectableDataModel;

/**
 *
 * @author casper
 * @param <T>
 */

public class SelectableDataList<T> extends ListDataModel<T> implements SelectableDataModel<T> {

    protected List<T> copyList;

    public SelectableDataList(List<T> list) {
        super(list);
        copyList=list;
    }

    @Override
    public Object getRowKey(T t) {
        return Integer.toString(copyList.indexOf(t));
    }

    @Override
    public T getRowData(String string) {
        return copyList.get(Integer.parseInt(string));
    }

}
