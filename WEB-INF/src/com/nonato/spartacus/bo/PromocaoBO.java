/*
 * Created on 23/09/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nonato.spartacus.bo;

import java.util.Collection;

import com.nonato.spartacus.dao.PromocaoDAO;
import com.nonato.spartacus.forms.PromocaoForm;
import com.nonato.spartacus.to.PromocaoTO;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class PromocaoBO {

	public static boolean inserir( PromocaoTO promocao ) {
		
		boolean sucesso = false;
		
		sucesso = PromocaoDAO.inserir( promocao );
		
		return sucesso;
		
	}
	
	public static boolean alterar( PromocaoTO promocao ) {
		
		boolean sucesso = false;
		
		sucesso = PromocaoDAO.alterar( promocao );
		
		return sucesso;
		
	}
	
	public static boolean excluir( PromocaoTO promocao ) {
		
		boolean sucesso = false;
		
		sucesso = PromocaoDAO.excluir( promocao );
		
		return sucesso;
		
	}
	
	public static Collection listar() {
		
		Collection promocoes = null;
		
		promocoes = PromocaoDAO.listar();
		
		return promocoes;
		
	}
	
	public static PromocaoForm listarPorCodigo( int promocao ) {
		
		PromocaoForm form = null;
		
		form = PromocaoDAO.listarPorCodigo( promocao );
		
		return form;
		
	}
	
	public static Collection listarPorDataFinal() {
		
		Collection promocoes = null;
		
		promocoes = PromocaoDAO.listarPorDataFinal();
		
		return promocoes;
		
	}
	
	public static Collection pesquisar( PromocaoTO promocao ) {
		
		Collection promocoes = null;
		
		StringBuffer sql = new StringBuffer();
		
		sql.append( "select * from tab_promocao " );
		
		if ( promocao.getCodigo() != 0 ) {
			
			sql.append( "where prm_codigo = " + promocao.getCodigo() );
			
		} else {
			
			
			
		}
		
		promocoes = PromocaoDAO.listar( sql.toString() );
		
		return promocoes;
		
	}	
	
}