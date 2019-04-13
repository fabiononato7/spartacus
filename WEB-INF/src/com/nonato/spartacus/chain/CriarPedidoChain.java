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
import com.nonato.spartacus.util.Validacao;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class CriarPedidoChain implements Command {

	public boolean execute( Context context ) throws Exception {
		
		int empresa = Validacao.objetoParaInteiro( context.get( "empresa" ) );
		
		PedidoTO pedidoTO = new PedidoTO();
		pedidoTO.setEmpresa( empresa );
		pedidoTO.setDataEmissao( Validacao.getData() );
		
		context.put( "pedido", pedidoTO );
		
		boolean comando = PedidoBO.inserir( pedidoTO );
		
		return ( ! comando );
		
	}
	
}
