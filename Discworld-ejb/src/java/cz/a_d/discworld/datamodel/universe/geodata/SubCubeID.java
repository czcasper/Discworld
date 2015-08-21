/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.a_d.discworld.datamodel.universe.geodata;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author casper
 */
public class SubCubeID implements Serializable {

    protected Long rootDefinition;

    protected Long xAxis;

    protected Long yAxis;

    protected Long zAxis;

    protected Long level;

    public SubCubeID() {
    }

    public SubCubeID(SubCubeDefinition rootDefinition, Long xAxis, Long yAxis, Long zAxis, Long level) {
        this.rootDefinition = rootDefinition.getId();
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        this.zAxis = zAxis;
        this.level = level;
    }

    /**
     * Get the value of rootDefinition
     *
     * @return the value of rootDefinition
     */
    public Long getRootDefinition() {
        return rootDefinition;
    }

    /**
     * Set the value of rootDefinition
     *
     * @param rootDefinition new value of rootDefinition
     */
    public void setRootDefinition(SubCubeDefinition rootDefinition) {
        this.rootDefinition = rootDefinition.getId();
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.rootDefinition);
        hash = 89 * hash + Objects.hashCode(this.xAxis);
        hash = 89 * hash + Objects.hashCode(this.yAxis);
        hash = 89 * hash + Objects.hashCode(this.zAxis);
        hash = 89 * hash + Objects.hashCode(this.level);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SubCubeID other = (SubCubeID) obj;
        if (!Objects.equals(this.rootDefinition, other.rootDefinition)) {
            return false;
        }
        if (!Objects.equals(this.xAxis, other.xAxis)) {
            return false;
        }
        if (!Objects.equals(this.yAxis, other.yAxis)) {
            return false;
        }
        if (!Objects.equals(this.zAxis, other.zAxis)) {
            return false;
        }
        if (!Objects.equals(this.level, other.level)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SubCubeID{" + "rootDefinition=" + rootDefinition + ", xAxis=" + xAxis + ", yAxis=" + yAxis + ", zAxis=" + zAxis + ", level=" + level + '}';
    }

}
