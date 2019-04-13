/*
 * Created on 20/09/2005
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
public class CondicaoForm extends ActionForm {

	private String codigo;
	private String dias;
	private String juros;
	private String multa;
	private String parcelas;
	
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
	 * @return Returns the dias.
	 */
	public String getDias() {
		return dias;
	}
	
	/**
	 * @param dias The dias to set.
	 */
	public void setDias(String dias) {
		this.dias = dias;
	}
	
	/**
	 * @return Returns the juros.
	 */
	public String getJuros() {
		return juros;
	}
	
	/**
	 * @param juros The juros to set.
	 */
	public void setJuros(String juros) {
		this.juros = juros;
	}
	
	/**
	 * @return Returns the multa.
	 */
	public String getMulta() {
		return multa;
	}
	
	/**
	 * @param multa The multa to set.
	 */
	public void setMulta(String multa) {
		this.multa = multa;
	}
	
	/**
	 * @return Returns the parcelas.
	 */
	public String getParcelas() {
		return parcelas;
	}
	
	/**
	 * @param parcelas The parcelas to set.
	 */
	public void setParcelas(String parcelas) {
		this.parcelas = parcelas;
	}
	
	public void reset( ActionMapping mapping, HttpServletRequest request ) {

		this.dias = null;
		this.juros = null;
		this.multa = null;
		this.parcelas = null;
		
	}

	public ActionErrors validate( ActionMapping mapping, HttpServletRequest request ) {
		
		return null;
				
	}
	
}