/**
 * Page.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkahlert.devel.wpws.model;

public class Page  extends com.bkahlert.devel.wpws.model.Post  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 6085177442991596425L;
	public Page() {
    }

    public Page(
           int id,
           java.lang.String author,
           java.util.Date date,
           java.util.Date dateGmt,
           java.lang.String content,
           java.lang.String title,
           java.lang.String excerpt,
           java.lang.String status,
           java.lang.String commentStatus,
           java.lang.String pingStatus,
           java.lang.String password,
           java.lang.String name,
           java.lang.String toPing,
           java.lang.String pinged,
           java.util.Date modified,
           java.util.Date modifiedGmt,
           java.lang.String contentFiltered,
           int parentId,
           java.lang.String guid,
           int menuOrder,
           java.lang.String type,
           java.lang.String mimeType,
           int commentCount,
           java.lang.String filter) {
        super(
            id,
            author,
            date,
            dateGmt,
            content,
            title,
            excerpt,
            status,
            commentStatus,
            pingStatus,
            password,
            name,
            toPing,
            pinged,
            modified,
            modifiedGmt,
            contentFiltered,
            parentId,
            guid,
            menuOrder,
            type,
            mimeType,
            commentCount,
            filter);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Page)) return false;
        Page other = (Page) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj);
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Page.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "Page"));
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
