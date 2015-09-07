/*
 */
package cz.a_d.goedata.world;

import cz.a_d.discworld.datamodel.universe.geodata.Cube;
import cz.a_d.discworld.facades.CubeFacade;
import cz.a_d.discworld.datamodel.universe.World;
import cz.a_d.discworld.datamodel.users.Configuration;
import cz.a_d.discworld.x3dom.X3DSceneManager;
import cz.a_d.discworld.x3dom.X3d;
import cz.a_d.discworld.x3dom.data.model.iterchange.scene.X3DTransform;
import cz.a_d.goedata.world.util.ControlerHelper;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import javax.annotation.security.RolesAllowed;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import org.primefaces.context.RequestContext;

/**
 *
 * @author casper
 */
@ManagedBean(name = "cubeControler")
@SessionScoped
public class CubeControler extends ControlerHelper implements Serializable {

    @EJB
    protected X3DSceneManager x3dManager;

    @EJB
    protected CubeFacade em;

    @ManagedProperty(value = "#{userControler}")
    protected UserControler userControler;

    protected List<Cube> selectedCubes;

    protected Cube cube;

    protected Cube editBackupCube;

    protected List<Cube> cubes;

    protected World world;

    protected Long shadow = 0l;

    /**
     * Get the value of userControler
     *
     * @return the value of userControler
     */
    public UserControler getUserControler() {
        return userControler;
    }

    /**
     * Set the value of userControler
     *
     * @param userControler new value of userControler
     */
    public void setUserControler(UserControler userControler) {
        this.userControler = userControler;
    }

    /**
     * Get the value of shadow
     *
     * @return the value of shadow
     */
    public Long getShadow() {
        return shadow;
    }

    /**
     * Set the value of shadow
     *
     * @param shadow new value of shadow
     */
    public void setShadow(Long shadow) {
        if ((this.shadow != null) && (!this.shadow.equals(shadow))) {
            cubes = null;
        }
        this.shadow = shadow;
    }

    /**
     * Get the value of world
     *
     * @return the value of world
     */
    public World getWorld() {
        if (world == null) {
            Configuration defaultConfiguration = userControler.getUser().getDefaultConfiguration();
            if (defaultConfiguration != null) {
                world = defaultConfiguration.getLastWorld();
            }
        }
        return world;
    }

    /**
     * Set the value of world
     *
     * @param world new value of world
     */
    public void setWorld(World world) {
        if ((this.world != null) && (!this.world.equals(world))) {
            cubes = null;
        }
        this.world = world;
    }

    /**
     * Get the value of cubes
     *
     * @return the value of cubes
     */
    public List<Cube> getCubes() {
        if (cubes == null) {
            try {
                cubes = em.findCubes(getWorld(), getShadow());
            } catch (EJBException ex) {
                addLocalizedMessage("PersistenceErrorOccured", null, null, ex);
            }
        }
        return cubes;
    }

    /**
     * Set the value of cubes
     *
     * @param cubes new value of cubes
     */
    public void setCubes(List<Cube> cubes) {
        this.cubes = cubes;
    }

    /**
     * Get the value of cube
     *
     * @return the value of cube
     */
    public Cube getCube() {
        return cube;
    }

    /**
     * Set the value of cube
     *
     * @param cube new value of cube
     */
    public void setCube(Cube cube) {
        this.cube = cube;
    }

    /**
     * Get the value of selectedCubes
     *
     * @return the value of selectedCubes
     */
    public List<Cube> getSelectedCubes() {
        return selectedCubes;
    }

    /**
     * Set the value of selectedCubes
     *
     * @param selectedCubes new value of selectedCubes
     */
    public void setSelectedCubes(List<Cube> selectedCubes) {
        this.selectedCubes = selectedCubes;
    }

    /**
     * Creates a new instance of CubeManager
     */
    public CubeControler() {
    }

    /**
     * Method generate X3Dom XML representation based on curent list of cubes.
     *
     * @return
     */
    public String printCurrentScene() {
        return x3dManager.createScene(getCubes(), "mainWorkSpace");
    }

    public void prepareCreate() {
        if (cube == null) {
            cube = new Cube(0l, 0l, 0l, shadow, world);
        } else {
            cube = new Cube(cube);
        }
        cube.setShadowLevel(getShadow());
        cube.setWorld(getWorld());
    }

    @RolesAllowed("Developer")
    public void create() {
        try {
            em.create(cube);
            cubes.add(cube);
            String delta = x3dManager.createCube(cube);
            if (delta != null) {
                RequestContext requestContext = RequestContext.getCurrentInstance();
                requestContext.execute(String.format("window.updateScene('%s')", delta));
                addLocalizedMessage("CubeCreated");
            }
        } catch (EJBException ex) {
            addLocalizedMessage("PersistenceErrorOccured", null, FacesMessage.SEVERITY_ERROR, ex);
        }
    }

    public void delete() {
        try {
            if (selectedCubes != null && (!selectedCubes.isEmpty())) {
                em.deleteCubes(selectedCubes);
                cubes.removeAll(selectedCubes);
                String delta = x3dManager.deleteCube(selectedCubes);
                if (delta != null) {
                    RequestContext requestContext = RequestContext.getCurrentInstance();
                    requestContext.execute(String.format("window.updateScene('%s')", delta));
                    addLocalizedMessage("CubeDeleted");
                }
            }
        } catch (EJBException ex) {
            addLocalizedMessage("PersistenceErrorOccured", null, FacesMessage.SEVERITY_ERROR, ex);
        }

    }

    public void prepareEdit(Cube item) {
        editBackupCube = item;
        cube = new Cube(item);
    }

    public void edit() {
        try {
            if (editBackupCube.isPositionEqual(cube)) {
                em.edit(cube);
            } else {
                em.moveCube(editBackupCube, cube, true);
            }
            int indexOf = cubes.indexOf(editBackupCube);
            if (indexOf >= 0) {
                cubes.set(indexOf, cube);
            }

            String delta = x3dManager.edit(editBackupCube, cube);
            if (delta != null && (!delta.isEmpty())) {
                RequestContext requestContext = RequestContext.getCurrentInstance();
                requestContext.execute(String.format("window.updateScene('%s')", delta));
                addLocalizedMessage("CubeUpdated");
            }

        } catch (EJBException ex) {
            addLocalizedMessage("PersistenceErrorOccured", null, FacesMessage.SEVERITY_ERROR, ex);
        }

    }
//    public long getMaxLong() {
//        return Long.MAX_VALUE;
//    }
//
//    public long getMixLong() {
//        return Long.MIN_VALUE;
//    }
}
