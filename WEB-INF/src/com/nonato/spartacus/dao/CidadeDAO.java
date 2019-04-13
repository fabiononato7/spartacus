/*
 * Created on 11/08/2005
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

import com.nonato.spartacus.forms.CidadeForm;
import com.nonato.spartacus.to.CidadeTO;
import com.nonato.spartacus.util.JDBCBase;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class CidadeDAO extends JDBCBase {

	public static boolean inserir( CidadeTO cidade ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;		
		String sql = null;
		
		boolean sucesso = false;
		
		try {			

			sql = "insert into tab_cidade (cid_nome, cid_cep, est_codigo) values( ?, ?, ? )";
							
			ps = con.prepareStatement( sql );
			ps.setString( 1, cidade.getNome() );
			ps.setString( 2, cidade.getCep() );
			ps.setInt( 3, cidade.getEstado() );
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
	
	public static boolean alterar( CidadeTO cidade ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;		
		String sql = null;
		
		boolean sucesso = false;
		
		try {			

			sql = "update tab_cidade set cid_nome = ?, cid_cep = ?, est_codigo = ? where cid_codigo = ?";
							
			ps = con.prepareStatement( sql );
			ps.setString( 1, cidade.getNome() );
			ps.setString( 2, cidade.getCep() );
			ps.setInt( 3, cidade.getEstado() );
			ps.setInt( 4, cidade.getCodigo() );
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
	
	public static boolean excluir( CidadeTO cidade ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;		
		String sql = null;
		
		boolean sucesso = false;
		
		try {			

			sql = "delete from tab_cidade where cid_codigo = ?";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, cidade.getCodigo() );
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
		Collection cidades = null;
		
		try {			

			sql = "select * from rel_cidade order by cid_nome";
							
			ps = con.prepareStatement( sql );
			rs = ps.executeQuery();
			cidades = new ArrayList();
			
			while ( rs.next() ) {
				
				CidadeForm cidade = new CidadeForm();
				
				cidade.setCodigo( Integer.toString( rs.getInt( "cid_codigo" ) ) );
				cidade.setNome( rs.getString( "cid_nome" ) );
				cidade.setCep( rs.getString( "cid_cep" ) );
				cidade.setEstado( Integer.toString( rs.getInt( "est_codigo" ) ) );
				cidade.setEstadoSigla( rs.getString( "est_sigla" ) );
				
				cidades.add( cidade );
				
			}
			
			return cidades;
		
		} catch ( SQLException se ) {
			
			System.out.println( "Erro: " + se.toString() );	
			se.printStackTrace();
						
		} catch ( Exception e ) {
			
			System.out.println( "Erro: " + e.toString() );
			e.printStackTrace();
			
        } finally {
			
			fecharConexao( con, ps, rs );
			
		} 
        
        return cidades;
		
	}
	
	public static Collection listar( String sql ) {
		
		Connection con = getConexao();
		Statement st = null;
		ResultSet rs = null;		
		Collection cidades = null;
		
		try {			
							
			st = con.createStatement();
			rs = st.executeQuery( sql );
			cidades = new ArrayList();
			
			while ( rs.next() ) {
				
				CidadeForm cidade = new CidadeForm();
				
				cidade.setCodigo( Integer.toString( rs.getInt( "cid_codigo" ) ) );
				cidade.setNome( rs.getString( "cid_nome" ) );
				cidade.setCep( rs.getString( "cid_cep" ) );
				cidade.setEstado( Integer.toString( rs.getInt( "est_codigo" ) ) );
				cidade.setEstadoSigla( rs.getString( "est_sigla" ) );
				
				cidades.add( cidade );
				
			}
			
			return cidades;
		
		} catch ( SQLException se ) {
			
			System.out.println( "Erro: " + se.toString() );	
			se.printStackTrace();
						
		} catch ( Exception e ) {
			
			System.out.println( "Erro: " + e.toString() );
			e.printStackTrace();
			
        } finally {
			
			fecharConexao( con, st, rs );
			
		} 
        
        return cidades;
		
	}

	public static CidadeForm listarPorCodigo( int cidade ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;		
		String sql = null;
		CidadeForm form = null;
		
		try {			

			sql = "select * from rel_cidade where cid_codigo = ?";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, cidade );
			rs = ps.executeQuery();			
			
			if ( rs.next() ) {
				
				form = new CidadeForm();
				
				form.setCodigo( Integer.toString( rs.getInt( "cid_codigo" ) ) );
				form.setNome( rs.getString( "cid_nome" ) );
				form.setCep( rs.getString( "cid_cep" ) );
				form.setEstado( Integer.toString( rs.getInt( "est_codigo" ) ) );
				form.setEstadoSigla( rs.getString( "est_sigla" ) );
				
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
	
	public static Collection listarPorEstado( int estado ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;		
		String sql = null;
		Collection cidades = null;
		
		try {			

			sql = "select * from rel_cidade where est_codigo = ?  order by cid_nome";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, estado );
			rs = ps.executeQuery();
			cidades = new ArrayList();
			
			while ( rs.next() ) {
				
				CidadeForm form = new CidadeForm();
				
				form.setCodigo( Integer.toString( rs.getInt( "cid_codigo" ) ) );
				form.setNome( rs.getString( "cid_nome" ) );
				form.setCep( rs.getString( "cid_cep" ) );
				form.setEstado( Integer.toString( rs.getInt( "est_codigo" ) ) );
				form.setEstadoSigla( rs.getString( "est_sigla" ) );
				
				cidades.add( form );
				
			}
			
			return cidades;
		
		} catch ( SQLException se ) {
			
			System.out.println( "Erro: " + se.toString() );	
			se.printStackTrace();
						
		} catch ( Exception e ) {
			
			System.out.println( "Erro: " + e.toString() );
			e.printStackTrace();
			
        } finally {
			
			fecharConexao( con, ps, rs );
			
		} 
        
        return cidades;
		
	}
	
	public static Collection listarNaoRelacionados( int regiao ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;		
		String sql = null;
		Collection cidades = null;
		
		try {			

			sql = "select * from rel_cidade c ";
			sql += "where c.cid_codigo not in ";
			sql += "( select cr.cid_codigo from rel_cidade_regiao cr ";
			sql += "where cr.reg_codigo = ? ) ";
			sql += "order by cid_nome";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, regiao );
			rs = ps.executeQuery();
			cidades = new ArrayList();
			
			while ( rs.next() ) {
				
				CidadeForm cidade = new CidadeForm();
				
				cidade.setCodigo( Integer.toString( rs.getInt( "cid_codigo" ) ) );
				cidade.setNome( rs.getString( "cid_nome" ) );
				cidade.setCep( rs.getString( "cid_cep" ) );
				cidade.setEstado( Integer.toString( rs.getInt( "est_codigo" ) ) );
				cidade.setEstadoSigla( rs.getString( "est_sigla" ) );
				
				cidades.add( cidade );
				
			}
			
			return cidades;
		
		} catch ( SQLException se ) {
			
			System.out.println( "Erro: " + se.toString() );	
			se.printStackTrace();
						
		} catch ( Exception e ) {
			
			System.out.println( "Erro: " + e.toString() );
			e.printStackTrace();
			
        } finally {
			
			fecharConexao( con, ps, rs );
			
		} 
        
        return cidades;
		
	}
	
}