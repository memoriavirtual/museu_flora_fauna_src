/**
 * Gallery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkahlert.devel.wpws.model;

public class Gallery  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 5796062151044850987L;

	private int id;

    private int parentId;

    private java.lang.String title;

    private java.lang.String description;

    private com.bkahlert.devel.wpws.model.Image mainImage;

    private com.bkahlert.devel.wpws.model.Image[] images;

    private com.bkahlert.devel.wpws.model.Gallery[] subGalleries;

    public Gallery() {
    }

    public Gallery(
           int id,
           int parentId,
           java.lang.String title,
           java.lang.String description,
           com.bkahlert.devel.wpws.model.Image mainImage,
           com.bkahlert.devel.wpws.model.Image[] images,
           com.bkahlert.devel.wpws.model.Gallery[] subGalleries) {
           this.id = id;
           this.parentId = parentId;
           this.title = title;
           this.description = description;
           this.mainImage = mainImage;
           this.images = images;
           this.subGalleries = subGalleries;
    }


    /**
     * Gets the id value for this Gallery.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this Gallery.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the parentId value for this Gallery.
     * 
     * @return parentId
     */
    public int getParentId() {
        return parentId;
    }


    /**
     * Sets the parentId value for this Gallery.
     * 
     * @param parentId
     */
    public void setParentId(int parentId) {
        this.parentId = parentId;
    }


    /**
     * Gets the title value for this Gallery.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Gallery.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the description value for this Gallery.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Gallery.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the mainImage value for this Gallery.
     * 
     * @return mainImage
     */
    public com.bkahlert.devel.wpws.model.Image getMainImage() {
        return mainImage;
    }


    /**
     * Sets the mainImage value for this Gallery.
     * 
     * @param mainImage
     */
    public void setMainImage(com.bkahlert.devel.wpws.model.Image mainImage) {
        this.mainImage = mainImage;
    }


    /**
     * Gets the images value for this Gallery.
     * 
     * @return images
     */
    public com.bkahlert.devel.wpws.model.Image[] getImages() {
        return images;
    }


    /**
     * Sets the images value for this Gallery.
     * 
     * @param images
     */
    public void setImages(com.bkahlert.devel.wpws.model.Image[] images) {
        this.images = images;
    }


    /**
     * Gets the subGalleries value for this Gallery.
     * 
     * @return subGalleries
     */
    public com.bkahlert.devel.wpws.model.Gallery[] getSubGalleries() {
        return subGalleries;
    }


    /**
     * Sets the subGalleries value for this Gallery.
     * 
     * @param subGalleries
     */
    public void setSubGalleries(com.bkahlert.devel.wpws.model.Gallery[] subGalleries) {
        this.subGalleries = subGalleries;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gallery)) return false;
        Gallery other = (Gallery) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            this.parentId == other.getParentId() &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.mainImage==null && other.getMainImage()==null) || 
             (this.mainImage!=null &&
              this.mainImage.equals(other.getMainImage()))) &&
            ((this.images==null && other.getImages()==null) || 
             (this.images!=null &&
              java.util.Arrays.equals(this.images, other.getImages()))) &&
            ((this.subGalleries==null && other.getSubGalleries()==null) || 
             (this.subGalleries!=null &&
              java.util.Arrays.equals(this.subGalleries, other.getSubGalleries())));
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
        _hashCode += getId();
        _hashCode += getParentId();
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getMainImage() != null) {
            _hashCode += getMainImage().hashCode();
        }
        if (getImages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubGalleries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubGalleries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubGalleries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gallery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "Gallery"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "parentId"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainImage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "mainImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "Image"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("images");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "images"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "Image"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://wpws.devel.bkahlert.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGalleries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "subGalleries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://model.wpws.devel.bkahlert.com", "Gallery"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://wpws.devel.bkahlert.com", "item"));
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
