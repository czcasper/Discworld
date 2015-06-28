/*
 */
package cz.a_d.discworld.x3dom.data.model;

import cz.a_d.discworld.x3dom.data.model.modelType.geometry.CAD;
import cz.a_d.discworld.x3dom.data.model.modelType.geometry.GeoSpatial;
import cz.a_d.discworld.x3dom.data.model.modelType.geometry.Immersive;
import cz.a_d.discworld.x3dom.data.model.modelType.geometry.Interactive;
import cz.a_d.discworld.x3dom.data.model.modelType.geometry.Interchange;
import cz.a_d.discworld.x3dom.data.model.modelType.geometry.Nurbs;
import cz.a_d.discworld.x3dom.data.model.modelType.geometry.TwoDimension;

/**
 *
 * @author maslu02
 */
public class Geometry {

    protected CAD cad;

    protected GeoSpatial geoSpatial;

    protected Immersive immersive;

    protected Interactive interactive;

    protected Interchange interchange;

    protected Nurbs nurbs;

    protected TwoDimension twoDimension;

    /**
     * Get the value of twoDimension
     *
     * @return the value of twoDimension
     */
    public TwoDimension getTwoDimension() {
        return twoDimension;
    }

    /**
     * Set the value of twoDimension
     *
     * @param twoDimension new value of twoDimension
     */
    public void setTwoDimension(TwoDimension twoDimension) {
        this.twoDimension = twoDimension;
    }

    /**
     * Get the value of nurbs
     *
     * @return the value of nurbs
     */
    public Nurbs getNurbs() {
        return nurbs;
    }

    /**
     * Set the value of nurbs
     *
     * @param nurbs new value of nurbs
     */
    public void setNurbs(Nurbs nurbs) {
        this.nurbs = nurbs;
    }

    /**
     * Get the value of interchange
     *
     * @return the value of interchange
     */
    public Interchange getInterchange() {
        return interchange;
    }

    /**
     * Set the value of interchange
     *
     * @param interchange new value of interchange
     */
    public void setInterchange(Interchange interchange) {
        this.interchange = interchange;
    }

    /**
     * Get the value of interactive
     *
     * @return the value of interactive
     */
    public Interactive getInteractive() {
        return interactive;
    }

    /**
     * Set the value of interactive
     *
     * @param interactive new value of interactive
     */
    public void setInteractive(Interactive interactive) {
        this.interactive = interactive;
    }

    /**
     * Get the value of immersive
     *
     * @return the value of immersive
     */
    public Immersive getImmersive() {
        return immersive;
    }

    /**
     * Set the value of immersive
     *
     * @param immersive new value of immersive
     */
    public void setImmersive(Immersive immersive) {
        this.immersive = immersive;
    }

    /**
     * Get the value of geoSpatial
     *
     * @return the value of geoSpatial
     */
    public GeoSpatial getGeoSpatial() {
        return geoSpatial;
    }

    /**
     * Set the value of geoSpatial
     *
     * @param geoSpatial new value of geoSpatial
     */
    public void setGeoSpatial(GeoSpatial geoSpatial) {
        this.geoSpatial = geoSpatial;
    }

    /**
     * Get the value of cad
     *
     * @return the value of cad
     */
    public CAD getCad() {
        return cad;
    }

    /**
     * Set the value of cad
     *
     * @param cad new value of cad
     */
    public void setCad(CAD cad) {
        this.cad = cad;
    }

}
