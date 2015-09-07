/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.a_d.goedata.world.util;

import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author casper
 */
public class ControlerHelper {

    protected boolean addLocalizedMessage(String summaryID) {
        return addLocalizedMessage(summaryID, null, FacesMessage.SEVERITY_INFO, null);
    }

    protected boolean addLocalizedMessage(String summaryID, String detailID) {
        return addLocalizedMessage(summaryID, detailID, FacesMessage.SEVERITY_INFO, null);
    }

    protected boolean addLocalizedMessage(String summaryID, String detailID, FacesMessage.Severity level, Throwable exeption) {
        boolean retValue = false;

        if (summaryID != null && (!summaryID.isEmpty())) {
            String summary;
            try {
                summary = ResourceBundle.getBundle("/Bundle").getString(summaryID);
            } catch (MissingResourceException ex) {
                summary = summaryID;
                Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Missing definition of bundle request for id:" + summaryID, ex);
            }

            String detail = "";
            if (detailID != null && (!detailID.isEmpty())) {
                try {
                    detail = ResourceBundle.getBundle("/Bundle").getString(detailID);
                } catch (MissingResourceException ex) {
                    Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "Missing definition of bundle request for id:" + summaryID, ex);
                }
            }

            FacesContext context = FacesContext.getCurrentInstance();
            if (exeption != null) {
                detail += exeption.getLocalizedMessage();
                context.validationFailed();
            }

            FacesMessage facesMsg = new FacesMessage(level, summary, detail);

            String msgClientID = null;
            if (FacesMessage.SEVERITY_INFO.equals(level)) {
                msgClientID = "successInfo";
            }
            context.addMessage(msgClientID, facesMsg);
            retValue = true;
        }
        return retValue;
    }

}
