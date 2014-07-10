package br.usp.memoriavirtual.servicos.soap;

public class RealizarBuscaSOAPServiceProxy implements br.usp.memoriavirtual.servicos.soap.RealizarBuscaSOAPService {
  private String _endpoint = null;
  private br.usp.memoriavirtual.servicos.soap.RealizarBuscaSOAPService realizarBuscaSOAPService = null;
  
  public RealizarBuscaSOAPServiceProxy() {
    _initRealizarBuscaSOAPServiceProxy();
  }
  
  public RealizarBuscaSOAPServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initRealizarBuscaSOAPServiceProxy();
  }
  
  private void _initRealizarBuscaSOAPServiceProxy() {
    try {
      realizarBuscaSOAPService = (new Buscar_ServiceLocator()).getRealizarBuscaSOAPServicePort();
      if (realizarBuscaSOAPService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)realizarBuscaSOAPService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)realizarBuscaSOAPService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (realizarBuscaSOAPService != null)
      ((javax.xml.rpc.Stub)realizarBuscaSOAPService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.usp.memoriavirtual.servicos.soap.RealizarBuscaSOAPService getRealizarBuscaSOAPService() {
    if (realizarBuscaSOAPService == null)
      _initRealizarBuscaSOAPServiceProxy();
    return realizarBuscaSOAPService;
  }
  
  public br.usp.memoriavirtual.servicos.soap.BemPatrimonial[] buscar(java.lang.String stringDeBusca, int numeroDaPagina) throws java.rmi.RemoteException{
    if (realizarBuscaSOAPService == null)
      _initRealizarBuscaSOAPServiceProxy();
    return realizarBuscaSOAPService.buscar(stringDeBusca, numeroDaPagina);
  }
  
  public br.usp.memoriavirtual.servicos.soap.Multimidia[] buscarMidias(java.lang.String idBemPatrimonial) throws java.rmi.RemoteException{
    if (realizarBuscaSOAPService == null)
      _initRealizarBuscaSOAPServiceProxy();
    return realizarBuscaSOAPService.buscarMidias(idBemPatrimonial);
  }
  
  public boolean autentica(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (realizarBuscaSOAPService == null)
      _initRealizarBuscaSOAPServiceProxy();
    return realizarBuscaSOAPService.autentica(arg0, arg1);
  }
  
  public br.usp.memoriavirtual.servicos.soap.BemPatrimonial[] buscarInstituicao(java.lang.String stringDeBusca, int numeroDaPagina, int tamanhoPagina, java.lang.String nomeInstituicao) throws java.rmi.RemoteException{
    if (realizarBuscaSOAPService == null)
      _initRealizarBuscaSOAPServiceProxy();
    return realizarBuscaSOAPService.buscarInstituicao(stringDeBusca, numeroDaPagina, tamanhoPagina, nomeInstituicao);
  }
  
  
}