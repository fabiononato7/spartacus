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

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class MenuAdmin {

	public static ActionForward listarCidades( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		target = "listar_cidades";

		return ( mapping.findForward( target ) );
		
	}	
	
	public static ActionForward listarCondicoes( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		target = "listar_condicoes";

		return ( mapping.findForward( target ) );
		
	}
	
	public static ActionForward listarEmpresas( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		target = "listar_empresas";

		return ( mapping.findForward( target ) );
		
	}	
	
	public static ActionForward listarLotes( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		target = "listar_lotes";

		return ( mapping.findForward( target ) );
		
	}	
	
	public static ActionForward listarPagamentos( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		target = "listar_pagamentos";

		return ( mapping.findForward( target ) );
		
	}	
	
	public static ActionForward listarPedidos( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		target = "listar_pedidos";

		return ( mapping.findForward( target ) );
		
	}	
	
	public static ActionForward listarProdutos( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		target = "listar_produtos";

		return ( mapping.findForward( target ) );
		
	}	
	
	public static ActionForward listarPromocoes( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		target = "listar_promocoes";

		return ( mapping.findForward( target ) );
		
	}	
	
	public static ActionForward listarRegioes( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		target = "listar_regioes";

		return ( mapping.findForward( target ) );
		
	}	
	
}