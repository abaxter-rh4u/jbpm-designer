//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.08.07 at 02:01:49 PM CEST 
//


package de.hpi.bpmn2_0.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tTimerEventDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tTimerEventDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.omg.org/spec/BPMN/2.0}tEventDefinition">
 *       &lt;choice>
 *         &lt;element name="timeDate" type="{http://schema.omg.org/spec/BPMN/2.0}tExpression" minOccurs="0"/>
 *         &lt;element name="timeCycle" type="{http://schema.omg.org/spec/BPMN/2.0}tExpression" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tTimerEventDefinition", propOrder = {
    "timeDate",
    "timeCycle"
})
public class TTimerEventDefinition
    extends TEventDefinition
{

    protected TExpression timeDate;
    protected TExpression timeCycle;

    /**
     * Gets the value of the timeDate property.
     * 
     * @return
     *     possible object is
     *     {@link TExpression }
     *     
     */
    public TExpression getTimeDate() {
        return timeDate;
    }

    /**
     * Sets the value of the timeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TExpression }
     *     
     */
    public void setTimeDate(TExpression value) {
        this.timeDate = value;
    }

    /**
     * Gets the value of the timeCycle property.
     * 
     * @return
     *     possible object is
     *     {@link TExpression }
     *     
     */
    public TExpression getTimeCycle() {
        return timeCycle;
    }

    /**
     * Sets the value of the timeCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TExpression }
     *     
     */
    public void setTimeCycle(TExpression value) {
        this.timeCycle = value;
    }

}