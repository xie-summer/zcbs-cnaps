//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.01 at 03:53:04 PM CST 
//


package com.zcbspay.platform.cnaps.ccms.bean.LoginResponse;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoginOperationTypeCode1.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoginOperationTypeCode1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OT00"/>
 *     &lt;enumeration value="OT01"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LoginOperationTypeCode1")
@XmlEnum
public enum LoginOperationTypeCode1 {

    @XmlEnumValue("OT00")
    OT_00("OT00"),
    @XmlEnumValue("OT01")
    OT_01("OT01");
    private final String value;

    LoginOperationTypeCode1(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoginOperationTypeCode1 fromValue(String v) {
        for (LoginOperationTypeCode1 c: LoginOperationTypeCode1 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
