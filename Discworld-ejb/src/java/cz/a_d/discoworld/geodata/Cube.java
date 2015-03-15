/*
 */
package cz.a_d.discoworld.geodata;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author casper
 */
@Entity(name = "Cubes")
public class Cube implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    protected long xAxis;

    protected long yAxis;

    protected long zAxis;

    protected long tAxis;

    protected long shadow;

    protected long worldAxis;

    protected long cubeLevel;

    public Cube() {
    }

    public Cube(Cube c) {
        if (c != null) {
            xAxis = c.xAxis;
            yAxis = c.yAxis;
            zAxis = c.zAxis;
            tAxis = c.tAxis;
            shadow = c.shadow;
            worldAxis = c.worldAxis;
            cubeLevel = c.cubeLevel;
        }
    }

    /**
     * This property represents material of this cube.
     */
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
     * Get the value of cubeLevel
     *
     * @return the value of cubeLevel
     */
    public long getCubeLevel() {
        return cubeLevel;
    }

    /**
     * Set the value of cubeLevel
     *
     * @param cubeLevel new value of cubeLevel
     */
    public void setCubeLevel(long cubeLevel) {
        this.cubeLevel = cubeLevel;
    }

    /**
     * Get the value of worldAxis
     *
     * @return the value of worldAxis
     */
    public long getWorldAxis() {
        return worldAxis;
    }

    /**
     * Set the value of worldAxis
     *
     * @param worldAxis new value of worldAxis
     */
    public void setWorldAxis(long worldAxis) {
        this.worldAxis = worldAxis;
    }

    /**
     * Get the value of shadow
     *
     * @return the value of shadow
     */
    public long getShadow() {
        return shadow;
    }

    /**
     * Set the value of shadow
     *
     * @param shadow new value of shadow
     */
    public void setShadow(long shadow) {
        this.shadow = shadow;
    }

    /**
     * Get the value of tAxis
     *
     * @return the value of tAxis
     */
    public long gettAxis() {
        return tAxis;
    }

    /**
     * Set the value of tAxis
     *
     * @param tAxis new value of tAxis
     */
    public void settAxis(long tAxis) {
        this.tAxis = tAxis;
    }

    /**
     * Get the value of zAxis
     *
     * @return the value of zAxis
     */
    public long getzAxis() {
        return zAxis;
    }

    /**
     * Set the value of zAxis
     *
     * @param zAxis new value of zAxis
     */
    public void setzAxis(long zAxis) {
        this.zAxis = zAxis;
    }

    /**
     * Get the value of yAxis
     *
     * @return the value of yAxis
     */
    public long getyAxis() {
        return yAxis;
    }

    /**
     * Set the value of yAxis
     *
     * @param yAxis new value of yAxis
     */
    public void setyAxis(long yAxis) {
        this.yAxis = yAxis;
    }

    /**
     * Get the value of xAxis
     *
     * @return the value of xAxis
     */
    public long getxAxis() {
        return xAxis;
    }

    /**
     * Set the value of xAxis
     *
     * @param xAxis new value of xAxis
     */
    public void setxAxis(long xAxis) {
        this.xAxis = xAxis;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cube)) {
            return false;
        }
        Cube other = (Cube) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cz.a_d.discoworld.geodata.Cube[ id=" + id + " ]";
    }

}
