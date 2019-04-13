/*
 * Created on 01/11/2005
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
public class ItemLoteForm extends ActionForm {

	private String item;
	private String itemQuantidade;
	private String produto;
	private String produtoNome;
	private String produtoPreco;
	private String produtoUnidadeSigla;	
	private String lote;
	private String loteDescricao;
	private String quantidade;
	private String valor;

	/**
	 * @return Returns the item.
	 */
	public String getItem() {
		return item;
	}
	
	/**
	 * @param item The item to set.
	 */
	public void setItem(String item) {
		this.item = item;
	}
	
	/**
	 * @return Returns the itemQuantidade.
	 */
	public String getItemQuantidade() {
		return itemQuantidade;
	}
	
	/**
	 * @param itemQuantidade The itemQuantidade to set.
	 */
	public void setItemQuantidade(String itemQuantidade) {
		this.itemQuantidade = itemQuantidade;
	}
	
	/**
	 * @return Returns the lote.
	 */
	public String getLote() {
		return lote;
	}
	
	/**
	 * @param lote The lote to set.
	 */
	public void setLote(String lote) {
		this.lote = lote;
	}
	
	/**
	 * @return Returns the loteDescricao.
	 */
	public String getLoteDescricao() {
		return loteDescricao;
	}
	
	/**
	 * @param loteDescricao The loteDescricao to set.
	 */
	public void setLoteDescricao(String loteDescricao) {
		this.loteDescricao = loteDescricao;
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
	
	/**
	 * @return Returns the valor.
	 */
	public String getValor() {
		return valor;
	}
	
	/**
	 * @param valor The valor to set.
	 */
	public void setValor(String valor) {
		this.valor = valor;
	}
		
	public void reset( ActionMapping mapping, HttpServletRequest request ) {
		
		this.item = null;
		this.lote = null;
		
		this.itemQuantidade = null;
		this.produto = null;
		this.produtoNome = null;
		this.produtoPreco = null;
		this.produtoUnidadeSigla = null;
		this.loteDescricao = null;
		this.quantidade = null;
		this.valor = null;
		
	}
	
	public ActionErrors validate( ActionMapping mapping, HttpServletRequest request ) {
		
		return null;
		
	}
	
}
