/*
 * Created on 17/10/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nonato.spartacus.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.nonato.spartacus.bo.LoginBO;
import com.nonato.spartacus.forms.MenuForm;
import com.nonato.spartacus.util.Validacao;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class LoginAction extends DispatchAction {

	public ActionForward conectar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		MenuForm menuForm = (MenuForm) form;		
		MenuForm menu = LoginBO.logar( menuForm.getLoginUsuario(), menuForm.getLoginSenha() );
		
		if ( ! Validacao.objetoNulo( menu ) ) {

			Menu.set( request, menu );	
				
			target = "ok";
			
		} else {
						
			ActionErrors errors = new ActionErrors();
			errors.add( "erro", new ActionError( "op.login.erro" ) );
			saveErrors( request, errors );
			
			target = "erro";
			
		}

		return ( mapping.findForward( target ) );
		
	}	
	
}
