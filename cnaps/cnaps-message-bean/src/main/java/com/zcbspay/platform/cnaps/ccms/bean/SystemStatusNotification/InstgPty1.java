//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.01 at 03:52:46 PM CST 
//


package com.zcbspay.platform.cnaps.ccms.bean.SystemStatusNotification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstgPty1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstgPty1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InstgDrctPty" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.801.001.02}Max14Text"/>
 *         &lt;element name="InstgPty" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.801.001.02}Max14Text"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstgPty1", propOrder = {
    "instgDrctPty",
    "instgPty"
})
public class InstgPty1 {

    @XmlElement(name = "InstgDrctPty", required = true)
    protected String instgDrctPty;
    @XmlElement(name = "InstgPty", required = true)
    protected String instgPty;

    /**
     * Gets the value of the instgDrctPty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstgDrctPty() {
        return instgDrctPty;
    }

    /**
     * Sets the value of the instgDrctPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstgDrctPty(String value) {
        this.instgDrctPty = value;
    }

    /**
     * Gets the value of the instgPty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstgPty() {
        return instgPty;
    }

    /**
     * Sets the value of the instgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstgPty(String value) {
        this.instgPty = value;
    }

}
