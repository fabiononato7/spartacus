/*
 * Created on 19/08/2005
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

import com.nonato.spartacus.forms.RegiaoForm;
import com.nonato.spartacus.to.RegiaoTO;
import com.nonato.spartacus.util.JDBCBase;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class RegiaoDAO extends JDBCBase {

	public static boolean inserir( RegiaoTO regiao ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;		
		String sql = null;
		StringBuffer sb = new StringBuffer();
		
		boolean sucesso = false;
		
		try {			
			
			if ( regiao.getEmpresa() != 0 ) {
				
				sb.append( "insert into tab_regiao (reg_descricao, reg_ativo, emp_codigo) values( ?, ?, ? )" );
				
				sql = sb.toString();
				
				ps = con.prepareStatement( sql );
				ps.setString( 1, regiao.getDescricao() );
				ps.setString( 2, "1" );
				ps.setInt( 3, regiao.getEmpresa() );
				ps.executeUpdate();
				
			} else {
				
				sb.append( "insert into tab_regiao (reg_descricao, reg_ativo) values( ?, ? )" );
				
				sql = sb.toString();
				
				ps = con.prepareStatement( sql );
				ps.setString( 1, regiao.getDescricao() );
				ps.setString( 2, "1" );
				ps.executeUpdate();
				
			}
				
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
	
	public static boolean alterar( RegiaoTO regiao ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;		
		String sql = null;
		
		boolean sucesso = false;
		
		try {			

			sql = "update tab_regiao set reg_descricao = ?, reg_ativo = ?, emp_codigo = ? where reg_codigo = ?";
							
			ps = con.prepareStatement( sql );
			ps.setString( 1, regiao.getDescricao() );
			ps.setString( 2, regiao.getAtivo() );
			ps.setInt( 3, regiao.getEmpresa() );
			ps.setInt( 4, regiao.getCodigo() );
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
	
	public static boolean excluir( RegiaoTO regiao ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;		
		String sql = null;
		
		boolean sucesso = false;
		
		try {			

			sql = "delete from tab_regiao where reg_codigo = ?";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, regiao.getCodigo() );
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
		Collection regioes = null;
		
		try {			

			sql = "select * from rel_regiao order by reg_descricao";
							
			ps = con.prepareStatement( sql );
			rs = ps.executeQuery();
			regioes = new ArrayList();
			
			while ( rs.next() ) {
				
				RegiaoForm regiao = new RegiaoForm();
				
				regiao.setCodigo( Integer.toString( rs.getInt( "reg_codigo" ) ) );
				regiao.setDescricao( rs.getString( "reg_descricao" ) );
				regiao.setAtivo( rs.getString( "reg_ativo" ) );
				regiao.setEmpresa( Integer.toString( rs.getInt( "emp_codigo" ) ) );
				regiao.setEmpresaNome( rs.getString( "emp_nome_razao_social" ) );
				
				regioes.add( regiao );
				
			}
			
			return regioes;
		
		} catch ( SQLException se ) {
			
			System.out.println( "Erro: " + se.toString() );	
			se.printStackTrace();
						
		} catch ( Exception e ) {
			
			System.out.println( "Erro: " + e.toString() );
			e.printStackTrace();
			
        } finally {
			
			fecharConexao( con, ps, rs );
			
		} 
        
        return regioes;
		
	}
	
	public static Collection listar( String sql ) {
		
		Connection con = getConexao();
		Statement st = null;
		ResultSet rs = null;		
		Collection regioes = null;
		
		try {			
							
			st = con.createStatement();
			rs = st.executeQuery( sql );
			regioes = new ArrayList();
			
			while ( rs.next() ) {
				
				RegiaoForm regiao = new RegiaoForm();
				
				regiao.setCodigo( Integer.toString( rs.getInt( "reg_codigo" ) ) );
				regiao.setDescricao( rs.getString( "reg_descricao" ) );
				regiao.setAtivo( rs.getString( "reg_ativo" ) );
				regiao.setEmpresa( Integer.toString( rs.getInt( "emp_codigo" ) ) );
				regiao.setEmpresaNome( rs.getString( "emp_nome_razao_social" ) );
				
				regioes.add( regiao );
				
			}
			
			return regioes;
		
		} catch ( SQLException se ) {
			
			System.out.println( "Erro: " + se.toString() );	
			se.printStackTrace();
						
		} catch ( Exception e ) {
			
			System.out.println( "Erro: " + e.toString() );
			e.printStackTrace();
			
        } finally {
			
			fecharConexao( con, st, rs );
			
		} 
        
        return regioes;
		
	}
	
	public static RegiaoForm listarPorCodigo( int regiao ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;		
		String sql = null;
		RegiaoForm form = null;
		
		try {			

			sql = "select * from rel_regiao where reg_codigo = ?";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, regiao );
			rs = ps.executeQuery();			
			
			if ( rs.next() ) {
				
				form = new RegiaoForm();
				
				form.setCodigo( Integer.toString( rs.getInt( "reg_codigo" ) ) );
				form.setDescricao( rs.getString( "reg_descricao" ) );
				form.setAtivo( rs.getString( "reg_ativo" ) );
				form.setEmpresa( Integer.toString( rs.getInt( "emp_codigo" ) ) );
				form.setEmpresaNome( rs.getString( "emp_nome_razao_social" ) );
				
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
	
	public static Collection listarRepresentantes() {
		
		Connection con = getConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;		
		String sql = null;
		Collection empresas = null;
		
		try {			

			sql = "select * from rel_empresa where tip_codigo = 3";
							
			ps = con.prepareStatement( sql );
			rs = ps.executeQuery();
			empresas = new ArrayList();
			
			while ( rs.next() ) {
				
				RegiaoForm empresa = new RegiaoForm();
				
				empresa.setEmpresa( Integer.toString( rs.getInt( "emp_codigo" ) ) );
				empresa.setEmpresaNome( rs.getString( "emp_nome_razao_social" ) );
				empresa.setEmpresaCnpjCpf( rs.getString( "emp_cnpj_cpf" ) );
				empresa.setEmpresaFoneFax( rs.getString( "emp_fone_fax" ) );
								
				empresas.add( empresa );
				
			}
			
			return empresas;
		
		} catch ( SQLException se ) {
			
			System.out.println( "Erro: " + se.toString() );	
			se.printStackTrace();
						
		} catch ( Exception e ) {
			
			System.out.println( "Erro: " + e.toString() );
			e.printStackTrace();
			
        } finally {
			
			fecharConexao( con, ps, rs );
			
		} 
        
        return empresas;
		
	}

}
