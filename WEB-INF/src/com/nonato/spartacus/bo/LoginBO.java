/*
 * Created on 14/09/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nonato.spartacus.bo;

import com.nonato.spartacus.dao.LoginDAO;
import com.nonato.spartacus.forms.MenuForm;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class LoginBO {

	public static MenuForm logar( String loginUsuario, String loginSenha ) {
		
		MenuForm form = null;
		
		form = LoginDAO.logar( loginUsuario, loginSenha );
		
		return form;
		
	}
	
}
