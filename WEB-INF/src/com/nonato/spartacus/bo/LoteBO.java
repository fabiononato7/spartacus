/*
 * Created on 22/09/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nonato.spartacus.bo;

import java.util.Collection;

import com.nonato.spartacus.dao.LoteDAO;
import com.nonato.spartacus.forms.LoteForm;
import com.nonato.spartacus.to.LoteTO;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class LoteBO {

	public static boolean inserir( LoteTO lote ) {
		
		boolean sucesso = false;
		
		sucesso = LoteDAO.inserir( lote );
		
		return sucesso;
		
	}
	
	public static boolean alterar( LoteTO lote ) {
		
		boolean sucesso = false;
		
		sucesso = LoteDAO.alterar( lote );
		
		return sucesso;
		
	}
	
	public static boolean excluir( LoteTO lote ) {
		
		boolean sucesso = false;
		
		sucesso = LoteDAO.excluir( lote );
		
		return sucesso;
		
	}	
	
	public static Collection listar() {
		
		Collection lotes = null;
		
		lotes = LoteDAO.listar();
		
		return lotes;
		
	}
	
	public static LoteForm listarPorCodigo( int lote ) {
		
		LoteForm form = null;
		
		form = LoteDAO.listarPorCodigo( lote );
		
		return form;
		
	}
	
	public static Collection listarProdutos() {
		
		Collection lotes = null;
		
		lotes = LoteDAO.listarProdutos();
		
		return lotes;
		
	}
	
	public static Collection pesquisar( LoteTO lote ) {
		
		Collection lotes = null;
		
		StringBuffer sql = new StringBuffer();
		
		sql.append( "select * from rel_lote " );
		
		if ( lote.getCodigo() != 0 ) {
			
			sql.append( "where lot_codigo = " + lote.getCodigo() );
			
		} else {
			
			
			
		}
		
		lotes = LoteDAO.listar( sql.toString() );
		
		return lotes;
		
	}	
	
}