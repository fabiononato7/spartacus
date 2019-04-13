/*
 * Created on 21/08/2005
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
public class CidadeRegiaoForm extends ActionForm {

	private String cidade;
	private String cidadeNome;
	private String cidadeCep;
	private String cidadeEstado;
	private String cidadeEstadoSigla;
	private String regiao;
	private String regiaoDescricao;
	private String regiaoAtivo;
	private String regiaoEmpresa;
	private String regiaoEmpresaNome;
	private String comentario;
	private String[] cidades;
	
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
	 * @return Returns the cidadeEstado.
	 */
	public String getCidadeEstado() {
		return cidadeEstado;
	}
	
	/**
	 * @param cidadeEstado The cidadeEstado to set.
	 */
	public void setCidadeEstado(String cidadeEstado) {
		this.cidadeEstado = cidadeEstado;
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
	 * @return Returns the comentario.
	 */
	public String getComentario() {
		return comentario;
	}
	
	/**
	 * @param comentario The comentario to set.
	 */
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	/**
	 * @return Returns the regiao.
	 */
	public String getRegiao() {
		return regiao;
	}
	
	/**
	 * @param regiao The regiao to set.
	 */
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	
	/**
	 * @return Returns the regiaoAtivo.
	 */
	public String getRegiaoAtivo() {
		return regiaoAtivo;
	}
	
	/**
	 * @param regiaoAtivo The regiaoAtivo to set.
	 */
	public void setRegiaoAtivo(String regiaoAtivo) {
		this.regiaoAtivo = regiaoAtivo;
	}
	
	/**
	 * @return Returns the regiaoDescricao.
	 */
	public String getRegiaoDescricao() {
		return regiaoDescricao;
	}
	
	/**
	 * @param regiaoDescricao The regiaoDescricao to set.
	 */
	public void setRegiaoDescricao(String regiaoDescricao) {
		this.regiaoDescricao = regiaoDescricao;
	}
	
	/**
	 * @return Returns the regiaoEmpresa.
	 */
	public String getRegiaoEmpresa() {
		return regiaoEmpresa;
	}
	
	/**
	 * @param regiaoEmpresa The regiaoEmpresa to set.
	 */
	public void setRegiaoEmpresa(String regiaoEmpresa) {
		this.regiaoEmpresa = regiaoEmpresa;
	}
	
	/**
	 * @return Returns the regiaoEmpresaNome.
	 */
	public String getRegiaoEmpresaNome() {
		return regiaoEmpresaNome;
	}
	
	/**
	 * @param regiaoEmpresaNome The regiaoEmpresaNome to set.
	 */
	public void setRegiaoEmpresaNome(String regiaoEmpresaNome) {
		this.regiaoEmpresaNome = regiaoEmpresaNome;
	}
	
	/**
	 * @return Returns the cidades.
	 */
	public String[] getCidades() {
		return cidades;
	}
	
	/**
	 * @param cidades The cidades to set.
	 */
	public void setCidades(String[] cidades) {
		this.cidades = cidades;
	}

	public void reset( ActionMapping mapping, HttpServletRequest request ) {
						
		this.cidadeNome = null;
		this.cidadeCep = null;
		this.cidadeEstado = null;
		this.cidadeEstadoSigla = null;
		this.regiaoDescricao = null;
		this.regiaoAtivo = null;
		this.regiaoEmpresa = null;
		this.regiaoEmpresaNome = null;
		this.comentario = null;
		this.cidades = null;
		
	}

	public ActionErrors validate( ActionMapping mapping, HttpServletRequest request ) {
		
		return null;
				
	}
	
}