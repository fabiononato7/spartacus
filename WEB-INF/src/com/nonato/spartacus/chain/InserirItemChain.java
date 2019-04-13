/*
 * Created on 16/09/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nonato.spartacus.chain;

import java.util.Collection;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

import com.nonato.spartacus.bo.PedidoBO;
import com.nonato.spartacus.forms.PedidoForm;
import com.nonato.spartacus.to.PedidoTO;
import com.nonato.spartacus.util.Colecao;
import com.nonato.spartacus.util.Validacao;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class InserirItemChain implements Command {

	public boolean execute( Context context ) throws Exception {

		PedidoTO pedidoTO = (PedidoTO) context.get( "pedido" );
		Collection carrinho = (Collection) context.get( "carrinho" );
		
		PedidoForm pedidoForm = PedidoBO.getCodigo( pedidoTO.getEmpresa(), pedidoTO.getDataEmissao() );
		
		pedidoTO.setCodigo( Validacao.stringParaInteiro( pedidoForm.getCodigo() ) );		
		context.put( "pedido", pedidoTO );
				
		boolean comando = Colecao.gravar( pedidoForm, carrinho );
		
		return ( ! comando );
		
	}
	
}
