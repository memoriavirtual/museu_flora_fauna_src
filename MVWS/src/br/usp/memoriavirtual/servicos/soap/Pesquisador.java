/**
 * Pesquisador.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.usp.memoriavirtual.servicos.soap;

public class Pesquisador  implements java.io.Serializable {
    private java.lang.String dataPesquisa;

    private java.lang.String nome;

    private java.lang.String notasPesquisador;

    public Pesquisador() {
    }

    public Pesquisador(
           java.lang.String dataPesquisa,
           java.lang.String nome,
           java.lang.String notasPesquisador) {
           this.dataPesquisa = dataPesquisa;
           this.nome = nome;
           this.notasPesquisador = notasPesquisador;
    }


    /**
     * Gets the dataPesquisa value for this Pesquisador.
     * 
     * @return dataPesquisa
     */
    public java.lang.String getDataPesquisa() {
        return dataPesquisa;
    }


    /**
     * Sets the dataPesquisa value for this Pesquisador.
     * 
     * @param dataPesquisa
     */
    public void setDataPesquisa(java.lang.String dataPesquisa) {
        this.dataPesquisa = dataPesquisa;
    }


    /**
     * Gets the nome value for this Pesquisador.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this Pesquisador.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the notasPesquisador value for this Pesquisador.
     * 
     * @return notasPesquisador
     */
    public java.lang.String getNotasPesquisador() {
        return notasPesquisador;
    }


    /**
     * Sets the notasPesquisador value for this Pesquisador.
     * 
     * @param notasPesquisador
     */
    public void setNotasPesquisador(java.lang.String notasPesquisador) {
        this.notasPesquisador = notasPesquisador;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Pesquisador)) return false;
        Pesquisador other = (Pesquisador) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataPesquisa==null && other.getDataPesquisa()==null) || 
             (this.dataPesquisa!=null &&
              this.dataPesquisa.equals(other.getDataPesquisa()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.notasPesquisador==null && other.getNotasPesquisador()==null) || 
             (this.notasPesquisador!=null &&
              this.notasPesquisador.equals(other.getNotasPesquisador())));
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
        if (getDataPesquisa() != null) {
            _hashCode += getDataPesquisa().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getNotasPesquisador() != null) {
            _hashCode += getNotasPesquisador().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Pesquisador.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "pesquisador"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataPesquisa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataPesquisa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notasPesquisador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notasPesquisador"));
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
