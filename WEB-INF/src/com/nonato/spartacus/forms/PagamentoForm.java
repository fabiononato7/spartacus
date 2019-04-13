/*
 * Created on 22/09/2005
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
public class PagamentoForm extends ActionForm {
	
	private String codigo;
	private String descricao;
	private String dataVencimento;
	private String dataPagamento;
	private String valor;
	private String valorPago;
	private String pedido;
	private String pedidoDataEmissao;
	private String pedidoEmpresaNome;
	private String pedidoEmpresaCnpjCpf;
	private String pedidoEmpresaEndereco;
	private String pedidoEmpresaBairroDistrito;
	private String pedidoEmpresaCep;
	private String pedidoEmpresaCidade;
	private String pedidoEmpresaEstado;

	/**
	 * @return Returns the pedidoDataEmissao.
	 */
	public String getPedidoDataEmissao() {
		return pedidoDataEmissao;
	}
	
	/**
	 * @param pedidoDataEmissao The pedidoDataEmissao to set.
	 */
	public void setPedidoDataEmissao(String pedidoDataEmissao) {
		this.pedidoDataEmissao = pedidoDataEmissao;
	}
	
	/**
	 * @return Returns the pedidoEmpresaBairroDistrito.
	 */
	public String getPedidoEmpresaBairroDistrito() {
		return pedidoEmpresaBairroDistrito;
	}
	
	/**
	 * @param pedidoEmpresaBairroDistrito The pedidoEmpresaBairroDistrito to set.
	 */
	public void setPedidoEmpresaBairroDistrito(
			String pedidoEmpresaBairroDistrito) {
		this.pedidoEmpresaBairroDistrito = pedidoEmpresaBairroDistrito;
	}
	
	/**
	 * @return Returns the pedidoEmpresaCep.
	 */
	public String getPedidoEmpresaCep() {
		return pedidoEmpresaCep;
	}
	
	/**
	 * @param pedidoEmpresaCep The pedidoEmpresaCep to set.
	 */
	public void setPedidoEmpresaCep(String pedidoEmpresaCep) {
		this.pedidoEmpresaCep = pedidoEmpresaCep;
	}
	
	/**
	 * @return Returns the pedidoEmpresaCidade.
	 */
	public String getPedidoEmpresaCidade() {
		return pedidoEmpresaCidade;
	}
	
	/**
	 * @param pedidoEmpresaCidade The pedidoEmpresaCidade to set.
	 */
	public void setPedidoEmpresaCidade(String pedidoEmpresaCidade) {
		this.pedidoEmpresaCidade = pedidoEmpresaCidade;
	}
	
	/**
	 * @return Returns the pedidoEmpresaCnpjCpf.
	 */
	public String getPedidoEmpresaCnpjCpf() {
		return pedidoEmpresaCnpjCpf;
	}
	
	/**
	 * @param pedidoEmpresaCnpjCpf The pedidoEmpresaCnpjCpf to set.
	 */
	public void setPedidoEmpresaCnpjCpf(String pedidoEmpresaCnpjCpf) {
		this.pedidoEmpresaCnpjCpf = pedidoEmpresaCnpjCpf;
	}
	
	/**
	 * @return Returns the pedidoEmpresaEndereco.
	 */
	public String getPedidoEmpresaEndereco() {
		return pedidoEmpresaEndereco;
	}
	
	/**
	 * @param pedidoEmpresaEndereco The pedidoEmpresaEndereco to set.
	 */
	public void setPedidoEmpresaEndereco(String pedidoEmpresaEndereco) {
		this.pedidoEmpresaEndereco = pedidoEmpresaEndereco;
	}
	
	/**
	 * @return Returns the pedidoEmpresaEstado.
	 */
	public String getPedidoEmpresaEstado() {
		return pedidoEmpresaEstado;
	}
	
	/**
	 * @param pedidoEmpresaEstado The pedidoEmpresaEstado to set.
	 */
	public void setPedidoEmpresaEstado(String pedidoEmpresaEstado) {
		this.pedidoEmpresaEstado = pedidoEmpresaEstado;
	}
	
	/**
	 * @return Returns the pedidoEmpresaNome.
	 */
	public String getPedidoEmpresaNome() {
		return pedidoEmpresaNome;
	}
	
	/**
	 * @param pedidoEmpresaNome The pedidoEmpresaNome to set.
	 */
	public void setPedidoEmpresaNome(String pedidoEmpresaNome) {
		this.pedidoEmpresaNome = pedidoEmpresaNome;
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
	 * @return Returns the valorPago.
	 */
	public String getValorPago() {
		return valorPago;
	}
	
	/**
	 * @param valorPago The valorPago to set.
	 */
	public void setValorPago(String valorPago) {
		this.valorPago = valorPago;
	}
	
	public void reset( ActionMapping mapping, HttpServletRequest request ) {

		this.descricao = null;
		this.dataPagamento = null;
		this.dataVencimento =null;
		this.valor = null;
		this.valorPago = null;
		this.pedido = null;
		
	}
	
	public ActionErrors validate( ActionMapping mapping, HttpServletRequest request ) {
		
		return null;
		
	}
	
}
