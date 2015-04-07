/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.a_d.discoworld.geodata;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author maslu02
 */
@Entity(name = "time_table")
public class Time implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "startDate")
    protected Date start;

    @Temporal(javax.persistence.TemporalType.DATE)
    protected Date stop;

    /**
     * Get the value of stop
     *
     * @return the value of stop
     */
    public Date getStop() {
        return stop;
    }

    /**
     * Set the value of stop
     *
     * @param stop new value of stop
     */
    public void setStop(Date stop) {
        this.stop = stop;
    }
    
    
    /**
     * Get the value of start
     *
     * @return the value of start
     */
    public Date getStart() {
        return start;
    }

    /**
     * Set the value of start
     *
     * @param start new value of start
     */
    public void setStart(Date start) {
        this.start = start;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

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
        if (!(object instanceof Time)) {
            return false;
        }
        Time other = (Time) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cz.a_d.discoworld.geodata.Time[ id=" + id + " ]";
    }
    
}
