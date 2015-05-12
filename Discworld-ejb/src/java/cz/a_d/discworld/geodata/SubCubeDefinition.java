/*
 */
package cz.a_d.discworld.geodata;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author maslu02
 */
@Entity
public class SubCubeDefinition implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    protected Cube parentCube;

    protected double subCubeSize;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Get the value of subCubeSize
     *
     * @return the value of subCubeSize
     */
    public double getSubCubeSize() {
        return subCubeSize;
    }

    /**
     * Set the value of subCubeSize
     *
     * @param subCubeSize new value of subCubeSize
     */
    public void setSubCubeSize(double subCubeSize) {
        this.subCubeSize = subCubeSize;
    }

    /**
     * Get the value of parentCube
     *
     * @return the value of parentCube
     */
    public Cube getParentCube() {
        return parentCube;
    }

    /**
     * Set the value of parentCube
     *
     * @param parentCube new value of parentCube
     */
    public void setParentCube(Cube parentCube) {
        this.parentCube = parentCube;
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
        if (!(object instanceof SubCubeDefinition)) {
            return false;
        }
        SubCubeDefinition other = (SubCubeDefinition) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cz.a_d.discworld.geodata.SubCubeDefinition[ id=" + id + " ]";
    }

}
