/*
 * Created on 19/08/2005
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
public class RegiaoForm extends ActionForm {

	private String codigo;
	private String descricao;
	private String ativo;
	private String empresa;
	private String empresaNome;
	private String empresaCnpjCpf;
	private String empresaFoneFax;
	private String valor;
	
	/**
	 * @return Returns the valor.
	 */
	public String getValor() {
		return valor;
	}
	
	/**
	 * @param valor The valor to set.
	 */
	public void setValor(String valor) {
		this.valor = valor;
	}
	
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
	 * @return Returns the descricao.
	 */
	public String getDescricao() {
		return descricao;
	}
	
	/**
	 * @param descricao The descricao to set.
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
	
	public void reset( ActionMapping mapping, HttpServletRequest request  ) {

		this.descricao = null;
		this.ativo = null;		
		this.empresa = null;
		this.empresaNome = null;
		this.empresaCnpjCpf = null;
		this.empresaFoneFax = null;
		
	}

	public ActionErrors validate( ActionMapping mapping, HttpServletRequest request ) {
		
		return null;
				
	}
	
}
