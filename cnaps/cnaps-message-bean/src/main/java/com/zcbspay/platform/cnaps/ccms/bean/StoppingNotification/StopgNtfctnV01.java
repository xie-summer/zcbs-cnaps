//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.01 at 03:53:14 PM CST 
//


package com.zcbspay.platform.cnaps.ccms.bean.StoppingNotification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StopgNtfctnV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopgNtfctnV01">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpHdr" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.809.001.02}GroupHeader1"/>
 *         &lt;element name="StsInf" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.809.001.02}StsInf1"/>
 *         &lt;element name="NdInf" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.809.001.02}NdInf1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopgNtfctnV01", propOrder = {
    "grpHdr",
    "stsInf",
    "ndInf"
})
public class StopgNtfctnV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader1 grpHdr;
    @XmlElement(name = "StsInf", required = true)
    protected StsInf1 stsInf;
    @XmlElement(name = "NdInf", required = true)
    protected NdInf1 ndInf;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader1 }
     *     
     */
    public GroupHeader1 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader1 }
     *     
     */
    public void setGrpHdr(GroupHeader1 value) {
        this.grpHdr = value;
    }

    /**
     * Gets the value of the stsInf property.
     * 
     * @return
     *     possible object is
     *     {@link StsInf1 }
     *     
     */
    public StsInf1 getStsInf() {
        return stsInf;
    }

    /**
     * Sets the value of the stsInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link StsInf1 }
     *     
     */
    public void setStsInf(StsInf1 value) {
        this.stsInf = value;
    }

    /**
     * Gets the value of the ndInf property.
     * 
     * @return
     *     possible object is
     *     {@link NdInf1 }
     *     
     */
    public NdInf1 getNdInf() {
        return ndInf;
    }

    /**
     * Sets the value of the ndInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link NdInf1 }
     *     
     */
    public void setNdInf(NdInf1 value) {
        this.ndInf = value;
    }

}
