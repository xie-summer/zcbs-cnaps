//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.01 at 03:52:29 PM CST 
//


package com.zcbspay.platform.cnaps.ccms.bean.GetTransactionResponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionReportDetails5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionReportDetails5">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InstrRef" type="{urn:swift:xsd:camt.006.001.04}PaymentIdentification3Choice"/>
 *         &lt;choice>
 *           &lt;element name="Tx" type="{urn:swift:xsd:camt.006.001.04}Transaction5"/>
 *           &lt;element name="BizErr" type="{urn:swift:xsd:camt.006.001.04}ErrorHandling3"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionReportDetails5", propOrder = {
    "instrRef",
    "tx",
    "bizErr"
})
public class TransactionReportDetails5 {

    @XmlElement(name = "InstrRef", required = true)
    protected PaymentIdentification3Choice instrRef;
    @XmlElement(name = "Tx")
    protected Transaction5 tx;
    @XmlElement(name = "BizErr")
    protected ErrorHandling3 bizErr;

    /**
     * Gets the value of the instrRef property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentIdentification3Choice }
     *     
     */
    public PaymentIdentification3Choice getInstrRef() {
        return instrRef;
    }

    /**
     * Sets the value of the instrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentIdentification3Choice }
     *     
     */
    public void setInstrRef(PaymentIdentification3Choice value) {
        this.instrRef = value;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link Transaction5 }
     *     
     */
    public Transaction5 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transaction5 }
     *     
     */
    public void setTx(Transaction5 value) {
        this.tx = value;
    }

    /**
     * Gets the value of the bizErr property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorHandling3 }
     *     
     */
    public ErrorHandling3 getBizErr() {
        return bizErr;
    }

    /**
     * Sets the value of the bizErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorHandling3 }
     *     
     */
    public void setBizErr(ErrorHandling3 value) {
        this.bizErr = value;
    }

}
