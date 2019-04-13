/*
 * Created on 11/08/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nonato.spartacus.bo;

import java.util.Collection;

import com.nonato.spartacus.dao.RegiaoDAO;
import com.nonato.spartacus.forms.RegiaoForm;
import com.nonato.spartacus.to.RegiaoTO;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class RegiaoBO {
	
	public static boolean inserir( RegiaoTO regiao ) {
		
		boolean sucesso = false;
		
		sucesso = RegiaoDAO.inserir( regiao );
		
		return sucesso;
		
	}
	
	public static boolean alterar( RegiaoTO regiao ) {
		
		boolean sucesso = false;
		
		sucesso = RegiaoDAO.alterar( regiao );
		
		return sucesso;
		
	}
	
	public static boolean excluir( RegiaoTO regiao ) {
		
		boolean sucesso = false;
		
		sucesso = RegiaoDAO.excluir( regiao );
		
		return sucesso;
		
	}
	
	public static Collection listar() {
		
		Collection regioes = null;
		
		regioes = RegiaoDAO.listar();
		
		return regioes;
		
	}
	
	public static RegiaoForm listarPorCodigo( int regiao ) {
		
		RegiaoForm form = null;
		
		form = RegiaoDAO.listarPorCodigo( regiao );
		
		return form;
		
	}
	
	public static Collection listarRepresentantes() {
		
		Collection regioes = null;
		
		regioes = RegiaoDAO.listarRepresentantes();
		
		return regioes;
		
	}
	
	public static Collection pesquisar( RegiaoTO regiao ) {
		
		Collection regioes = null;
		
		StringBuffer sql = new StringBuffer();
		
		sql.append( "select * from rel_regiao " );
		
		if ( regiao.getCodigo() != 0 ) {
			
			sql.append( "where reg_codigo = " + regiao.getCodigo() );
			
		} else {
			
			
			
		}
		
		regioes = RegiaoDAO.listar( sql.toString() );
		
		return regioes;
		
	}	
	
	
}