/*
 * Created on 16/09/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nonato.spartacus.chain;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

import com.nonato.spartacus.bo.PagamentoBO;
import com.nonato.spartacus.to.PedidoTO;
import com.nonato.spartacus.util.Validacao;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class GerarPagamentoChain implements Command {

	public boolean execute( Context context ) throws Exception {
		
		PedidoTO pedidoTO = (PedidoTO) context.get( "pedido" );
		
		int modo = Validacao.objetoParaInteiro( context.get( "modo" ) );
		
		boolean comando = PagamentoBO.gerar( pedidoTO.getCodigo(), modo );
		
		return ( ! comando );
		
	}	
	
}
