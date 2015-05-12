/*
 */
package cz.a_d.discworld.geodata;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author casper
 */
@Entity(name = "Cubes")
public class Cube implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected CubeID id;
    /**
     * This property represents material of this cube.
     */
    @ManyToOne
    protected Material material;

    @ManyToOne
    protected Time time;
    
    @OneToOne(mappedBy = "parentCube")
    private SubCubeDefinition subCubeDefinition;
    

    public Cube() {
    }

    public Cube(Cube c) {
        id = c.id;
        material = c.material;
        time = c.time;
    }

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public CubeID getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(CubeID id) {
        this.id = id;
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
