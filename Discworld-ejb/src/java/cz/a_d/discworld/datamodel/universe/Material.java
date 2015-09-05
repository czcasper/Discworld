/*
 */
package cz.a_d.discworld.datamodel.universe;

import cz.a_d.discworld.datamodel.users.User;
import java.awt.Color;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author maslu02
 */
@Entity
public class Material implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    protected Color color;

    protected String name;

    @ManyToOne
    private User creator;

    protected String description;

    /**
     * Get the value of description
     *
     * @return the value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the value of description
     *
     * @param description new value of description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get the value of creator
     *
     * @return the value of creator
     */
    public User getCreator() {
        return creator;
    }

    /**
     * Set the value of creator
     *
     * @param creator new value of creator
     */
    public void setCreator(User creator) {
        this.creator = creator;
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the value of color
     *
     * @return the value of color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Set the value of color
     *
     * @param color new value of color
     */
    public void setColor(Color color) {
        this.color = color;
    }

    public void setStringColor(String color) {
        this.color = new Color(Integer.parseUnsignedInt(color, 16));
    }

    public String getStringColor() {
        String retValue = "";
        if (color != null) {
            retValue=String.format("#%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue());
        }
        return retValue;
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
        if (!(object instanceof Material)) {
            return false;
        }
        Material other = (Material) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cz.a_d.discoworld.geodata.Material[ id=" + id + " ]";
    }

}
