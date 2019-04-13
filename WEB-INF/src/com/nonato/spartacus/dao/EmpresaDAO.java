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

import com.nonato.spartacus.forms.EmpresaForm;
import com.nonato.spartacus.to.EmpresaTO;
import com.nonato.spartacus.util.JDBCBase;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class EmpresaDAO extends JDBCBase {

	public static boolean inserir( EmpresaTO empresa ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;		
		String sql = null;
		StringBuffer sb = new StringBuffer();
		
		boolean sucesso = false;
		
		try {			
				    
		    if ( empresa.getCondicao() != 0 ) {
		    	
		    	sb.append( "insert into tab_empresa (emp_nome_razao_social, emp_responsavel, emp_cnpj_cpf, emp_email, emp_inscricao_estadual, " );
		    	sb.append( "emp_alvara, emp_endereco, emp_bairro_distrito, emp_fone_fax, emp_login_usuario, emp_login_senha, " );
		    	sb.append( "emp_observacao, emp_ativo, tip_codigo, con_codigo, cid_codigo) values( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, " );
		    	sb.append( "?, ?, ?, ?, ?)" );
		    	
		    	sql = sb.toString();
		    			    	
				ps = con.prepareStatement( sql );
				ps.setString( 1, empresa.getNomeRazaoSocial() );
				ps.setString( 2, empresa.getResponsavel() );
				ps.setString( 3, empresa.getCnpjCpf() );
				ps.setString( 4, empresa.getEmail() );
				ps.setString( 5, empresa.getInscricaoEstadual() );
				ps.setString( 6, empresa.getAlvara() );
				ps.setString( 7, empresa.getEndereco() );
				ps.setString( 8, empresa.getBairroDistrito() );
				ps.setString( 9, empresa.getFoneFax() );
				ps.setString( 10, empresa.getLoginUsuario() );
				ps.setString( 11, empresa.getLoginSenha() );
				ps.setString( 12, empresa.getObservacao() );
				ps.setString( 13, empresa.getAtivo() );
				ps.setInt( 14, empresa.getTipo() );
				ps.setInt( 15, empresa.getCondicao() );
				ps.setInt( 16, empresa.getCidade() );
				ps.executeUpdate();
		    	
		    } else {
		    	
		    	sb.append( "insert into tab_empresa (emp_nome_razao_social, emp_responsavel, emp_cnpj_cpf, emp_email, emp_inscricao_estadual, " );
		    	sb.append( "emp_alvara, emp_endereco, emp_bairro_distrito, emp_fone_fax, emp_login_usuario, emp_login_senha, " );
		    	sb.append( "emp_observacao, emp_ativo, tip_codigo, cid_codigo) values( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, " );
		    	sb.append( "?, ?, ?, ?)" );
		    	
		    	sql = sb.toString();
		    	
		    	ps = con.prepareStatement( sql );
		    	ps.setString( 1, empresa.getNomeRazaoSocial() );
				ps.setString( 2, empresa.getResponsavel() );
				ps.setString( 3, empresa.getCnpjCpf() );
				ps.setString( 4, empresa.getEmail() );
				ps.setString( 5, empresa.getInscricaoEstadual() );
				ps.setString( 6, empresa.getAlvara() );
				ps.setString( 7, empresa.getEndereco() );
				ps.setString( 8, empresa.getBairroDistrito() );
				ps.setString( 9, empresa.getFoneFax() );
				ps.setString( 10, empresa.getLoginUsuario() );
				ps.setString( 11, empresa.getLoginSenha() );
				ps.setString( 12, empresa.getObservacao() );
				ps.setString( 13, empresa.getAtivo() );
				ps.setInt( 14, empresa.getTipo() );
				ps.setInt( 15, empresa.getCidade() );
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

	public static boolean alterar( EmpresaTO empresa ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;		
		String sql = null;
		StringBuffer sb = new StringBuffer();
		
		boolean sucesso = false;
		
		try {
			
			if ( empresa.getCondicao() != 0 ) {
			
				sb.append( "update tab_empresa set emp_nome_razao_social = ?, emp_responsavel = ?, emp_cnpj_cpf = ?, " );
		    	sb.append( "emp_email = ?, emp_inscricao_estadual = ?, emp_alvara = ?, emp_endereco = ?, emp_bairro_distrito = ?, " );
		    	sb.append( "emp_fone_fax = ?, emp_login_usuario = ?, emp_login_senha = ?, emp_observacao = ?, emp_ativo = ?, " );
		    	sb.append( "tip_codigo = ?, con_codigo = ?, cid_codigo = ? where emp_codigo = ?" );
		    	
		    	sql = sb.toString();
		    			    	
				ps = con.prepareStatement( sql );
				ps.setString( 1, empresa.getNomeRazaoSocial() );
				ps.setString( 2, empresa.getResponsavel() );
				ps.setString( 3, empresa.getCnpjCpf() );
				ps.setString( 4, empresa.getEmail() );
				ps.setString( 5, empresa.getInscricaoEstadual() );
				ps.setString( 6, empresa.getAlvara() );
				ps.setString( 7, empresa.getEndereco() );
				ps.setString( 8, empresa.getBairroDistrito() );
				ps.setString( 9, empresa.getFoneFax() );
				ps.setString( 10, empresa.getLoginUsuario() );
				ps.setString( 11, empresa.getLoginSenha() );
				ps.setString( 12, empresa.getObservacao() );
				ps.setString( 13, empresa.getAtivo() );
				ps.setInt( 14, empresa.getTipo() );
				ps.setInt( 15, empresa.getCondicao() );
				ps.setInt( 16, empresa.getCidade() );
				ps.setInt( 17, empresa.getCodigo() );
				ps.executeUpdate();
		    				
			} else {
			
				sb.append( "update tab_empresa set emp_nome_razao_social = ?, emp_responsavel = ?, emp_cnpj_cpf = ?, " );
		    	sb.append( "emp_email = ?, emp_inscricao_estadual = ?, emp_alvara = ?, emp_endereco = ?, emp_bairro_distrito = ?, " );
		    	sb.append( "emp_fone_fax = ?, emp_login_usuario = ?, emp_login_senha = ?, emp_observacao = ?, emp_ativo = ?, " );
		    	sb.append( "tip_codigo = ?, cid_codigo = ? where emp_codigo = ?" );
		    	
		    	sql = sb.toString();
		    			    	
				ps = con.prepareStatement( sql );
				ps.setString( 1, empresa.getNomeRazaoSocial() );
				ps.setString( 2, empresa.getResponsavel() );
				ps.setString( 3, empresa.getCnpjCpf() );
				ps.setString( 4, empresa.getEmail() );
				ps.setString( 5, empresa.getInscricaoEstadual() );
				ps.setString( 6, empresa.getAlvara() );
				ps.setString( 7, empresa.getEndereco() );
				ps.setString( 8, empresa.getBairroDistrito() );
				ps.setString( 9, empresa.getFoneFax() );
				ps.setString( 10, empresa.getLoginUsuario() );
				ps.setString( 11, empresa.getLoginSenha() );
				ps.setString( 12, empresa.getObservacao() );
				ps.setString( 13, empresa.getAtivo() );
				ps.setInt( 14, empresa.getTipo() );
				ps.setInt( 15, empresa.getCidade() );
				ps.setInt( 16, empresa.getCodigo() );
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
	
	public static boolean excluir( EmpresaTO empresa ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;		
		String sql = null;
		
		boolean sucesso = false;
		
		try {			

			sql = "delete from tab_empresa where emp_codigo = ?";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, empresa.getCodigo() );
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
		Collection empresas = null;
		
		try {			

			sql = "select * from rel_empresa order by emp_nome_razao_social";
							
			ps = con.prepareStatement( sql );
			rs = ps.executeQuery();
			empresas = new ArrayList();
			
			while ( rs.next() ) {
				
				EmpresaForm empresa = new EmpresaForm();
				
				empresa.setCodigo( Integer.toString( rs.getInt( "emp_codigo" ) ) );
				empresa.setNomeRazaoSocial( rs.getString( "emp_nome_razao_social" ) );
				empresa.setResponsavel( rs.getString( "emp_responsavel" ) );
				empresa.setEmail( rs.getString( "emp_email" ) );
				empresa.setCnpjCpf( rs.getString( "emp_cnpj_cpf" ) );
				empresa.setInscricaoEstadual( rs.getString( "emp_inscricao_estadual" ) );
				empresa.setAlvara( rs.getString( "emp_alvara" ) );
				empresa.setEndereco( rs.getString( "emp_endereco" ) );
				empresa.setBairroDistrito( rs.getString( "emp_bairro_distrito" ) );
				empresa.setFoneFax( rs.getString( "emp_fone_fax" ) );
				empresa.setLoginUsuario( rs.getString( "emp_login_usuario" ) );
				empresa.setLoginSenha( rs.getString( "emp_login_senha" ) );
				empresa.setObservacao( rs.getString( "emp_observacao" ) );
				empresa.setAtivo( rs.getString( "emp_ativo" ) );
				empresa.setTipo( Integer.toString( rs.getInt( "tip_codigo" ) ) );
				empresa.setTipoDescricao( rs.getString( "tip_descricao" ) );
				empresa.setCondicao( rs.getString( "con_codigo" ) );
				empresa.setCondicaoDias( rs.getString( "con_dias" ) );
				empresa.setCondicaoJuros( rs.getString( "con_juros" ) );
				empresa.setCondicaoMulta( rs.getString( "con_multa" ) );
				empresa.setCondicaoParcelas( rs.getString( "con_parcelas" ) );
				empresa.setCidade( rs.getString( "cid_codigo" ) );
				empresa.setCidadeNome( rs.getString( "cid_nome" ) );
				empresa.setCidadeEstadoSigla( rs.getString( "est_sigla" ) );
				empresa.setCidadeCep( rs.getString( "cid_cep" ) );
				
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
	
	public static Collection listar( String sql ) {
		
		Connection con = getConexao();
		Statement st = null;
		ResultSet rs = null;		
		Collection empresas = null;
		
		try {			
							
			st = con.createStatement();
			rs = st.executeQuery( sql );
			empresas = new ArrayList();
			
			while ( rs.next() ) {
				
				EmpresaForm empresa = new EmpresaForm();
				
				empresa.setCodigo( Integer.toString( rs.getInt( "emp_codigo" ) ) );
				empresa.setNomeRazaoSocial( rs.getString( "emp_nome_razao_social" ) );
				empresa.setResponsavel( rs.getString( "emp_responsavel" ) );
				empresa.setEmail( rs.getString( "emp_email" ) );
				empresa.setCnpjCpf( rs.getString( "emp_cnpj_cpf" ) );
				empresa.setInscricaoEstadual( rs.getString( "emp_inscricao_estadual" ) );
				empresa.setAlvara( rs.getString( "emp_alvara" ) );
				empresa.setEndereco( rs.getString( "emp_endereco" ) );
				empresa.setBairroDistrito( rs.getString( "emp_bairro_distrito" ) );
				empresa.setFoneFax( rs.getString( "emp_fone_fax" ) );
				empresa.setLoginUsuario( rs.getString( "emp_login_usuario" ) );
				empresa.setLoginSenha( rs.getString( "emp_login_senha" ) );
				empresa.setObservacao( rs.getString( "emp_observacao" ) );
				empresa.setAtivo( rs.getString( "emp_ativo" ) );
				empresa.setTipo( Integer.toString( rs.getInt( "tip_codigo" ) ) );
				empresa.setTipoDescricao( rs.getString( "tip_descricao" ) );
				empresa.setCondicao( rs.getString( "con_codigo" ) );
				empresa.setCondicaoDias( rs.getString( "con_dias" ) );
				empresa.setCondicaoJuros( rs.getString( "con_juros" ) );
				empresa.setCondicaoMulta( rs.getString( "con_multa" ) );
				empresa.setCondicaoParcelas( rs.getString( "con_parcelas" ) );
				empresa.setCidade( rs.getString( "cid_codigo" ) );
				empresa.setCidadeNome( rs.getString( "cid_nome" ) );
				empresa.setCidadeEstadoSigla( rs.getString( "est_sigla" ) );
				empresa.setCidadeCep( rs.getString( "cid_cep" ) );
				
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
			
			fecharConexao( con, st, rs );
			
		} 
        
        return empresas;
		
	}
	
	public static EmpresaForm listarPorCodigo( int empresa ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;		
		String sql = null;
		EmpresaForm form = null;
		
		try {			

			sql = "select * from rel_empresa where emp_codigo = ?";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, empresa );
			rs = ps.executeQuery();			
			
			if ( rs.next() ) {
				
				form = new EmpresaForm();
				
				form.setCodigo( Integer.toString( rs.getInt( "emp_codigo" ) ) );
				form.setNomeRazaoSocial( rs.getString( "emp_nome_razao_social" ) );
				form.setResponsavel( rs.getString( "emp_responsavel" ) );
				form.setCnpjCpf( rs.getString( "emp_cnpj_cpf" ) );
				form.setEmail( rs.getString( "emp_email" ) );
				form.setInscricaoEstadual( rs.getString( "emp_inscricao_estadual" ) );
				form.setAlvara( rs.getString( "emp_alvara" ) );
				form.setEndereco( rs.getString( "emp_endereco" ) );
				form.setBairroDistrito( rs.getString( "emp_bairro_distrito" ) );
				form.setFoneFax( rs.getString( "emp_fone_fax" ) );
				form.setLoginUsuario( rs.getString( "emp_login_usuario" ) );
				form.setLoginSenha( rs.getString( "emp_login_senha" ) );
				form.setObservacao( rs.getString( "emp_observacao" ) );
				form.setAtivo( rs.getString( "emp_ativo" ) );
				form.setTipo( Integer.toString( rs.getInt( "tip_codigo" ) ) );
				form.setTipoDescricao( rs.getString( "tip_descricao" ) );
				form.setCondicao( rs.getString( "con_codigo" ) );	
				form.setCondicaoDias( rs.getString( "con_dias" ) );
				form.setCondicaoJuros( rs.getString( "con_juros" ) );
				form.setCondicaoMulta( rs.getString( "con_multa" ) );
				form.setCondicaoParcelas( rs.getString( "con_parcelas" ) );
				form.setCidade( rs.getString( "cid_codigo" ) );
				form.setCidadeNome(rs.getString( "cid_nome" ) );
				form.setCidadeEstadoSigla( rs.getString( "est_sigla" ) );
				form.setCidadeCep( rs.getString( "cid_cep" ) );
				
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
	
	public static Collection listarCidades() {
		
		Connection con = getConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;		
		String sql = null;
		Collection cidades = null;
		
		try {			

			sql = "select * from rel_cidade";
							
			ps = con.prepareStatement( sql );
			rs = ps.executeQuery();
			cidades = new ArrayList();
			
			while ( rs.next() ) {
				
				EmpresaForm form = new EmpresaForm();
				
				form.setCidade( Integer.toString( rs.getInt( "cid_codigo" ) ) );
				form.setCidadeNome( rs.getString( "cid_nome" ) );
				form.setCidadeEstadoSigla( rs.getString( "est_sigla" ) );
				form.setCidadeCep( rs.getString( "cid_cep" ) );
								
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
	
	public static Collection listarCondicoes() {
		
		Connection con = getConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;		
		String sql = null;
		Collection condicoes = null;
		
		try {			

			sql = "select * from tab_condicao";
							
			ps = con.prepareStatement( sql );
			rs = ps.executeQuery();
			condicoes = new ArrayList();
			
			while ( rs.next() ) {
				
				EmpresaForm form = new EmpresaForm();
				
				form.setCondicao( Integer.toString( rs.getInt( "con_codigo" ) ) );
				form.setCondicaoDias( Integer.toString( rs.getInt( "con_dias" ) ) );
				form.setCondicaoJuros( Double.toString( rs.getDouble( "con_juros" ) ) );
				form.setCondicaoMulta( Double.toString( rs.getDouble( "con_multa" ) ) );
				form.setCondicaoParcelas( Integer.toString( rs.getInt( "con_parcelas" ) ) );
				
				condicoes.add( form );
				
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

}