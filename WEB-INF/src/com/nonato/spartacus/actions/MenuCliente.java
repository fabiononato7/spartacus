/*
 * Created on 14/10/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nonato.spartacus.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.nonato.spartacus.forms.MenuForm;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class MenuCliente {

	public static ActionForward iniciarPedido( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		MenuForm menuForm = Menu.get( request );	

		target = "iniciar_pedido";

		return ( mapping.findForward( target ) );
		
	}	
	
	public static ActionForward iniciarPromocao( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		MenuForm menuForm = Menu.get( request );

		target = "iniciar_promocao";

		return ( mapping.findForward( target ) );
		
	}	
	
	public static ActionForward consultarProdutos( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		target = "consultar_produtos";

		return ( mapping.findForward( target ) );
		
	}	
	
	public static ActionForward consultarPagamentos( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		target = "consultar_pagamentos";

		return ( mapping.findForward( target ) );
		
	}
	
}
