//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.01 at 03:52:24 PM CST 
//


package com.zcbspay.platform.cnaps.ccms.bean.GetTransactionRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionQueryDefinition4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionQueryDefinition4">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QryTp" type="{urn:swift:xsd:camt.005.001.04}QueryType2Code" minOccurs="0"/>
 *         &lt;element name="TxCrit" type="{urn:swift:xsd:camt.005.001.04}TransactionCriteriaDefinition3Choice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionQueryDefinition4", propOrder = {
    "qryTp",
    "txCrit"
})
public class TransactionQueryDefinition4 {

    @XmlElement(name = "QryTp")
    protected QueryType2Code qryTp;
    @XmlElement(name = "TxCrit")
    protected TransactionCriteriaDefinition3Choice txCrit;

    /**
     * Gets the value of the qryTp property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType2Code }
     *     
     */
    public QueryType2Code getQryTp() {
        return qryTp;
    }

    /**
     * Sets the value of the qryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType2Code }
     *     
     */
    public void setQryTp(QueryType2Code value) {
        this.qryTp = value;
    }

    /**
     * Gets the value of the txCrit property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionCriteriaDefinition3Choice }
     *     
     */
    public TransactionCriteriaDefinition3Choice getTxCrit() {
        return txCrit;
    }

    /**
     * Sets the value of the txCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionCriteriaDefinition3Choice }
     *     
     */
    public void setTxCrit(TransactionCriteriaDefinition3Choice value) {
        this.txCrit = value;
    }

}
