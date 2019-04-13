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

import com.nonato.spartacus.forms.PromocaoForm;
import com.nonato.spartacus.to.PromocaoTO;
import com.nonato.spartacus.util.JDBCBase;
import com.nonato.spartacus.util.Validacao;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class PromocaoDAO extends JDBCBase {

	public static boolean inserir( PromocaoTO promocao ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;		
		String sql = null;
		
		boolean sucesso = false;
		
		try {			

			sql = "insert into tab_promocao (prm_descricao, prm_data_inicio, prm_data_final) values( ?, ?, ? )";
							
			ps = con.prepareStatement( sql );
			ps.setString( 1, promocao.getDescricao() );
			ps.setTimestamp( 2, Validacao.stringParaData( promocao.getDataInicio() ) );
			ps.setTimestamp( 3, Validacao.stringParaData( promocao.getDataFinal() ) );
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
	
	public static boolean alterar( PromocaoTO promocao ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;		
		String sql = null;
		
		boolean sucesso = false;
		
		try {			

			sql = "update tab_promocao set prm_descricao = ?, prm_data_inicio = ?, prm_data_final = ? where prm_codigo = ?";
							
			ps = con.prepareStatement( sql );
			ps.setString( 1, promocao.getDescricao() );
			ps.setTimestamp( 2, Validacao.stringParaData( promocao.getDataInicio() ) );
			ps.setTimestamp( 3, Validacao.stringParaData( promocao.getDataFinal() ) );
			ps.setInt( 4, promocao.getCodigo() );
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
	
	public static boolean excluir( PromocaoTO promocao ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;		
		String sql = null;
		
		boolean sucesso = false;
		
		try {			

			sql = "delete from tab_promocao where prm_codigo = ?";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, promocao.getCodigo() );
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
		Collection promocoes = null;
		
		try {			

			sql = "select * from tab_promocao order by prm_data_final desc, prm_data_inicio asc";
							
			ps = con.prepareStatement( sql );
			rs = ps.executeQuery();
			promocoes = new ArrayList();
			
			while ( rs.next() ) {
				
				PromocaoForm promocao = new PromocaoForm();
				
				promocao.setCodigo( Integer.toString( rs.getInt( "prm_codigo" ) ) );
				promocao.setDescricao( rs.getString( "prm_descricao" ) );
				promocao.setDataInicio( Validacao.dataParaString( rs.getTimestamp( "prm_data_inicio" ) ) );
				promocao.setDataFinal( Validacao.dataParaString( rs.getTimestamp( "prm_data_final" ) ) );
				
				promocoes.add( promocao );
				
			}
			
			return promocoes;
		
		} catch ( SQLException se ) {
			
			System.out.println( "Erro: " + se.toString() );	
			se.printStackTrace();
						
		} catch ( Exception e ) {
			
			System.out.println( "Erro: " + e.toString() );
			e.printStackTrace();
			
        } finally {
			
			fecharConexao( con, ps, rs );
			
		} 
        
        return promocoes;
		
	}
	
	public static Collection listar( String sql ) {
		
		Connection con = getConexao();
		Statement st = null;
		ResultSet rs = null;		
		Collection promocoes = null;
		
		try {			
							
			st = con.createStatement();
			rs = st.executeQuery( sql );
			promocoes = new ArrayList();
			
			while ( rs.next() ) {
				
				PromocaoForm promocao = new PromocaoForm();
				
				promocao.setCodigo( Integer.toString( rs.getInt( "prm_codigo" ) ) );
				promocao.setDescricao( rs.getString( "prm_descricao" ) );
				promocao.setDataInicio( Validacao.dataParaString( rs.getTimestamp( "prm_data_inicio" ) ) );
				promocao.setDataFinal( Validacao.dataParaString( rs.getTimestamp( "prm_data_final" ) ) );
				
				promocoes.add( promocao );
				
			}
			
			return promocoes;
		
		} catch ( SQLException se ) {
			
			System.out.println( "Erro: " + se.toString() );	
			se.printStackTrace();
						
		} catch ( Exception e ) {
			
			System.out.println( "Erro: " + e.toString() );
			e.printStackTrace();
			
        } finally {
			
			fecharConexao( con, st, rs );
			
		} 
        
        return promocoes;
		
	}

	public static PromocaoForm listarPorCodigo( int promocao ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;		
		String sql = null;
		PromocaoForm form = null;
		
		try {			

			sql = "select * from tab_promocao where prm_codigo = ?";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, promocao );
			rs = ps.executeQuery();			
			
			if ( rs.next() ) {
				
				form = new PromocaoForm();
				
				form.setCodigo( Integer.toString( rs.getInt( "prm_codigo" ) ) );
				form.setDescricao( rs.getString( "prm_descricao" ) );
				form.setDataInicio( Validacao.dataParaString( rs.getTimestamp( "prm_data_inicio" ) ) );
				form.setDataFinal( Validacao.dataParaString( rs.getTimestamp( "prm_data_final" ) ) );
				
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
	
	public static Collection listarPorDataFinal() {
		
		Connection con = getConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;		
		String sql = null;
		Collection promocoes = null;
		
		try {			

			sql = "select * from tab_promocao where prm_data_final > ?";
							
			ps = con.prepareStatement( sql );
			ps.setTimestamp( 1, Validacao.stringParaData( Validacao.getData() ) );
			rs = ps.executeQuery();
			promocoes = new ArrayList();
			
			while ( rs.next() ) {
				
				PromocaoForm promocao = new PromocaoForm();
				
				promocao.setCodigo( Integer.toString( rs.getInt( "prm_codigo" ) ) );
				promocao.setDescricao( rs.getString( "prm_descricao" ) );
				promocao.setDataInicio( Validacao.dataParaString( rs.getTimestamp( "prm_data_inicio" ) ) );
				promocao.setDataFinal( Validacao.dataParaString( rs.getTimestamp( "prm_data_final" ) ) );
				
				promocoes.add( promocao );
				
			}
			
			return promocoes;
		
		} catch ( SQLException se ) {
			
			System.out.println( "Erro: " + se.toString() );	
			se.printStackTrace();
						
		} catch ( Exception e ) {
			
			System.out.println( "Erro: " + e.toString() );
			e.printStackTrace();
			
        } finally {
			
			fecharConexao( con, ps, rs );
			
		} 
        
        return promocoes;
		
	}
	
}