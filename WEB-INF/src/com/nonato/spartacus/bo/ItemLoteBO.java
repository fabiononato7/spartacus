/*
 * Created on 25/08/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nonato.spartacus.bo;

import java.util.Collection;

import com.nonato.spartacus.dao.ItemLoteDAO;
import com.nonato.spartacus.to.ItemLoteTO;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ItemLoteBO {

	public static boolean inserir( ItemLoteTO itemLote ) {
		
		boolean sucesso = false;
		
		sucesso = ItemLoteDAO.inserir( itemLote );
		
		return sucesso;
		
	}
	
	public static Collection listarPorPedido( int pedido ) {
		
		Collection itensLotes = null;
		
		itensLotes = ItemLoteDAO.listarPorPedido( pedido );
		
		return itensLotes;
		
	}
	
}
