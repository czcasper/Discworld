/*
 */
package cz.a_d.goedata.world;

import cz.a_d.discworld.geodata.Cube;
import cz.a_d.discworld.x3dom.CubeToX3dom;
import cz.a_d.discworld.facades.CubeFacade;
import cz.a_d.discworld.geodata.CubeID;
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
@DeclareRoles("Developer")
public class CubeManager implements Serializable {

    @EJB
    protected CubeToX3dom convert;

    protected List<Cube> cubes;

    @EJB
    protected CubeFacade cubeEM;

    protected CubeID tmpCubeID;

    /**
     * Creates a new instance of CubeManager
     */
    public CubeManager() {
        tmpCubeID = new CubeID(0, 0, 0, 0, 0);
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
        Cube tmp = new Cube();
        tmp.setId(new CubeID(tmpCubeID));
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

    public CubeID getTmpCube() {
        return tmpCubeID;
    }

    public void setTmpCube(CubeID tmpCubeID) {
        this.tmpCubeID = tmpCubeID;
    }

    public long getMaxLong() {
        return Long.MAX_VALUE;
    }

    public long getMixLong() {
        return Long.MIN_VALUE;
    }
}
