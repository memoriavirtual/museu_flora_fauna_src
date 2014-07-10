/**
 * Disponibilidade.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.usp.memoriavirtual.servicos.soap;

public class Disponibilidade implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Disponibilidade(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _acervo = "acervo";
    public static final java.lang.String _evento = "evento";
    public static final java.lang.String _exposicaoPermanente = "exposicaoPermanente";
    public static final java.lang.String _emprestimo = "emprestimo";
    public static final java.lang.String _restauro = "restauro";
    public static final java.lang.String _baixa = "baixa";
    public static final Disponibilidade acervo = new Disponibilidade(_acervo);
    public static final Disponibilidade evento = new Disponibilidade(_evento);
    public static final Disponibilidade exposicaoPermanente = new Disponibilidade(_exposicaoPermanente);
    public static final Disponibilidade emprestimo = new Disponibilidade(_emprestimo);
    public static final Disponibilidade restauro = new Disponibilidade(_restauro);
    public static final Disponibilidade baixa = new Disponibilidade(_baixa);
    public java.lang.String getValue() { return _value_;}
    public static Disponibilidade fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Disponibilidade enumeration = (Disponibilidade)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Disponibilidade fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Disponibilidade.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "disponibilidade"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
