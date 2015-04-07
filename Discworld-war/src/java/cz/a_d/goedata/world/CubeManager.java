/*
 */
package cz.a_d.goedata.world;

import cz.a_d.discoworld.geodata.Cube;
import cz.a_d.discoworld.x3dom.CubeToX3dom;
import cz.a_d.discworld.facades.CubeFacade;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.ActionEvent;
import org.primefaces.context.RequestContext;

/**
 *
 * @author casper
 */
@Named(value = "cubeManager")
@SessionScoped
public class CubeManager implements Serializable {

    @EJB
    protected CubeToX3dom convert;

    protected List<Cube> cubes;

    @EJB
    protected CubeFacade cubeEM;

    protected Cube tmpCube;

    /**
     * Creates a new instance of CubeManager
     */
    public CubeManager() {
        tmpCube = new Cube();
    }

    @PostConstruct
    public void initCubeList() {
        cubes = cubeEM.findAll();
        if (cubes == null) {
            cubes = new ArrayList<>();
        }
    }

    public void initializeX3DomScene() {
        RequestContext requestContext = RequestContext.getCurrentInstance();
        requestContext.execute(String.format("window.addObject('%s')", convert.convert(cubes)));
    }

    public String getText() {
        return convert.convert(cubes);
    }

    public void createCube(ActionEvent event) {
        cubes.add(new Cube(tmpCube));
        cubeEM.create(tmpCube);
        RequestContext requestContext = RequestContext.getCurrentInstance();
        requestContext.execute(String.format("window.addObject('%s')", convert.convert(tmpCube)));
        tmpCube = new Cube();
    }

    public Cube getTmpCube() {
        return tmpCube;
    }

    public void setTmpCube(Cube tmpCube) {
        this.tmpCube = tmpCube;
    }
}
