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
public class ProdutoPromocaoTO implements Serializable {

	private int produto;
	private int promocao;
	private double desconto;
	private int[] produtos;
	private double[] descontos;
	
	/**
	 * @return Returns the descontos.
	 */
	public double[] getDescontos() {
		return descontos;
	}
	
	/**
	 * @param descontos The descontos to set.
	 */
	public void setDescontos(double[] descontos) {
		this.descontos = descontos;
	}
	
	/**
	 * @return Returns the produtos.
	 */
	public int[] getProdutos() {
		return produtos;
	}
	
	/**
	 * @param produtos The produtos to set.
	 */
	public void setProdutos(int[] produtos) {
		this.produtos = produtos;
	}
	
	/**
	 * @return Returns the desconto.
	 */
	public double getDesconto() {
		return desconto;
	}
	
	/**
	 * @param desconto The desconto to set.
	 */
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	/**
	 * @return Returns the produto.
	 */
	public int getProduto() {
		return produto;
	}
	
	/**
	 * @param produto The produto to set.
	 */
	public void setProduto(int produto) {
		this.produto = produto;
	}
	
	/**
	 * @return Returns the promocao.
	 */
	public int getPromocao() {
		return promocao;
	}
	
	/**
	 * @param promocao The promocao to set.
	 */
	public void setPromocao(int promocao) {
		this.promocao = promocao;
	}
	
}
