/**
 * Image.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkahlert.devel.wpws.model;

public class Image  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1972219232595666443L;

	private int parentId;

    private java.lang.String url;

    private int width;

    private int height;

    private java.lang.String resizeableUrl;

    private int maxResizeableWidth;

    private int maxResizeableHeight;

    private java.lang.String title;

    private java.lang.String description;

    public Image() {
    }

    public Image(
           int parentId,
           java.lang.String url,
           int width,
           int height,
           java.lang.String resizeableUrl,
           int maxResizeableWidth,
           int maxResizeableHeight,
           java.lang.String title,
           java.lang.String description) {
           this.parentId = parentId;
           this.url = url;
           this.width = width;
           this.height = height;
           this.resizeableUrl = resizeableUrl;
           this.maxResizeableWidth = maxResizeableWidth;
           this.maxResizeableHeight = maxResizeableHeight;
           this.title = title;
           this.description = description;
    }


    /**
     * Gets the parentId value for this Image.
     * 
     * @return parentId
     */
    public int getParentId() {
        return parentId;
    }


    /**
     * Sets the parentId value for this Image.
     * 
     * @param parentId
     */
    public void setParentId(int parentId) {
        this.parentId = parentId;
    }


    /**
     * Gets the url value for this Image.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Image.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the width value for this Image.
     * 
     * @return width
     */
    public int getWidth() {
        return width;
    }


    /**
     * Sets the width value for this Image.
     * 
     * @param width
     */
    public void setWidth(int width) {
        this.width = width;
    }


    /**
     * Gets the height value for this Image.
     * 
     * @return height
     */
    public int getHeight() {
        return height;
    }


    /**
     * Sets the height value for this Image.
     * 
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }


    /**
     * Gets the resizeableUrl value for this Image.
     * 
     * @return resizeableUrl
     */
    public java.lang.String getResizeableUrl() {
        return resizeableUrl;
    }


    /**
     * Sets the resizeableUrl value for this Image.
     * 
     * @param resizeableUrl
     */
    public void setResizeableUrl(java.lang.String resizeableUrl) {
        this.resizeableUrl = resizeableUrl;
    }


    /**
     * Gets the maxResizeableWidth value for this Image.
     * 
     * @return maxResizeableWidth
     */
    public int getMaxResizeableWidth() {
        return maxResizeableWidth;
    }


    /**
     * Sets the maxResizeableWidth value for this Image.
     * 
     * @param maxResizeableWidth
     */
    public void setMaxResizeableWidth(int maxResizeableWidth) {
        this.maxResizeableWidth = maxResizeableWidth;
    }


    /**
     * Gets the maxResizeableHeight value for this Image.
     * 
     * @return maxResizeableHeight
     */
    public int getMaxResizeableHeight() {
        return maxResizeableHeight;
    }


    /**
     * Sets the maxResizeableHeight value for this Image.
     * 
     * @param maxResizeableHeight
     */
    public void setMaxResizeableHeight(int maxResizeableHeight) {
        this.maxResizeableHeight = maxResizeableHeight;
    }


    /**
     * Gets the title value for this Image.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Image.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the description value for this Image.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Image.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Image)) return false;
        Image other = (Image) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.parentId == other.getParentId() &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            this.width == other.getWidth() &&
            this.height == other.getHeight() &&
            ((this.resizeableUrl==null && other.getResizeableUrl()==null) || 
             (this.resizeableUrl!=null &&
              this.resizeableUrl.equals(other.getResizeableUrl()))) &&
            this.maxResizeableWidth == other.getMaxResizeableWidth() &&
            this.maxResizeableHeight == other.getMaxResizeableHeight() &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getParentId();
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        _hashCode += getWidth();
        _hashCode += getHeight();
        if (getResizeableUrl() != null) {
            _hashCode += getResizeableUrl().hashCode();
        }
        _hashCode += getMaxResizeableWidth();
        _hashCode += getMaxResizeableHeight();
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Image.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "Image"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "parentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("width");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "width"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("height");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resizeableUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "resizeableUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxResizeableWidth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "maxResizeableWidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxResizeableHeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "maxResizeableHeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
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
