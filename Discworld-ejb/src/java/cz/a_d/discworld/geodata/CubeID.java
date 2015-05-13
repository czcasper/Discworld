/*
 */
package cz.a_d.discworld.geodata;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;

/**
 *
 * @author maslu02
 */
@Embeddable
public class CubeID implements Serializable {

    protected Long xAxis;

    protected Long yAxis;

    protected Long zAxis;

    protected Long shadowLevel;

    protected Long worldAxis;

    public CubeID() {
    }

    public CubeID(long xAxis, long yAxis, long zAxis, long shadowLevel, long worldAxis) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        this.zAxis = zAxis;
        this.shadowLevel = shadowLevel;
        this.worldAxis = worldAxis;
    }

    public CubeID(CubeID id) {
        this.xAxis = id.xAxis;
        this.yAxis = id.yAxis;
        this.zAxis = id.zAxis;
        this.shadowLevel = id.shadowLevel;
        this.worldAxis = id.worldAxis;
    }

    /**
     * Get the value of worldAxis
     *
     * @return the value of worldAxis
     */
    public Long getWorldAxis() {
        return worldAxis;
    }

    /**
     * Set the value of worldAxis
     *
     * @param worldAxis new value of worldAxis
     */
    public void setWorldAxis(Long worldAxis) {
        this.worldAxis = worldAxis;
    }

    /**
     * Get the value of shadowLevel
     *
     * @return the value of shadowLevel
     */
    public Long getShadowLevel() {
        return shadowLevel;
    }

    /**
     * Set the value of shadowLevel
     *
     * @param shadowLevel new value of shadowLevel
     */
    public void setShadowLevel(Long shadowLevel) {
        this.shadowLevel = shadowLevel;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.xAxis);
        hash = 83 * hash + Objects.hashCode(this.yAxis);
        hash = 83 * hash + Objects.hashCode(this.zAxis);
        hash = 83 * hash + Objects.hashCode(this.shadowLevel);
        hash = 83 * hash + Objects.hashCode(this.worldAxis);
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
        final CubeID other = (CubeID) obj;
        if (!Objects.equals(this.xAxis, other.xAxis)) {
            return false;
        }
        if (!Objects.equals(this.yAxis, other.yAxis)) {
            return false;
        }
        if (!Objects.equals(this.zAxis, other.zAxis)) {
            return false;
        }
        if (!Objects.equals(this.shadowLevel, other.shadowLevel)) {
            return false;
        }
        return Objects.equals(this.worldAxis, other.worldAxis);
    }

    @Override
    public String toString() {
        return "CubeID{" + "xAxis=" + xAxis + ", yAxis=" + yAxis + ", zAxis=" + zAxis + ", shadowLevel=" + shadowLevel + ", worldAxis=" + worldAxis + '}';
    }

}
