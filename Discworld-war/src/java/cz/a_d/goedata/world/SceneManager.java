/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.a_d.goedata.world;

import cz.a_d.discworld.facades.CubeFacade;
import cz.a_d.discworld.datamodel.universe.geodata.Cube;
import cz.a_d.discworld.x3dom.handler.SceneDataTransferHandler;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.primefaces.context.RequestContext;

/**
 *
 * @author casper
 */
@ManagedBean
@SessionScoped
public class SceneManager implements Serializable {

    @EJB
    protected CubeFacade cubeEM;
    
    @EJB
    protected SceneDataTransferHandler dataHandler;

    protected List<Cube> cubes;

    /**
     * Creates a new instance of SceneManager
     */
    public SceneManager() {
    }

    public void initializeScene() {
        cubes = cubeEM.findAll();
    }
    
    public void initializeX3DomScene() {
        RequestContext requestContext = RequestContext.getCurrentInstance();
//        requestContext.execute(String.format("window.addObject('%s')", convert.convert(cubes)));
    }
    
}
