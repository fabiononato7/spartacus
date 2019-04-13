/*
 * Created on 16/09/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nonato.spartacus.chain;

import org.apache.commons.chain.impl.ChainBase;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class PedidoChain extends ChainBase {

	public PedidoChain() {
		
		addCommand( new CriarPedidoChain() );
		addCommand( new InserirItemChain() );
		addCommand( new InserirItemLoteChain() );
		addCommand( new GerarPagamentoChain() );
		
	}

}