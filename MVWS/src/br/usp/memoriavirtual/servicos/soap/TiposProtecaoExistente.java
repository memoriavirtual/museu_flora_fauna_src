/**
 * TiposProtecaoExistente.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.usp.memoriavirtual.servicos.soap;

public class TiposProtecaoExistente implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TiposProtecaoExistente(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _mundial = "mundial";
    public static final java.lang.String _federalIndividual = "federalIndividual";
    public static final java.lang.String _federalConjunto = "federalConjunto";
    public static final java.lang.String _estadualIndividual = "estadualIndividual";
    public static final java.lang.String _estadualConjunto = "estadualConjunto";
    public static final java.lang.String _municipalIndividual = "municipalIndividual";
    public static final java.lang.String _municipalConjunto = "municipalConjunto";
    public static final java.lang.String _decreto = "decreto";
    public static final java.lang.String _entorno = "entorno";
    public static final java.lang.String _nenhuma = "nenhuma";
    public static final TiposProtecaoExistente mundial = new TiposProtecaoExistente(_mundial);
    public static final TiposProtecaoExistente federalIndividual = new TiposProtecaoExistente(_federalIndividual);
    public static final TiposProtecaoExistente federalConjunto = new TiposProtecaoExistente(_federalConjunto);
    public static final TiposProtecaoExistente estadualIndividual = new TiposProtecaoExistente(_estadualIndividual);
    public static final TiposProtecaoExistente estadualConjunto = new TiposProtecaoExistente(_estadualConjunto);
    public static final TiposProtecaoExistente municipalIndividual = new TiposProtecaoExistente(_municipalIndividual);
    public static final TiposProtecaoExistente municipalConjunto = new TiposProtecaoExistente(_municipalConjunto);
    public static final TiposProtecaoExistente decreto = new TiposProtecaoExistente(_decreto);
    public static final TiposProtecaoExistente entorno = new TiposProtecaoExistente(_entorno);
    public static final TiposProtecaoExistente nenhuma = new TiposProtecaoExistente(_nenhuma);
    public java.lang.String getValue() { return _value_;}
    public static TiposProtecaoExistente fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TiposProtecaoExistente enumeration = (TiposProtecaoExistente)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TiposProtecaoExistente fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TiposProtecaoExistente.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "tiposProtecaoExistente"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
