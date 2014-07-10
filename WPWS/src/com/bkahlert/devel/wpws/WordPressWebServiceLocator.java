/**
 * WordPressWebServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkahlert.devel.wpws;

public class WordPressWebServiceLocator extends org.apache.axis.client.Service implements com.bkahlert.devel.wpws.WordPressWebService {

    public WordPressWebServiceLocator() {
    }


    public WordPressWebServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WordPressWebServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WordPressWebServiceHttpSoapEndpoint
    private java.lang.String WordPressWebServiceHttpSoapEndpoint_address = "http://localhost:8080/quercus/wordpress/index.php?/wpws";

    public java.lang.String getWordPressWebServiceHttpSoapEndpointAddress() {
        return WordPressWebServiceHttpSoapEndpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WordPressWebServiceHttpSoapEndpointWSDDServiceName = "WordPressWebServiceHttpSoapEndpoint";

    public java.lang.String getWordPressWebServiceHttpSoapEndpointWSDDServiceName() {
        return WordPressWebServiceHttpSoapEndpointWSDDServiceName;
    }

    public void setWordPressWebServiceHttpSoapEndpointWSDDServiceName(java.lang.String name) {
        WordPressWebServiceHttpSoapEndpointWSDDServiceName = name;
    }

    public com.bkahlert.devel.wpws.WordPressWebServicePortType getWordPressWebServiceHttpSoapEndpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WordPressWebServiceHttpSoapEndpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWordPressWebServiceHttpSoapEndpoint(endpoint);
    }

    public com.bkahlert.devel.wpws.WordPressWebServicePortType getWordPressWebServiceHttpSoapEndpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.bkahlert.devel.wpws.WordPressWebServiceSoapBindingStub _stub = new com.bkahlert.devel.wpws.WordPressWebServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getWordPressWebServiceHttpSoapEndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWordPressWebServiceHttpSoapEndpointEndpointAddress(java.lang.String address) {
        WordPressWebServiceHttpSoapEndpoint_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.bkahlert.devel.wpws.WordPressWebServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.bkahlert.devel.wpws.WordPressWebServiceSoapBindingStub _stub = new com.bkahlert.devel.wpws.WordPressWebServiceSoapBindingStub(new java.net.URL(WordPressWebServiceHttpSoapEndpoint_address), this);
                _stub.setPortName(getWordPressWebServiceHttpSoapEndpointWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WordPressWebServiceHttpSoapEndpoint".equals(inputPortName)) {
            return getWordPressWebServiceHttpSoapEndpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://wpws.devel.bkahlert.com", "WordPressWebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://wpws.devel.bkahlert.com", "WordPressWebServiceHttpSoapEndpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WordPressWebServiceHttpSoapEndpoint".equals(portName)) {
            setWordPressWebServiceHttpSoapEndpointEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
