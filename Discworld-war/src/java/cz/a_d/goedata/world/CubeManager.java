/*
 */
package cz.a_d.goedata.world;

import cz.a_d.discoworld.geodata.Cube;
import cz.a_d.discoworld.x3dom.CubeToX3dom;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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

    protected Cube tmpCube;

    /**
     * Creates a new instance of CubeManager
     */
    public CubeManager() {
        cubes = new ArrayList<>();
        Cube c = new Cube();
        c.setxAxis(0);
        c.setyAxis(0);
        c.setzAxis(0);
        cubes.add(c);
        c = new Cube();
        c.setxAxis(1);
        c.setyAxis(0);
        c.setzAxis(0);
        cubes.add(c);

        tmpCube = new Cube();
    }
    
    public void initializeX3DomScene(){
        RequestContext requestContext = RequestContext.getCurrentInstance();
        requestContext.execute(String.format("window.addObject('%s')", convert.convert(cubes)));        
    }

    public String getText() {
        return convert.convert(cubes);
    }

    public void createCube(ActionEvent event) {
        cubes.add(new Cube(tmpCube));
        RequestContext requestContext = RequestContext.getCurrentInstance();
        requestContext.execute(String.format("window.addObject('%s')", convert.convert(tmpCube)));
    }

    public Cube getTmpCube() {
        return tmpCube;
    }

    public void setTmpCube(Cube tmpCube) {
        this.tmpCube = tmpCube;
    }
}
