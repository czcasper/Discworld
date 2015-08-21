/*
 */
package cz.a_d.discworld.datamodel.universe.geodata;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author casper
 */
public class CubeID implements Serializable {

    protected Long xAxis;

    protected Long yAxis;

    protected Long zAxis;

    protected Long shadowLevel;

    protected Long world;

    public CubeID() {
    }

    public CubeID(long xAxis, long yAxis, long zAxis, long shadowLevel, long worldAxis) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        this.zAxis = zAxis;
        this.shadowLevel = shadowLevel;
        this.world = worldAxis;
    }

    public CubeID(CubeID id) {
        this.xAxis = id.xAxis;
        this.yAxis = id.yAxis;
        this.zAxis = id.zAxis;
        this.shadowLevel = id.shadowLevel;
        this.world = id.world;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.xAxis);
        hash = 79 * hash + Objects.hashCode(this.yAxis);
        hash = 79 * hash + Objects.hashCode(this.zAxis);
        hash = 79 * hash + Objects.hashCode(this.shadowLevel);
        hash = 79 * hash + Objects.hashCode(this.world);
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
        return Objects.equals(this.world, other.world);
    }

    @Override
    public String toString() {
        return "CubeID{" + "xAxis=" + xAxis + ", yAxis=" + yAxis + ", zAxis=" + zAxis + ", shadowLevel=" + shadowLevel + ", world=" + world + '}';
    }

}
