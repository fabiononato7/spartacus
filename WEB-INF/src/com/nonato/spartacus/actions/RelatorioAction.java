/*
 * Created on 08/12/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nonato.spartacus.actions;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.nonato.spartacus.bo.RelatorioBO;

/**
 * @author XP
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class RelatorioAction extends DispatchAction {

	public ActionForward listarClientesEmDebito( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		Collection pagamentos = RelatorioBO.clientesEmDebito();

		request.getSession().setAttribute( "clientesEmDebito", pagamentos );

		target = "listar_clientes_debito";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward listarProdutosMaisVendidos( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		Collection produtos = RelatorioBO.produtosMaisVendidos();

		request.getSession().setAttribute( "produtosMaisVendidos", produtos );

		target = "listar_produtos_vendidos";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward listarVendasPorRegiao( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		Collection vendas = RelatorioBO.vendasPorRegiao();

		request.getSession().setAttribute( "vendasPorRegiao", vendas );

		target = "listar_vendas_regiao";

		return ( mapping.findForward( target ) );
		
	}
	
}
