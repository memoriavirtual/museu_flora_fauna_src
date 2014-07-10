/**
 * Diagnostico.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.usp.memoriavirtual.servicos.soap;

public class Diagnostico  implements java.io.Serializable {
    private br.usp.memoriavirtual.servicos.soap.EstadoConservacao estadoConservacao;

    private br.usp.memoriavirtual.servicos.soap.EstadoPreservacao estadoPreservacao;

    private java.lang.String notasEstadoConservacao;

    public Diagnostico() {
    }

    public Diagnostico(
           br.usp.memoriavirtual.servicos.soap.EstadoConservacao estadoConservacao,
           br.usp.memoriavirtual.servicos.soap.EstadoPreservacao estadoPreservacao,
           java.lang.String notasEstadoConservacao) {
           this.estadoConservacao = estadoConservacao;
           this.estadoPreservacao = estadoPreservacao;
           this.notasEstadoConservacao = notasEstadoConservacao;
    }


    /**
     * Gets the estadoConservacao value for this Diagnostico.
     * 
     * @return estadoConservacao
     */
    public br.usp.memoriavirtual.servicos.soap.EstadoConservacao getEstadoConservacao() {
        return estadoConservacao;
    }


    /**
     * Sets the estadoConservacao value for this Diagnostico.
     * 
     * @param estadoConservacao
     */
    public void setEstadoConservacao(br.usp.memoriavirtual.servicos.soap.EstadoConservacao estadoConservacao) {
        this.estadoConservacao = estadoConservacao;
    }


    /**
     * Gets the estadoPreservacao value for this Diagnostico.
     * 
     * @return estadoPreservacao
     */
    public br.usp.memoriavirtual.servicos.soap.EstadoPreservacao getEstadoPreservacao() {
        return estadoPreservacao;
    }


    /**
     * Sets the estadoPreservacao value for this Diagnostico.
     * 
     * @param estadoPreservacao
     */
    public void setEstadoPreservacao(br.usp.memoriavirtual.servicos.soap.EstadoPreservacao estadoPreservacao) {
        this.estadoPreservacao = estadoPreservacao;
    }


    /**
     * Gets the notasEstadoConservacao value for this Diagnostico.
     * 
     * @return notasEstadoConservacao
     */
    public java.lang.String getNotasEstadoConservacao() {
        return notasEstadoConservacao;
    }


    /**
     * Sets the notasEstadoConservacao value for this Diagnostico.
     * 
     * @param notasEstadoConservacao
     */
    public void setNotasEstadoConservacao(java.lang.String notasEstadoConservacao) {
        this.notasEstadoConservacao = notasEstadoConservacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Diagnostico)) return false;
        Diagnostico other = (Diagnostico) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.estadoConservacao==null && other.getEstadoConservacao()==null) || 
             (this.estadoConservacao!=null &&
              this.estadoConservacao.equals(other.getEstadoConservacao()))) &&
            ((this.estadoPreservacao==null && other.getEstadoPreservacao()==null) || 
             (this.estadoPreservacao!=null &&
              this.estadoPreservacao.equals(other.getEstadoPreservacao()))) &&
            ((this.notasEstadoConservacao==null && other.getNotasEstadoConservacao()==null) || 
             (this.notasEstadoConservacao!=null &&
              this.notasEstadoConservacao.equals(other.getNotasEstadoConservacao())));
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
        if (getEstadoConservacao() != null) {
            _hashCode += getEstadoConservacao().hashCode();
        }
        if (getEstadoPreservacao() != null) {
            _hashCode += getEstadoPreservacao().hashCode();
        }
        if (getNotasEstadoConservacao() != null) {
            _hashCode += getNotasEstadoConservacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Diagnostico.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "diagnostico"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoConservacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estadoConservacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "estadoConservacao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoPreservacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estadoPreservacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "estadoPreservacao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notasEstadoConservacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notasEstadoConservacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
