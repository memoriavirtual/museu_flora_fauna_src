/**
 * EstadoConservacao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.usp.memoriavirtual.servicos.soap;

public class EstadoConservacao implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EstadoConservacao(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _bom = "bom";
    public static final java.lang.String _precario = "precario";
    public static final java.lang.String _emArruinamento = "emArruinamento";
    public static final java.lang.String _arruinado = "arruinado";
    public static final EstadoConservacao bom = new EstadoConservacao(_bom);
    public static final EstadoConservacao precario = new EstadoConservacao(_precario);
    public static final EstadoConservacao emArruinamento = new EstadoConservacao(_emArruinamento);
    public static final EstadoConservacao arruinado = new EstadoConservacao(_arruinado);
    public java.lang.String getValue() { return _value_;}
    public static EstadoConservacao fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EstadoConservacao enumeration = (EstadoConservacao)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EstadoConservacao fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EstadoConservacao.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "estadoConservacao"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
