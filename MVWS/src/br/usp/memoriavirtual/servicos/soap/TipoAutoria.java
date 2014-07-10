/**
 * TipoAutoria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.usp.memoriavirtual.servicos.soap;

public class TipoAutoria implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TipoAutoria(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _coautor = "coautor";
    public static final java.lang.String _organizador = "organizador";
    public static final java.lang.String _agencia = "agencia";
    public static final java.lang.String _autor = "autor";
    public static final java.lang.String _autorInstitucional = "autorInstitucional";
    public static final java.lang.String _compilador = "compilador";
    public static final java.lang.String _coordenador = "coordenador";
    public static final java.lang.String _diretor = "diretor";
    public static final java.lang.String _editor = "editor";
    public static final java.lang.String _entidadeProdutora = "entidadeProdutora";
    public static final java.lang.String _entrevistado = "entrevistado";
    public static final java.lang.String _estudio = "estudio";
    public static final java.lang.String _fabricante = "fabricante";
    public static final java.lang.String _figurinista = "figurinista";
    public static final java.lang.String _fotografo = "fotografo";
    public static final java.lang.String _ilustrador = "ilustrador";
    public static final java.lang.String _palestrante = "palestrante";
    public static final java.lang.String _prefaciador = "prefaciador";
    public static final java.lang.String _tradutor = "tradutor";
    public static final TipoAutoria coautor = new TipoAutoria(_coautor);
    public static final TipoAutoria organizador = new TipoAutoria(_organizador);
    public static final TipoAutoria agencia = new TipoAutoria(_agencia);
    public static final TipoAutoria autor = new TipoAutoria(_autor);
    public static final TipoAutoria autorInstitucional = new TipoAutoria(_autorInstitucional);
    public static final TipoAutoria compilador = new TipoAutoria(_compilador);
    public static final TipoAutoria coordenador = new TipoAutoria(_coordenador);
    public static final TipoAutoria diretor = new TipoAutoria(_diretor);
    public static final TipoAutoria editor = new TipoAutoria(_editor);
    public static final TipoAutoria entidadeProdutora = new TipoAutoria(_entidadeProdutora);
    public static final TipoAutoria entrevistado = new TipoAutoria(_entrevistado);
    public static final TipoAutoria estudio = new TipoAutoria(_estudio);
    public static final TipoAutoria fabricante = new TipoAutoria(_fabricante);
    public static final TipoAutoria figurinista = new TipoAutoria(_figurinista);
    public static final TipoAutoria fotografo = new TipoAutoria(_fotografo);
    public static final TipoAutoria ilustrador = new TipoAutoria(_ilustrador);
    public static final TipoAutoria palestrante = new TipoAutoria(_palestrante);
    public static final TipoAutoria prefaciador = new TipoAutoria(_prefaciador);
    public static final TipoAutoria tradutor = new TipoAutoria(_tradutor);
    public java.lang.String getValue() { return _value_;}
    public static TipoAutoria fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TipoAutoria enumeration = (TipoAutoria)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TipoAutoria fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TipoAutoria.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "tipoAutoria"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
