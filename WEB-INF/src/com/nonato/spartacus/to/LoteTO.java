/*
 * Created on 29/08/2005
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
public class LoteTO implements Serializable {

	private int codigo;
	private String descricao;
	private String dataFabricacao;
	private String dataValidade;
	private int quantidadeProduzida;
	private int quantidadeDisponivel;
	private int produto;
	
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
	 * @return Returns the quantidadeDisponivel.
	 */
	public int getQuantidadeDisponivel() {
		return quantidadeDisponivel;
	}
	
	/**
	 * @param quantidadeDisponivel The quantidadeDisponivel to set.
	 */
	public void setQuantidadeDisponivel(int quantidadeDisponivel) {
		this.quantidadeDisponivel = quantidadeDisponivel;
	}
	
	/**
	 * @return Returns the quantidadeProduzida.
	 */
	public int getQuantidadeProduzida() {
		return quantidadeProduzida;
	}
	
	/**
	 * @param quantidadeProduzida The quantidadeProduzida to set.
	 */
	public void setQuantidadeProduzida(int quantidadeProduzida) {
		this.quantidadeProduzida = quantidadeProduzida;
	}
	
}