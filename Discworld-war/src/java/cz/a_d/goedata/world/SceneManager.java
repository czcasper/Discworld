/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.a_d.goedata.world;

import cz.a_d.discworld.datamodel.universe.World;
import cz.a_d.discworld.facades.CubeFacade;
import cz.a_d.discworld.datamodel.universe.geodata.Cube;
import cz.a_d.discworld.facades.WorldFacade;
import cz.a_d.discworld.x3dom.X3d;
import cz.a_d.discworld.x3dom.data.model.X3DScene;
import cz.a_d.discworld.x3dom.data.model.iterchange.scene.X3DTransform;
import cz.a_d.discworld.x3dom.handler.SceneDataTransferHandler;
import cz.a_d.goedata.world.util.JsfUtil;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.xml.bind.JAXBException;
import org.primefaces.context.RequestContext;

/**
 *
 * @author casper
 */
@ManagedBean
@SessionScoped
public class SceneManager implements Serializable {

    /**
     * Creates a new instance of SceneManager
     */
    public SceneManager() {
    }

    @EJB
    protected CubeFacade cubeEM;

    @EJB
    private WorldFacade worldEM;

    @EJB
    protected SceneDataTransferHandler dataHandler;

    protected List<Cube> cubes;

    protected List<World> worlds;

    protected World world;

    protected Cube cube;

    protected Long shadowLevel;

    protected X3d scene;

    /**
     * Get the value of shadowLevel
     *
     * @return the value of shadowLevel
     */
    public Long getShadowLevel() {
        if (shadowLevel == null) {
            shadowLevel = 0l;
        }
        return shadowLevel;
    }

    /**
     * Set the value of shadowLevel
     *
     * @param shadowLevel new value of shadowLevel
     */
    public void setShadowLevel(Long shadowLevel) {
        this.shadowLevel = shadowLevel;
    }

    /**
     * Get the value of cube
     *
     * @return the value of cube
     */
    public Cube getCube() {
        if (cube == null) {
            cube = new Cube(0l, 0l, 0l, getShadowLevel(), getWorld());
        }
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
     * Get the value of world
     *
     * @return the value of world
     */
    public World getWorld() {
        if (world == null) {
            List<World> work = getWorlds();
            if ((work != null) && (!work.isEmpty())) {
                world = work.get(0);
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
        this.world = world;
    }

    public void onWorldChange() {
        if (world != null) {
            cubes = null;
        }
    }

    public List<World> getWorlds() {
        if (worlds == null) {
            worlds = worldEM.findAll();
        }
        return worlds;
    }

    public void setWorlds(List<World> worlds) {
        this.worlds = worlds;
    }

    public Map<String, World> getWorldsDropDownData() {
        List<World> ws = getWorlds();
        Map<String, World> retValue = new HashMap<>(ws.size());
        for (World w : ws) {
            retValue.put(w.getName(), w);
        }
        return retValue;
    }

    public void createCube() {
        cube.setWorld(getWorld());
        cube.setShadowLevel(getShadowLevel());
        persistCube(JsfUtil.PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("CubeCreated"));
        if (!JsfUtil.isValidationFailed()) {
            List<X3DScene> scenes = scene.getScene();
            if (scenes != null && (!scenes.isEmpty())) {
                X3DScene get = scenes.get(0);

                X3DTransform createCube = dataHandler.createCube(get, cube);
                String generateDelta = dataHandler.generateDelta(get, createCube);
                RequestContext requestContext = RequestContext.getCurrentInstance();
                requestContext.execute(String.format("window.updateScene('%s')", generateDelta));

                get.addTransform(createCube);
                cubes.add(cube);
            }
        }

    }

    public void initializeScene() {
        cubes = cubeEM.findCubes(getWorld());
    }

    public List<Cube> getCubes() {
        if (cubes == null) {
            initializeScene();
        }
        return cubes;
    }

    public String initializeX3DomScene() {
        String retValue = "";
        scene = dataHandler.createScene(getCubes(), "mainWorkSpace");
        if (scene != null) {
            try {
                retValue = dataHandler.convert(scene);
            } catch (JAXBException ex) {
                Logger.getLogger(SceneManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return retValue;
    }

    private void persistCube(JsfUtil.PersistAction persistAction, String successMessage) {
        if (cube != null) {
            try {
                if (persistAction != JsfUtil.PersistAction.DELETE) {
                    cubeEM.edit(cube);
                } else {
                    cubeEM.remove(cube);
                }
                JsfUtil.addSuccessMessage(successMessage);
            } catch (EJBException ex) {
                String msg = "";
                Throwable cause = ex.getCause();
                if (cause != null) {
                    msg = cause.getLocalizedMessage();
                }
                if (msg.length() > 0) {
                    JsfUtil.addErrorMessage(msg);
                } else {
                    JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            }
        }
    }

    public long getMaxLong() {
        return Long.MAX_VALUE;
    }

    public long getMixLong() {
        return Long.MIN_VALUE;
    }

}
