/**
 * Atividade.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.usp.memoriavirtual.servicos.soap;

public class Atividade implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Atividade(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _adaptador = "adaptador";
    public static final java.lang.String _arquiteto = "arquiteto";
    public static final java.lang.String _arranjador = "arranjador";
    public static final java.lang.String _classificador = "classificador";
    public static final java.lang.String _comentador = "comentador";
    public static final java.lang.String _compilador = "compilador";
    public static final java.lang.String _cozinheiro = "cozinheiro";
    public static final java.lang.String _designer = "designer";
    public static final java.lang.String _engenheiro = "engenheiro";
    public static final java.lang.String _escritor = "escritor";
    public static final java.lang.String _escultor = "escultor";
    public static final java.lang.String _fundador = "fundador";
    public static final java.lang.String _fotografo = "fotografo";
    public static final java.lang.String _horticulturista = "horticulturista";
    public static final java.lang.String _ilustrador = "ilustrador";
    public static final java.lang.String _interprete = "interprete";
    public static final java.lang.String _jardineiro = "jardineiro";
    public static final java.lang.String _pintor = "pintor";
    public static final java.lang.String _reporter = "reporter";
    public static final java.lang.String _revisor = "revisor";
    public static final java.lang.String _roteirista = "roteirista";
    public static final Atividade adaptador = new Atividade(_adaptador);
    public static final Atividade arquiteto = new Atividade(_arquiteto);
    public static final Atividade arranjador = new Atividade(_arranjador);
    public static final Atividade classificador = new Atividade(_classificador);
    public static final Atividade comentador = new Atividade(_comentador);
    public static final Atividade compilador = new Atividade(_compilador);
    public static final Atividade cozinheiro = new Atividade(_cozinheiro);
    public static final Atividade designer = new Atividade(_designer);
    public static final Atividade engenheiro = new Atividade(_engenheiro);
    public static final Atividade escritor = new Atividade(_escritor);
    public static final Atividade escultor = new Atividade(_escultor);
    public static final Atividade fundador = new Atividade(_fundador);
    public static final Atividade fotografo = new Atividade(_fotografo);
    public static final Atividade horticulturista = new Atividade(_horticulturista);
    public static final Atividade ilustrador = new Atividade(_ilustrador);
    public static final Atividade interprete = new Atividade(_interprete);
    public static final Atividade jardineiro = new Atividade(_jardineiro);
    public static final Atividade pintor = new Atividade(_pintor);
    public static final Atividade reporter = new Atividade(_reporter);
    public static final Atividade revisor = new Atividade(_revisor);
    public static final Atividade roteirista = new Atividade(_roteirista);
    public java.lang.String getValue() { return _value_;}
    public static Atividade fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Atividade enumeration = (Atividade)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Atividade fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Atividade.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "atividade"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
