/*
 * Created on 27/08/2005
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
public class ProdutoTO implements Serializable {

	private int codigo;
	private String nome;
	private double preco;
	private int unidade;
	private int empresa;
	
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
	 * @return Returns the preco.
	 */
	public double getPreco() {
		return preco;
	}
	
	/**
	 * @param preco The preco to set.
	 */
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	/**
	 * @return Returns the unidade.
	 */
	public int getUnidade() {
		return unidade;
	}
	
	/**
	 * @param unidade The unidade to set.
	 */
	public void setUnidade(int unidade) {
		this.unidade = unidade;
	}
	
}
