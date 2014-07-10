/**
 * Buscar_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.usp.memoriavirtual.servicos.soap;

public class Buscar_ServiceLocator extends org.apache.axis.client.Service implements br.usp.memoriavirtual.servicos.soap.Buscar_Service {

    public Buscar_ServiceLocator() {
    }


    public Buscar_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Buscar_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RealizarBuscaSOAPServicePort
    private java.lang.String RealizarBuscaSOAPServicePort_address = "http://143.107.231.114:8080/memoriavirtualWebService/buscar";

    public java.lang.String getRealizarBuscaSOAPServicePortAddress() {
        return RealizarBuscaSOAPServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RealizarBuscaSOAPServicePortWSDDServiceName = "RealizarBuscaSOAPServicePort";

    public java.lang.String getRealizarBuscaSOAPServicePortWSDDServiceName() {
        return RealizarBuscaSOAPServicePortWSDDServiceName;
    }

    public void setRealizarBuscaSOAPServicePortWSDDServiceName(java.lang.String name) {
        RealizarBuscaSOAPServicePortWSDDServiceName = name;
    }

    public br.usp.memoriavirtual.servicos.soap.RealizarBuscaSOAPService getRealizarBuscaSOAPServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RealizarBuscaSOAPServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRealizarBuscaSOAPServicePort(endpoint);
    }

    public br.usp.memoriavirtual.servicos.soap.RealizarBuscaSOAPService getRealizarBuscaSOAPServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.usp.memoriavirtual.servicos.soap.RealizarBuscaSOAPServicePortBindingStub _stub = new br.usp.memoriavirtual.servicos.soap.RealizarBuscaSOAPServicePortBindingStub(portAddress, this);
            _stub.setPortName(getRealizarBuscaSOAPServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRealizarBuscaSOAPServicePortEndpointAddress(java.lang.String address) {
        RealizarBuscaSOAPServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.usp.memoriavirtual.servicos.soap.RealizarBuscaSOAPService.class.isAssignableFrom(serviceEndpointInterface)) {
                br.usp.memoriavirtual.servicos.soap.RealizarBuscaSOAPServicePortBindingStub _stub = new br.usp.memoriavirtual.servicos.soap.RealizarBuscaSOAPServicePortBindingStub(new java.net.URL(RealizarBuscaSOAPServicePort_address), this);
                _stub.setPortName(getRealizarBuscaSOAPServicePortWSDDServiceName());
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
        if ("RealizarBuscaSOAPServicePort".equals(inputPortName)) {
            return getRealizarBuscaSOAPServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "buscar");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "RealizarBuscaSOAPServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RealizarBuscaSOAPServicePort".equals(portName)) {
            setRealizarBuscaSOAPServicePortEndpointAddress(address);
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
