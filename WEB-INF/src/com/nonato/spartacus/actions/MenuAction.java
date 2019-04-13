/*
 * Created on 29/09/2005
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
import org.apache.struts.actions.DispatchAction;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class MenuAction extends DispatchAction {
	
	public ActionForward conectar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		return Menu.conectar( mapping, form, request, response );
		
	}	
	
	public ActionForward desconectar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		return Menu.desconectar( mapping, form, request, response );
		
	}
	
	public ActionForward login( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		return Menu.login( mapping, form, request, response );
		
	}	
	
	public ActionForward principal( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		return Menu.principal( mapping, form, request, response );
				
	}	
	
	public ActionForward listarCidades( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {
		/*
		if ( ! Menu.isAdmin( Menu.get( request ) ) ) {
			
			return Menu.login( mapping, form, request, response );
			
		}
		*/
		return MenuAdmin.listarCidades( mapping, form, request, response );
		
	}	
	
	public ActionForward listarCondicoes( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {
		/*
		if ( ! Menu.isAdmin( Menu.get( request ) ) ) {
			
			return Menu.login( mapping, form, request, response );
			
		}
		*/
		return MenuAdmin.listarCondicoes( mapping, form, request, response );
		
	}
	
	public ActionForward listarEmpresas( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {
		/*
		if ( ! Menu.isAdmin( Menu.get( request ) ) ) {
			
			return Menu.login( mapping, form, request, response );
			
		}
		*/
		return MenuAdmin.listarEmpresas( mapping, form, request, response );
		
	}	
	
	public ActionForward listarLotes( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {
		/*
		if ( ! Menu.isAdmin( Menu.get( request ) ) ) {
			
			return Menu.login( mapping, form, request, response );
			
		}
		*/
		return MenuAdmin.listarLotes( mapping, form, request, response );
		
	}	
	
	public ActionForward listarPagamentos( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {
		/*
		if ( ! Menu.isAdmin( Menu.get( request ) ) ) {
			
			return Menu.login( mapping, form, request, response );
			
		}
		*/
		return MenuAdmin.listarPagamentos( mapping, form, request, response );
		
	}	
	
	public ActionForward listarPedidos( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {
		/*
		if ( ! Menu.isAdmin( Menu.get( request ) ) ) {
			
			return Menu.login( mapping, form, request, response );
			
		}
		*/
		return MenuAdmin.listarPedidos( mapping, form, request, response );
		
	}	
	
	public ActionForward listarProdutos( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {
		/*
		if ( ! Menu.isAdmin( Menu.get( request ) ) ) {
			
			return Menu.login( mapping, form, request, response );
			
		}
		*/
		return MenuAdmin.listarProdutos( mapping, form, request, response );
		
	}	
	
	public ActionForward listarPromocoes( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {
		/*
		if ( ! Menu.isAdmin( Menu.get( request ) ) ) {
			
			return Menu.login( mapping, form, request, response );
			
		}
		*/
		return MenuAdmin.listarPromocoes( mapping, form, request, response );
		
	}	
	
	public ActionForward listarRegioes( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {
		/*
		if ( ! Menu.isAdmin( Menu.get( request ) ) ) {
			
			return Menu.login( mapping, form, request, response );
			
		}
		*/
		return MenuAdmin.listarRegioes( mapping, form, request, response );
		
	}	

	public ActionForward iniciarPedido( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {
		/*
		if ( ! Menu.isCliente( Menu.get( request ) ) ) {
			
			return Menu.login( mapping, form, request, response );
			
		}
		*/
		return MenuCliente.iniciarPedido( mapping, form, request, response );
		
	}	
	
	public ActionForward iniciarPromocao( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {
		/*
		if ( ! Menu.isCliente( Menu.get( request ) ) ) {
			
			return Menu.login( mapping, form, request, response );
			
		}
		*/
		return MenuCliente.iniciarPromocao( mapping, form, request, response );
		
	}	
	
	public ActionForward consultarProdutos( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {
		/*
		if ( ! Menu.isCliente( Menu.get( request ) ) ) {
			
			return Menu.login( mapping, form, request, response );
			
		}
		*/
		return MenuCliente.consultarProdutos( mapping, form, request, response );
		
	}	
	
	public ActionForward consultarPagamentos( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {
		/*
		if ( ! Menu.isCliente( Menu.get( request ) ) ) {
			
			return Menu.login( mapping, form, request, response );
			
		}
		*/
		return MenuCliente.consultarPagamentos( mapping, form, request, response );
		
	}	
		
}
