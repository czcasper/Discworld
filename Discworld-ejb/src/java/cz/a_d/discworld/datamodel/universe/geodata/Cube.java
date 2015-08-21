/*
 */
package cz.a_d.discworld.datamodel.universe.geodata;

import cz.a_d.discworld.datamodel.universe.World;
import cz.a_d.discworld.geodata.Material;
import cz.a_d.discworld.geodata.Time;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author casper
 */
@Entity(name = "Cubes")
@IdClass(CubeID.class)
public class Cube implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    protected Long xAxis;

    @Id
    protected Long yAxis;

    @Id
    protected Long zAxis;

    @Id
    protected Long shadowLevel;

    @Id
    @OneToOne
    protected World world;
    /**
     * This property represents material of this cube.
     */
    @ManyToOne
    protected Material material;

    @ManyToOne
    protected Time time;

    @OneToOne
    private SubCubeDefinition subCubeDefinition;

    public Cube() {
    }

    public Cube(Long xAxis, Long yAxis, Long zAxis, Long shadowLevel, World worldAxis) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        this.zAxis = zAxis;
        this.shadowLevel = shadowLevel;
        this.world = worldAxis;
    }

    public Cube(Cube c) {
        this.xAxis = c.xAxis;
        this.yAxis = c.yAxis;
        this.zAxis = c.zAxis;
        this.shadowLevel = c.shadowLevel;
        this.world = c.world;
        material = c.material;
        time = c.time;
    }

    public SubCubeDefinition getSubCubeDefinition() {
        return subCubeDefinition;
    }

    public void setSubCubeDefinition(SubCubeDefinition subCubeDefinition) {
        this.subCubeDefinition = subCubeDefinition;
    }

    /**
     * Get the value of world
     *
     * @return the value of world
     */
    public World getWorld() {
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

    /**
     * Get the value of shadowLevel
     *
     * @return the value of shadowLevel
     */
    public Long getShadowLevel() {
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
     * Get the value of zAxis
     *
     * @return the value of zAxis
     */
    public Long getzAxis() {
        return zAxis;
    }

    /**
     * Set the value of zAxis
     *
     * @param zAxis new value of zAxis
     */
    public void setzAxis(Long zAxis) {
        this.zAxis = zAxis;
    }

    /**
     * Get the value of yAxis
     *
     * @return the value of yAxis
     */
    public Long getyAxis() {
        return yAxis;
    }

    /**
     * Set the value of yAxis
     *
     * @param yAxis new value of yAxis
     */
    public void setyAxis(Long yAxis) {
        this.yAxis = yAxis;
    }

    /**
     * Get the value of xAxis
     *
     * @return the value of xAxis
     */
    public Long getxAxis() {
        return xAxis;
    }

    /**
     * Set the value of xAxis
     *
     * @param xAxis new value of xAxis
     */
    public void setxAxis(Long xAxis) {
        this.xAxis = xAxis;
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
     * Get the value of time
     *
     * @return the value of time
     */
    public Time getTime() {
        return time;
    }

    /**
     * Set the value of time
     *
     * @param time new value of time
     */
    public void setTime(Time time) {
        this.time = time;
    }
}
