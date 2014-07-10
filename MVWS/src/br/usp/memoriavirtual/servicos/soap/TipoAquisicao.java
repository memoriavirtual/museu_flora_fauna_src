/**
 * TipoAquisicao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.usp.memoriavirtual.servicos.soap;

public class TipoAquisicao implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TipoAquisicao(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _comprado = "comprado";
    public static final java.lang.String _trocado = "trocado";
    public static final java.lang.String _doacaoInstitucional = "doacaoInstitucional";
    public static final java.lang.String _doacaoPessoal = "doacaoPessoal";
    public static final java.lang.String _emprestado = "emprestado";
    public static final TipoAquisicao comprado = new TipoAquisicao(_comprado);
    public static final TipoAquisicao trocado = new TipoAquisicao(_trocado);
    public static final TipoAquisicao doacaoInstitucional = new TipoAquisicao(_doacaoInstitucional);
    public static final TipoAquisicao doacaoPessoal = new TipoAquisicao(_doacaoPessoal);
    public static final TipoAquisicao emprestado = new TipoAquisicao(_emprestado);
    public java.lang.String getValue() { return _value_;}
    public static TipoAquisicao fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TipoAquisicao enumeration = (TipoAquisicao)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TipoAquisicao fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TipoAquisicao.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "tipoAquisicao"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
