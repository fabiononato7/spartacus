/*
 * Created on 19/08/2005
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
public class RegiaoTO implements Serializable {

	private int codigo;
	private String descricao;
	private String ativo;
	private int empresa;
	
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
	public int getEmpresa() {
		return empresa;
	}
	
	/**
	 * @param empresa The empresa to set.
	 */
	public void setEmpresa(int empresa) {
		this.empresa = empresa;
	}
	
}
