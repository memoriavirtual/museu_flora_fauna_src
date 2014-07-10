/**
 * WordPressWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkahlert.devel.wpws;

public interface WordPressWebService extends javax.xml.rpc.Service {
    public java.lang.String getWordPressWebServiceHttpSoapEndpointAddress();

    public com.bkahlert.devel.wpws.WordPressWebServicePortType getWordPressWebServiceHttpSoapEndpoint() throws javax.xml.rpc.ServiceException;

    public com.bkahlert.devel.wpws.WordPressWebServicePortType getWordPressWebServiceHttpSoapEndpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
