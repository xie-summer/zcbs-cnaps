//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.01 at 03:53:37 PM CST 
//


package com.zcbspay.platform.cnaps.ccms.bean.SystemParameterNotification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SysParamInf1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SysParamInf1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChgTp" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.907.001.02}ChangeCode1"/>
 *         &lt;element name="CmonDataTp" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.907.001.02}CommonDataCode1"/>
 *         &lt;element name="CmonDataCd" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.907.001.02}Max8Text"/>
 *         &lt;element name="CmonDataNm" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.907.001.02}Max60Text"/>
 *         &lt;element name="CmonDataVal" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.907.001.02}Max256Text"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SysParamInf1", propOrder = {
    "chgTp",
    "cmonDataTp",
    "cmonDataCd",
    "cmonDataNm",
    "cmonDataVal"
})
public class SysParamInf1 {

    @XmlElement(name = "ChgTp", required = true)
    protected ChangeCode1 chgTp;
    @XmlElement(name = "CmonDataTp", required = true)
    protected CommonDataCode1 cmonDataTp;
    @XmlElement(name = "CmonDataCd", required = true)
    protected String cmonDataCd;
    @XmlElement(name = "CmonDataNm", required = true)
    protected String cmonDataNm;
    @XmlElement(name = "CmonDataVal", required = true)
    protected String cmonDataVal;

    /**
     * Gets the value of the chgTp property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeCode1 }
     *     
     */
    public ChangeCode1 getChgTp() {
        return chgTp;
    }

    /**
     * Sets the value of the chgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeCode1 }
     *     
     */
    public void setChgTp(ChangeCode1 value) {
        this.chgTp = value;
    }

    /**
     * Gets the value of the cmonDataTp property.
     * 
     * @return
     *     possible object is
     *     {@link CommonDataCode1 }
     *     
     */
    public CommonDataCode1 getCmonDataTp() {
        return cmonDataTp;
    }

    /**
     * Sets the value of the cmonDataTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonDataCode1 }
     *     
     */
    public void setCmonDataTp(CommonDataCode1 value) {
        this.cmonDataTp = value;
    }

    /**
     * Gets the value of the cmonDataCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmonDataCd() {
        return cmonDataCd;
    }

    /**
     * Sets the value of the cmonDataCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmonDataCd(String value) {
        this.cmonDataCd = value;
    }

    /**
     * Gets the value of the cmonDataNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmonDataNm() {
        return cmonDataNm;
    }

    /**
     * Sets the value of the cmonDataNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmonDataNm(String value) {
        this.cmonDataNm = value;
    }

    /**
     * Gets the value of the cmonDataVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmonDataVal() {
        return cmonDataVal;
    }

    /**
     * Sets the value of the cmonDataVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmonDataVal(String value) {
        this.cmonDataVal = value;
    }

}
