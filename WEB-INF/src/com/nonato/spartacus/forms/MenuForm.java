/*
 * Created on 29/09/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nonato.spartacus.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class MenuForm extends ActionForm {

	private String codigo;
	private String nomeRazaoSocial;
	private String primeiroNome;
	private String responsavel;
	private String cnpjCpf;
	private String inscricaoEstadual;
	private String alvara;
	private String endereco;
	private String bairroDistrito;
	private String foneFax;
	private String loginUsuario;
	private String loginSenha;
	private String observacao;
	private String ativo;
	private String tipo;
	private String tipoDescricao;
	private String condicao;
	private String cidade;
	private String cidadeNome;
	private String cidadeCep;
	private String cidadeEstadoSigla;
	
	/**
	 * @return Returns the primeiroNome.
	 */
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	
	/**
	 * @param primeiroNome The primeiroNome to set.
	 */
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	
	/**
	 * @return Returns the alvara.
	 */
	public String getAlvara() {
		return alvara;
	}
	
	/**
	 * @param alvara The alvara to set.
	 */
	public void setAlvara(String alvara) {
		this.alvara = alvara;
	}
	
	/**
	 * @return Returns the ativo.
	 */
	public String getAtivo() {
		return ativo;
	}
	
	/**
	 * @param ativo The ativo to set.
	 */
	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
	
	/**
	 * @return Returns the bairroDistrito.
	 */
	public String getBairroDistrito() {
		return bairroDistrito;
	}
	
	/**
	 * @param bairroDistrito The bairroDistrito to set.
	 */
	public void setBairroDistrito(String bairroDistrito) {
		this.bairroDistrito = bairroDistrito;
	}
	
	/**
	 * @return Returns the cidade.
	 */
	public String getCidade() {
		return cidade;
	}
	
	/**
	 * @param cidade The cidade to set.
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	/**
	 * @return Returns the cidadeCep.
	 */
	public String getCidadeCep() {
		return cidadeCep;
	}
	
	/**
	 * @param cidadeCep The cidadeCep to set.
	 */
	public void setCidadeCep(String cidadeCep) {
		this.cidadeCep = cidadeCep;
	}
	
	/**
	 * @return Returns the cidadeEstadoSigla.
	 */
	public String getCidadeEstadoSigla() {
		return cidadeEstadoSigla;
	}
	
	/**
	 * @param cidadeEstadoSigla The cidadeEstadoSigla to set.
	 */
	public void setCidadeEstadoSigla(String cidadeEstadoSigla) {
		this.cidadeEstadoSigla = cidadeEstadoSigla;
	}
	
	/**
	 * @return Returns the cidadeNome.
	 */
	public String getCidadeNome() {
		return cidadeNome;
	}
	
	/**
	 * @param cidadeNome The cidadeNome to set.
	 */
	public void setCidadeNome(String cidadeNome) {
		this.cidadeNome = cidadeNome;
	}
	
	/**
	 * @return Returns the cnpjCpf.
	 */
	public String getCnpjCpf() {
		return cnpjCpf;
	}
	
	/**
	 * @param cnpjCpf The cnpjCpf to set.
	 */
	public void setCnpjCpf(String cnpjCpf) {
		this.cnpjCpf = cnpjCpf;
	}
	
	/**
	 * @return Returns the codigo.
	 */
	public String getCodigo() {
		return codigo;
	}
	
	/**
	 * @param codigo The codigo to set.
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	/**
	 * @return Returns the condicao.
	 */
	public String getCondicao() {
		return condicao;
	}
	
	/**
	 * @param condicao The condicao to set.
	 */
	public void setCondicao(String condicao) {
		this.condicao = condicao;
	}
	
	/**
	 * @return Returns the endereco.
	 */
	public String getEndereco() {
		return endereco;
	}
	
	/**
	 * @param endereco The endereco to set.
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	/**
	 * @return Returns the foneFax.
	 */
	public String getFoneFax() {
		return foneFax;
	}
	
	/**
	 * @param foneFax The foneFax to set.
	 */
	public void setFoneFax(String foneFax) {
		this.foneFax = foneFax;
	}
	
	/**
	 * @return Returns the inscricaoEstadual.
	 */
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	
	/**
	 * @param inscricaoEstadual The inscricaoEstadual to set.
	 */
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	
	/**
	 * @return Returns the loginSenha.
	 */
	public String getLoginSenha() {
		return loginSenha;
	}
	
	/**
	 * @param loginSenha The loginSenha to set.
	 */
	public void setLoginSenha(String loginSenha) {
		this.loginSenha = loginSenha;
	}
	
	/**
	 * @return Returns the loginUsuario.
	 */
	public String getLoginUsuario() {
		return loginUsuario;
	}
	
	/**
	 * @param loginUsuario The loginUsuario to set.
	 */
	public void setLoginUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}
	
	/**
	 * @return Returns the nomeRazaoSocial.
	 */
	public String getNomeRazaoSocial() {
		return nomeRazaoSocial;
	}
	
	/**
	 * @param nomeRazaoSocial The nomeRazaoSocial to set.
	 */
	public void setNomeRazaoSocial(String nomeRazaoSocial) {
		this.nomeRazaoSocial = nomeRazaoSocial;
	}
	
	/**
	 * @return Returns the observacao.
	 */
	public String getObservacao() {
		return observacao;
	}
	
	/**
	 * @param observacao The observacao to set.
	 */
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	/**
	 * @return Returns the responsavel.
	 */
	public String getResponsavel() {
		return responsavel;
	}
	
	/**
	 * @param responsavel The responsavel to set.
	 */
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	
	/**
	 * @return Returns the tipo.
	 */
	public String getTipo() {
		return tipo;
	}
	
	/**
	 * @param tipo The tipo to set.
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	/**
	 * @return Returns the tipoDescricao.
	 */
	public String getTipoDescricao() {
		return tipoDescricao;
	}
	
	/**
	 * @param tipoDescricao The tipoDescricao to set.
	 */
	public void setTipoDescricao(String tipoDescricao) {
		this.tipoDescricao = tipoDescricao;
	}
	
	public void reset( ActionMapping mapping, HttpServletRequest request ) {
		
		this.nomeRazaoSocial = null;
		this.responsavel = null;
		this.cnpjCpf = null;
		this.inscricaoEstadual = null;
		this.alvara = null;
		this.endereco = null;
		this.bairroDistrito = null;
		this.foneFax = null;
		this.loginUsuario = null;
		this.loginSenha = null;
		this.observacao = null;
		this.ativo = null;
		this.tipo = null;
		this.tipoDescricao = null;
		
		this.condicao = null;
		this.cidade = null;
		this.cidadeNome = null;
		this.cidadeCep = null;
		this.cidadeEstadoSigla = null;
		
	}

	public ActionErrors validate( ActionMapping mapping, HttpServletRequest request ) {
		
		return null;
				
	}
	
}
