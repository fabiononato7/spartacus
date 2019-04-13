/*
 * Created on 25/08/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nonato.spartacus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.nonato.spartacus.forms.ItemForm;
import com.nonato.spartacus.to.ItemLoteTO;
import com.nonato.spartacus.to.ItemTO;
import com.nonato.spartacus.to.LoteTO;
import com.nonato.spartacus.util.JDBCBase;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ItemDAO extends JDBCBase {

	public static boolean inserir( ItemTO item ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;		
		String sql = null;
		
		boolean sucesso = false;
		
		try {			

			sql = "insert into tab_item (ite_quantidade, ped_codigo, pro_codigo) values( ?, ?, ? )";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, item.getQuantidade() );
			ps.setInt( 2, item.getPedido() );
			ps.setInt( 3, item.getProduto() );
			ps.executeUpdate();
				
			return sucesso = true;				
		
		} catch ( SQLException se ) {
			
			System.out.println( "Erro: " + se.toString() );	
			se.printStackTrace();
						
		} catch ( Exception e ) {
			
			System.out.println( "Erro: " + e.toString() );
			e.printStackTrace();
			
        } finally {
			
			fecharConexao( con, ps );
			
		} 
		
		return sucesso;
		
	}

	public static Collection listarParaMontagem( int pedido ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;		
		String sql = null;
		Collection itens = null;
		
		try {			
	
			sql = "select * from tab_item where ped_codigo = ?";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, pedido );
			rs = ps.executeQuery();		
			itens = new ArrayList();
			
		    while ( rs.next() ) {
				
				ItemTO itemTO = new ItemTO();
				
				itemTO.setCodigo( rs.getInt( "ite_codigo" ) );
				itemTO.setPedido( rs.getInt( "ped_codigo" ) );
				itemTO.setProduto( rs.getInt( "pro_codigo" ) );
				itemTO.setQuantidade( rs.getInt( "ite_quantidade" ) );
				
				itens.add( itemTO );
				
			}
			
			return itens;
		
		} catch ( SQLException se ) {
			
			System.out.println( "Erro: " + se.toString() );	
			se.printStackTrace();
						
		} catch ( Exception e ) {
			
			System.out.println( "Erro: " + e.toString() );
			e.printStackTrace();
			
	    } finally {
			
			fecharConexao( con, ps, rs );
			
		} 
	    
	    return itens;
		
	}

	public static Collection listarPorPedido( int pedido ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;		
		String sql = null;
		Collection itens = null;
		
		try {			
	
			sql = "select * from rel_item where ped_codigo = ?";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, pedido );
			rs = ps.executeQuery();		
			itens = new ArrayList();
			
		    while ( rs.next() ) {
				
				ItemForm itemForm = new ItemForm();
				
				itemForm.setCodigo( rs.getString( "ite_codigo" ) );
				itemForm.setPedido( rs.getString( "ped_codigo" ) );
				itemForm.setProduto( rs.getString( "pro_codigo" ) );
				itemForm.setProdutoNome( rs.getString( "pro_nome" ) );
				itemForm.setProdutoPreco( rs.getString( "pro_preco" ) );
				itemForm.setQuantidade( rs.getString( "ite_quantidade" ) );
				
				itens.add( itemForm );
				
			}
			
			return itens;
		
		} catch ( SQLException se ) {
			
			System.out.println( "Erro: " + se.toString() );	
			se.printStackTrace();
						
		} catch ( Exception e ) {
			
			System.out.println( "Erro: " + e.toString() );
			e.printStackTrace();
			
	    } finally {
			
			fecharConexao( con, ps, rs );
			
		} 
	    
	    return itens;
		
	}
	
	public static Collection listarProdutos() {
		
		Connection con = getConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;		
		String sql = null;
		Collection produtos = null;
		
		try {			

			sql = "select * from rel_produto order by pro_nome";
							
			ps = con.prepareStatement( sql );
			rs = ps.executeQuery();
			produtos = new ArrayList();
			
			while ( rs.next() ) {
				
				ItemForm form = new ItemForm();
				
				form.setProduto( Integer.toString( rs.getInt( "pro_codigo" ) ) );
				form.setProdutoNome( rs.getString( "pro_nome" ) );
				form.setProdutoPreco( rs.getString( "pro_preco" ) );
				form.setProdutoUnidade( Integer.toString( rs.getInt( "uni_codigo" ) ) );
				form.setProdutoUnidadeSigla( rs.getString( "uni_sigla" ) );
				
				produtos.add( form );
				
			}
			
			return produtos;
		
		} catch ( SQLException se ) {
			
			System.out.println( "Erro: " + se.toString() );	
			se.printStackTrace();
						
		} catch ( Exception e ) {
			
			System.out.println( "Erro: " + e.toString() );
			e.printStackTrace();
			
        } finally {
			
			fecharConexao( con, ps, rs );
			
		} 
        
        return produtos;
		
	}
	
	public static Collection processar( ItemTO item ) {
		
		Collection itens = new ArrayList();
		Collection lotes = LoteDAO.listarPorProduto( item.getProduto() );
		Iterator it = lotes.iterator();
		
		int quantidadeAtendida = 0;
		int quantidadeRestante = item.getQuantidade();
		int quantidadeDisponivel = 0;
		int loteAtual = 0;
		
		while ( it.hasNext() ) {
			
			LoteTO lote = (LoteTO) it.next();
			
			loteAtual = lote.getCodigo();
			quantidadeDisponivel = lote.getQuantidadeDisponivel();
			
			if ( quantidadeRestante == 0 ) {
				
				break;
				
			}
			
			if ( quantidadeRestante <= quantidadeDisponivel ) {
				
				quantidadeAtendida = quantidadeRestante;
				quantidadeRestante = 0;
				
			} else if ( quantidadeRestante > quantidadeDisponivel ) {
				
				quantidadeAtendida = quantidadeDisponivel;
				quantidadeRestante -= quantidadeDisponivel; 
				
			}
			
			ItemLoteTO itemLoteTO = new ItemLoteTO();
			itemLoteTO.setItem( item.getCodigo() );
			itemLoteTO.setLote( loteAtual );
			itemLoteTO.setQuantidade( quantidadeAtendida );
			
			itens.add( itemLoteTO );
			
		}		
		
		return itens;
		
	}
	
}