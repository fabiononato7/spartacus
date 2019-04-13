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

import com.nonato.spartacus.forms.CondicaoForm;
import com.nonato.spartacus.to.CondicaoTO;
import com.nonato.spartacus.util.JDBCBase;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class CondicaoDAO extends JDBCBase {

	public static boolean inserir( CondicaoTO condicao ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;		
		String sql = null;
		
		boolean sucesso = false;
		
		try {			

			sql = "insert into tab_condicao (con_dias, con_juros, con_multa, con_parcelas) values( ?, ?, ?, ? )";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, condicao.getDias() );
			ps.setDouble( 2, condicao.getJuros() );
			ps.setDouble( 3, condicao.getMulta() );
			ps.setInt( 4, condicao.getParcelas() );
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
	
	public static boolean alterar( CondicaoTO condicao ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;		
		String sql = null;
		
		boolean sucesso = false;
		
		try {			

			sql = "update tab_condicao set con_dias = ?, con_juros = ?, con_multa = ?, con_parcelas = ? where con_codigo = ?";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, condicao.getDias() );
			ps.setDouble( 2, condicao.getJuros() );
			ps.setDouble( 3, condicao.getMulta() );
			ps.setInt( 4, condicao.getParcelas() );
			ps.setInt( 5, condicao.getCodigo() );
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
	
	public static boolean excluir( CondicaoTO condicao ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;		
		String sql = null;
		
		boolean sucesso = false;
		
		try {			

			sql = "delete from tab_condicao where con_codigo = ?";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, condicao.getCodigo() );
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
		Collection condicoes = null;
		
		try {			

			sql = "select * from tab_condicao order by con_codigo";
							
			ps = con.prepareStatement( sql );
			rs = ps.executeQuery();
			condicoes = new ArrayList();
			
			while ( rs.next() ) {
				
				CondicaoForm condicao = new CondicaoForm();
				
				condicao.setCodigo( Integer.toString( rs.getInt( "con_codigo" ) ) );
				condicao.setDias( Integer.toString( rs.getInt( "con_dias" ) ) );
				condicao.setJuros( Double.toString( rs.getDouble( "con_juros" ) ) );
				condicao.setMulta( Double.toString( rs.getDouble( "con_multa" ) ) );
				condicao.setParcelas( Integer.toString( rs.getInt( "con_parcelas" ) ) );
				
				condicoes.add( condicao );
				
			}
			
			return condicoes;
		
		} catch ( SQLException se ) {
			
			System.out.println( "Erro: " + se.toString() );	
			se.printStackTrace();
						
		} catch ( Exception e ) {
			
			System.out.println( "Erro: " + e.toString() );
			e.printStackTrace();
			
        } finally {
			
			fecharConexao( con, ps, rs );
			
		} 
        
        return condicoes;
		
	}
	
	public static Collection listar( String sql ) {
		
		Connection con = getConexao();
		Statement st = null;
		ResultSet rs = null;		
		Collection condicoes = null;
		
		try {			
							
			st = con.createStatement();
			rs = st.executeQuery( sql );
			condicoes = new ArrayList();
			
			while ( rs.next() ) {
				
				CondicaoForm condicao = new CondicaoForm();
				
				condicao.setCodigo( Integer.toString( rs.getInt( "con_codigo" ) ) );
				condicao.setDias( Integer.toString( rs.getInt( "con_dias" ) ) );
				condicao.setJuros( Double.toString( rs.getDouble( "con_juros" ) ) );
				condicao.setMulta( Double.toString( rs.getDouble( "con_multa" ) ) );
				condicao.setParcelas( Integer.toString( rs.getInt( "con_parcelas" ) ) );
				
				condicoes.add( condicao );
				
			}
			
			return condicoes;
		
		} catch ( SQLException se ) {
			
			System.out.println( "Erro: " + se.toString() );	
			se.printStackTrace();
						
		} catch ( Exception e ) {
			
			System.out.println( "Erro: " + e.toString() );
			e.printStackTrace();
			
        } finally {
			
			fecharConexao( con, st, rs );
			
		} 
        
        return condicoes;
		
	}
	
	public static CondicaoForm listarPorCodigo( int condicao ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;		
		String sql = null;
		CondicaoForm form = null;
		
		try {			
	
			sql = "select * from tab_condicao where con_codigo = ?";
			
			ps = con.prepareStatement( sql );
			ps.setInt( 1, condicao );
			rs = ps.executeQuery();			
			
			if ( rs.next() ) {
				
				form = new CondicaoForm();
				
				form.setCodigo( Integer.toString( rs.getInt( "con_codigo" ) ) );
				form.setDias( Integer.toString( rs.getInt( "con_dias" ) ) );
				form.setJuros( Double.toString( rs.getDouble( "con_juros" ) ) );
				form.setMulta( Double.toString( rs.getDouble( "con_multa" ) ) );
				form.setParcelas( Integer.toString( rs.getInt( "con_parcelas" ) ) );
								
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
	
}