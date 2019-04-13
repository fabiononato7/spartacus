/*
 * Created on 15/08/2005
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
public class EstadoTO implements Serializable {
	
	private int codigo;
	private String nome;
	private String sigla;

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
	 * @return Returns the sigla.
	 */
	public String getSigla() {
		return sigla;
	}
	
	/**
	 * @param sigla The sigla to set.
	 */
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
}