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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import com.nonato.spartacus.forms.ProdutoForm;
import com.nonato.spartacus.to.ProdutoTO;
import com.nonato.spartacus.util.JDBCBase;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ProdutoDAO extends JDBCBase {
	

	public static boolean inserir( ProdutoTO produto ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;		
		String sql = null;
		
		boolean sucesso = false;
		
		try {			

			sql = "insert into tab_produto (pro_nome, pro_preco, uni_codigo, emp_codigo) values( ?, ?, ?, ? )";
							
			ps = con.prepareStatement( sql );
			ps.setString( 1, produto.getNome() );
			ps.setDouble( 2, produto.getPreco() );
			ps.setInt( 3, produto.getUnidade() );
			ps.setInt( 4, produto.getEmpresa() );
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
	
	public static boolean alterar( ProdutoTO produto ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;		
		String sql = null;
		
		boolean sucesso = false;
		
		try {			

			sql = "update tab_produto set pro_nome = ?, pro_preco = ?, uni_codigo = ?, emp_codigo = ? where pro_codigo = ?";
							
			ps = con.prepareStatement( sql );
			ps.setString( 1, produto.getNome() );
			ps.setDouble( 2, produto.getPreco() );
			ps.setInt( 3, produto.getUnidade() );
			ps.setInt( 4, produto.getEmpresa() );
			ps.setInt( 5, produto.getCodigo() );
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
	
	public static boolean excluir( ProdutoTO produto ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;		
		String sql = null;
		
		boolean sucesso = false;
		
		try {			

			sql = "delete from tab_produto where pro_codigo = ?";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, produto.getCodigo() );
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
		Collection produtos = null;
		
		try {			

			sql = "select * from rel_produto order by pro_nome";
							
			ps = con.prepareStatement( sql );
			rs = ps.executeQuery();
			produtos = new ArrayList();
			
			while ( rs.next() ) {
				
				ProdutoForm form = new ProdutoForm();
				
				form.setCodigo( Integer.toString( rs.getInt( "pro_codigo" ) ) );
				form.setNome( rs.getString( "pro_nome" ) );
				form.setPreco( rs.getString( "pro_preco" ) );
				form.setUnidade( Integer.toString( rs.getInt( "uni_codigo" ) ) );
				form.setUnidadeSigla( rs.getString( "uni_sigla" ) );
				form.setEmpresa( Integer.toString( rs.getInt( "emp_codigo" ) ) );
				form.setEmpresaNome( rs.getString( "emp_nome_razao_social" ) );
				
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
				
				ProdutoForm form = new ProdutoForm();
				
				form.setCodigo( Integer.toString( rs.getInt( "pro_codigo" ) ) );
				form.setNome( rs.getString( "pro_nome" ) );
				form.setPreco( rs.getString( "pro_preco" ) );
				form.setUnidade( Integer.toString( rs.getInt( "uni_codigo" ) ) );
				form.setUnidadeSigla( rs.getString( "uni_sigla" ) );
				form.setEmpresa( Integer.toString( rs.getInt( "emp_codigo" ) ) );
				form.setEmpresaNome( rs.getString( "emp_nome_razao_social" ) );
				
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
	
	public static ProdutoForm listarPorCodigo( int produto ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;		
		String sql = null;
		ProdutoForm form = null;
		
		try {			

			sql = "select * from rel_produto where pro_codigo = ?";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, produto );
			rs = ps.executeQuery();
						
			if ( rs.next() ) {
			
				form = new ProdutoForm();
				
				form.setCodigo( Integer.toString( rs.getInt( "pro_codigo" ) ) );
				form.setNome( rs.getString( "pro_nome" ) );
				form.setPreco( rs.getString( "pro_preco" ) );
				form.setUnidade( Integer.toString( rs.getInt( "uni_codigo" ) ) );
				form.setUnidadeSigla( rs.getString( "uni_sigla" ) );
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
	
	public static Collection listarNaoRelacionados( int promocao ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;		
		String sql = null;
		Collection produtos = null;
		
		try {			

			sql = "select * from rel_produto r ";
			sql += "where r.pro_codigo not in ";
			sql += "( select pp.pro_codigo from tab_produto_promocao pp ";
			sql += "where pp.prm_codigo = ?) ";
			sql += "order by pro_nome";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, promocao );
			rs = ps.executeQuery();
			produtos = new ArrayList();
			
			while ( rs.next() ) {
				
				ProdutoForm form = new ProdutoForm();
				
				form.setCodigo( Integer.toString( rs.getInt( "pro_codigo" ) ) );
				form.setNome( rs.getString( "pro_nome" ) );
				form.setPreco( rs.getString( "pro_preco" ) );
				form.setUnidade( Integer.toString( rs.getInt( "uni_codigo" ) ) );
				form.setUnidadeSigla( rs.getString( "uni_sigla" ) );
				form.setEmpresa( Integer.toString( rs.getInt( "emp_codigo" ) ) );
				form.setEmpresaNome( rs.getString( "emp_nome_razao_social" ) );
				
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
	
	public static Collection listarLaboratorios() {
		
		Connection con = getConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;		
		String sql = null;
		Collection empresas = null;
		
		try {			

			sql = "select * from rel_empresa where tip_codigo = 2 order by emp_nome_razao_social";
							
			ps = con.prepareStatement( sql );
			rs = ps.executeQuery();
			empresas = new ArrayList();
			
			while ( rs.next() ) {
				
				ProdutoForm empresa = new ProdutoForm();
				
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