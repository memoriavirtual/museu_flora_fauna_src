/**
 * BemPatrimonial.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.usp.memoriavirtual.servicos.soap;

public class BemPatrimonial  implements java.io.Serializable {
    private java.lang.String aguaProxima;

    private boolean alcova;

    private java.lang.String altura;

    private java.lang.String alturaCumeeira;

    private java.lang.String alturaFachadaFrontal;

    private java.lang.String alturaFachadaPosterior;

    private java.lang.String alturaTotal;

    private java.lang.String areaTotal;

    private br.usp.memoriavirtual.servicos.soap.Assunto[] assuntos;

    private br.usp.memoriavirtual.servicos.soap.Autoria[] autorias;

    private br.usp.memoriavirtual.servicos.soap.BemPatrimonial[] bensRelacionados;

    private java.lang.String caracteristicasAmbientais;

    private java.lang.String caracteristicasFisicasTecnicasExecutivas;

    private java.lang.String colecao;

    private java.lang.String complemento;

    private java.lang.String comprimento;

    private java.lang.String condicaoTopografica;

    private br.usp.memoriavirtual.servicos.soap.ContainerMultimidia containerMultimidia;

    private java.lang.String conteudo;

    private br.usp.memoriavirtual.servicos.soap.Descritor[] descritores;

    private br.usp.memoriavirtual.servicos.soap.Diagnostico diagnostico;

    private java.lang.String dimensoesQuantificacoes;

    private br.usp.memoriavirtual.servicos.soap.DisponibilidadeUsoProtecao disponibilidadeUsoProtecao;

    private br.usp.memoriavirtual.servicos.soap.Exposicao exposicao;

    private boolean externo;

    private java.lang.String[] fontesInformacao;

    private br.usp.memoriavirtual.servicos.soap.HistoricoProcedencia historicoProcedencia;

    private long id;

    private java.lang.String idMidia;

    private br.usp.memoriavirtual.servicos.soap.Instituicao instituicao;

    private br.usp.memoriavirtual.servicos.soap.Intervencao[] intervencoes;

    private java.lang.String largura;

    private java.lang.String latitude;

    private java.lang.String localizacaoFisica;

    private java.lang.String longitude;

    private java.lang.String meioAcesso;

    private java.lang.String meioAntropico;

    private java.lang.String notas;

    private java.lang.Integer numeroAmbientes;

    private java.lang.Integer numeroPavimentos;

    private java.lang.String numeroRegistro;

    private java.lang.String outros;

    private java.lang.String peDireitoTerreo;

    private java.lang.String peDireitoTipo;

    private br.usp.memoriavirtual.servicos.soap.Pesquisador[] pesquisadores;

    private boolean porao;

    private br.usp.memoriavirtual.servicos.soap.Producao producao;

    private java.lang.String profundidade;

    private java.lang.String sitioPaisagem;

    private boolean sotao;

    private java.lang.String tipoBemPatrimonial;

    private java.lang.String tituloPrincipal;

    private br.usp.memoriavirtual.servicos.soap.Titulo[] titulos;

    private java.lang.String uso;

    private java.lang.String usoAtual;

    private java.lang.String vegetacao;

    public BemPatrimonial() {
    }

    public BemPatrimonial(
           java.lang.String aguaProxima,
           boolean alcova,
           java.lang.String altura,
           java.lang.String alturaCumeeira,
           java.lang.String alturaFachadaFrontal,
           java.lang.String alturaFachadaPosterior,
           java.lang.String alturaTotal,
           java.lang.String areaTotal,
           br.usp.memoriavirtual.servicos.soap.Assunto[] assuntos,
           br.usp.memoriavirtual.servicos.soap.Autoria[] autorias,
           br.usp.memoriavirtual.servicos.soap.BemPatrimonial[] bensRelacionados,
           java.lang.String caracteristicasAmbientais,
           java.lang.String caracteristicasFisicasTecnicasExecutivas,
           java.lang.String colecao,
           java.lang.String complemento,
           java.lang.String comprimento,
           java.lang.String condicaoTopografica,
           br.usp.memoriavirtual.servicos.soap.ContainerMultimidia containerMultimidia,
           java.lang.String conteudo,
           br.usp.memoriavirtual.servicos.soap.Descritor[] descritores,
           br.usp.memoriavirtual.servicos.soap.Diagnostico diagnostico,
           java.lang.String dimensoesQuantificacoes,
           br.usp.memoriavirtual.servicos.soap.DisponibilidadeUsoProtecao disponibilidadeUsoProtecao,
           br.usp.memoriavirtual.servicos.soap.Exposicao exposicao,
           boolean externo,
           java.lang.String[] fontesInformacao,
           br.usp.memoriavirtual.servicos.soap.HistoricoProcedencia historicoProcedencia,
           long id,
           java.lang.String idMidia,
           br.usp.memoriavirtual.servicos.soap.Instituicao instituicao,
           br.usp.memoriavirtual.servicos.soap.Intervencao[] intervencoes,
           java.lang.String largura,
           java.lang.String latitude,
           java.lang.String localizacaoFisica,
           java.lang.String longitude,
           java.lang.String meioAcesso,
           java.lang.String meioAntropico,
           java.lang.String notas,
           java.lang.Integer numeroAmbientes,
           java.lang.Integer numeroPavimentos,
           java.lang.String numeroRegistro,
           java.lang.String outros,
           java.lang.String peDireitoTerreo,
           java.lang.String peDireitoTipo,
           br.usp.memoriavirtual.servicos.soap.Pesquisador[] pesquisadores,
           boolean porao,
           br.usp.memoriavirtual.servicos.soap.Producao producao,
           java.lang.String profundidade,
           java.lang.String sitioPaisagem,
           boolean sotao,
           java.lang.String tipoBemPatrimonial,
           java.lang.String tituloPrincipal,
           br.usp.memoriavirtual.servicos.soap.Titulo[] titulos,
           java.lang.String uso,
           java.lang.String usoAtual,
           java.lang.String vegetacao) {
           this.aguaProxima = aguaProxima;
           this.alcova = alcova;
           this.altura = altura;
           this.alturaCumeeira = alturaCumeeira;
           this.alturaFachadaFrontal = alturaFachadaFrontal;
           this.alturaFachadaPosterior = alturaFachadaPosterior;
           this.alturaTotal = alturaTotal;
           this.areaTotal = areaTotal;
           this.assuntos = assuntos;
           this.autorias = autorias;
           this.bensRelacionados = bensRelacionados;
           this.caracteristicasAmbientais = caracteristicasAmbientais;
           this.caracteristicasFisicasTecnicasExecutivas = caracteristicasFisicasTecnicasExecutivas;
           this.colecao = colecao;
           this.complemento = complemento;
           this.comprimento = comprimento;
           this.condicaoTopografica = condicaoTopografica;
           this.containerMultimidia = containerMultimidia;
           this.conteudo = conteudo;
           this.descritores = descritores;
           this.diagnostico = diagnostico;
           this.dimensoesQuantificacoes = dimensoesQuantificacoes;
           this.disponibilidadeUsoProtecao = disponibilidadeUsoProtecao;
           this.exposicao = exposicao;
           this.externo = externo;
           this.fontesInformacao = fontesInformacao;
           this.historicoProcedencia = historicoProcedencia;
           this.id = id;
           this.idMidia = idMidia;
           this.instituicao = instituicao;
           this.intervencoes = intervencoes;
           this.largura = largura;
           this.latitude = latitude;
           this.localizacaoFisica = localizacaoFisica;
           this.longitude = longitude;
           this.meioAcesso = meioAcesso;
           this.meioAntropico = meioAntropico;
           this.notas = notas;
           this.numeroAmbientes = numeroAmbientes;
           this.numeroPavimentos = numeroPavimentos;
           this.numeroRegistro = numeroRegistro;
           this.outros = outros;
           this.peDireitoTerreo = peDireitoTerreo;
           this.peDireitoTipo = peDireitoTipo;
           this.pesquisadores = pesquisadores;
           this.porao = porao;
           this.producao = producao;
           this.profundidade = profundidade;
           this.sitioPaisagem = sitioPaisagem;
           this.sotao = sotao;
           this.tipoBemPatrimonial = tipoBemPatrimonial;
           this.tituloPrincipal = tituloPrincipal;
           this.titulos = titulos;
           this.uso = uso;
           this.usoAtual = usoAtual;
           this.vegetacao = vegetacao;
    }


    /**
     * Gets the aguaProxima value for this BemPatrimonial.
     * 
     * @return aguaProxima
     */
    public java.lang.String getAguaProxima() {
        return aguaProxima;
    }


    /**
     * Sets the aguaProxima value for this BemPatrimonial.
     * 
     * @param aguaProxima
     */
    public void setAguaProxima(java.lang.String aguaProxima) {
        this.aguaProxima = aguaProxima;
    }


    /**
     * Gets the alcova value for this BemPatrimonial.
     * 
     * @return alcova
     */
    public boolean isAlcova() {
        return alcova;
    }


    /**
     * Sets the alcova value for this BemPatrimonial.
     * 
     * @param alcova
     */
    public void setAlcova(boolean alcova) {
        this.alcova = alcova;
    }


    /**
     * Gets the altura value for this BemPatrimonial.
     * 
     * @return altura
     */
    public java.lang.String getAltura() {
        return altura;
    }


    /**
     * Sets the altura value for this BemPatrimonial.
     * 
     * @param altura
     */
    public void setAltura(java.lang.String altura) {
        this.altura = altura;
    }


    /**
     * Gets the alturaCumeeira value for this BemPatrimonial.
     * 
     * @return alturaCumeeira
     */
    public java.lang.String getAlturaCumeeira() {
        return alturaCumeeira;
    }


    /**
     * Sets the alturaCumeeira value for this BemPatrimonial.
     * 
     * @param alturaCumeeira
     */
    public void setAlturaCumeeira(java.lang.String alturaCumeeira) {
        this.alturaCumeeira = alturaCumeeira;
    }


    /**
     * Gets the alturaFachadaFrontal value for this BemPatrimonial.
     * 
     * @return alturaFachadaFrontal
     */
    public java.lang.String getAlturaFachadaFrontal() {
        return alturaFachadaFrontal;
    }


    /**
     * Sets the alturaFachadaFrontal value for this BemPatrimonial.
     * 
     * @param alturaFachadaFrontal
     */
    public void setAlturaFachadaFrontal(java.lang.String alturaFachadaFrontal) {
        this.alturaFachadaFrontal = alturaFachadaFrontal;
    }


    /**
     * Gets the alturaFachadaPosterior value for this BemPatrimonial.
     * 
     * @return alturaFachadaPosterior
     */
    public java.lang.String getAlturaFachadaPosterior() {
        return alturaFachadaPosterior;
    }


    /**
     * Sets the alturaFachadaPosterior value for this BemPatrimonial.
     * 
     * @param alturaFachadaPosterior
     */
    public void setAlturaFachadaPosterior(java.lang.String alturaFachadaPosterior) {
        this.alturaFachadaPosterior = alturaFachadaPosterior;
    }


    /**
     * Gets the alturaTotal value for this BemPatrimonial.
     * 
     * @return alturaTotal
     */
    public java.lang.String getAlturaTotal() {
        return alturaTotal;
    }


    /**
     * Sets the alturaTotal value for this BemPatrimonial.
     * 
     * @param alturaTotal
     */
    public void setAlturaTotal(java.lang.String alturaTotal) {
        this.alturaTotal = alturaTotal;
    }


    /**
     * Gets the areaTotal value for this BemPatrimonial.
     * 
     * @return areaTotal
     */
    public java.lang.String getAreaTotal() {
        return areaTotal;
    }


    /**
     * Sets the areaTotal value for this BemPatrimonial.
     * 
     * @param areaTotal
     */
    public void setAreaTotal(java.lang.String areaTotal) {
        this.areaTotal = areaTotal;
    }


    /**
     * Gets the assuntos value for this BemPatrimonial.
     * 
     * @return assuntos
     */
    public br.usp.memoriavirtual.servicos.soap.Assunto[] getAssuntos() {
        return assuntos;
    }


    /**
     * Sets the assuntos value for this BemPatrimonial.
     * 
     * @param assuntos
     */
    public void setAssuntos(br.usp.memoriavirtual.servicos.soap.Assunto[] assuntos) {
        this.assuntos = assuntos;
    }

    public br.usp.memoriavirtual.servicos.soap.Assunto getAssuntos(int i) {
        return this.assuntos[i];
    }

    public void setAssuntos(int i, br.usp.memoriavirtual.servicos.soap.Assunto _value) {
        this.assuntos[i] = _value;
    }


    /**
     * Gets the autorias value for this BemPatrimonial.
     * 
     * @return autorias
     */
    public br.usp.memoriavirtual.servicos.soap.Autoria[] getAutorias() {
        return autorias;
    }


    /**
     * Sets the autorias value for this BemPatrimonial.
     * 
     * @param autorias
     */
    public void setAutorias(br.usp.memoriavirtual.servicos.soap.Autoria[] autorias) {
        this.autorias = autorias;
    }

    public br.usp.memoriavirtual.servicos.soap.Autoria getAutorias(int i) {
        return this.autorias[i];
    }

    public void setAutorias(int i, br.usp.memoriavirtual.servicos.soap.Autoria _value) {
        this.autorias[i] = _value;
    }


    /**
     * Gets the bensRelacionados value for this BemPatrimonial.
     * 
     * @return bensRelacionados
     */
    public br.usp.memoriavirtual.servicos.soap.BemPatrimonial[] getBensRelacionados() {
        return bensRelacionados;
    }


    /**
     * Sets the bensRelacionados value for this BemPatrimonial.
     * 
     * @param bensRelacionados
     */
    public void setBensRelacionados(br.usp.memoriavirtual.servicos.soap.BemPatrimonial[] bensRelacionados) {
        this.bensRelacionados = bensRelacionados;
    }

    public br.usp.memoriavirtual.servicos.soap.BemPatrimonial getBensRelacionados(int i) {
        return this.bensRelacionados[i];
    }

    public void setBensRelacionados(int i, br.usp.memoriavirtual.servicos.soap.BemPatrimonial _value) {
        this.bensRelacionados[i] = _value;
    }


    /**
     * Gets the caracteristicasAmbientais value for this BemPatrimonial.
     * 
     * @return caracteristicasAmbientais
     */
    public java.lang.String getCaracteristicasAmbientais() {
        return caracteristicasAmbientais;
    }


    /**
     * Sets the caracteristicasAmbientais value for this BemPatrimonial.
     * 
     * @param caracteristicasAmbientais
     */
    public void setCaracteristicasAmbientais(java.lang.String caracteristicasAmbientais) {
        this.caracteristicasAmbientais = caracteristicasAmbientais;
    }


    /**
     * Gets the caracteristicasFisicasTecnicasExecutivas value for this BemPatrimonial.
     * 
     * @return caracteristicasFisicasTecnicasExecutivas
     */
    public java.lang.String getCaracteristicasFisicasTecnicasExecutivas() {
        return caracteristicasFisicasTecnicasExecutivas;
    }


    /**
     * Sets the caracteristicasFisicasTecnicasExecutivas value for this BemPatrimonial.
     * 
     * @param caracteristicasFisicasTecnicasExecutivas
     */
    public void setCaracteristicasFisicasTecnicasExecutivas(java.lang.String caracteristicasFisicasTecnicasExecutivas) {
        this.caracteristicasFisicasTecnicasExecutivas = caracteristicasFisicasTecnicasExecutivas;
    }


    /**
     * Gets the colecao value for this BemPatrimonial.
     * 
     * @return colecao
     */
    public java.lang.String getColecao() {
        return colecao;
    }


    /**
     * Sets the colecao value for this BemPatrimonial.
     * 
     * @param colecao
     */
    public void setColecao(java.lang.String colecao) {
        this.colecao = colecao;
    }


    /**
     * Gets the complemento value for this BemPatrimonial.
     * 
     * @return complemento
     */
    public java.lang.String getComplemento() {
        return complemento;
    }


    /**
     * Sets the complemento value for this BemPatrimonial.
     * 
     * @param complemento
     */
    public void setComplemento(java.lang.String complemento) {
        this.complemento = complemento;
    }


    /**
     * Gets the comprimento value for this BemPatrimonial.
     * 
     * @return comprimento
     */
    public java.lang.String getComprimento() {
        return comprimento;
    }


    /**
     * Sets the comprimento value for this BemPatrimonial.
     * 
     * @param comprimento
     */
    public void setComprimento(java.lang.String comprimento) {
        this.comprimento = comprimento;
    }


    /**
     * Gets the condicaoTopografica value for this BemPatrimonial.
     * 
     * @return condicaoTopografica
     */
    public java.lang.String getCondicaoTopografica() {
        return condicaoTopografica;
    }


    /**
     * Sets the condicaoTopografica value for this BemPatrimonial.
     * 
     * @param condicaoTopografica
     */
    public void setCondicaoTopografica(java.lang.String condicaoTopografica) {
        this.condicaoTopografica = condicaoTopografica;
    }


    /**
     * Gets the containerMultimidia value for this BemPatrimonial.
     * 
     * @return containerMultimidia
     */
    public br.usp.memoriavirtual.servicos.soap.ContainerMultimidia getContainerMultimidia() {
        return containerMultimidia;
    }


    /**
     * Sets the containerMultimidia value for this BemPatrimonial.
     * 
     * @param containerMultimidia
     */
    public void setContainerMultimidia(br.usp.memoriavirtual.servicos.soap.ContainerMultimidia containerMultimidia) {
        this.containerMultimidia = containerMultimidia;
    }


    /**
     * Gets the conteudo value for this BemPatrimonial.
     * 
     * @return conteudo
     */
    public java.lang.String getConteudo() {
        return conteudo;
    }


    /**
     * Sets the conteudo value for this BemPatrimonial.
     * 
     * @param conteudo
     */
    public void setConteudo(java.lang.String conteudo) {
        this.conteudo = conteudo;
    }


    /**
     * Gets the descritores value for this BemPatrimonial.
     * 
     * @return descritores
     */
    public br.usp.memoriavirtual.servicos.soap.Descritor[] getDescritores() {
        return descritores;
    }


    /**
     * Sets the descritores value for this BemPatrimonial.
     * 
     * @param descritores
     */
    public void setDescritores(br.usp.memoriavirtual.servicos.soap.Descritor[] descritores) {
        this.descritores = descritores;
    }

    public br.usp.memoriavirtual.servicos.soap.Descritor getDescritores(int i) {
        return this.descritores[i];
    }

    public void setDescritores(int i, br.usp.memoriavirtual.servicos.soap.Descritor _value) {
        this.descritores[i] = _value;
    }


    /**
     * Gets the diagnostico value for this BemPatrimonial.
     * 
     * @return diagnostico
     */
    public br.usp.memoriavirtual.servicos.soap.Diagnostico getDiagnostico() {
        return diagnostico;
    }


    /**
     * Sets the diagnostico value for this BemPatrimonial.
     * 
     * @param diagnostico
     */
    public void setDiagnostico(br.usp.memoriavirtual.servicos.soap.Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }


    /**
     * Gets the dimensoesQuantificacoes value for this BemPatrimonial.
     * 
     * @return dimensoesQuantificacoes
     */
    public java.lang.String getDimensoesQuantificacoes() {
        return dimensoesQuantificacoes;
    }


    /**
     * Sets the dimensoesQuantificacoes value for this BemPatrimonial.
     * 
     * @param dimensoesQuantificacoes
     */
    public void setDimensoesQuantificacoes(java.lang.String dimensoesQuantificacoes) {
        this.dimensoesQuantificacoes = dimensoesQuantificacoes;
    }


    /**
     * Gets the disponibilidadeUsoProtecao value for this BemPatrimonial.
     * 
     * @return disponibilidadeUsoProtecao
     */
    public br.usp.memoriavirtual.servicos.soap.DisponibilidadeUsoProtecao getDisponibilidadeUsoProtecao() {
        return disponibilidadeUsoProtecao;
    }


    /**
     * Sets the disponibilidadeUsoProtecao value for this BemPatrimonial.
     * 
     * @param disponibilidadeUsoProtecao
     */
    public void setDisponibilidadeUsoProtecao(br.usp.memoriavirtual.servicos.soap.DisponibilidadeUsoProtecao disponibilidadeUsoProtecao) {
        this.disponibilidadeUsoProtecao = disponibilidadeUsoProtecao;
    }


    /**
     * Gets the exposicao value for this BemPatrimonial.
     * 
     * @return exposicao
     */
    public br.usp.memoriavirtual.servicos.soap.Exposicao getExposicao() {
        return exposicao;
    }


    /**
     * Sets the exposicao value for this BemPatrimonial.
     * 
     * @param exposicao
     */
    public void setExposicao(br.usp.memoriavirtual.servicos.soap.Exposicao exposicao) {
        this.exposicao = exposicao;
    }


    /**
     * Gets the externo value for this BemPatrimonial.
     * 
     * @return externo
     */
    public boolean isExterno() {
        return externo;
    }


    /**
     * Sets the externo value for this BemPatrimonial.
     * 
     * @param externo
     */
    public void setExterno(boolean externo) {
        this.externo = externo;
    }


    /**
     * Gets the fontesInformacao value for this BemPatrimonial.
     * 
     * @return fontesInformacao
     */
    public java.lang.String[] getFontesInformacao() {
        return fontesInformacao;
    }


    /**
     * Sets the fontesInformacao value for this BemPatrimonial.
     * 
     * @param fontesInformacao
     */
    public void setFontesInformacao(java.lang.String[] fontesInformacao) {
        this.fontesInformacao = fontesInformacao;
    }

    public java.lang.String getFontesInformacao(int i) {
        return this.fontesInformacao[i];
    }

    public void setFontesInformacao(int i, java.lang.String _value) {
        this.fontesInformacao[i] = _value;
    }


    /**
     * Gets the historicoProcedencia value for this BemPatrimonial.
     * 
     * @return historicoProcedencia
     */
    public br.usp.memoriavirtual.servicos.soap.HistoricoProcedencia getHistoricoProcedencia() {
        return historicoProcedencia;
    }


    /**
     * Sets the historicoProcedencia value for this BemPatrimonial.
     * 
     * @param historicoProcedencia
     */
    public void setHistoricoProcedencia(br.usp.memoriavirtual.servicos.soap.HistoricoProcedencia historicoProcedencia) {
        this.historicoProcedencia = historicoProcedencia;
    }


    /**
     * Gets the id value for this BemPatrimonial.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this BemPatrimonial.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the idMidia value for this BemPatrimonial.
     * 
     * @return idMidia
     */
    public java.lang.String getIdMidia() {
        return idMidia;
    }


    /**
     * Sets the idMidia value for this BemPatrimonial.
     * 
     * @param idMidia
     */
    public void setIdMidia(java.lang.String idMidia) {
        this.idMidia = idMidia;
    }


    /**
     * Gets the instituicao value for this BemPatrimonial.
     * 
     * @return instituicao
     */
    public br.usp.memoriavirtual.servicos.soap.Instituicao getInstituicao() {
        return instituicao;
    }


    /**
     * Sets the instituicao value for this BemPatrimonial.
     * 
     * @param instituicao
     */
    public void setInstituicao(br.usp.memoriavirtual.servicos.soap.Instituicao instituicao) {
        this.instituicao = instituicao;
    }


    /**
     * Gets the intervencoes value for this BemPatrimonial.
     * 
     * @return intervencoes
     */
    public br.usp.memoriavirtual.servicos.soap.Intervencao[] getIntervencoes() {
        return intervencoes;
    }


    /**
     * Sets the intervencoes value for this BemPatrimonial.
     * 
     * @param intervencoes
     */
    public void setIntervencoes(br.usp.memoriavirtual.servicos.soap.Intervencao[] intervencoes) {
        this.intervencoes = intervencoes;
    }

    public br.usp.memoriavirtual.servicos.soap.Intervencao getIntervencoes(int i) {
        return this.intervencoes[i];
    }

    public void setIntervencoes(int i, br.usp.memoriavirtual.servicos.soap.Intervencao _value) {
        this.intervencoes[i] = _value;
    }


    /**
     * Gets the largura value for this BemPatrimonial.
     * 
     * @return largura
     */
    public java.lang.String getLargura() {
        return largura;
    }


    /**
     * Sets the largura value for this BemPatrimonial.
     * 
     * @param largura
     */
    public void setLargura(java.lang.String largura) {
        this.largura = largura;
    }


    /**
     * Gets the latitude value for this BemPatrimonial.
     * 
     * @return latitude
     */
    public java.lang.String getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this BemPatrimonial.
     * 
     * @param latitude
     */
    public void setLatitude(java.lang.String latitude) {
        this.latitude = latitude;
    }


    /**
     * Gets the localizacaoFisica value for this BemPatrimonial.
     * 
     * @return localizacaoFisica
     */
    public java.lang.String getLocalizacaoFisica() {
        return localizacaoFisica;
    }


    /**
     * Sets the localizacaoFisica value for this BemPatrimonial.
     * 
     * @param localizacaoFisica
     */
    public void setLocalizacaoFisica(java.lang.String localizacaoFisica) {
        this.localizacaoFisica = localizacaoFisica;
    }


    /**
     * Gets the longitude value for this BemPatrimonial.
     * 
     * @return longitude
     */
    public java.lang.String getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this BemPatrimonial.
     * 
     * @param longitude
     */
    public void setLongitude(java.lang.String longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the meioAcesso value for this BemPatrimonial.
     * 
     * @return meioAcesso
     */
    public java.lang.String getMeioAcesso() {
        return meioAcesso;
    }


    /**
     * Sets the meioAcesso value for this BemPatrimonial.
     * 
     * @param meioAcesso
     */
    public void setMeioAcesso(java.lang.String meioAcesso) {
        this.meioAcesso = meioAcesso;
    }


    /**
     * Gets the meioAntropico value for this BemPatrimonial.
     * 
     * @return meioAntropico
     */
    public java.lang.String getMeioAntropico() {
        return meioAntropico;
    }


    /**
     * Sets the meioAntropico value for this BemPatrimonial.
     * 
     * @param meioAntropico
     */
    public void setMeioAntropico(java.lang.String meioAntropico) {
        this.meioAntropico = meioAntropico;
    }


    /**
     * Gets the notas value for this BemPatrimonial.
     * 
     * @return notas
     */
    public java.lang.String getNotas() {
        return notas;
    }


    /**
     * Sets the notas value for this BemPatrimonial.
     * 
     * @param notas
     */
    public void setNotas(java.lang.String notas) {
        this.notas = notas;
    }


    /**
     * Gets the numeroAmbientes value for this BemPatrimonial.
     * 
     * @return numeroAmbientes
     */
    public java.lang.Integer getNumeroAmbientes() {
        return numeroAmbientes;
    }


    /**
     * Sets the numeroAmbientes value for this BemPatrimonial.
     * 
     * @param numeroAmbientes
     */
    public void setNumeroAmbientes(java.lang.Integer numeroAmbientes) {
        this.numeroAmbientes = numeroAmbientes;
    }


    /**
     * Gets the numeroPavimentos value for this BemPatrimonial.
     * 
     * @return numeroPavimentos
     */
    public java.lang.Integer getNumeroPavimentos() {
        return numeroPavimentos;
    }


    /**
     * Sets the numeroPavimentos value for this BemPatrimonial.
     * 
     * @param numeroPavimentos
     */
    public void setNumeroPavimentos(java.lang.Integer numeroPavimentos) {
        this.numeroPavimentos = numeroPavimentos;
    }


    /**
     * Gets the numeroRegistro value for this BemPatrimonial.
     * 
     * @return numeroRegistro
     */
    public java.lang.String getNumeroRegistro() {
        return numeroRegistro;
    }


    /**
     * Sets the numeroRegistro value for this BemPatrimonial.
     * 
     * @param numeroRegistro
     */
    public void setNumeroRegistro(java.lang.String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }


    /**
     * Gets the outros value for this BemPatrimonial.
     * 
     * @return outros
     */
    public java.lang.String getOutros() {
        return outros;
    }


    /**
     * Sets the outros value for this BemPatrimonial.
     * 
     * @param outros
     */
    public void setOutros(java.lang.String outros) {
        this.outros = outros;
    }


    /**
     * Gets the peDireitoTerreo value for this BemPatrimonial.
     * 
     * @return peDireitoTerreo
     */
    public java.lang.String getPeDireitoTerreo() {
        return peDireitoTerreo;
    }


    /**
     * Sets the peDireitoTerreo value for this BemPatrimonial.
     * 
     * @param peDireitoTerreo
     */
    public void setPeDireitoTerreo(java.lang.String peDireitoTerreo) {
        this.peDireitoTerreo = peDireitoTerreo;
    }


    /**
     * Gets the peDireitoTipo value for this BemPatrimonial.
     * 
     * @return peDireitoTipo
     */
    public java.lang.String getPeDireitoTipo() {
        return peDireitoTipo;
    }


    /**
     * Sets the peDireitoTipo value for this BemPatrimonial.
     * 
     * @param peDireitoTipo
     */
    public void setPeDireitoTipo(java.lang.String peDireitoTipo) {
        this.peDireitoTipo = peDireitoTipo;
    }


    /**
     * Gets the pesquisadores value for this BemPatrimonial.
     * 
     * @return pesquisadores
     */
    public br.usp.memoriavirtual.servicos.soap.Pesquisador[] getPesquisadores() {
        return pesquisadores;
    }


    /**
     * Sets the pesquisadores value for this BemPatrimonial.
     * 
     * @param pesquisadores
     */
    public void setPesquisadores(br.usp.memoriavirtual.servicos.soap.Pesquisador[] pesquisadores) {
        this.pesquisadores = pesquisadores;
    }

    public br.usp.memoriavirtual.servicos.soap.Pesquisador getPesquisadores(int i) {
        return this.pesquisadores[i];
    }

    public void setPesquisadores(int i, br.usp.memoriavirtual.servicos.soap.Pesquisador _value) {
        this.pesquisadores[i] = _value;
    }


    /**
     * Gets the porao value for this BemPatrimonial.
     * 
     * @return porao
     */
    public boolean isPorao() {
        return porao;
    }


    /**
     * Sets the porao value for this BemPatrimonial.
     * 
     * @param porao
     */
    public void setPorao(boolean porao) {
        this.porao = porao;
    }


    /**
     * Gets the producao value for this BemPatrimonial.
     * 
     * @return producao
     */
    public br.usp.memoriavirtual.servicos.soap.Producao getProducao() {
        return producao;
    }


    /**
     * Sets the producao value for this BemPatrimonial.
     * 
     * @param producao
     */
    public void setProducao(br.usp.memoriavirtual.servicos.soap.Producao producao) {
        this.producao = producao;
    }


    /**
     * Gets the profundidade value for this BemPatrimonial.
     * 
     * @return profundidade
     */
    public java.lang.String getProfundidade() {
        return profundidade;
    }


    /**
     * Sets the profundidade value for this BemPatrimonial.
     * 
     * @param profundidade
     */
    public void setProfundidade(java.lang.String profundidade) {
        this.profundidade = profundidade;
    }


    /**
     * Gets the sitioPaisagem value for this BemPatrimonial.
     * 
     * @return sitioPaisagem
     */
    public java.lang.String getSitioPaisagem() {
        return sitioPaisagem;
    }


    /**
     * Sets the sitioPaisagem value for this BemPatrimonial.
     * 
     * @param sitioPaisagem
     */
    public void setSitioPaisagem(java.lang.String sitioPaisagem) {
        this.sitioPaisagem = sitioPaisagem;
    }


    /**
     * Gets the sotao value for this BemPatrimonial.
     * 
     * @return sotao
     */
    public boolean isSotao() {
        return sotao;
    }


    /**
     * Sets the sotao value for this BemPatrimonial.
     * 
     * @param sotao
     */
    public void setSotao(boolean sotao) {
        this.sotao = sotao;
    }


    /**
     * Gets the tipoBemPatrimonial value for this BemPatrimonial.
     * 
     * @return tipoBemPatrimonial
     */
    public java.lang.String getTipoBemPatrimonial() {
        return tipoBemPatrimonial;
    }


    /**
     * Sets the tipoBemPatrimonial value for this BemPatrimonial.
     * 
     * @param tipoBemPatrimonial
     */
    public void setTipoBemPatrimonial(java.lang.String tipoBemPatrimonial) {
        this.tipoBemPatrimonial = tipoBemPatrimonial;
    }


    /**
     * Gets the tituloPrincipal value for this BemPatrimonial.
     * 
     * @return tituloPrincipal
     */
    public java.lang.String getTituloPrincipal() {
        return tituloPrincipal;
    }


    /**
     * Sets the tituloPrincipal value for this BemPatrimonial.
     * 
     * @param tituloPrincipal
     */
    public void setTituloPrincipal(java.lang.String tituloPrincipal) {
        this.tituloPrincipal = tituloPrincipal;
    }


    /**
     * Gets the titulos value for this BemPatrimonial.
     * 
     * @return titulos
     */
    public br.usp.memoriavirtual.servicos.soap.Titulo[] getTitulos() {
        return titulos;
    }


    /**
     * Sets the titulos value for this BemPatrimonial.
     * 
     * @param titulos
     */
    public void setTitulos(br.usp.memoriavirtual.servicos.soap.Titulo[] titulos) {
        this.titulos = titulos;
    }

    public br.usp.memoriavirtual.servicos.soap.Titulo getTitulos(int i) {
        return this.titulos[i];
    }

    public void setTitulos(int i, br.usp.memoriavirtual.servicos.soap.Titulo _value) {
        this.titulos[i] = _value;
    }


    /**
     * Gets the uso value for this BemPatrimonial.
     * 
     * @return uso
     */
    public java.lang.String getUso() {
        return uso;
    }


    /**
     * Sets the uso value for this BemPatrimonial.
     * 
     * @param uso
     */
    public void setUso(java.lang.String uso) {
        this.uso = uso;
    }


    /**
     * Gets the usoAtual value for this BemPatrimonial.
     * 
     * @return usoAtual
     */
    public java.lang.String getUsoAtual() {
        return usoAtual;
    }


    /**
     * Sets the usoAtual value for this BemPatrimonial.
     * 
     * @param usoAtual
     */
    public void setUsoAtual(java.lang.String usoAtual) {
        this.usoAtual = usoAtual;
    }


    /**
     * Gets the vegetacao value for this BemPatrimonial.
     * 
     * @return vegetacao
     */
    public java.lang.String getVegetacao() {
        return vegetacao;
    }


    /**
     * Sets the vegetacao value for this BemPatrimonial.
     * 
     * @param vegetacao
     */
    public void setVegetacao(java.lang.String vegetacao) {
        this.vegetacao = vegetacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BemPatrimonial)) return false;
        BemPatrimonial other = (BemPatrimonial) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aguaProxima==null && other.getAguaProxima()==null) || 
             (this.aguaProxima!=null &&
              this.aguaProxima.equals(other.getAguaProxima()))) &&
            this.alcova == other.isAlcova() &&
            ((this.altura==null && other.getAltura()==null) || 
             (this.altura!=null &&
              this.altura.equals(other.getAltura()))) &&
            ((this.alturaCumeeira==null && other.getAlturaCumeeira()==null) || 
             (this.alturaCumeeira!=null &&
              this.alturaCumeeira.equals(other.getAlturaCumeeira()))) &&
            ((this.alturaFachadaFrontal==null && other.getAlturaFachadaFrontal()==null) || 
             (this.alturaFachadaFrontal!=null &&
              this.alturaFachadaFrontal.equals(other.getAlturaFachadaFrontal()))) &&
            ((this.alturaFachadaPosterior==null && other.getAlturaFachadaPosterior()==null) || 
             (this.alturaFachadaPosterior!=null &&
              this.alturaFachadaPosterior.equals(other.getAlturaFachadaPosterior()))) &&
            ((this.alturaTotal==null && other.getAlturaTotal()==null) || 
             (this.alturaTotal!=null &&
              this.alturaTotal.equals(other.getAlturaTotal()))) &&
            ((this.areaTotal==null && other.getAreaTotal()==null) || 
             (this.areaTotal!=null &&
              this.areaTotal.equals(other.getAreaTotal()))) &&
            ((this.assuntos==null && other.getAssuntos()==null) || 
             (this.assuntos!=null &&
              java.util.Arrays.equals(this.assuntos, other.getAssuntos()))) &&
            ((this.autorias==null && other.getAutorias()==null) || 
             (this.autorias!=null &&
              java.util.Arrays.equals(this.autorias, other.getAutorias()))) &&
            ((this.bensRelacionados==null && other.getBensRelacionados()==null) || 
             (this.bensRelacionados!=null &&
              java.util.Arrays.equals(this.bensRelacionados, other.getBensRelacionados()))) &&
            ((this.caracteristicasAmbientais==null && other.getCaracteristicasAmbientais()==null) || 
             (this.caracteristicasAmbientais!=null &&
              this.caracteristicasAmbientais.equals(other.getCaracteristicasAmbientais()))) &&
            ((this.caracteristicasFisicasTecnicasExecutivas==null && other.getCaracteristicasFisicasTecnicasExecutivas()==null) || 
             (this.caracteristicasFisicasTecnicasExecutivas!=null &&
              this.caracteristicasFisicasTecnicasExecutivas.equals(other.getCaracteristicasFisicasTecnicasExecutivas()))) &&
            ((this.colecao==null && other.getColecao()==null) || 
             (this.colecao!=null &&
              this.colecao.equals(other.getColecao()))) &&
            ((this.complemento==null && other.getComplemento()==null) || 
             (this.complemento!=null &&
              this.complemento.equals(other.getComplemento()))) &&
            ((this.comprimento==null && other.getComprimento()==null) || 
             (this.comprimento!=null &&
              this.comprimento.equals(other.getComprimento()))) &&
            ((this.condicaoTopografica==null && other.getCondicaoTopografica()==null) || 
             (this.condicaoTopografica!=null &&
              this.condicaoTopografica.equals(other.getCondicaoTopografica()))) &&
            ((this.containerMultimidia==null && other.getContainerMultimidia()==null) || 
             (this.containerMultimidia!=null &&
              this.containerMultimidia.equals(other.getContainerMultimidia()))) &&
            ((this.conteudo==null && other.getConteudo()==null) || 
             (this.conteudo!=null &&
              this.conteudo.equals(other.getConteudo()))) &&
            ((this.descritores==null && other.getDescritores()==null) || 
             (this.descritores!=null &&
              java.util.Arrays.equals(this.descritores, other.getDescritores()))) &&
            ((this.diagnostico==null && other.getDiagnostico()==null) || 
             (this.diagnostico!=null &&
              this.diagnostico.equals(other.getDiagnostico()))) &&
            ((this.dimensoesQuantificacoes==null && other.getDimensoesQuantificacoes()==null) || 
             (this.dimensoesQuantificacoes!=null &&
              this.dimensoesQuantificacoes.equals(other.getDimensoesQuantificacoes()))) &&
            ((this.disponibilidadeUsoProtecao==null && other.getDisponibilidadeUsoProtecao()==null) || 
             (this.disponibilidadeUsoProtecao!=null &&
              this.disponibilidadeUsoProtecao.equals(other.getDisponibilidadeUsoProtecao()))) &&
            ((this.exposicao==null && other.getExposicao()==null) || 
             (this.exposicao!=null &&
              this.exposicao.equals(other.getExposicao()))) &&
            this.externo == other.isExterno() &&
            ((this.fontesInformacao==null && other.getFontesInformacao()==null) || 
             (this.fontesInformacao!=null &&
              java.util.Arrays.equals(this.fontesInformacao, other.getFontesInformacao()))) &&
            ((this.historicoProcedencia==null && other.getHistoricoProcedencia()==null) || 
             (this.historicoProcedencia!=null &&
              this.historicoProcedencia.equals(other.getHistoricoProcedencia()))) &&
            this.id == other.getId() &&
            ((this.idMidia==null && other.getIdMidia()==null) || 
             (this.idMidia!=null &&
              this.idMidia.equals(other.getIdMidia()))) &&
            ((this.instituicao==null && other.getInstituicao()==null) || 
             (this.instituicao!=null &&
              this.instituicao.equals(other.getInstituicao()))) &&
            ((this.intervencoes==null && other.getIntervencoes()==null) || 
             (this.intervencoes!=null &&
              java.util.Arrays.equals(this.intervencoes, other.getIntervencoes()))) &&
            ((this.largura==null && other.getLargura()==null) || 
             (this.largura!=null &&
              this.largura.equals(other.getLargura()))) &&
            ((this.latitude==null && other.getLatitude()==null) || 
             (this.latitude!=null &&
              this.latitude.equals(other.getLatitude()))) &&
            ((this.localizacaoFisica==null && other.getLocalizacaoFisica()==null) || 
             (this.localizacaoFisica!=null &&
              this.localizacaoFisica.equals(other.getLocalizacaoFisica()))) &&
            ((this.longitude==null && other.getLongitude()==null) || 
             (this.longitude!=null &&
              this.longitude.equals(other.getLongitude()))) &&
            ((this.meioAcesso==null && other.getMeioAcesso()==null) || 
             (this.meioAcesso!=null &&
              this.meioAcesso.equals(other.getMeioAcesso()))) &&
            ((this.meioAntropico==null && other.getMeioAntropico()==null) || 
             (this.meioAntropico!=null &&
              this.meioAntropico.equals(other.getMeioAntropico()))) &&
            ((this.notas==null && other.getNotas()==null) || 
             (this.notas!=null &&
              this.notas.equals(other.getNotas()))) &&
            ((this.numeroAmbientes==null && other.getNumeroAmbientes()==null) || 
             (this.numeroAmbientes!=null &&
              this.numeroAmbientes.equals(other.getNumeroAmbientes()))) &&
            ((this.numeroPavimentos==null && other.getNumeroPavimentos()==null) || 
             (this.numeroPavimentos!=null &&
              this.numeroPavimentos.equals(other.getNumeroPavimentos()))) &&
            ((this.numeroRegistro==null && other.getNumeroRegistro()==null) || 
             (this.numeroRegistro!=null &&
              this.numeroRegistro.equals(other.getNumeroRegistro()))) &&
            ((this.outros==null && other.getOutros()==null) || 
             (this.outros!=null &&
              this.outros.equals(other.getOutros()))) &&
            ((this.peDireitoTerreo==null && other.getPeDireitoTerreo()==null) || 
             (this.peDireitoTerreo!=null &&
              this.peDireitoTerreo.equals(other.getPeDireitoTerreo()))) &&
            ((this.peDireitoTipo==null && other.getPeDireitoTipo()==null) || 
             (this.peDireitoTipo!=null &&
              this.peDireitoTipo.equals(other.getPeDireitoTipo()))) &&
            ((this.pesquisadores==null && other.getPesquisadores()==null) || 
             (this.pesquisadores!=null &&
              java.util.Arrays.equals(this.pesquisadores, other.getPesquisadores()))) &&
            this.porao == other.isPorao() &&
            ((this.producao==null && other.getProducao()==null) || 
             (this.producao!=null &&
              this.producao.equals(other.getProducao()))) &&
            ((this.profundidade==null && other.getProfundidade()==null) || 
             (this.profundidade!=null &&
              this.profundidade.equals(other.getProfundidade()))) &&
            ((this.sitioPaisagem==null && other.getSitioPaisagem()==null) || 
             (this.sitioPaisagem!=null &&
              this.sitioPaisagem.equals(other.getSitioPaisagem()))) &&
            this.sotao == other.isSotao() &&
            ((this.tipoBemPatrimonial==null && other.getTipoBemPatrimonial()==null) || 
             (this.tipoBemPatrimonial!=null &&
              this.tipoBemPatrimonial.equals(other.getTipoBemPatrimonial()))) &&
            ((this.tituloPrincipal==null && other.getTituloPrincipal()==null) || 
             (this.tituloPrincipal!=null &&
              this.tituloPrincipal.equals(other.getTituloPrincipal()))) &&
            ((this.titulos==null && other.getTitulos()==null) || 
             (this.titulos!=null &&
              java.util.Arrays.equals(this.titulos, other.getTitulos()))) &&
            ((this.uso==null && other.getUso()==null) || 
             (this.uso!=null &&
              this.uso.equals(other.getUso()))) &&
            ((this.usoAtual==null && other.getUsoAtual()==null) || 
             (this.usoAtual!=null &&
              this.usoAtual.equals(other.getUsoAtual()))) &&
            ((this.vegetacao==null && other.getVegetacao()==null) || 
             (this.vegetacao!=null &&
              this.vegetacao.equals(other.getVegetacao())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAguaProxima() != null) {
            _hashCode += getAguaProxima().hashCode();
        }
        _hashCode += (isAlcova() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAltura() != null) {
            _hashCode += getAltura().hashCode();
        }
        if (getAlturaCumeeira() != null) {
            _hashCode += getAlturaCumeeira().hashCode();
        }
        if (getAlturaFachadaFrontal() != null) {
            _hashCode += getAlturaFachadaFrontal().hashCode();
        }
        if (getAlturaFachadaPosterior() != null) {
            _hashCode += getAlturaFachadaPosterior().hashCode();
        }
        if (getAlturaTotal() != null) {
            _hashCode += getAlturaTotal().hashCode();
        }
        if (getAreaTotal() != null) {
            _hashCode += getAreaTotal().hashCode();
        }
        if (getAssuntos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssuntos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssuntos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAutorias() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAutorias());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAutorias(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBensRelacionados() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBensRelacionados());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBensRelacionados(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCaracteristicasAmbientais() != null) {
            _hashCode += getCaracteristicasAmbientais().hashCode();
        }
        if (getCaracteristicasFisicasTecnicasExecutivas() != null) {
            _hashCode += getCaracteristicasFisicasTecnicasExecutivas().hashCode();
        }
        if (getColecao() != null) {
            _hashCode += getColecao().hashCode();
        }
        if (getComplemento() != null) {
            _hashCode += getComplemento().hashCode();
        }
        if (getComprimento() != null) {
            _hashCode += getComprimento().hashCode();
        }
        if (getCondicaoTopografica() != null) {
            _hashCode += getCondicaoTopografica().hashCode();
        }
        if (getContainerMultimidia() != null) {
            _hashCode += getContainerMultimidia().hashCode();
        }
        if (getConteudo() != null) {
            _hashCode += getConteudo().hashCode();
        }
        if (getDescritores() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescritores());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescritores(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDiagnostico() != null) {
            _hashCode += getDiagnostico().hashCode();
        }
        if (getDimensoesQuantificacoes() != null) {
            _hashCode += getDimensoesQuantificacoes().hashCode();
        }
        if (getDisponibilidadeUsoProtecao() != null) {
            _hashCode += getDisponibilidadeUsoProtecao().hashCode();
        }
        if (getExposicao() != null) {
            _hashCode += getExposicao().hashCode();
        }
        _hashCode += (isExterno() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFontesInformacao() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFontesInformacao());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFontesInformacao(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHistoricoProcedencia() != null) {
            _hashCode += getHistoricoProcedencia().hashCode();
        }
        _hashCode += new Long(getId()).hashCode();
        if (getIdMidia() != null) {
            _hashCode += getIdMidia().hashCode();
        }
        if (getInstituicao() != null) {
            _hashCode += getInstituicao().hashCode();
        }
        if (getIntervencoes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIntervencoes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIntervencoes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLargura() != null) {
            _hashCode += getLargura().hashCode();
        }
        if (getLatitude() != null) {
            _hashCode += getLatitude().hashCode();
        }
        if (getLocalizacaoFisica() != null) {
            _hashCode += getLocalizacaoFisica().hashCode();
        }
        if (getLongitude() != null) {
            _hashCode += getLongitude().hashCode();
        }
        if (getMeioAcesso() != null) {
            _hashCode += getMeioAcesso().hashCode();
        }
        if (getMeioAntropico() != null) {
            _hashCode += getMeioAntropico().hashCode();
        }
        if (getNotas() != null) {
            _hashCode += getNotas().hashCode();
        }
        if (getNumeroAmbientes() != null) {
            _hashCode += getNumeroAmbientes().hashCode();
        }
        if (getNumeroPavimentos() != null) {
            _hashCode += getNumeroPavimentos().hashCode();
        }
        if (getNumeroRegistro() != null) {
            _hashCode += getNumeroRegistro().hashCode();
        }
        if (getOutros() != null) {
            _hashCode += getOutros().hashCode();
        }
        if (getPeDireitoTerreo() != null) {
            _hashCode += getPeDireitoTerreo().hashCode();
        }
        if (getPeDireitoTipo() != null) {
            _hashCode += getPeDireitoTipo().hashCode();
        }
        if (getPesquisadores() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPesquisadores());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPesquisadores(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isPorao() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getProducao() != null) {
            _hashCode += getProducao().hashCode();
        }
        if (getProfundidade() != null) {
            _hashCode += getProfundidade().hashCode();
        }
        if (getSitioPaisagem() != null) {
            _hashCode += getSitioPaisagem().hashCode();
        }
        _hashCode += (isSotao() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTipoBemPatrimonial() != null) {
            _hashCode += getTipoBemPatrimonial().hashCode();
        }
        if (getTituloPrincipal() != null) {
            _hashCode += getTituloPrincipal().hashCode();
        }
        if (getTitulos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTitulos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTitulos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUso() != null) {
            _hashCode += getUso().hashCode();
        }
        if (getUsoAtual() != null) {
            _hashCode += getUsoAtual().hashCode();
        }
        if (getVegetacao() != null) {
            _hashCode += getVegetacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BemPatrimonial.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "bemPatrimonial"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aguaProxima");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aguaProxima"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alcova");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alcova"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altura");
        elemField.setXmlName(new javax.xml.namespace.QName("", "altura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alturaCumeeira");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alturaCumeeira"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alturaFachadaFrontal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alturaFachadaFrontal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alturaFachadaPosterior");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alturaFachadaPosterior"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alturaTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alturaTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("areaTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "areaTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assuntos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assuntos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "assunto"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autorias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autorias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "autoria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bensRelacionados");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bensRelacionados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "bemPatrimonial"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caracteristicasAmbientais");
        elemField.setXmlName(new javax.xml.namespace.QName("", "caracteristicasAmbientais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caracteristicasFisicasTecnicasExecutivas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "caracteristicasFisicasTecnicasExecutivas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colecao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "colecao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complemento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "complemento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comprimento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comprimento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("condicaoTopografica");
        elemField.setXmlName(new javax.xml.namespace.QName("", "condicaoTopografica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("containerMultimidia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "containerMultimidia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "containerMultimidia"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conteudo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "conteudo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descritores");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descritores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "descritor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diagnostico");
        elemField.setXmlName(new javax.xml.namespace.QName("", "diagnostico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "diagnostico"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimensoesQuantificacoes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dimensoesQuantificacoes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disponibilidadeUsoProtecao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disponibilidadeUsoProtecao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "disponibilidadeUsoProtecao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exposicao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exposicao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "exposicao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "externo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fontesInformacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fontesInformacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historicoProcedencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "historicoProcedencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "historicoProcedencia"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idMidia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idMidia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instituicao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "instituicao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "instituicao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intervencoes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "intervencoes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "intervencao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("largura");
        elemField.setXmlName(new javax.xml.namespace.QName("", "largura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new javax.xml.namespace.QName("", "latitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localizacaoFisica");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localizacaoFisica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitude");
        elemField.setXmlName(new javax.xml.namespace.QName("", "longitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meioAcesso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "meioAcesso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meioAntropico");
        elemField.setXmlName(new javax.xml.namespace.QName("", "meioAntropico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroAmbientes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroAmbientes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroPavimentos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroPavimentos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroRegistro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroRegistro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outros");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peDireitoTerreo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "peDireitoTerreo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peDireitoTipo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "peDireitoTipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pesquisadores");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pesquisadores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "pesquisador"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("porao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "porao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("producao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "producao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "producao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profundidade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "profundidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitioPaisagem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sitioPaisagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sotao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sotao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoBemPatrimonial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoBemPatrimonial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tituloPrincipal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tituloPrincipal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titulos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "titulos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.servicos.memoriavirtual.usp.br/", "titulo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usoAtual");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usoAtual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vegetacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vegetacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
