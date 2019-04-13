/*
 * Created on 25/08/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nonato.spartacus.bo;

import java.util.Collection;

import com.nonato.spartacus.dao.ProdutoDAO;
import com.nonato.spartacus.forms.ProdutoForm;
import com.nonato.spartacus.to.ProdutoTO;
import com.nonato.spartacus.util.Validacao;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ProdutoBO {
	
	public static boolean inserir( ProdutoTO produto ) {
		
		boolean sucesso = false;
		
		sucesso = ProdutoDAO.inserir( produto );
		
		return sucesso;
		
	}
	
	public static boolean alterar( ProdutoTO produto ) {
		
		boolean sucesso = false;
		
		sucesso = ProdutoDAO.alterar( produto );
		
		return sucesso;
		
	}
	
	public static boolean excluir( ProdutoTO produto ) {
		
		boolean sucesso = false;
		
		sucesso = ProdutoDAO.excluir( produto );
		
		return sucesso;
		
	}
	
	public static Collection listar() {
		
		Collection produtos = null;
		
		produtos = ProdutoDAO.listar();
		
		return produtos;
		
	}
	
	public static ProdutoForm listarPorCodigo( int produto ) {
		
		ProdutoForm form = null;
		
		form = ProdutoDAO.listarPorCodigo( produto );
		
		return form;
		
	}
	
	public static Collection listarNaoRelacionados( int promocao ) {
		
		Collection produtos = null;
		
		produtos = ProdutoDAO.listarNaoRelacionados( promocao );
		
		return produtos;
		
	}
	
	public static Collection listarLaboratorios() {
		
		Collection produtos = null;
		
		produtos = ProdutoDAO.listarLaboratorios();
		
		return produtos;
		
	}
	
	public static Collection pesquisar( ProdutoTO produto ) {
		
		Collection produtos = null;
		
		StringBuffer sql = new StringBuffer();
		
		sql.append( "select * from rel_produto " );
		
		if ( produto.getCodigo() != 0 ) {
			
			sql.append( "where pro_codigo = " + produto.getCodigo() );
			
		} else {
			
			if ( Validacao.valorNulo( produto.getNome() ) ) {
				
				if ( produto.getPreco() != 0 ) {
					
					sql.append( "where pro_preco = " + produto.getPreco() );
					
				} else {
					
					if ( produto.getUnidade() != 0 ) {
						
						sql.append( "where uni_codigo = " + produto.getUnidade() );
						
					}
					
				}
				
			} else {
				
				sql.append( "where pro_nome like '%" + produto.getNome() + "%'" );
				
			}
			
		}
		
		produtos = ProdutoDAO.listar( sql.toString() );
		
		return produtos;
		
	}	
	
}