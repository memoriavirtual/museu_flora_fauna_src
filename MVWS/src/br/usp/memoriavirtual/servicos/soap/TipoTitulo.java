/**
 * TipoTitulo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.usp.memoriavirtual.servicos.soap;

public class TipoTitulo implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TipoTitulo(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _equivalente = "equivalente";
    public static final java.lang.String _atribuido = "atribuido";
    public static final java.lang.String _subtitulo = "subtitulo";
    public static final java.lang.String _anterior = "anterior";
    public static final java.lang.String _posterior = "posterior";
    public static final java.lang.String _suplemento = "suplemento";
    public static final java.lang.String _correlato = "correlato";
    public static final TipoTitulo equivalente = new TipoTitulo(_equivalente);
    public static final TipoTitulo atribuido = new TipoTitulo(_atribuido);
    public static final TipoTitulo subtitulo = new TipoTitulo(_subtitulo);
    public static final TipoTitulo anterior = new TipoTitulo(_anterior);
    public static final TipoTitulo posterior = new TipoTitulo(_posterior);
    public static final TipoTitulo suplemento = new TipoTitulo(_suplemento);
    public static final TipoTitulo correlato = new TipoTitulo(_correlato);
    public java.lang.String getValue() { return _value_;}
    public static TipoTitulo fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TipoTitulo enumeration = (TipoTitulo)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TipoTitulo fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TipoTitulo.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "tipoTitulo"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
