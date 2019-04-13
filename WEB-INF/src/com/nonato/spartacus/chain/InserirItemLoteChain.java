/*
 * Created on 16/09/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nonato.spartacus.chain;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

import com.nonato.spartacus.bo.PedidoBO;
import com.nonato.spartacus.to.PedidoTO;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class InserirItemLoteChain implements Command {

	public boolean execute( Context context ) throws Exception {
		
		PedidoTO pedidoTO = (PedidoTO) context.get( "pedido" );
		
		boolean comando = PedidoBO.montar( pedidoTO.getCodigo() );
		
		return ( ! comando );
		
	}
	
}
