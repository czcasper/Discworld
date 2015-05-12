/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.a_d.exceptions.ejb;

import javax.ejb.EJBException;

/**
 *
 * @author maslu02
 */
public class RootCauseInfoException extends Exception {

    protected Throwable root;

    public RootCauseInfoException(EJBException ex) {
        this("", ex);
    }

    public RootCauseInfoException(String message, EJBException ex) {
        super(message, ex);
        root = getRoot(ex);
    }

    protected final Throwable getRoot(EJBException ex) {
        Throwable retvalue = ex.getCause();
        Throwable tmp;
        while ((tmp = retvalue.getCause()) != null) {
            retvalue = tmp;
        }
        return retvalue;
    }

    @Override
    public String getMessage() {
        String retValue = super.getMessage();
        retValue+=root.getMessage();
        return retValue;
    }

}
