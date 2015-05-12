/*
 */
package cz.a_d.discworld.geodata;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author maslu02
 */
@Embeddable
public class SubCubeID implements Serializable {
    
    protected long level;    
    protected long xAxis;

    protected long yAxis;

    protected long zAxis;

    protected long shadowLevel;

    protected long worldAxis;

    protected long definitionID;

    /**
     * Get the value of definitionID
     *
     * @return the value of definitionID
     */
    public long getDefinitionID() {
        return definitionID;
    }

    /**
     * Set the value of definitionID
     *
     * @param definitionID new value of definitionID
     */
    public void setDefinitionID(long definitionID) {
        this.definitionID = definitionID;
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
     * Get the value of shadowLevel
     *
     * @return the value of shadowLevel
     */
    public long getShadowLevel() {
        return shadowLevel;
    }

    /**
     * Set the value of shadowLevel
     *
     * @param shadowLevel new value of shadowLevel
     */
    public void setShadowLevel(long shadowLevel) {
        this.shadowLevel = shadowLevel;
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


    /**
     * Get the value of level
     *
     * @return the value of level
     */
    public long getLevel() {
        return level;
    }

    /**
     * Set the value of level
     *
     * @param level new value of level
     */
    public void setLevel(long level) {
        this.level = level;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (int) (this.level ^ (this.level >>> 32));
        hash = 67 * hash + (int) (this.xAxis ^ (this.xAxis >>> 32));
        hash = 67 * hash + (int) (this.yAxis ^ (this.yAxis >>> 32));
        hash = 67 * hash + (int) (this.zAxis ^ (this.zAxis >>> 32));
        hash = 67 * hash + (int) (this.shadowLevel ^ (this.shadowLevel >>> 32));
        hash = 67 * hash + (int) (this.worldAxis ^ (this.worldAxis >>> 32));
        hash = 67 * hash + (int) (this.definitionID ^ (this.definitionID >>> 32));
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
        if (this.level != other.level) {
            return false;
        }
        if (this.xAxis != other.xAxis) {
            return false;
        }
        if (this.yAxis != other.yAxis) {
            return false;
        }
        if (this.zAxis != other.zAxis) {
            return false;
        }
        if (this.shadowLevel != other.shadowLevel) {
            return false;
        }
        if (this.worldAxis != other.worldAxis) {
            return false;
        }
        if (this.definitionID != other.definitionID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SubCubeID{" + "level=" + level + ", x=" + xAxis + ", yAxis=" + yAxis + ", zAxis=" + zAxis + ", shadowLevel=" + shadowLevel + ", worldAxis=" + worldAxis + ", definitionID=" + definitionID + '}';
    }

}