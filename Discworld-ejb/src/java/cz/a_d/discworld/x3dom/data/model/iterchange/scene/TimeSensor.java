/*
 */
package cz.a_d.discworld.x3dom.data.model.iterchange.scene;

import cz.a_d.discworld.x3dom.data.metadata.X3DMetadata;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author maslu02
 */
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class TimeSensor {

    /**
     * The "cycle" of a TimeSensor node lasts for cycleInterval seconds. The value of cycleInterval shall be greater than zero.
     */
    @XmlAttribute
    protected Long cycleInterval;

    /**
     * A cycleTime outputOnly field can be used for synchronization purposes such as sound with animation. The value of a cycleTime event
     * will be equal to the time at the beginning of the current cycle. A cycleTime event is generated at the beginning of every cycle,
     * including the cycle starting at startTime. The first cycleTime event for a TimeSensor node can be used as an alarm (single pulse at a
     * specified time).
     */
    @XmlAttribute
    protected Long cycleTime;

    /**
     * The elapsedTime outputOnly field delivers the current elapsed time since the TimeSensor was activated and running, cumulative in
     * seconds and not counting any time while in a paused state.
     */
    @XmlAttribute
    protected Long elapsedTime;

    /**
     * Specifies whether this sensor is enabled. A disabled sensor does not produce any output.
     */
    @XmlAttribute
    protected Boolean enabled;

    @XmlAttribute
    protected Boolean first;

    @XmlAttribute
    protected Float firstCycle;

    /**
     * Fraction_changed events output a floating point value in the closed interval [0, 1]. At startTime the value of fraction_changed is 0.
     * After startTime, the value of fraction_changed in any cycle will progress through the range (0.0, 1.0].
     */
    @XmlAttribute(name = "fraction_changed")
    protected Float fractionChanged;

    /**
     * Outputs whether the timer is active.
     */
    @XmlAttribute(name = "isActive")
    protected Boolean active;

    /**
     * Outputs whether the timer is paused.
     */
    @XmlAttribute(name = "isPaused")
    protected Boolean paused;

    /**
     * Specifies whether the timer cycle loops.
     */
    @XmlAttribute
    protected Boolean loop;

    /**
     * Field to add metadata information.
     */
    protected List<X3DMetadata> metadata;

    /**
     * Sets a time for the timer to pause.
     */
    @XmlAttribute
    protected Long pauseTime;

    /**
     * Sets a time for the timer to resume from pause.
     */
    @XmlAttribute
    protected Long resumeTime;

    /**
     * Sets the startTime for the cycle.
     */
    @XmlAttribute
    protected Long startTime;

    /**
     * Sets a time for the timer to stop.
     */
    @XmlAttribute
    protected Long stopTime;

    /**
     * The time event sends the absolute time for a given tick of the TimeSensor node.
     */
    @XmlAttribute
    protected Long time;

    /**
     * Get the value of time
     *
     * @return the value of time
     */
    public Long getTime() {
        return time;
    }

    /**
     * Set the value of time
     *
     * @param time new value of time
     */
    public void setTime(Long time) {
        this.time = time;
    }

    /**
     * Get the value of stopTime
     *
     * @return the value of stopTime
     */
    public Long getStopTime() {
        return stopTime;
    }

    /**
     * Set the value of stopTime
     *
     * @param stopTime new value of stopTime
     */
    public void setStopTime(Long stopTime) {
        this.stopTime = stopTime;
    }

    /**
     * Get the value of startTime
     *
     * @return the value of startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    /**
     * Set the value of startTime
     *
     * @param startTime new value of startTime
     */
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    /**
     * Get the value of resumeTime
     *
     * @return the value of resumeTime
     */
    public Long getResumeTime() {
        return resumeTime;
    }

    /**
     * Set the value of resumeTime
     *
     * @param resumeTime new value of resumeTime
     */
    public void setResumeTime(Long resumeTime) {
        this.resumeTime = resumeTime;
    }

    /**
     * Get the value of pauseTime
     *
     * @return the value of pauseTime
     */
    public Long getPauseTime() {
        return pauseTime;
    }

    /**
     * Set the value of pauseTime
     *
     * @param pauseTime new value of pauseTime
     */
    public void setPauseTime(Long pauseTime) {
        this.pauseTime = pauseTime;
    }

    /**
     * Get the value of metadata
     *
     * @return the value of metadata
     */
    public List<X3DMetadata> getMetadata() {
        return metadata;
    }

    /**
     * Set the value of metadata
     *
     * @param metadata new value of metadata
     */
    public void setMetadata(List<X3DMetadata> metadata) {
        this.metadata = metadata;
    }

    /**
     * Get the value of loop
     *
     * @return the value of loop
     */
    public Boolean isLoop() {
        return loop;
    }

    /**
     * Set the value of loop
     *
     * @param loop new value of loop
     */
    public void setLoop(Boolean loop) {
        this.loop = loop;
    }

    /**
     * Get the value of paused
     *
     * @return the value of paused
     */
    public Boolean isPaused() {
        return paused;
    }

    /**
     * Set the value of paused
     *
     * @param paused new value of paused
     */
    public void setPaused(Boolean paused) {
        this.paused = paused;
    }

    /**
     * Get the value of active
     *
     * @return the value of active
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Set the value of active
     *
     * @param active new value of active
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * Get the value of fractionChanged
     *
     * @return the value of fractionChanged
     */
    public Float getFractionChanged() {
        return fractionChanged;
    }

    /**
     * Set the value of fractionChanged
     *
     * @param fractionChanged new value of fractionChanged
     */
    public void setFractionChanged(Float fractionChanged) {
        this.fractionChanged = fractionChanged;
    }

    /**
     * Get the value of firstCycle
     *
     * @return the value of firstCycle
     */
    public Float getFirstCycle() {
        return firstCycle;
    }

    /**
     * Set the value of firstCycle
     *
     * @param firstCycle new value of firstCycle
     */
    public void setFirstCycle(Float firstCycle) {
        this.firstCycle = firstCycle;
    }

    /**
     * Get the value of first
     *
     * @return the value of first
     */
    public Boolean isFirst() {
        return first;
    }

    /**
     * Set the value of first
     *
     * @param first new value of first
     */
    public void setFirst(Boolean first) {
        this.first = first;
    }

    /**
     * Get the value of enabled
     *
     * @return the value of enabled
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Set the value of enabled
     *
     * @param enabled new value of enabled
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Get the value of elapsedTime
     *
     * @return the value of elapsedTime
     */
    public Long getElapsedTime() {
        return elapsedTime;
    }

    /**
     * Set the value of elapsedTime
     *
     * @param elapsedTime new value of elapsedTime
     */
    public void setElapsedTime(Long elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    /**
     * Get the value of cycleTime
     *
     * @return the value of cycleTime
     */
    public Long getCycleTime() {
        return cycleTime;
    }

    /**
     * Set the value of cycleTime
     *
     * @param cycleTime new value of cycleTime
     */
    public void setCycleTime(Long cycleTime) {
        this.cycleTime = cycleTime;
    }

    /**
     * Get the value of cycleInterval
     *
     * @return the value of cycleInterval
     */
    public Long getCycleInterval() {
        return cycleInterval;
    }

    /**
     * Set the value of cycleInterval
     *
     * @param cycleInterval new value of cycleInterval
     */
    public void setCycleInterval(Long cycleInterval) {
        this.cycleInterval = cycleInterval;
    }

}
