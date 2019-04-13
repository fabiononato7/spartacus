/*
 * Created on 23/09/2005
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
public class ProdutoPromocaoForm extends ActionForm {

	private String produto;
	private String produtoNome;
	private String produtoPreco;
	private String produtoUnidade;
	private String produtoUnidadeSigla;
	private String promocao;
	private String promocaoDescricao;
	private String promocaoDataInicio;
	private String promocaoDataFinal;
	private String desconto;
	private String valor;
	private String[] produtos;
	private String[] descontos;
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
	 * @return Returns the promocaoDataFinal.
	 */
	public String getPromocaoDataFinal() {
		return promocaoDataFinal;
	}
	
	/**
	 * @param promocaoDataFinal The promocaoDataFinal to set.
	 */
	public void setPromocaoDataFinal(String promocaoDataFinal) {
		this.promocaoDataFinal = promocaoDataFinal;
	}
	
	/**
	 * @return Returns the promocaoDataInicio.
	 */
	public String getPromocaoDataInicio() {
		return promocaoDataInicio;
	}
	
	/**
	 * @param promocaoDataInicio The promocaoDataInicio to set.
	 */
	public void setPromocaoDataInicio(String promocaoDataInicio) {
		this.promocaoDataInicio = promocaoDataInicio;
	}
	
	/**
	 * @return Returns the promocaoDescricao.
	 */
	public String getPromocaoDescricao() {
		return promocaoDescricao;
	}
	
	/**
	 * @param promocaoDescricao The promocaoDescricao to set.
	 */
	public void setPromocaoDescricao(String promocaoDescricao) {
		this.promocaoDescricao = promocaoDescricao;
	}
	
	/**
	 * @return Returns the desconto.
	 */
	public String getDesconto() {
		return desconto;
	}
	
	/**
	 * @param desconto The desconto to set.
	 */
	public void setDesconto(String desconto) {
		this.desconto = desconto;
	}
	
	/**
	 * @return Returns the descontos.
	 */
	public String[] getDescontos() {
		return descontos;
	}
	
	/**
	 * @param descontos The descontos to set.
	 */
	public void setDescontos(String[] descontos) {
		this.descontos = descontos;
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
	 * @return Returns the promocao.
	 */
	public String getPromocao() {
		return promocao;
	}
	
	/**
	 * @param promocao The promocao to set.
	 */
	public void setPromocao(String promocao) {
		this.promocao = promocao;
	}
	
	public void reset( ActionMapping mapping, HttpServletRequest request ) {
		
		this.produtoNome = null;
		this.produtoPreco = null;
		this.promocaoDescricao = null;
		this.promocaoDataInicio = null;
		this.promocaoDataFinal = null;
		this.desconto = null;
		this.valor = null;
		
	}
	
	public ActionErrors validate( ActionMapping mapping, HttpServletRequest request ) {
		
		return null;
				
	}	
	
}
