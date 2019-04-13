/*
 * Created on 25/08/2005
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
public class ItemTO implements Serializable {

	private int codigo;
	private int quantidade;
	private int pedido;
	private int produto;
	private int[] quantidades;
	private int[] produtos;
		
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
	 * @return Returns the quantidades.
	 */
	public int[] getQuantidades() {
		return quantidades;
	}
	
	/**
	 * @param quantidades The quantidades to set.
	 */
	public void setQuantidades(int[] quantidades) {
		this.quantidades = quantidades;
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
	 * @return Returns the pedido.
	 */
	public int getPedido() {
		return pedido;
	}
	
	/**
	 * @param pedido The pedido to set.
	 */
	public void setPedido(int pedido) {
		this.pedido = pedido;
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
	 * @return Returns the quantidade.
	 */
	public int getQuantidade() {
		return quantidade;
	}
	
	/**
	 * @param quantidade The quantidade to set.
	 */
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
