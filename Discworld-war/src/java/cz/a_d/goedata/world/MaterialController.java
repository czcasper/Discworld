/*
 */
package cz.a_d.goedata.world;

import cz.a_d.discworld.datamodel.universe.Material;
import cz.a_d.discworld.facades.MaterialFacade;
import cz.a_d.goedata.world.util.ControlerHelper;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author casper
 */
@ManagedBean
@SessionScoped
public class MaterialController extends  ControlerHelper implements Serializable {

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
            try {
                materials = em.findAll();
            } catch (EJBException ex) {
                addLocalizedMessage("PersistenceErrorOccured", null, null, ex);
            }
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
            addLocalizedMessage("PersistenceErrorOccured", null, FacesMessage.SEVERITY_ERROR, ex);
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
            addLocalizedMessage("PersistenceErrorOccured", null, FacesMessage.SEVERITY_ERROR, ex);
        }
    }

}
