/*
 * Created on 20/09/2005
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
public class LoteForm extends ActionForm {

	private String codigo;
	private String descricao;
	private String dataFabricacao;
	private String dataValidade;
	private String quantidadeProduzida;
	private String quantidadeDisponivel;
	private String produto;
	private String produtoNome;
	private String produtoPreco;
	private String produtoUnidadeSigla;
	private String produtoEmpresaNome;
	
	/**
	 * @return Returns the produtoEmpresaNome.
	 */
	public String getProdutoEmpresaNome() {
		return produtoEmpresaNome;
	}
	
	/**
	 * @param produtoEmpresaNome The produtoEmpresaNome to set.
	 */
	public void setProdutoEmpresaNome(String produtoEmpresaNome) {
		this.produtoEmpresaNome = produtoEmpresaNome;
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
	 * @return Returns the dataFabricacao.
	 */
	public String getDataFabricacao() {
		return dataFabricacao;
	}
	
	/**
	 * @param dataFabricacao The dataFabricacao to set.
	 */
	public void setDataFabricacao(String dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	/**
	 * @return Returns the dataValidade.
	 */
	public String getDataValidade() {
		return dataValidade;
	}
	
	/**
	 * @param dataValidade The dataValidade to set.
	 */
	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
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
	 * @return Returns the quantidadeDisponivel.
	 */
	public String getQuantidadeDisponivel() {
		return quantidadeDisponivel;
	}
	
	/**
	 * @param quantidadeDisponivel The quantidadeDisponivel to set.
	 */
	public void setQuantidadeDisponivel(String quantidadeDisponivel) {
		this.quantidadeDisponivel = quantidadeDisponivel;
	}
	
	/**
	 * @return Returns the quantidadeProduzida.
	 */
	public String getQuantidadeProduzida() {
		return quantidadeProduzida;
	}
	
	/**
	 * @param quantidadeProduzida The quantidadeProduzida to set.
	 */
	public void setQuantidadeProduzida(String quantidadeProduzida) {
		this.quantidadeProduzida = quantidadeProduzida;
	}
	
	public void reset( ActionMapping mapping, HttpServletRequest request ) {

		this.descricao = null;
		this.dataFabricacao = null;
		this.dataValidade = null;
		this.quantidadeProduzida = null;
		this.quantidadeDisponivel = null;
		this.produto = null;
		this.produtoNome = null;
				
	}

	public ActionErrors validate( ActionMapping mapping, HttpServletRequest request ) {
		
		return null;
				
	}
		
}
