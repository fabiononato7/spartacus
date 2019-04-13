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
public class PedidoForm extends ActionForm {

	private String codigo;
	private String dataEmissao;
	private String dataEntrega;
	private String valor;
	private String empresa;
	private String empresaNome;
	private String empresaResponsavel;
	private String empresaCnpjCpf;
	
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
	 * @return Returns the empresaResponsavel.
	 */
	public String getEmpresaResponsavel() {
		return empresaResponsavel;
	}
	
	/**
	 * @param empresaResponsavel The empresaResponsavel to set.
	 */
	public void setEmpresaResponsavel(String empresaResponsavel) {
		this.empresaResponsavel = empresaResponsavel;
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
	 * @return Returns the dataEmissao.
	 */
	public String getDataEmissao() {
		return dataEmissao;
	}
	
	/**
	 * @param dataEmissao The dataEmissao to set.
	 */
	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	
	/**
	 * @return Returns the dataEntrega.
	 */
	public String getDataEntrega() {
		return dataEntrega;
	}
	
	/**
	 * @param dataEntrega The dataEntrega to set.
	 */
	public void setDataEntrega(String dataEntrega) {
		this.dataEntrega = dataEntrega;
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

	public void reset( ActionMapping mapping, HttpServletRequest request ) {

		this.dataEmissao = null;
		this.dataEntrega = null;
		this.valor = null;
		this.empresa = null;
		this.empresaNome = null;
		
	}

	public ActionErrors validate( ActionMapping mapping, HttpServletRequest request ) {
		
		return null;
				
	}
	
}