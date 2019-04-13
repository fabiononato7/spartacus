/*
 * Created on 21/08/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nonato.spartacus.bo;

import java.util.Collection;

import com.nonato.spartacus.dao.CidadeRegiaoDAO;
import com.nonato.spartacus.forms.CidadeRegiaoForm;
import com.nonato.spartacus.to.CidadeRegiaoTO;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class CidadeRegiaoBO {
	
	public static boolean inserir( CidadeRegiaoTO cidadeRegiao ) {
		
		boolean sucesso = false;
		
		int[] cidades = cidadeRegiao.getCidades();
		int regiao = cidadeRegiao.getRegiao();
		
		for ( int i = 0; i < cidades.length; i++ ) {
			
			CidadeRegiaoTO to = new CidadeRegiaoTO();
			to.setRegiao( regiao );
			to.setCidade( cidades[i] );
		
			sucesso = CidadeRegiaoDAO.inserir( to );
			
		}		
		
		return sucesso;
		
	}
	
	public static boolean alterar( CidadeRegiaoTO cidadeRegiao ) {
		
		boolean sucesso = false;
		
		sucesso = CidadeRegiaoDAO.alterar( cidadeRegiao );
		
		return sucesso;
		
	}
	
	public static boolean excluir( CidadeRegiaoTO cidadeRegiao ) {
		
		boolean sucesso = false;
		
		sucesso = CidadeRegiaoDAO.excluir( cidadeRegiao );
		
		return sucesso;
		
	}
	
	public static Collection listar() {
		
		Collection cidadesRegioes = null;
		
		cidadesRegioes = CidadeRegiaoDAO.listar();
		
		return cidadesRegioes;
		
	}	
	
	public static CidadeRegiaoForm listarPorCodigo( int cidade, int regiao ) {
		
		CidadeRegiaoForm form = null;
		
		form = CidadeRegiaoDAO.listarPorCodigo( cidade, regiao );
		
		return form;
		
	}
	
	public static Collection listarPorRegiao( int regiao ) {
		
		Collection cidadesRegioes = null;
		
		cidadesRegioes = CidadeRegiaoDAO.listarPorRegiao( regiao );
		
		return cidadesRegioes;
		
	}
		
}