/*
 * Created on 22/09/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nonato.spartacus.bo;

import java.util.Collection;

import com.nonato.spartacus.dao.CondicaoDAO;
import com.nonato.spartacus.forms.CondicaoForm;
import com.nonato.spartacus.to.CondicaoTO;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class CondicaoBO {

	public static boolean inserir( CondicaoTO condicao ) {
		
		boolean sucesso = false;
		
		sucesso = CondicaoDAO.inserir( condicao );
		
		return sucesso;
		
	}
	
	public static boolean alterar( CondicaoTO condicao ) {
		
		boolean sucesso = false;
		
		sucesso = CondicaoDAO.alterar( condicao );
		
		return sucesso;
		
	}
	
	public static boolean excluir( CondicaoTO condicao ) {
		
		boolean sucesso = false;
		
		sucesso = CondicaoDAO.excluir( condicao );
		
		return sucesso;
		
	}	
	
	public static Collection listar() {
		
		Collection cidades = null;
		
		cidades = CondicaoDAO.listar();
		
		return cidades;
		
	}
	
	public static CondicaoForm listarPorCodigo( int condicao ) {
		
		CondicaoForm form = null;
		
		form = CondicaoDAO.listarPorCodigo( condicao );
		
		return form;
		
	}
	
	public static Collection pesquisar( CondicaoTO condicao ) {
		
		Collection condicoes = null;
		
		StringBuffer sql = new StringBuffer();
		
		sql.append( "select * from tab_condicao " );
		
		if ( condicao.getCodigo() != 0 ) {
			
			sql.append( "where con_codigo = " + condicao.getCodigo() );
			
		} else {
			
			if ( condicao.getDias() == 0 ) {
				
				if ( condicao.getJuros() == 0 ) {
					
					if ( condicao.getMulta() == 0 ) {
						
						if ( condicao.getParcelas() != 0 ) {
							
							sql.append( "where con_parcelas = " + condicao.getParcelas() );
							
						}
						
					} else {
						
						sql.append( "where con_multa = " + condicao.getMulta() );
						
					}
					
				} else {
					
					sql.append( "where con_juros = " + condicao.getJuros() );
					
				}
				
			} else {
				
				sql.append( "where con_dias = " + condicao.getDias() );
				
			}
			
		}
		
		condicoes = CondicaoDAO.listar( sql.toString() );
		
		return condicoes;
		
	}
			
}