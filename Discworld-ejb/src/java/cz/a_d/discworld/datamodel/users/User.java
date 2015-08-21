/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.a_d.discworld.datamodel.users;

import cz.a_d.discworld.datamodel.universe.World;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author casper
 */
@Entity(name = "User_Data")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String id;

    @OneToMany(mappedBy = "creator")
    protected List<World> worlds;

    /**
     * Get the value of worlds
     *
     * @return the value of worlds
     */
    public List<World> getWorlds() {
        return worlds;
    }

    /**
     * Set the value of worlds
     *
     * @param worlds new value of worlds
     */
    public void setWorlds(List<World> worlds) {
        this.worlds = worlds;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cz.a_d.discworld.datamodel.users.User[ id=" + id + " ]";
    }

}
