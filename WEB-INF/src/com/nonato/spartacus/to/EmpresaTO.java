/*
 * Created on 20/08/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nonato.spartacus.to;

import java.io.Serializable;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class EmpresaTO implements Serializable {
	
	private int codigo;
	private String nomeRazaoSocial;
	private String responsavel;
	private String cnpjCpf;
	private String email;
	private String inscricaoEstadual;
	private String alvara;
	private String endereco;
	private String bairroDistrito;
	private String foneFax;
	private String loginUsuario;
	private String loginSenha;
	private String observacao;
	private String ativo;
	private int tipo;
	private int condicao;
	private int cidade;
	

	/**
	 * @return Returns the email.
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * @param email The email to set.
	 */
	public void setEmail(String email) {
		this.email = email;
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
	public int getCidade() {
		return cidade;
	}
	
	/**
	 * @param cidade The cidade to set.
	 */
	public void setCidade(int cidade) {
		this.cidade = cidade;
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
	public int getCodigo() {
		return codigo;
	}
	
	/**
	 * @param codigo The codigo to set.
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	/**
	 * @return Returns the condicao.
	 */
	public int getCondicao() {
		return condicao;
	}
	
	/**
	 * @param condicao The condicao to set.
	 */
	public void setCondicao(int condicao) {
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
	public int getTipo() {
		return tipo;
	}
	
	/**
	 * @param tipo The tipo to set.
	 */
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
}
