//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.01 at 03:52:10 PM CST 
//


package com.zcbspay.platform.cnaps.ccms.bean.CommonSignatureInformationBusiNessResponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CmonSgntrInfBizRspnV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CmonSgntrInfBizRspnV01">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpHdr" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.313.001.01}GroupHeader1"/>
 *         &lt;element name="OrgnlGrpHdr" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.313.001.01}OrgnlGrpHdr1"/>
 *         &lt;element name="RspnInf" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.313.001.01}RspnInf1"/>
 *         &lt;element name="CmonSgntrInfBizRspnInf" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.313.001.01}CmonSgntrInfBizRspnInf1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CmonSgntrInfBizRspnV01", propOrder = {
    "grpHdr",
    "orgnlGrpHdr",
    "rspnInf",
    "cmonSgntrInfBizRspnInf"
})
public class CmonSgntrInfBizRspnV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader1 grpHdr;
    @XmlElement(name = "OrgnlGrpHdr", required = true)
    protected OrgnlGrpHdr1 orgnlGrpHdr;
    @XmlElement(name = "RspnInf", required = true)
    protected RspnInf1 rspnInf;
    @XmlElement(name = "CmonSgntrInfBizRspnInf", required = true)
    protected CmonSgntrInfBizRspnInf1 cmonSgntrInfBizRspnInf;

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
     * Gets the value of the orgnlGrpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link OrgnlGrpHdr1 }
     *     
     */
    public OrgnlGrpHdr1 getOrgnlGrpHdr() {
        return orgnlGrpHdr;
    }

    /**
     * Sets the value of the orgnlGrpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgnlGrpHdr1 }
     *     
     */
    public void setOrgnlGrpHdr(OrgnlGrpHdr1 value) {
        this.orgnlGrpHdr = value;
    }

    /**
     * Gets the value of the rspnInf property.
     * 
     * @return
     *     possible object is
     *     {@link RspnInf1 }
     *     
     */
    public RspnInf1 getRspnInf() {
        return rspnInf;
    }

    /**
     * Sets the value of the rspnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link RspnInf1 }
     *     
     */
    public void setRspnInf(RspnInf1 value) {
        this.rspnInf = value;
    }

    /**
     * Gets the value of the cmonSgntrInfBizRspnInf property.
     * 
     * @return
     *     possible object is
     *     {@link CmonSgntrInfBizRspnInf1 }
     *     
     */
    public CmonSgntrInfBizRspnInf1 getCmonSgntrInfBizRspnInf() {
        return cmonSgntrInfBizRspnInf;
    }

    /**
     * Sets the value of the cmonSgntrInfBizRspnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmonSgntrInfBizRspnInf1 }
     *     
     */
    public void setCmonSgntrInfBizRspnInf(CmonSgntrInfBizRspnInf1 value) {
        this.cmonSgntrInfBizRspnInf = value;
    }

}
