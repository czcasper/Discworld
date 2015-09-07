/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.a_d.discworld.datamodel.users;

import cz.a_d.discworld.datamodel.universe.World;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author casper
 */
@Entity
public class Configuration implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    protected User user;

    @OneToOne
    protected World lastWorld;

    protected Long lastShadow;

    /**
     * Get the value of lastShadow
     *
     * @return the value of lastShadow
     */
    public Long getLastShadow() {
        return lastShadow;
    }

    /**
     * Set the value of lastShadow
     *
     * @param lastShadow new value of lastShadow
     */
    public void setLastShadow(Long lastShadow) {
        this.lastShadow = lastShadow;
    }

    /**
     * Get the value of lastWorld
     *
     * @return the value of lastWorld
     */
    public World getLastWorld() {
        return lastWorld;
    }

    /**
     * Set the value of lastWorld
     *
     * @param lastWorld new value of lastWorld
     */
    public void setLastWorld(World lastWorld) {
        this.lastWorld = lastWorld;
    }

    /**
     * Get the value of user
     *
     * @return the value of user
     */
    public User getUser() {
        return user;
    }

    /**
     * Set the value of user
     *
     * @param user new value of user
     */
    public void setUser(User user) {
        this.user = user;
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
        if (!(object instanceof Configuration)) {
            return false;
        }
        Configuration other = (Configuration) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cz.a_d.discworld.datamodel.users.Configuration[ id=" + id + " ]";
    }

}
