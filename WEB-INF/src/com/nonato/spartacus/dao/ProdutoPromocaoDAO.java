/*
 * Created on 23/09/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nonato.spartacus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import com.nonato.spartacus.forms.ProdutoPromocaoForm;
import com.nonato.spartacus.to.ProdutoPromocaoTO;
import com.nonato.spartacus.util.JDBCBase;
import com.nonato.spartacus.util.Validacao;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ProdutoPromocaoDAO extends JDBCBase {

	public static boolean inserir( ProdutoPromocaoTO produtoPromocao ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;		
		String sql = null;
		
		boolean sucesso = false;
		
		try {			

			sql = "insert into tab_produto_promocao (pro_codigo, prm_codigo, pp_desconto) values( ?, ?, ? )";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, produtoPromocao.getProduto() );
			ps.setInt( 2, produtoPromocao.getPromocao() );
			ps.setDouble( 3, produtoPromocao.getDesconto() );
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
	
	public static boolean alterar( ProdutoPromocaoTO produtoPromocao ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;		
		String sql = null;
		
		boolean sucesso = false;
		
		try {			

			sql = "update tab_produto_promocao set pp_desconto = ? where pro_codigo = ? and prm_codigo = ?";
							
			ps = con.prepareStatement( sql );
			ps.setDouble( 1, produtoPromocao.getDesconto() );
			ps.setInt( 2, produtoPromocao.getProduto() );
			ps.setInt( 3, produtoPromocao.getPromocao() );
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
	
	public static boolean excluir( ProdutoPromocaoTO produtoPromocao ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;		
		String sql = null;
		
		boolean sucesso = false;
		
		try {			

			sql = "delete from tab_produto_promocao where pro_codigo = ? and prm_codigo = ?";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, produtoPromocao.getProduto() );
			ps.setInt( 2, produtoPromocao.getPromocao() );
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
	
	public static Collection listar() {
		
		Connection con = getConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;		
		String sql = null;
		Collection produtosPromocoes = null;
		
		try {			

			sql = "select * from rel_promocao order by prm_data_final asc";
							
			ps = con.prepareStatement( sql );
			rs = ps.executeQuery();
			produtosPromocoes = new ArrayList();
			
			while ( rs.next() ) {
				
				ProdutoPromocaoForm form = new ProdutoPromocaoForm();
				
				form.setProduto( Integer.toString( rs.getInt( "pro_codigo" ) ) );
				form.setProdutoNome( rs.getString( "pro_nome" ) );
				form.setProdutoPreco( Double.toString( rs.getDouble( "pro_preco" ) ) );
				form.setPromocao( Integer.toString( rs.getInt( "prm_codigo" ) ) );
				form.setPromocaoDescricao( rs.getString( "prm_descricao" ) );
				form.setPromocaoDataInicio( Validacao.dataParaString( rs.getTimestamp( "prm_data_inicio" ) ) );
				form.setPromocaoDataFinal( Validacao.dataParaString( rs.getTimestamp( "prm_data_final" ) ) );
				form.setValor( Double.toString( rs.getDouble( "valor_total" ) ) );
				form.setDesconto( Double.toString( rs.getDouble( "pp_desconto" ) ) );
								
				produtosPromocoes.add( form );
				
			}
			
			return produtosPromocoes;
		
		} catch ( SQLException se ) {
			
			System.out.println( "Erro: " + se.toString() );	
			se.printStackTrace();
						
		} catch ( Exception e ) {
			
			System.out.println( "Erro: " + e.toString() );
			e.printStackTrace();
			
        } finally {
			
			fecharConexao( con, ps, rs );
			
		} 
        
        return produtosPromocoes;
		
	}
	
	public static ProdutoPromocaoForm listarPorCodigo( int produto, int promocao ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;		
		String sql = null;
		ProdutoPromocaoForm form = null;
		
		try {			

			sql = "select * from rel_promocao where pro_codigo = ? and prm_codigo = ? order by pro_nome";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, produto );
			ps.setInt( 2, promocao );
			rs = ps.executeQuery();			
			
			if ( rs.next() ) {
				
				form = new ProdutoPromocaoForm();
				
				form.setProduto( Integer.toString( rs.getInt( "pro_codigo" ) ) );
				form.setProdutoNome( rs.getString( "pro_nome" ) );
				form.setProdutoPreco( Double.toString( rs.getDouble( "pro_preco" ) ) );
				form.setPromocao( Integer.toString( rs.getInt( "prm_codigo" ) ) );
				form.setPromocaoDescricao( rs.getString( "prm_descricao" ) );
				form.setPromocaoDataInicio( Validacao.dataParaString( rs.getTimestamp( "prm_data_inicio" ) ) );
				form.setPromocaoDataFinal( Validacao.dataParaString( rs.getTimestamp( "prm_data_final" ) ) );
				form.setValor( Double.toString( rs.getDouble( "valor_total" ) ) );
				form.setDesconto( Double.toString( rs.getDouble( "pp_desconto" ) ) );
								
			}
			
			return form;
		
		} catch ( SQLException se ) {
			
			System.out.println( "Erro: " + se.toString() );	
			se.printStackTrace();
						
		} catch ( Exception e ) {
			
			System.out.println( "Erro: " + e.toString() );
			e.printStackTrace();
			
        } finally {
			
			fecharConexao( con, ps, rs );
			
		} 
        
        return form;
		
	}
	
	public static Collection listar( String sql ) {
		
		Connection con = getConexao();
		Statement st = null;
		ResultSet rs = null;		
		Collection produtos = null;
		
		try {			
							
			st = con.createStatement();
			rs = st.executeQuery( sql );
			produtos = new ArrayList();
			
			while ( rs.next() ) {
				
				ProdutoPromocaoForm form = new ProdutoPromocaoForm();
				
				form.setProduto( Integer.toString( rs.getInt( "pro_codigo" ) ) );
				form.setProdutoNome( rs.getString( "pro_nome" ) );
				form.setProdutoPreco( Double.toString( rs.getDouble( "pro_preco" ) ) );
				form.setPromocao( Integer.toString( rs.getInt( "prm_codigo" ) ) );
				form.setPromocaoDescricao( rs.getString( "prm_descricao" ) );
				form.setPromocaoDataInicio( Validacao.dataParaString( rs.getTimestamp( "prm_data_inicio" ) ) );
				form.setPromocaoDataFinal( Validacao.dataParaString( rs.getTimestamp( "prm_data_final" ) ) );
				form.setValor( Double.toString( rs.getDouble( "valor_total" ) ) );
				form.setDesconto( Double.toString( rs.getDouble( "pp_desconto" ) ) );
				
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
			
			fecharConexao( con, st, rs );
			
		} 
        
        return produtos;
		
	}
	
	public static Collection listarPorPromocao( int promocao ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;		
		String sql = null;
		Collection produtos = null;
		
		try {			

			sql = "select * from rel_promocao where prm_codigo = ? order by pro_nome";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, promocao );
			rs = ps.executeQuery();
			produtos = new ArrayList();
			
			while ( rs.next() ) {
				
				ProdutoPromocaoForm form = new ProdutoPromocaoForm();
				
				form.setProduto( Integer.toString( rs.getInt( "pro_codigo" ) ) );
				form.setProdutoNome( rs.getString( "pro_nome" ) );
				form.setProdutoPreco( Double.toString( rs.getDouble( "pro_preco" ) ) );
				form.setPromocao( Integer.toString( rs.getInt( "prm_codigo" ) ) );
				form.setPromocaoDescricao( rs.getString( "prm_descricao" ) );
				form.setPromocaoDataInicio( Validacao.dataParaString( rs.getTimestamp( "prm_data_inicio" ) ) );
				form.setPromocaoDataFinal( Validacao.dataParaString( rs.getTimestamp( "prm_data_final" ) ) );
				form.setValor( Double.toString( rs.getDouble( "valor_total" ) ) );
				form.setDesconto( Double.toString( rs.getDouble( "pp_desconto" ) ) );
				
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
	
}
