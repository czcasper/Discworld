/*
 */
package cz.a_d.goedata.world;

import cz.a_d.discworld.datamodel.universe.Material;
import cz.a_d.discworld.facades.MaterialFacade;
import java.util.List;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author casper
 */
@ManagedBean
@SessionScoped
public class MaterialController {

    @EJB
    protected MaterialFacade em;

    @ManagedProperty(value = "#{userControler}")
    protected UserControler controler;

    protected Material material;

    protected List<Material> materials;

    protected List<Material> selectedMaterials;

    /**
     * Get the value of selectedMaterials
     *
     * @return the value of selectedMaterials
     */
    public List<Material> getSelectedMaterials() {
        return selectedMaterials;
    }

    /**
     * Set the value of selectedMaterials
     *
     * @param selectedMaterials new value of selectedMaterials
     */
    public void setSelectedMaterials(List<Material> selectedMaterials) {
        this.selectedMaterials = selectedMaterials;
    }

    /**
     * Get the value of controler
     *
     * @return the value of controler
     */
    public UserControler getControler() {
        return controler;
    }

    /**
     * Set the value of controler
     *
     * @param controler new value of controler
     */
    public void setControler(UserControler controler) {
        this.controler = controler;
    }

    /**
     * Get the value of materials
     *
     * @return the value of materials
     */
    public List<Material> getMaterials() {
        if (materials == null) {
            materials = em.findAll();
        }
        return materials;
    }

    /**
     * Set the value of materials
     *
     * @param materials new value of materials
     */
    public void setMaterials(List<Material> materials) {
        this.materials = materials;
    }

    /**
     * Get the value of material
     *
     * @return the value of material
     */
    public Material getMaterial() {
        return material;
    }

    /**
     * Set the value of material
     *
     * @param material new value of material
     */
    public void setMaterial(Material material) {
        this.material = material;
    }

    /**
     * Creates a new instance of MaterialController
     */
    public MaterialController() {
    }

    public void prepareCreate() {
        if (material == null) {
            material = new Material();
        } else {
            material.setId(null);
        }
        material.setCreator(controler.getUser());
    }

    public void createMaterial() {
        try {
            em.create(material);
            materials.add(material);
            material = null;
            addLocalizedMessage("MaterialCreated");
        } catch (EJBException ex) {
            addLocalizedMessage("PersistenceErrorOccured", null, null, ex);
        }

    }

    public void deleteMaterial() {
        try {
            if (selectedMaterials != null && (!selectedMaterials.isEmpty())) {
                for (Material mat : selectedMaterials) {
                    em.remove(mat);
                    materials.remove(mat);
                }
                em.flush();
                selectedMaterials.clear();
                addLocalizedMessage("MaterialDeleted");
            }
        } catch (EJBException ex) {
            addLocalizedMessage("PersistenceErrorOccured", null, null, ex);
        }
    }

    protected boolean addLocalizedMessage(String summaryID) {
        return addLocalizedMessage(summaryID, null, FacesMessage.SEVERITY_INFO, null);
    }

    protected boolean addLocalizedMessage(String summaryID, String detailID) {
        return addLocalizedMessage(summaryID, detailID, FacesMessage.SEVERITY_INFO, null);
    }

    protected boolean addLocalizedMessage(String summaryID, String detailID, Severity level, Throwable exeption) {
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
