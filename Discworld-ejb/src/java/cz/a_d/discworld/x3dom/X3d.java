/*
 */
package cz.a_d.discworld.x3dom;

import cz.a_d.discworld.x3dom.data.model.X3DScene;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author maslu02
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "x3d")
@XmlType(namespace = "http://www.web3d.org/specifications/x3d-namespace")
public class X3d {

    protected List<X3DScene> scene;

    /**
     * Hide or display the logging console.
     */
    @XmlAttribute
    protected Boolean showLog;

    /**
     * Hide or display the statistics overlay.
     */
    @XmlAttribute
    protected Boolean showStat;

    /**
     * Hide or show the loading indicator.
     */
    @XmlAttribute
    protected Boolean showProgress;

    /**
     * Render quality (tesselation level) for Box, Cone, Cylinder, Sphere.
     */
    @XmlAttribute
    protected PrimitiveQuality primitiveQuality;

    /**
     * Get the value of primitiveQuality
     *
     * @return the value of primitiveQuality
     */
    public PrimitiveQuality getPrimitiveQuality() {
        return primitiveQuality;
    }

    /**
     * Set the value of primitiveQuality
     *
     * @param primitiveQuality new value of primitiveQuality
     */
    public void setPrimitiveQuality(PrimitiveQuality primitiveQuality) {
        this.primitiveQuality = primitiveQuality;
    }

    /**
     * Get the value of showProgress
     *
     * @return the value of showProgress
     */
    public Boolean isShowProgress() {
        return showProgress;
    }

    /**
     * Set the value of showProgress
     *
     * @param showProgress new value of showProgress
     */
    public void setShowProgress(Boolean showProgress) {
        this.showProgress = showProgress;
    }

    /**
     * Get the value of showStat
     *
     * @return the value of showStat
     */
    public Boolean isShowStat() {
        return showStat;
    }

    /**
     * Set the value of showStat
     *
     * @param showStat new value of showStat
     */
    public void setShowStat(Boolean showStat) {
        this.showStat = showStat;
    }

    /**
     * Get the value of showLog
     *
     * @return the value of showLog
     */
    public Boolean isShowLog() {
        return showLog;
    }

    /**
     * Set the value of showLog
     *
     * @param showLog new value of showLog
     */
    public void setShowLog(Boolean showLog) {
        this.showLog = showLog;
    }

    /**
     * Get the value of scene
     *
     * @return the value of scene
     */
    public List<X3DScene> getScene() {
        return scene;
    }

    /**
     * Set the value of scene
     *
     * @param scene new value of scene
     */
    public void setScene(List<X3DScene> scene) {
        this.scene = scene;
    }

    /**
     * Add scene to X3D data. If parameter is null nothing will happend.
     *
     * @param scene must be valid non null object of scene.
     */
    public void addScene(X3DScene scene) {
        if (scene != null) {
            if (this.scene == null) {
                this.scene = new ArrayList<>();
            }
            this.scene.add(scene);
        }
    }
}
