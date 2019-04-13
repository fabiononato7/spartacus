/*
 * Created on 25/08/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nonato.spartacus.bo;

import java.util.Collection;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.apache.commons.chain.impl.ContextBase;

import com.nonato.spartacus.chain.PedidoChain;
import com.nonato.spartacus.dao.PedidoDAO;
import com.nonato.spartacus.dao.ProdutoDAO;
import com.nonato.spartacus.dao.ProdutoPromocaoDAO;
import com.nonato.spartacus.forms.ItemForm;
import com.nonato.spartacus.forms.PedidoForm;
import com.nonato.spartacus.forms.ProdutoPromocaoForm;
import com.nonato.spartacus.to.PedidoTO;
import com.nonato.spartacus.util.Validacao;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class PedidoBO {
	
	public static boolean inserir( PedidoTO pedido ) {
		
		boolean sucesso = false;
		
		sucesso = PedidoDAO.inserir( pedido );
		
		return sucesso;
		
	}
	
	public static boolean alterar( PedidoTO pedido ) {
		
		boolean sucesso = false;
		
		sucesso = PedidoDAO.alterar( pedido );
		
		return sucesso;
		
	}
	
	public static boolean excluir( PedidoTO pedido ) {
		
		boolean sucesso = false;
		
		sucesso = PedidoDAO.excluir( pedido );
		
		return sucesso;
		
	}
	
	public static Collection listar() {
		
		Collection pedidos = null;
		
		pedidos = PedidoDAO.listar();
		
		return pedidos;
		
	}
	
	public static PedidoForm listarPorCodigo( int pedido ) {
		
		PedidoForm form = null;
		
		form = PedidoDAO.listarPorCodigo( pedido );
		
		return form;
		
	}
	
	public static Collection listarPorEmpresa( int empresa ) {
		
		Collection pedidos = null;
		
		pedidos = PedidoDAO.listarPorEmpresa( empresa );
		
		return pedidos;
		
	}
	
	public static PedidoForm getCodigo( int empresa, String dataEmissao ) {
		
		PedidoForm form = null;
		
		form = PedidoDAO.getCodigo( empresa, dataEmissao );
		
		return form;
		
	}
	
	public static boolean montar( int pedido ) {
		
		boolean sucesso = false;
		
		sucesso = PedidoDAO.montar( pedido );
		
		return sucesso;
		
	}
	
	public static boolean processar( int empresa, Collection produtos, int modo ) {
		
		boolean sucesso = false;
		
		Command processo = new PedidoChain();
		Context contexto = new ContextBase();
		
		contexto.put( "empresa", new Integer( empresa ) );
		contexto.put( "carrinho", produtos );
		contexto.put( "modo", new Integer( modo ) );
		
		try {
			
			processo.execute( contexto );
			
			return sucesso = true;
			
		} catch ( Exception e ) {
			
			return sucesso = false;
			
		}
		
	}
	
	public static Collection pesquisar( PedidoTO pedido ) {
		
		Collection pedidos = null;
		
		StringBuffer sql = new StringBuffer();
		
		sql.append( "select * from rel_pedido " );
		
		if ( pedido.getCodigo() != 0 ) {
			
			sql.append( "where ped_codigo = " + pedido.getCodigo() );
			
		} else {
			
			
			
		}
		
		pedidos = PedidoDAO.listar( sql.toString() );
		
		return pedidos;
		
	}
	

	public static Collection pesquisarProdutos( ItemForm item ) {
		
		Collection produtos = null;
		
		StringBuffer sql = new StringBuffer();
		
		sql.append( "select * from rel_produto " );
		
		if ( Validacao.stringParaInteiro( item.getProduto() ) != 0 ) {
			
			sql.append( "where pro_codigo = " + item.getProduto() );
			
		} else {
			
			if ( Validacao.valorNulo( item.getProdutoNome() ) ) {
				
				if ( Validacao.stringParaInteiro( item.getProdutoPreco() ) != 0 ) {
					
					sql.append( "where pro_preco = " + item.getProdutoPreco() );
					
				} else {
					
					if ( Validacao.stringParaInteiro( item.getProdutoUnidade() ) != 0 ) {
						
						sql.append( "where uni_codigo = " + item.getProdutoUnidade() );
						
					}
					
				}
				
			} else {
				
				sql.append( "where pro_nome like '%" + item.getProdutoNome() + "%'" );
				
			}
			
		}
		
		produtos = ProdutoDAO.listar( sql.toString() );
		
		return produtos;
		
	}	
	
	public static Collection pesquisarProdutosEmPromocao( ProdutoPromocaoForm ppf ) {
		
		Collection produtos = null;
		
		StringBuffer sql = new StringBuffer();
		
		sql.append( "select * from rel_promocao " );
		
		if ( Validacao.stringParaInteiro( ppf.getProduto() ) != 0 ) {
			
			sql.append( "where pro_codigo = " + ppf.getProduto() );
			
		} else {
			
			if ( Validacao.valorNulo( ppf.getProdutoNome() ) ) {
				
				if ( Validacao.stringParaInteiro( ppf.getProdutoPreco() ) != 0 ) {
					
					sql.append( "where pro_preco = " + ppf.getProdutoPreco() );
					
				} else {
					
					if ( Validacao.stringParaInteiro( ppf.getProdutoUnidade() ) != 0 ) {
						
						sql.append( "where uni_codigo = " + ppf.getProdutoUnidadeSigla() );
						
					}
					
				}
				
			} else {
				
				sql.append( "where pro_nome like '%" + ppf.getProdutoNome() + "%'" );
				
			}
			
		}
		
		sql.append( " and prm_codigo = " + ppf.getPromocao() );
		
		produtos = ProdutoPromocaoDAO.listar( sql.toString() );
		
		return produtos;
		
	}	
		
}