/*
 * Created on 21/08/2005
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
public class CidadeRegiaoTO implements Serializable {

	private int cidade;
	private int regiao;
	private String comentario;
	private int[] cidades;
		
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
	public int getRegiao() {
		return regiao;
	}
	
	/**
	 * @param regiao The regiao to set.
	 */
	public void setRegiao(int regiao) {
		this.regiao = regiao;
	}
	
	/**
	 * @return Returns the cidades.
	 */
	public int[] getCidades() {
		return cidades;
	}
	
	/**
	 * @param cidades The cidades to set.
	 */
	public void setCidades(int[] cidades) {
		this.cidades = cidades;
	}
	
}
