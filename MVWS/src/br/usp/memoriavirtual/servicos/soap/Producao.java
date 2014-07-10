/**
 * Producao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.usp.memoriavirtual.servicos.soap;

public class Producao  implements java.io.Serializable {
    private java.lang.String ano;

    private java.lang.String edicao;

    private java.lang.String local;

    private java.lang.String outrasResponsabilidades;

    public Producao() {
    }

    public Producao(
           java.lang.String ano,
           java.lang.String edicao,
           java.lang.String local,
           java.lang.String outrasResponsabilidades) {
           this.ano = ano;
           this.edicao = edicao;
           this.local = local;
           this.outrasResponsabilidades = outrasResponsabilidades;
    }


    /**
     * Gets the ano value for this Producao.
     * 
     * @return ano
     */
    public java.lang.String getAno() {
        return ano;
    }


    /**
     * Sets the ano value for this Producao.
     * 
     * @param ano
     */
    public void setAno(java.lang.String ano) {
        this.ano = ano;
    }


    /**
     * Gets the edicao value for this Producao.
     * 
     * @return edicao
     */
    public java.lang.String getEdicao() {
        return edicao;
    }


    /**
     * Sets the edicao value for this Producao.
     * 
     * @param edicao
     */
    public void setEdicao(java.lang.String edicao) {
        this.edicao = edicao;
    }


    /**
     * Gets the local value for this Producao.
     * 
     * @return local
     */
    public java.lang.String getLocal() {
        return local;
    }


    /**
     * Sets the local value for this Producao.
     * 
     * @param local
     */
    public void setLocal(java.lang.String local) {
        this.local = local;
    }


    /**
     * Gets the outrasResponsabilidades value for this Producao.
     * 
     * @return outrasResponsabilidades
     */
    public java.lang.String getOutrasResponsabilidades() {
        return outrasResponsabilidades;
    }


    /**
     * Sets the outrasResponsabilidades value for this Producao.
     * 
     * @param outrasResponsabilidades
     */
    public void setOutrasResponsabilidades(java.lang.String outrasResponsabilidades) {
        this.outrasResponsabilidades = outrasResponsabilidades;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Producao)) return false;
        Producao other = (Producao) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ano==null && other.getAno()==null) || 
             (this.ano!=null &&
              this.ano.equals(other.getAno()))) &&
            ((this.edicao==null && other.getEdicao()==null) || 
             (this.edicao!=null &&
              this.edicao.equals(other.getEdicao()))) &&
            ((this.local==null && other.getLocal()==null) || 
             (this.local!=null &&
              this.local.equals(other.getLocal()))) &&
            ((this.outrasResponsabilidades==null && other.getOutrasResponsabilidades()==null) || 
             (this.outrasResponsabilidades!=null &&
              this.outrasResponsabilidades.equals(other.getOutrasResponsabilidades())));
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
        if (getAno() != null) {
            _hashCode += getAno().hashCode();
        }
        if (getEdicao() != null) {
            _hashCode += getEdicao().hashCode();
        }
        if (getLocal() != null) {
            _hashCode += getLocal().hashCode();
        }
        if (getOutrasResponsabilidades() != null) {
            _hashCode += getOutrasResponsabilidades().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Producao.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "producao"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ano");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ano"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("edicao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "edicao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("local");
        elemField.setXmlName(new javax.xml.namespace.QName("", "local"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outrasResponsabilidades");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outrasResponsabilidades"));
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
