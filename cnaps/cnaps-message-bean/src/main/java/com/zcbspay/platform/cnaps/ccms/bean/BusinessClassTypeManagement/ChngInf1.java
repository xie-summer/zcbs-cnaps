//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.01 at 03:53:33 PM CST 
//


package com.zcbspay.platform.cnaps.ccms.bean.BusinessClassTypeManagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChngInf1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChngInf1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChngCtrl" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.906.001.01}ChngCtrl1"/>
 *         &lt;element name="MT" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.906.001.01}Max20Text"/>
 *         &lt;element name="MsgNm" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.906.001.01}Max60Text"/>
 *         &lt;element name="TxTpCd" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.906.001.01}Max4Text" minOccurs="0"/>
 *         &lt;element name="TxTpNm" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.906.001.01}Max60Text" minOccurs="0"/>
 *         &lt;element name="CtgyPurpCd" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.906.001.01}Max5NumericText" minOccurs="0"/>
 *         &lt;element name="CtgyPurpNm" type="{urn:cnaps:std:ccms:2010:tech:xsd:ccms.906.001.01}Max60Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChngInf1", propOrder = {
    "chngCtrl",
    "mt",
    "msgNm",
    "txTpCd",
    "txTpNm",
    "ctgyPurpCd",
    "ctgyPurpNm"
})
public class ChngInf1 {

    @XmlElement(name = "ChngCtrl", required = true)
    protected ChngCtrl1 chngCtrl;
    @XmlElement(name = "MT", required = true)
    protected String mt;
    @XmlElement(name = "MsgNm", required = true)
    protected String msgNm;
    @XmlElement(name = "TxTpCd")
    protected String txTpCd;
    @XmlElement(name = "TxTpNm")
    protected String txTpNm;
    @XmlElement(name = "CtgyPurpCd")
    protected String ctgyPurpCd;
    @XmlElement(name = "CtgyPurpNm")
    protected String ctgyPurpNm;

    /**
     * Gets the value of the chngCtrl property.
     * 
     * @return
     *     possible object is
     *     {@link ChngCtrl1 }
     *     
     */
    public ChngCtrl1 getChngCtrl() {
        return chngCtrl;
    }

    /**
     * Sets the value of the chngCtrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChngCtrl1 }
     *     
     */
    public void setChngCtrl(ChngCtrl1 value) {
        this.chngCtrl = value;
    }

    /**
     * Gets the value of the mt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMT() {
        return mt;
    }

    /**
     * Sets the value of the mt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMT(String value) {
        this.mt = value;
    }

    /**
     * Gets the value of the msgNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgNm() {
        return msgNm;
    }

    /**
     * Sets the value of the msgNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgNm(String value) {
        this.msgNm = value;
    }

    /**
     * Gets the value of the txTpCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxTpCd() {
        return txTpCd;
    }

    /**
     * Sets the value of the txTpCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxTpCd(String value) {
        this.txTpCd = value;
    }

    /**
     * Gets the value of the txTpNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxTpNm() {
        return txTpNm;
    }

    /**
     * Sets the value of the txTpNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxTpNm(String value) {
        this.txTpNm = value;
    }

    /**
     * Gets the value of the ctgyPurpCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtgyPurpCd() {
        return ctgyPurpCd;
    }

    /**
     * Sets the value of the ctgyPurpCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtgyPurpCd(String value) {
        this.ctgyPurpCd = value;
    }

    /**
     * Gets the value of the ctgyPurpNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtgyPurpNm() {
        return ctgyPurpNm;
    }

    /**
     * Sets the value of the ctgyPurpNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtgyPurpNm(String value) {
        this.ctgyPurpNm = value;
    }

}