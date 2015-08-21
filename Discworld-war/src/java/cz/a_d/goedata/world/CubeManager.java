/*
 */
package cz.a_d.goedata.world;

import cz.a_d.discworld.datamodel.universe.geodata.Cube;
import cz.a_d.discworld.x3dom.CubeToX3dom;
import cz.a_d.discworld.facades.CubeFacade;
import cz.a_d.discworld.datamodel.universe.geodata.CubeID;
import cz.a_d.discworld.datamodel.universe.World;
import cz.a_d.exceptions.ejb.RootCauseInfoException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RolesAllowed;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.inject.Named;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
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
        tmpCube = new Cube(0l, 0l, 0l, 0l, new World());
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

    @RolesAllowed("Developer")
    public void createCube(ActionEvent event) {
        Cube tmp = tmpCube;
        
        FacesContext context = FacesContext.getCurrentInstance();
        try {
            cubeEM.create(tmp);
            cubeEM.flush();
            RequestContext requestContext = RequestContext.getCurrentInstance();
            requestContext.execute(String.format("window.addObject('%s')", convert.convert(tmp)));
            requestContext.execute("PF('cubeCreationDialog').hide()");
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Cube has been created successfully", tmp.toString()));
        } catch (EJBException ex) {
            RootCauseInfoException reason = new RootCauseInfoException("Failed to create cube. ", ex);
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Cube creation has failed", reason.getLocalizedMessage()));
            context.validationFailed();
        }
    }

    public Cube getTmpCube() {
        return tmpCube;
    }

    public void setTmpCube(Cube tmpCubeID) {
        this.tmpCube = tmpCubeID;
    }

    public long getMaxLong() {
        return Long.MAX_VALUE;
    }

    public long getMixLong() {
        return Long.MIN_VALUE;
    }
}
