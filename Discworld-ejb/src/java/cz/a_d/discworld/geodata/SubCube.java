/*
 */
package cz.a_d.discworld.geodata;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author maslu02
 */
@Entity
public class SubCube implements Serializable {

    private static final long serialVersionUID = 1L;

    @OneToMany
    protected List<SubCube> cubes;

    @ManyToOne
    protected Time time;

    @ManyToOne
    protected Material material;

    protected long maxSubCubeAxis;

    @OneToOne
    @Id
    protected SubCubeDefinition rootDefinition;
    
    @Id
    protected Long xAxis;

    @Id
    protected Long yAxis;

    @Id
    protected Long zAxis;

    @Id
    @Column(name = "sub_level")
    protected Long level;

    /**
     * Get the value of rootDefinition
     *
     * @return the value of rootDefinition
     */
    public SubCubeDefinition getRootDefinition() {
        return rootDefinition;
    }

    /**
     * Set the value of rootDefinition
     *
     * @param rootDefinition new value of rootDefinition
     */
    public void setRootDefinition(SubCubeDefinition rootDefinition) {
        this.rootDefinition = rootDefinition;
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
     * Get the value of level
     *
     * @return the value of level
     */
    public Long getLevel() {
        return level;
    }

    /**
     * Set the value of level
     *
     * @param level new value of level
     */
    public void setLevel(Long level) {
        this.level = level;
    }

    /**
     * Get the value of maxSubCubeAxis
     *
     * @return the value of maxSubCubeAxis
     */
    public long getMaxSubCubeAxis() {
        return maxSubCubeAxis;
    }

    /**
     * Set the value of maxSubCubeAxis
     *
     * @param maxSubCubeAxis new value of maxSubCubeAxis
     */
    public void setMaxSubCubeAxis(long maxSubCubeAxis) {
        this.maxSubCubeAxis = maxSubCubeAxis;
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

    /**
     * Get the value of cubes
     *
     * @return the value of cubes
     */
    public List<SubCube> getCubes() {
        return cubes;
    }

    /**
     * Set the value of cubes
     *
     * @param cubes new value of cubes
     */
    public void setCubes(List<SubCube> cubes) {
        this.cubes = cubes;
    }

}
