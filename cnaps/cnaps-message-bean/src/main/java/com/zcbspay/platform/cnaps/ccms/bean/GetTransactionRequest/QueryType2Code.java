//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.01 at 03:52:24 PM CST 
//


package com.zcbspay.platform.cnaps.ccms.bean.GetTransactionRequest;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryType2Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALLL"/>
 *     &lt;enumeration value="CHNG"/>
 *     &lt;enumeration value="MODF"/>
 *     &lt;enumeration value="DELD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QueryType2Code")
@XmlEnum
public enum QueryType2Code {

    ALLL,
    CHNG,
    MODF,
    DELD;

    public String value() {
        return name();
    }

    public static QueryType2Code fromValue(String v) {
        return valueOf(v);
    }

}