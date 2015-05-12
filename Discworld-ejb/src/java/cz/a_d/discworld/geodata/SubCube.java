/*
 */
package cz.a_d.discworld.geodata;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author maslu02
 */
@Entity
public class SubCube implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected SubCubeID id;
    
    @OneToMany
    protected List<SubCube> cubes;

    protected double subElementSize;

    @ManyToOne
    protected Time time;

    @ManyToOne
    protected Material material;

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
     * Get the value of subElementSize
     *
     * @return the value of subElementSize
     */
    public double getSubElementSize() {
        return subElementSize;
    }

    /**
     * Set the value of subElementSize
     *
     * @param subElementSize new value of subElementSize
     */
    public void setSubElementSize(double subElementSize) {
        this.subElementSize = subElementSize;
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

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public SubCubeID getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(SubCubeID id) {
        this.id = id;
    }

}
