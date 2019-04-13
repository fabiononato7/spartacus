/*
 * Created on 23/09/2005
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
public class PromocaoForm extends ActionForm {

	private String codigo;
	private String descricao;
	private String dataInicio;
	private String dataFinal;
	private String[] produtos;
	private String[] quantidades;
	
	/**
	 * @return Returns the produtos.
	 */
	public String[] getProdutos() {
		return produtos;
	}
	
	/**
	 * @param produtos The produtos to set.
	 */
	public void setProdutos(String[] produtos) {
		this.produtos = produtos;
	}
	
	/**
	 * @return Returns the quantidades.
	 */
	public String[] getQuantidades() {
		return quantidades;
	}
	
	/**
	 * @param quantidades The quantidades to set.
	 */
	public void setQuantidades(String[] quantidades) {
		this.quantidades = quantidades;
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
	 * @return Returns the dataFinal.
	 */
	public String getDataFinal() {
		return dataFinal;
	}
	
	/**
	 * @param dataFinal The dataFinal to set.
	 */
	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}
	
	/**
	 * @return Returns the dataInicio.
	 */
	public String getDataInicio() {
		return dataInicio;
	}
	
	/**
	 * @param dataInicio The dataInicio to set.
	 */
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
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
	
	public void reset( ActionMapping mapping, HttpServletRequest request ) {

		this.descricao = null;
		this.dataInicio = null;
		this.dataFinal = null;
		
	}

	public ActionErrors validate( ActionMapping mapping, HttpServletRequest request ) {
		
		return null;
				
	}
	
}