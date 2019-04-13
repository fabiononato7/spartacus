/*
 * Created on 23/09/2005
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
public class PromocaoTO implements Serializable {

	private int codigo;
	private String descricao;
	private String dataInicio;
	private String dataFinal;
	
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
	
}
