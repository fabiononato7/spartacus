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
public class ItemLoteTO implements Serializable {

	private int item;
	private int lote;
	private int quantidade;
	
	/**
	 * @return Returns the item.
	 */
	public int getItem() {
		return item;
	}
	
	/**
	 * @param item The item to set.
	 */
	public void setItem(int item) {
		this.item = item;
	}
	
	/**
	 * @return Returns the lote.
	 */
	public int getLote() {
		return lote;
	}
	
	/**
	 * @param lote The lote to set.
	 */
	public void setLote(int lote) {
		this.lote = lote;
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
