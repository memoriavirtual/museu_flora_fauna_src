/**
 * HistoricoProcedencia.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.usp.memoriavirtual.servicos.soap;

public class HistoricoProcedencia  implements java.io.Serializable {
    private java.lang.String dadosDocTransacao;

    private java.lang.String dataAquisicao;

    private java.lang.String historico;

    private java.lang.String instrumentoPesquisa;

    private java.lang.String primeiroProprietario;

    private br.usp.memoriavirtual.servicos.soap.TipoAquisicao tipoAquisicao;

    private java.lang.String valorVenalTransacao;

    public HistoricoProcedencia() {
    }

    public HistoricoProcedencia(
           java.lang.String dadosDocTransacao,
           java.lang.String dataAquisicao,
           java.lang.String historico,
           java.lang.String instrumentoPesquisa,
           java.lang.String primeiroProprietario,
           br.usp.memoriavirtual.servicos.soap.TipoAquisicao tipoAquisicao,
           java.lang.String valorVenalTransacao) {
           this.dadosDocTransacao = dadosDocTransacao;
           this.dataAquisicao = dataAquisicao;
           this.historico = historico;
           this.instrumentoPesquisa = instrumentoPesquisa;
           this.primeiroProprietario = primeiroProprietario;
           this.tipoAquisicao = tipoAquisicao;
           this.valorVenalTransacao = valorVenalTransacao;
    }


    /**
     * Gets the dadosDocTransacao value for this HistoricoProcedencia.
     * 
     * @return dadosDocTransacao
     */
    public java.lang.String getDadosDocTransacao() {
        return dadosDocTransacao;
    }


    /**
     * Sets the dadosDocTransacao value for this HistoricoProcedencia.
     * 
     * @param dadosDocTransacao
     */
    public void setDadosDocTransacao(java.lang.String dadosDocTransacao) {
        this.dadosDocTransacao = dadosDocTransacao;
    }


    /**
     * Gets the dataAquisicao value for this HistoricoProcedencia.
     * 
     * @return dataAquisicao
     */
    public java.lang.String getDataAquisicao() {
        return dataAquisicao;
    }


    /**
     * Sets the dataAquisicao value for this HistoricoProcedencia.
     * 
     * @param dataAquisicao
     */
    public void setDataAquisicao(java.lang.String dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }


    /**
     * Gets the historico value for this HistoricoProcedencia.
     * 
     * @return historico
     */
    public java.lang.String getHistorico() {
        return historico;
    }


    /**
     * Sets the historico value for this HistoricoProcedencia.
     * 
     * @param historico
     */
    public void setHistorico(java.lang.String historico) {
        this.historico = historico;
    }


    /**
     * Gets the instrumentoPesquisa value for this HistoricoProcedencia.
     * 
     * @return instrumentoPesquisa
     */
    public java.lang.String getInstrumentoPesquisa() {
        return instrumentoPesquisa;
    }


    /**
     * Sets the instrumentoPesquisa value for this HistoricoProcedencia.
     * 
     * @param instrumentoPesquisa
     */
    public void setInstrumentoPesquisa(java.lang.String instrumentoPesquisa) {
        this.instrumentoPesquisa = instrumentoPesquisa;
    }


    /**
     * Gets the primeiroProprietario value for this HistoricoProcedencia.
     * 
     * @return primeiroProprietario
     */
    public java.lang.String getPrimeiroProprietario() {
        return primeiroProprietario;
    }


    /**
     * Sets the primeiroProprietario value for this HistoricoProcedencia.
     * 
     * @param primeiroProprietario
     */
    public void setPrimeiroProprietario(java.lang.String primeiroProprietario) {
        this.primeiroProprietario = primeiroProprietario;
    }


    /**
     * Gets the tipoAquisicao value for this HistoricoProcedencia.
     * 
     * @return tipoAquisicao
     */
    public br.usp.memoriavirtual.servicos.soap.TipoAquisicao getTipoAquisicao() {
        return tipoAquisicao;
    }


    /**
     * Sets the tipoAquisicao value for this HistoricoProcedencia.
     * 
     * @param tipoAquisicao
     */
    public void setTipoAquisicao(br.usp.memoriavirtual.servicos.soap.TipoAquisicao tipoAquisicao) {
        this.tipoAquisicao = tipoAquisicao;
    }


    /**
     * Gets the valorVenalTransacao value for this HistoricoProcedencia.
     * 
     * @return valorVenalTransacao
     */
    public java.lang.String getValorVenalTransacao() {
        return valorVenalTransacao;
    }


    /**
     * Sets the valorVenalTransacao value for this HistoricoProcedencia.
     * 
     * @param valorVenalTransacao
     */
    public void setValorVenalTransacao(java.lang.String valorVenalTransacao) {
        this.valorVenalTransacao = valorVenalTransacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HistoricoProcedencia)) return false;
        HistoricoProcedencia other = (HistoricoProcedencia) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dadosDocTransacao==null && other.getDadosDocTransacao()==null) || 
             (this.dadosDocTransacao!=null &&
              this.dadosDocTransacao.equals(other.getDadosDocTransacao()))) &&
            ((this.dataAquisicao==null && other.getDataAquisicao()==null) || 
             (this.dataAquisicao!=null &&
              this.dataAquisicao.equals(other.getDataAquisicao()))) &&
            ((this.historico==null && other.getHistorico()==null) || 
             (this.historico!=null &&
              this.historico.equals(other.getHistorico()))) &&
            ((this.instrumentoPesquisa==null && other.getInstrumentoPesquisa()==null) || 
             (this.instrumentoPesquisa!=null &&
              this.instrumentoPesquisa.equals(other.getInstrumentoPesquisa()))) &&
            ((this.primeiroProprietario==null && other.getPrimeiroProprietario()==null) || 
             (this.primeiroProprietario!=null &&
              this.primeiroProprietario.equals(other.getPrimeiroProprietario()))) &&
            ((this.tipoAquisicao==null && other.getTipoAquisicao()==null) || 
             (this.tipoAquisicao!=null &&
              this.tipoAquisicao.equals(other.getTipoAquisicao()))) &&
            ((this.valorVenalTransacao==null && other.getValorVenalTransacao()==null) || 
             (this.valorVenalTransacao!=null &&
              this.valorVenalTransacao.equals(other.getValorVenalTransacao())));
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
        if (getDadosDocTransacao() != null) {
            _hashCode += getDadosDocTransacao().hashCode();
        }
        if (getDataAquisicao() != null) {
            _hashCode += getDataAquisicao().hashCode();
        }
        if (getHistorico() != null) {
            _hashCode += getHistorico().hashCode();
        }
        if (getInstrumentoPesquisa() != null) {
            _hashCode += getInstrumentoPesquisa().hashCode();
        }
        if (getPrimeiroProprietario() != null) {
            _hashCode += getPrimeiroProprietario().hashCode();
        }
        if (getTipoAquisicao() != null) {
            _hashCode += getTipoAquisicao().hashCode();
        }
        if (getValorVenalTransacao() != null) {
            _hashCode += getValorVenalTransacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HistoricoProcedencia.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "historicoProcedencia"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dadosDocTransacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dadosDocTransacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataAquisicao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataAquisicao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historico");
        elemField.setXmlName(new javax.xml.namespace.QName("", "historico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instrumentoPesquisa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instrumentoPesquisa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primeiroProprietario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primeiroProprietario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoAquisicao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoAquisicao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "tipoAquisicao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorVenalTransacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorVenalTransacao"));
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
