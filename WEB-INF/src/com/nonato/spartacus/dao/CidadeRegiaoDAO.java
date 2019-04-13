/*
 * Created on 21/08/2005
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

import com.nonato.spartacus.forms.CidadeRegiaoForm;
import com.nonato.spartacus.to.CidadeRegiaoTO;
import com.nonato.spartacus.util.JDBCBase;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class CidadeRegiaoDAO extends JDBCBase {
	
	public static boolean inserir( CidadeRegiaoTO cidadeRegiao ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;		
		String sql = null;
		
		boolean sucesso = false;
		
		try {			

			sql = "insert into tab_cidade_regiao (cid_codigo, reg_codigo) values( ?, ? )";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, cidadeRegiao.getCidade() );
			ps.setInt( 2, cidadeRegiao.getRegiao() );
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
	
	public static boolean alterar( CidadeRegiaoTO cidadeRegiao ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;		
		String sql = null;
		
		boolean sucesso = false;
		
		try {			

			sql = "update tab_cidade_regiao set cr_comentario = ? where cid_codigo = ? and reg_codigo = ?";
							
			ps = con.prepareStatement( sql );
			ps.setString( 1, cidadeRegiao.getComentario() );
			ps.setInt( 2, cidadeRegiao.getCidade() );
			ps.setInt( 3, cidadeRegiao.getRegiao() );
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
	
	public static boolean excluir( CidadeRegiaoTO cidadeRegiao ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;		
		String sql = null;
		
		boolean sucesso = false;
		
		try {			

			sql = "delete from tab_cidade_regiao where cid_codigo = ? and reg_codigo = ?";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, cidadeRegiao.getCidade() );
			ps.setInt( 2, cidadeRegiao.getRegiao() );
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
		Collection cidadesRegioes = null;
		
		try {			

			sql = "select * from rel_cidade_regiao";
							
			ps = con.prepareStatement( sql );
			rs = ps.executeQuery();
			cidadesRegioes = new ArrayList();
			
			while ( rs.next() ) {
				
				CidadeRegiaoForm form = new CidadeRegiaoForm();
				
				form.setCidade( Integer.toString( rs.getInt( "cid_codigo" ) ) );
				form.setCidadeNome( rs.getString( "cid_nome" ) );
				form.setCidadeEstadoSigla( rs.getString( "est_sigla" ) );
				form.setCidadeCep( rs.getString( "cid_cep" ) );
				form.setRegiao( Integer.toString( rs.getInt( "reg_codigo" ) ) );
				form.setRegiaoDescricao( rs.getString( "reg_descricao" ) );
				form.setComentario( rs.getString( "cr_comentario" ) );
				
				cidadesRegioes.add( form );
				
			}
			
			return cidadesRegioes;
		
		} catch ( SQLException se ) {
			
			System.out.println( "Erro: " + se.toString() );	
			se.printStackTrace();
						
		} catch ( Exception e ) {
			
			System.out.println( "Erro: " + e.toString() );
			e.printStackTrace();
			
        } finally {
			
			fecharConexao( con, ps, rs );
			
		} 
        
        return cidadesRegioes;
		
	}

	public static CidadeRegiaoForm listarPorCodigo( int cidade, int regiao ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;		
		String sql = null;
		CidadeRegiaoForm form = null;
		
		try {			

			sql = "select * from rel_cidade_regiao where cid_codigo = ? and reg_codigo = ?";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, cidade );
			ps.setInt( 2, regiao );
			rs = ps.executeQuery();			
			
			if ( rs.next() ) {
				
				form = new CidadeRegiaoForm();
				
				form.setCidade( Integer.toString( rs.getInt( "cid_codigo" ) ) );
				form.setCidadeNome( rs.getString( "cid_nome" ) );
				form.setCidadeEstadoSigla( rs.getString( "est_sigla" ) );
				form.setCidadeCep( rs.getString( "cid_cep" ) );
				form.setRegiao( Integer.toString( rs.getInt( "reg_codigo" ) ) );
				form.setRegiaoDescricao( rs.getString( "reg_descricao" ) );
				form.setComentario( rs.getString( "cr_comentario" ) );
				
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
	
	public static Collection listarPorRegiao( int regiao ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;		
		String sql = null;
		Collection cidadesRegioes = null;
		
		try {			

			sql = "select * from rel_cidade_regiao where reg_codigo = ? order by cid_nome";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, regiao );
			rs = ps.executeQuery();
			cidadesRegioes = new ArrayList();
			
			while ( rs.next() ) {
				
				CidadeRegiaoForm form = new CidadeRegiaoForm();
				
				form.setCidade( Integer.toString( rs.getInt( "cid_codigo" ) ) );
				form.setCidadeNome( rs.getString( "cid_nome" ) );
				form.setCidadeCep( rs.getString( "cid_cep" ) );
				form.setCidadeEstado( rs.getString( "est_codigo" ) );
				form.setCidadeEstadoSigla( rs.getString( "est_sigla" ) );
				form.setRegiao( Integer.toString( rs.getInt( "reg_codigo" ) ) );
				form.setComentario( rs.getString( "cr_comentario" ) );
				
				cidadesRegioes.add( form );
				
			}
			
			return cidadesRegioes;
		
		} catch ( SQLException se ) {
			
			System.out.println( "Erro: " + se.toString() );	
			se.printStackTrace();
						
		} catch ( Exception e ) {
			
			System.out.println( "Erro: " + e.toString() );
			e.printStackTrace();
			
        } finally {
			
			fecharConexao( con, ps, rs );
			
		} 
        
        return cidadesRegioes;
		
	}	
	
}