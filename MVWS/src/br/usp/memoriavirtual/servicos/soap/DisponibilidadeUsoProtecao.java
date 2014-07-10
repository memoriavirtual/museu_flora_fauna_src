/**
 * DisponibilidadeUsoProtecao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.usp.memoriavirtual.servicos.soap;

public class DisponibilidadeUsoProtecao  implements java.io.Serializable {
    private br.usp.memoriavirtual.servicos.soap.CondicoesAcesso condicoesAcesso;

    private br.usp.memoriavirtual.servicos.soap.CondicoesReproducao condicoesReproducao;

    private java.lang.String dataRetorno;

    private br.usp.memoriavirtual.servicos.soap.Disponibilidade disponibilidade;

    private java.lang.String legislacao;

    private java.lang.String notasUsoAproveitamento;

    private br.usp.memoriavirtual.servicos.soap.Protecao protecao;

    private java.lang.String protetoraInstituicao;

    public DisponibilidadeUsoProtecao() {
    }

    public DisponibilidadeUsoProtecao(
           br.usp.memoriavirtual.servicos.soap.CondicoesAcesso condicoesAcesso,
           br.usp.memoriavirtual.servicos.soap.CondicoesReproducao condicoesReproducao,
           java.lang.String dataRetorno,
           br.usp.memoriavirtual.servicos.soap.Disponibilidade disponibilidade,
           java.lang.String legislacao,
           java.lang.String notasUsoAproveitamento,
           br.usp.memoriavirtual.servicos.soap.Protecao protecao,
           java.lang.String protetoraInstituicao) {
           this.condicoesAcesso = condicoesAcesso;
           this.condicoesReproducao = condicoesReproducao;
           this.dataRetorno = dataRetorno;
           this.disponibilidade = disponibilidade;
           this.legislacao = legislacao;
           this.notasUsoAproveitamento = notasUsoAproveitamento;
           this.protecao = protecao;
           this.protetoraInstituicao = protetoraInstituicao;
    }


    /**
     * Gets the condicoesAcesso value for this DisponibilidadeUsoProtecao.
     * 
     * @return condicoesAcesso
     */
    public br.usp.memoriavirtual.servicos.soap.CondicoesAcesso getCondicoesAcesso() {
        return condicoesAcesso;
    }


    /**
     * Sets the condicoesAcesso value for this DisponibilidadeUsoProtecao.
     * 
     * @param condicoesAcesso
     */
    public void setCondicoesAcesso(br.usp.memoriavirtual.servicos.soap.CondicoesAcesso condicoesAcesso) {
        this.condicoesAcesso = condicoesAcesso;
    }


    /**
     * Gets the condicoesReproducao value for this DisponibilidadeUsoProtecao.
     * 
     * @return condicoesReproducao
     */
    public br.usp.memoriavirtual.servicos.soap.CondicoesReproducao getCondicoesReproducao() {
        return condicoesReproducao;
    }


    /**
     * Sets the condicoesReproducao value for this DisponibilidadeUsoProtecao.
     * 
     * @param condicoesReproducao
     */
    public void setCondicoesReproducao(br.usp.memoriavirtual.servicos.soap.CondicoesReproducao condicoesReproducao) {
        this.condicoesReproducao = condicoesReproducao;
    }


    /**
     * Gets the dataRetorno value for this DisponibilidadeUsoProtecao.
     * 
     * @return dataRetorno
     */
    public java.lang.String getDataRetorno() {
        return dataRetorno;
    }


    /**
     * Sets the dataRetorno value for this DisponibilidadeUsoProtecao.
     * 
     * @param dataRetorno
     */
    public void setDataRetorno(java.lang.String dataRetorno) {
        this.dataRetorno = dataRetorno;
    }


    /**
     * Gets the disponibilidade value for this DisponibilidadeUsoProtecao.
     * 
     * @return disponibilidade
     */
    public br.usp.memoriavirtual.servicos.soap.Disponibilidade getDisponibilidade() {
        return disponibilidade;
    }


    /**
     * Sets the disponibilidade value for this DisponibilidadeUsoProtecao.
     * 
     * @param disponibilidade
     */
    public void setDisponibilidade(br.usp.memoriavirtual.servicos.soap.Disponibilidade disponibilidade) {
        this.disponibilidade = disponibilidade;
    }


    /**
     * Gets the legislacao value for this DisponibilidadeUsoProtecao.
     * 
     * @return legislacao
     */
    public java.lang.String getLegislacao() {
        return legislacao;
    }


    /**
     * Sets the legislacao value for this DisponibilidadeUsoProtecao.
     * 
     * @param legislacao
     */
    public void setLegislacao(java.lang.String legislacao) {
        this.legislacao = legislacao;
    }


    /**
     * Gets the notasUsoAproveitamento value for this DisponibilidadeUsoProtecao.
     * 
     * @return notasUsoAproveitamento
     */
    public java.lang.String getNotasUsoAproveitamento() {
        return notasUsoAproveitamento;
    }


    /**
     * Sets the notasUsoAproveitamento value for this DisponibilidadeUsoProtecao.
     * 
     * @param notasUsoAproveitamento
     */
    public void setNotasUsoAproveitamento(java.lang.String notasUsoAproveitamento) {
        this.notasUsoAproveitamento = notasUsoAproveitamento;
    }


    /**
     * Gets the protecao value for this DisponibilidadeUsoProtecao.
     * 
     * @return protecao
     */
    public br.usp.memoriavirtual.servicos.soap.Protecao getProtecao() {
        return protecao;
    }


    /**
     * Sets the protecao value for this DisponibilidadeUsoProtecao.
     * 
     * @param protecao
     */
    public void setProtecao(br.usp.memoriavirtual.servicos.soap.Protecao protecao) {
        this.protecao = protecao;
    }


    /**
     * Gets the protetoraInstituicao value for this DisponibilidadeUsoProtecao.
     * 
     * @return protetoraInstituicao
     */
    public java.lang.String getProtetoraInstituicao() {
        return protetoraInstituicao;
    }


    /**
     * Sets the protetoraInstituicao value for this DisponibilidadeUsoProtecao.
     * 
     * @param protetoraInstituicao
     */
    public void setProtetoraInstituicao(java.lang.String protetoraInstituicao) {
        this.protetoraInstituicao = protetoraInstituicao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DisponibilidadeUsoProtecao)) return false;
        DisponibilidadeUsoProtecao other = (DisponibilidadeUsoProtecao) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.condicoesAcesso==null && other.getCondicoesAcesso()==null) || 
             (this.condicoesAcesso!=null &&
              this.condicoesAcesso.equals(other.getCondicoesAcesso()))) &&
            ((this.condicoesReproducao==null && other.getCondicoesReproducao()==null) || 
             (this.condicoesReproducao!=null &&
              this.condicoesReproducao.equals(other.getCondicoesReproducao()))) &&
            ((this.dataRetorno==null && other.getDataRetorno()==null) || 
             (this.dataRetorno!=null &&
              this.dataRetorno.equals(other.getDataRetorno()))) &&
            ((this.disponibilidade==null && other.getDisponibilidade()==null) || 
             (this.disponibilidade!=null &&
              this.disponibilidade.equals(other.getDisponibilidade()))) &&
            ((this.legislacao==null && other.getLegislacao()==null) || 
             (this.legislacao!=null &&
              this.legislacao.equals(other.getLegislacao()))) &&
            ((this.notasUsoAproveitamento==null && other.getNotasUsoAproveitamento()==null) || 
             (this.notasUsoAproveitamento!=null &&
              this.notasUsoAproveitamento.equals(other.getNotasUsoAproveitamento()))) &&
            ((this.protecao==null && other.getProtecao()==null) || 
             (this.protecao!=null &&
              this.protecao.equals(other.getProtecao()))) &&
            ((this.protetoraInstituicao==null && other.getProtetoraInstituicao()==null) || 
             (this.protetoraInstituicao!=null &&
              this.protetoraInstituicao.equals(other.getProtetoraInstituicao())));
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
        if (getCondicoesAcesso() != null) {
            _hashCode += getCondicoesAcesso().hashCode();
        }
        if (getCondicoesReproducao() != null) {
            _hashCode += getCondicoesReproducao().hashCode();
        }
        if (getDataRetorno() != null) {
            _hashCode += getDataRetorno().hashCode();
        }
        if (getDisponibilidade() != null) {
            _hashCode += getDisponibilidade().hashCode();
        }
        if (getLegislacao() != null) {
            _hashCode += getLegislacao().hashCode();
        }
        if (getNotasUsoAproveitamento() != null) {
            _hashCode += getNotasUsoAproveitamento().hashCode();
        }
        if (getProtecao() != null) {
            _hashCode += getProtecao().hashCode();
        }
        if (getProtetoraInstituicao() != null) {
            _hashCode += getProtetoraInstituicao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DisponibilidadeUsoProtecao.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "disponibilidadeUsoProtecao"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("condicoesAcesso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "condicoesAcesso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "condicoesAcesso"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("condicoesReproducao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "condicoesReproducao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "condicoesReproducao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataRetorno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataRetorno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disponibilidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disponibilidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "disponibilidade"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legislacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "legislacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notasUsoAproveitamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notasUsoAproveitamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protecao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "protecao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "protecao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protetoraInstituicao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "protetoraInstituicao"));
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
