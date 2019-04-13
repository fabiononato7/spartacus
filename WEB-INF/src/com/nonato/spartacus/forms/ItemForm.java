/*
 * Created on 25/08/2005
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
public class ItemForm extends ActionForm {

	private String codigo;
	private String quantidade;
	private String pedido;
	private String pedidoEmpresa;
	private String produto;
	private String produtoNome;
	private String produtoPreco;
	private String produtoUnidade;
	private String produtoUnidadeSigla;
	private String[] produtos;
	private String[] quantidades;
	
	/**
	 * @return Returns the produtoUnidade.
	 */
	public String getProdutoUnidade() {
		return produtoUnidade;
	}
	
	/**
	 * @param produtoUnidade The produtoUnidade to set.
	 */
	public void setProdutoUnidade(String produtoUnidade) {
		this.produtoUnidade = produtoUnidade;
	}
	
	/**
	 * @return Returns the produtoUnidadeSigla.
	 */
	public String getProdutoUnidadeSigla() {
		return produtoUnidadeSigla;
	}
	
	/**
	 * @param produtoUnidadeSigla The produtoUnidadeSigla to set.
	 */
	public void setProdutoUnidadeSigla(String produtoUnidadeSigla) {
		this.produtoUnidadeSigla = produtoUnidadeSigla;
	}
	
	/**
	 * @return Returns the produtos.
	 */
	public String[] getProdutos() {
		return produtos;
	}
	
	/**
	 * @param produtos The produtos to set.
	 */
	public void setProdutos(String[] produtos) {
		this.produtos = produtos;
	}
	
	/**
	 * @return Returns the produtoNome.
	 */
	public String getProdutoNome() {
		return produtoNome;
	}
	
	/**
	 * @param produtoNome The produtoNome to set.
	 */
	public void setProdutoNome(String produtoNome) {
		this.produtoNome = produtoNome;
	}
	
	/**
	 * @return Returns the produtoPreco.
	 */
	public String getProdutoPreco() {
		return produtoPreco;
	}
	
	/**
	 * @param produtoPreco The produtoPreco to set.
	 */
	public void setProdutoPreco(String produtoPreco) {
		this.produtoPreco = produtoPreco;
	}
	
	/**
	 * @return Returns the quantidades.
	 */
	public String[] getQuantidades() {
		return quantidades;
	}
	
	/**
	 * @param quantidades The quantidades to set.
	 */
	public void setQuantidades(String[] quantidades) {
		this.quantidades = quantidades;
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
	 * @return Returns the pedido.
	 */
	public String getPedido() {
		return pedido;
	}
	
	/**
	 * @param pedido The pedido to set.
	 */
	public void setPedido(String pedido) {
		this.pedido = pedido;
	}
	
	/**
	 * @return Returns the pedidoEmpresa.
	 */
	public String getPedidoEmpresa() {
		return pedidoEmpresa;
	}
	
	/**
	 * @param pedidoEmpresa The pedidoEmpresa to set.
	 */
	public void setPedidoEmpresa(String pedidoEmpresa) {
		this.pedidoEmpresa = pedidoEmpresa;
	}
	
	/**
	 * @return Returns the produto.
	 */
	public String getProduto() {
		return produto;
	}
	
	/**
	 * @param produto The produto to set.
	 */
	public void setProduto(String produto) {
		this.produto = produto;
	}
	
	/**
	 * @return Returns the quantidade.
	 */
	public String getQuantidade() {
		return quantidade;
	}
	
	/**
	 * @param quantidade The quantidade to set.
	 */
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public void reset( ActionMapping mapping, HttpServletRequest request ) {
		
		this.pedido = null;
		this.pedidoEmpresa = null;
		this.produto = null;
		this.produtoNome = null;
		this.produtoPreco = null;
		this.produtoUnidade = null;
		this.produtoUnidadeSigla = null;
		
	}

	public ActionErrors validate( ActionMapping mapping, HttpServletRequest request ) {
		
		return null;
				
	}
	
}
