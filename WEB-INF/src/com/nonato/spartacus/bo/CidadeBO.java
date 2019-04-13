/*
 * Created on 11/08/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nonato.spartacus.bo;

import java.util.Collection;

import com.nonato.spartacus.dao.CidadeDAO;
import com.nonato.spartacus.forms.CidadeForm;
import com.nonato.spartacus.to.CidadeTO;
import com.nonato.spartacus.util.Validacao;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class CidadeBO {
	
	public static boolean inserir( CidadeTO cidade ) {
		
		boolean sucesso = false;
		
		sucesso = CidadeDAO.inserir( cidade );
		
		return sucesso;
		
	}
	
	public static boolean alterar( CidadeTO cidade ) {
		
		boolean sucesso = false;
		
		sucesso = CidadeDAO.alterar( cidade );
		
		return sucesso;
		
	}
	
	public static boolean excluir( CidadeTO cidade ) {
		
		boolean sucesso = false;
		
		sucesso = CidadeDAO.excluir( cidade );
		
		return sucesso;
		
	}	
	
	public static Collection listar() {
		
		Collection cidades = null;
		
		cidades = CidadeDAO.listar();
		
		return cidades;
		
	}
	
	public static CidadeForm listarPorCodigo( int cidade ) {
		
		CidadeForm form = null;
		
		form = CidadeDAO.listarPorCodigo( cidade );
		
		return form;
		
	}
	
	public static Collection listarNaoRelacionados( int regiao ) {
		
		Collection cidades = null;
		
		cidades = CidadeDAO.listarNaoRelacionados( regiao );
		
		return cidades;
		
	}
	
	public static Collection pesquisar( CidadeTO cidade ) {
		
		Collection cidades = null;
		
		StringBuffer sql = new StringBuffer();
		
		sql.append( "select * from rel_cidade " );
		
		if ( cidade.getCodigo() != 0 ) {
			
			sql.append( "where cid_codigo = " + cidade.getCodigo() );
			
		} else {
			
			if ( Validacao.valorNulo( cidade.getCep() ) ) {
				
				if ( Validacao.valorNulo( cidade.getNome() ) ) {
					
					sql.append( "where est_codigo = " + cidade.getEstado() );
					
				} else {

					sql.append( "where cid_nome like '%" + cidade.getNome() + "%'" );
										
				}
			
			} else {
				
				sql.append( "where cid_cep = '" + cidade.getCep() + "'" );
				
			}
			
		}
		
		cidades = CidadeDAO.listar( sql.toString() );
		
		return cidades;
		
	}
	
}