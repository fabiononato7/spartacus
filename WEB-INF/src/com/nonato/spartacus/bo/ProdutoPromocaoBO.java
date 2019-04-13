/*
 * Created on 23/09/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nonato.spartacus.bo;

import java.util.Collection;

import com.nonato.spartacus.dao.ProdutoPromocaoDAO;
import com.nonato.spartacus.forms.ProdutoPromocaoForm;
import com.nonato.spartacus.to.ProdutoPromocaoTO;
import com.nonato.spartacus.util.Validacao;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ProdutoPromocaoBO {

	public static boolean inserir( ProdutoPromocaoTO produtoPromocao ) {
		
		boolean sucesso = false;
		
		int[] produtos = produtoPromocao.getProdutos();
		double[] descontos = produtoPromocao.getDescontos();
		
		for ( int i = 0; i < produtos.length; i++ ) {
			
			ProdutoPromocaoTO to = new ProdutoPromocaoTO();
			to.setProduto( produtos[i] );
			to.setPromocao( produtoPromocao.getPromocao() );
			to.setDesconto( descontos[i] );
		
			if ( descontos[i] > 0.0 ) {
			
				sucesso = ProdutoPromocaoDAO.inserir( to );
				
			}
									
		}		
		
		return sucesso;
		
	}
	
	public static boolean inserir( String[] produtos, String[] descontos, String promocao ) {
		
		boolean sucesso = false;
		
		for ( int i = 0; i < produtos.length; i++ ) {
			
			ProdutoPromocaoTO to = new ProdutoPromocaoTO();
			
			to.setPromocao( Validacao.stringParaInteiro( promocao ) );
			to.setProduto( Validacao.stringParaInteiro( produtos[i] ) );
			to.setDesconto( Validacao.stringParaFlutuante( descontos[i] ) );
			
			if ( to.getDesconto() > 0.0 ) {
				
				sucesso = ProdutoPromocaoDAO.inserir( to );
				
			}			
			
		}
		
		return sucesso;
		
	}
	
	public static boolean alterar( ProdutoPromocaoTO produtoPromocao ) {
		
		boolean sucesso = false;
		
		sucesso = ProdutoPromocaoDAO.alterar( produtoPromocao );
		
		return sucesso;
		
	}
	
	public static boolean excluir( ProdutoPromocaoTO produtoPromocao ) {
		
		boolean sucesso = false;
		
		sucesso = ProdutoPromocaoDAO.excluir( produtoPromocao );
		
		return sucesso;
		
	}
	
	public static Collection listar() {
		
		Collection produtosPromocoes = null;
		
		produtosPromocoes = ProdutoPromocaoDAO.listar();
		
		return produtosPromocoes;
		
	}	

	public static ProdutoPromocaoForm listarPorCodigo( int produto, int promocao ) {
		
		ProdutoPromocaoForm form = null;
		
		form = ProdutoPromocaoDAO.listarPorCodigo( produto, promocao );
		
		return form;
		
	}
	
	public static Collection listarPorPromocao( int promocao ) {
		
		Collection produtos = null;
		
		produtos = ProdutoPromocaoDAO.listarPorPromocao( promocao );
		
		return produtos;
		
	}
	
}
