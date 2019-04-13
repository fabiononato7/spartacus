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
import com.nonato.spartacus.util.BobEsponja;
import com.nonato.spartacus.util.Validacao;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Menu {

	public static void set( HttpServletRequest request, MenuForm menuForm ) {
		
		request.getSession().setAttribute( "menu", menuForm );
		
	}
	
	public static MenuForm get( HttpServletRequest request ) {
		
		MenuForm menuForm = (MenuForm) request.getSession().getAttribute( "menu" );
		
		return menuForm;
		
	}
	
	public static boolean isAdmin( MenuForm menu ) {
		
		boolean is = false;
		
		if ( Validacao.stringParaInteiro( menu.getTipo() ) == BobEsponja.ADMINISTRADOR ) {
			
			is = true;
			
		}
		
		return is;
		
	}
	
	public static boolean isCliente( MenuForm menu ) {
		
		boolean is = false;
		
		if ( Validacao.stringParaInteiro( menu.getTipo() ) == BobEsponja.CLIENTE ) {
			
			is = true;
			
		}
		
		return is;
		
	}
		
	public static ActionForward login( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		target = "login";

		return ( mapping.findForward( target ) );
		
	}	
	
	public static ActionForward principal( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		MenuForm menuForm = get( request );		

		target = "principal";

		return ( mapping.findForward( target ) );
		
	}	
	
	public static ActionForward conectar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		target = "conectar";

		return ( mapping.findForward( target ) );
		
	}	
	
	public static ActionForward desconectar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;
		
		MenuForm menuForm = new MenuForm();
		
		menuForm.reset( mapping, request );
		
		set( request, menuForm );

		target = "login";

		return ( mapping.findForward( target ) );
		
	}	
		
}
