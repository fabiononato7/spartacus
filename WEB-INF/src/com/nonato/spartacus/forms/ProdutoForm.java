/*
 * Created on 25/08/2005
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
public class ProdutoForm extends ActionForm {

	private String codigo;
	private String nome;
	private String preco;
	private String unidade;
	private String unidadeSigla;
	private String empresa;
	private String empresaNome;
	private String empresaCnpjCpf;
	private String empresaFoneFax;
	
	/**
	 * @return Returns the empresaCnpjCpf.
	 */
	public String getEmpresaCnpjCpf() {
		return empresaCnpjCpf;
	}
	
	/**
	 * @param empresaCnpjCpf The empresaCnpjCpf to set.
	 */
	public void setEmpresaCnpjCpf(String empresaCnpjCpf) {
		this.empresaCnpjCpf = empresaCnpjCpf;
	}
	
	/**
	 * @return Returns the empresaFoneFax.
	 */
	public String getEmpresaFoneFax() {
		return empresaFoneFax;
	}
	
	/**
	 * @param empresaFoneFax The empresaFoneFax to set.
	 */
	public void setEmpresaFoneFax(String empresaFoneFax) {
		this.empresaFoneFax = empresaFoneFax;
	}
	
	/**
	 * @return Returns the empresaNome.
	 */
	public String getEmpresaNome() {
		return empresaNome;
	}
	
	/**
	 * @param empresaNome The empresaNome to set.
	 */
	public void setEmpresaNome(String empresaNome) {
		this.empresaNome = empresaNome;
	}
	
	/**
	 * @return Returns the unidadeSigla.
	 */
	public String getUnidadeSigla() {
		return unidadeSigla;
	}
	
	/**
	 * @param unidadeSigla The unidadeSigla to set.
	 */
	public void setUnidadeSigla(String unidadeSigla) {
		this.unidadeSigla = unidadeSigla;
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
	 * @return Returns the empresa.
	 */
	public String getEmpresa() {
		return empresa;
	}
	
	/**
	 * @param empresa The empresa to set.
	 */
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	/**
	 * @return Returns the nome.
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * @param nome The nome to set.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * @return Returns the preco.
	 */
	public String getPreco() {
		return preco;
	}
	
	/**
	 * @param preco The preco to set.
	 */
	public void setPreco(String preco) {
		this.preco = preco;
	}
	
	/**
	 * @return Returns the unidade.
	 */
	public String getUnidade() {
		return unidade;
	}
	
	/**
	 * @param unidade The unidade to set.
	 */
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public void reset(  ActionMapping mapping, HttpServletRequest request  ) {

		this.nome = null;
		this.preco = null;
		this.unidade = null;
		this.empresa = null;
		this.empresaNome = null;
		this.empresaCnpjCpf = null;
		this.empresaFoneFax = null;
		
	}

	public ActionErrors validate( ActionMapping mapping, HttpServletRequest request ) {
		
		return null;
				
	}
	
}
