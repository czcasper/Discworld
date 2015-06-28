/*
 */
package cz.a_d.discworld.x3dom;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author maslu02
 */
@XmlType
@XmlEnum
public enum PrimitiveQuality {
    High, Medium, Low, Floating;
}
