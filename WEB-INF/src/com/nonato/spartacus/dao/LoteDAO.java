/*
 * Created on 14/09/2005
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

import com.nonato.spartacus.forms.LoteForm;
import com.nonato.spartacus.to.LoteTO;
import com.nonato.spartacus.util.JDBCBase;
import com.nonato.spartacus.util.Validacao;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class LoteDAO extends JDBCBase {

	public static boolean inserir( LoteTO lote ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;		
		String sql = null;
		
		boolean sucesso = false;
		
		try {			

			sql = "insert into tab_lote (lot_descricao, lot_data_fabricacao, lot_data_validade, lot_quantidade_produzida, ";
			sql += "lot_quantidade_disponivel, pro_codigo) values( ?, ?, ?, ?, ?, ?)";
							
			ps = con.prepareStatement( sql );
			ps.setString( 1, lote.getDescricao() );
			ps.setTimestamp( 2, Validacao.stringParaData( lote.getDataFabricacao() ) );
			ps.setTimestamp( 3, Validacao.stringParaData( lote.getDataValidade() ) );
			ps.setInt( 4, lote.getQuantidadeProduzida() );
			ps.setInt( 5, lote.getQuantidadeDisponivel() );
			ps.setInt( 6, lote.getProduto() );
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
	
	public static boolean alterar( LoteTO lote ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;		
		String sql = null;
		
		boolean sucesso = false;
		
		try {			

			sql = "update tab_lote set lot_descricao = ?, lot_data_fabricacao = ?, lot_data_validade = ?, ";
			sql += "lot_quantidade_produzida = ?, lot_quantidade_disponivel = ?, pro_codigo = ? where lot_codigo = ?";
							
			ps = con.prepareStatement( sql );
			ps.setString( 1, lote.getDescricao() );
			ps.setTimestamp( 2, Validacao.stringParaData( lote.getDataFabricacao() ) );
			ps.setTimestamp( 3, Validacao.stringParaData( lote.getDataValidade() ) );
			ps.setInt( 4, lote.getQuantidadeProduzida() );
			ps.setInt( 5, lote.getQuantidadeDisponivel() );
			ps.setInt( 6, lote.getProduto() );
			ps.setInt( 7, lote.getCodigo() );
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
	
	public static boolean excluir( LoteTO lote ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;		
		String sql = null;
		
		boolean sucesso = false;
		
		try {			

			sql = "delete from tab_lote where lot_codigo = ?";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, lote.getCodigo() );
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
		Collection lotes = null;
		
		try {			
	
			sql = "select * from rel_lote order by pro_nome, lot_data_validade";
							
			ps = con.prepareStatement( sql );
			rs = ps.executeQuery();		
			lotes = new ArrayList();
			
		    while ( rs.next() ) {
				
				LoteForm lote = new LoteForm();
				
				lote.setCodigo( Integer.toString( rs.getInt( "lot_codigo" ) ) );
				lote.setDescricao( rs.getString( "lot_descricao" ) );
				lote.setDataFabricacao( Validacao.dataParaString( rs.getTimestamp( "lot_data_fabricacao" ) ) );
				lote.setDataValidade( Validacao.dataParaString( rs.getTimestamp( "lot_data_validade" ) ) );
				lote.setQuantidadeProduzida( Integer.toString( rs.getInt( "lot_quantidade_produzida" ) ) );
				lote.setQuantidadeDisponivel( Integer.toString( rs.getInt( "lot_quantidade_disponivel" ) ) );
				lote.setProduto( Integer.toString( rs.getInt( "pro_codigo" ) ) );
				lote.setProdutoNome( rs.getString( "pro_nome" ) );
				
				lotes.add( lote );
				
			}
			
			return lotes;
		
		} catch ( SQLException se ) {
			
			System.out.println( "Erro: " + se.toString() );	
			se.printStackTrace();
						
		} catch ( Exception e ) {
			
			System.out.println( "Erro: " + e.toString() );
			e.printStackTrace();
			
	    } finally {
			
			fecharConexao( con, ps, rs );
			
		} 
	    
	    return lotes;
		
	}
	
	public static Collection listar( String sql ) {
		
		Connection con = getConexao();
		Statement st = null;
		ResultSet rs = null;		
		Collection lotes = null;
		
		try {			
							
			st = con.createStatement();
			rs = st.executeQuery( sql );
			lotes = new ArrayList();
			
			while ( rs.next() ) {
				
				LoteForm lote = new LoteForm();
				
				lote.setCodigo( Integer.toString( rs.getInt( "lot_codigo" ) ) );
				lote.setDescricao( rs.getString( "lot_descricao" ) );
				lote.setDataFabricacao( Validacao.dataParaString( rs.getTimestamp( "lot_data_fabricacao" ) ) );
				lote.setDataValidade( Validacao.dataParaString( rs.getTimestamp( "lot_data_validade" ) ) );
				lote.setQuantidadeProduzida( Integer.toString( rs.getInt( "lot_quantidade_produzida" ) ) );
				lote.setQuantidadeDisponivel( Integer.toString( rs.getInt( "lot_quantidade_disponivel" ) ) );
				lote.setProduto( Integer.toString( rs.getInt( "pro_codigo" ) ) );
				lote.setProdutoNome( rs.getString( "pro_nome" ) );
				
				lotes.add( lote );
				
			}
			
			return lotes;
		
		} catch ( SQLException se ) {
			
			System.out.println( "Erro: " + se.toString() );	
			se.printStackTrace();
						
		} catch ( Exception e ) {
			
			System.out.println( "Erro: " + e.toString() );
			e.printStackTrace();
			
        } finally {
			
			fecharConexao( con, st, rs );
			
		} 
        
        return lotes;
		
	}
	
	public static LoteForm listarPorCodigo( int lote ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;		
		String sql = null;
		LoteForm form = null;
		
		try {			
	
			sql = "select * from rel_lote where lot_codigo = ?";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, lote );
			rs = ps.executeQuery();		
			
		    while ( rs.next() ) {
				
				form = new LoteForm();
				
				form.setCodigo( Integer.toString( rs.getInt( "lot_codigo" ) ) );
				form.setDescricao( rs.getString( "lot_descricao" ) );
				form.setDataFabricacao( Validacao.dataParaString( rs.getTimestamp( "lot_data_fabricacao" ) ) );
				form.setDataValidade( Validacao.dataParaString( rs.getTimestamp( "lot_data_validade" ) ) );
				form.setQuantidadeProduzida( Integer.toString( rs.getInt( "lot_quantidade_produzida" ) ) );
				form.setQuantidadeDisponivel( Integer.toString( rs.getInt( "lot_quantidade_disponivel" ) ) );
				form.setProduto( Integer.toString( rs.getInt( "pro_codigo" ) ) );
				form.setProdutoNome( rs.getString( "pro_nome" ) );
				
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

	public static Collection listarPorProduto( int produto ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;		
		String sql = null;
		Collection lotes = null;
		
		try {			
	
			sql = "select l.lot_codigo, l.lot_quantidade_disponivel ";
		    sql += "from rel_lote l ";
		    sql += "where l.pro_codigo = ?";
		    sql += "and l.lot_data_validade > ?";
		    sql += "and l.lot_quantidade_disponivel > 0";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, produto );
			ps.setTimestamp( 2, Validacao.stringParaData( Validacao.getData() ) );
			rs = ps.executeQuery();		
			lotes = new ArrayList();
			
		    while ( rs.next() ) {
				
				LoteTO lote = new LoteTO();
				
				lote.setCodigo( rs.getInt( "lot_codigo" ) );
				lote.setQuantidadeDisponivel( rs.getInt( "lot_quantidade_disponivel" ) );
				
				lotes.add( lote );
				
			}
			
			return lotes;
		
		} catch ( SQLException se ) {
			
			System.out.println( "Erro: " + se.toString() );	
			se.printStackTrace();
						
		} catch ( Exception e ) {
			
			System.out.println( "Erro: " + e.toString() );
			e.printStackTrace();
			
	    } finally {
			
			fecharConexao( con, ps, rs );
			
		} 
	    
	    return lotes;
		
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
				
				LoteForm form = new LoteForm();
				
				form.setProduto( Integer.toString( rs.getInt( "pro_codigo" ) ) );
				form.setProdutoNome( rs.getString( "pro_nome" ) );
				form.setProdutoPreco( rs.getString( "pro_preco" ) );
				form.setProdutoUnidadeSigla( rs.getString( "uni_sigla" ) );
				form.setProdutoEmpresaNome( rs.getString( "emp_nome_razao_social" ) );
				
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
