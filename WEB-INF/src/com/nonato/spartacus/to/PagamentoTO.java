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
public class PagamentoTO implements Serializable {

	private int codigo;
	private String descricao;
	private String dataVencimento;
	private String dataPagamento;
	private double valor;
	private double valorPago;
	private int pedido;
		
	/**
	 * @return Returns the dataPagamento.
	 */
	public String getDataPagamento() {
		return dataPagamento;
	}
	
	/**
	 * @param dataPagamento The dataPagamento to set.
	 */
	public void setDataPagamento(String dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
	/**
	 * @return Returns the dataVencimento.
	 */
	public String getDataVencimento() {
		return dataVencimento;
	}
	
	/**
	 * @param dataVencimento The dataVencimento to set.
	 */
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
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
	 * @return Returns the valor.
	 */
	public double getValor() {
		return valor;
	}
	
	/**
	 * @param valor The valor to set.
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	/**
	 * @return Returns the valorPago.
	 */
	public double getValorPago() {
		return valorPago;
	}
	
	/**
	 * @param valorPago The valorPago to set.
	 */
	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}
	
}