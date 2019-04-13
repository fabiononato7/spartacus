/*
 * Created on 30/08/2005
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
public class CondicaoTO implements Serializable {

	private int codigo;
	private int dias;
	private double juros;
	private double multa;
	private int parcelas;
	
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
	 * @return Returns the dias.
	 */
	public int getDias() {
		return dias;
	}
	
	/**
	 * @param dias The dias to set.
	 */
	public void setDias(int dias) {
		this.dias = dias;
	}
	
	/**
	 * @return Returns the juros.
	 */
	public double getJuros() {
		return juros;
	}
	
	/**
	 * @param juros The juros to set.
	 */
	public void setJuros(double juros) {
		this.juros = juros;
	}
	
	/**
	 * @return Returns the multa.
	 */
	public double getMulta() {
		return multa;
	}
	
	/**
	 * @param multa The multa to set.
	 */
	public void setMulta(double multa) {
		this.multa = multa;
	}
	
	/**
	 * @return Returns the parcelas.
	 */
	public int getParcelas() {
		return parcelas;
	}
	
	/**
	 * @param parcelas The parcelas to set.
	 */
	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}
	
}