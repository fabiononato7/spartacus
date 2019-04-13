/*
 * Created on 24/08/2005
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
public class PedidoTO implements Serializable {

	private int codigo;
	private String dataEmissao;
	private String dataEntrega;
	private double valor;
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
	 * @return Returns the dataEmissao.
	 */
	public String getDataEmissao() {
		return dataEmissao;
	}
	
	/**
	 * @param dataEmissao The dataEmissao to set.
	 */
	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	
	/**
	 * @return Returns the dataEntrega.
	 */
	public String getDataEntrega() {
		return dataEntrega;
	}
	
	/**
	 * @param dataEntrega The dataEntrega to set.
	 */
	public void setDataEntrega(String dataEntrega) {
		this.dataEntrega = dataEntrega;
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
	
}
