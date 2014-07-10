/**
 * RealizarBuscaSOAPService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.usp.memoriavirtual.servicos.soap;

public interface RealizarBuscaSOAPService extends java.rmi.Remote {
    public br.usp.memoriavirtual.servicos.soap.BemPatrimonial[] buscar(java.lang.String stringDeBusca, int numeroDaPagina) throws java.rmi.RemoteException;
    public br.usp.memoriavirtual.servicos.soap.Multimidia[] buscarMidias(java.lang.String idBemPatrimonial) throws java.rmi.RemoteException;
    public boolean autentica(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public br.usp.memoriavirtual.servicos.soap.BemPatrimonial[] buscarInstituicao(java.lang.String stringDeBusca, int numeroDaPagina, int tamanhoPagina, java.lang.String nomeInstituicao) throws java.rmi.RemoteException;
}
