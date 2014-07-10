/**
 * Autor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.usp.memoriavirtual.servicos.soap;

public class Autor  implements java.io.Serializable {
    private br.usp.memoriavirtual.servicos.soap.Atividade atividade;

    private java.lang.String codinome;

    private long id;

    private java.lang.String nascimento;

    private java.lang.String nome;

    private java.lang.String obito;

    private java.lang.String sobrenome;

    public Autor() {
    }

    public Autor(
           br.usp.memoriavirtual.servicos.soap.Atividade atividade,
           java.lang.String codinome,
           long id,
           java.lang.String nascimento,
           java.lang.String nome,
           java.lang.String obito,
           java.lang.String sobrenome) {
           this.atividade = atividade;
           this.codinome = codinome;
           this.id = id;
           this.nascimento = nascimento;
           this.nome = nome;
           this.obito = obito;
           this.sobrenome = sobrenome;
    }


    /**
     * Gets the atividade value for this Autor.
     * 
     * @return atividade
     */
    public br.usp.memoriavirtual.servicos.soap.Atividade getAtividade() {
        return atividade;
    }


    /**
     * Sets the atividade value for this Autor.
     * 
     * @param atividade
     */
    public void setAtividade(br.usp.memoriavirtual.servicos.soap.Atividade atividade) {
        this.atividade = atividade;
    }


    /**
     * Gets the codinome value for this Autor.
     * 
     * @return codinome
     */
    public java.lang.String getCodinome() {
        return codinome;
    }


    /**
     * Sets the codinome value for this Autor.
     * 
     * @param codinome
     */
    public void setCodinome(java.lang.String codinome) {
        this.codinome = codinome;
    }


    /**
     * Gets the id value for this Autor.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this Autor.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the nascimento value for this Autor.
     * 
     * @return nascimento
     */
    public java.lang.String getNascimento() {
        return nascimento;
    }


    /**
     * Sets the nascimento value for this Autor.
     * 
     * @param nascimento
     */
    public void setNascimento(java.lang.String nascimento) {
        this.nascimento = nascimento;
    }


    /**
     * Gets the nome value for this Autor.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this Autor.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the obito value for this Autor.
     * 
     * @return obito
     */
    public java.lang.String getObito() {
        return obito;
    }


    /**
     * Sets the obito value for this Autor.
     * 
     * @param obito
     */
    public void setObito(java.lang.String obito) {
        this.obito = obito;
    }


    /**
     * Gets the sobrenome value for this Autor.
     * 
     * @return sobrenome
     */
    public java.lang.String getSobrenome() {
        return sobrenome;
    }


    /**
     * Sets the sobrenome value for this Autor.
     * 
     * @param sobrenome
     */
    public void setSobrenome(java.lang.String sobrenome) {
        this.sobrenome = sobrenome;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Autor)) return false;
        Autor other = (Autor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.atividade==null && other.getAtividade()==null) || 
             (this.atividade!=null &&
              this.atividade.equals(other.getAtividade()))) &&
            ((this.codinome==null && other.getCodinome()==null) || 
             (this.codinome!=null &&
              this.codinome.equals(other.getCodinome()))) &&
            this.id == other.getId() &&
            ((this.nascimento==null && other.getNascimento()==null) || 
             (this.nascimento!=null &&
              this.nascimento.equals(other.getNascimento()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.obito==null && other.getObito()==null) || 
             (this.obito!=null &&
              this.obito.equals(other.getObito()))) &&
            ((this.sobrenome==null && other.getSobrenome()==null) || 
             (this.sobrenome!=null &&
              this.sobrenome.equals(other.getSobrenome())));
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
        if (getAtividade() != null) {
            _hashCode += getAtividade().hashCode();
        }
        if (getCodinome() != null) {
            _hashCode += getCodinome().hashCode();
        }
        _hashCode += new Long(getId()).hashCode();
        if (getNascimento() != null) {
            _hashCode += getNascimento().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getObito() != null) {
            _hashCode += getObito().hashCode();
        }
        if (getSobrenome() != null) {
            _hashCode += getSobrenome().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Autor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "autor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atividade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "atividade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "atividade"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codinome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codinome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nascimento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nascimento"));
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
        elemField.setFieldName("obito");
        elemField.setXmlName(new javax.xml.namespace.QName("", "obito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sobrenome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sobrenome"));
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
