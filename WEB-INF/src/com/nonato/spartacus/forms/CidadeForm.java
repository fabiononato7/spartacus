/*
 * Created on 11/08/2005
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
public class CidadeForm extends ActionForm {

	private String codigo;
	private String nome;
	private String cep;
	private String estado;
	private String estadoSigla;
	
	/**
	 * @return Returns the cep.
	 */
	public String getCep() {
		return cep;
	}
	
	/**
	 * @param cep The cep to set.
	 */
	public void setCep(String cep) {
		this.cep = cep;
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
	 * @return Returns the estado.
	 */
	public String getEstado() {
		return estado;
	}
	
	/**
	 * @param estado The estado to set.
	 */
	public void setEstado(String estado) {
		this.estado = estado;
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
	 * @return Returns the estadoSigla.
	 */
	public String getEstadoSigla() {
		return estadoSigla;
	}
	
	/**
	 * @param estadoSigla The estadoSigla to set.
	 */
	public void setEstadoSigla(String estadoSigla) {
		this.estadoSigla = estadoSigla;
	}

	public void reset( ActionMapping mapping, HttpServletRequest request  ) {
		
		this.nome = null;
		this.cep = null;
		this.estado = null;	
		this.estadoSigla = null;
		
	}

	public ActionErrors validate( ActionMapping mapping, HttpServletRequest request ) {
		
		ActionErrors erros = new ActionErrors();
		/*		
		if ( Validacao.valorNulo( nome ) ) {
			
			erros.add( "erro", new ActionError( "erro.nome" ) );
			
		}
		*/
		return erros;
				
	}

}