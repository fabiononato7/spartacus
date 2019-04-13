/*
 * Created on 13/09/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nonato.spartacus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.nonato.spartacus.forms.MenuForm;
import com.nonato.spartacus.util.JDBCBase;
import com.nonato.spartacus.util.Validacao;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class LoginDAO extends JDBCBase {

	public static MenuForm logar( String loginUsuario, String loginSenha ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;		
		String sql = null;
		MenuForm form = null;
		
		try {			
	
			sql = "select * from rel_empresa where emp_login_usuario = ? and emp_login_senha = ?";
							
			ps = con.prepareStatement( sql );
			ps.setString( 1, loginUsuario );
			ps.setString( 2, loginSenha );
			rs = ps.executeQuery();			
			
			if ( rs.next() ) {
								
				form = new MenuForm();
				
				form.setCodigo( Integer.toString( rs.getInt( "emp_codigo" ) ) );
				form.setNomeRazaoSocial( rs.getString( "emp_nome_razao_social" ) );
				form.setResponsavel( rs.getString( "emp_responsavel" ) );
				form.setPrimeiroNome( Validacao.getPrimeiroNome( rs.getString( "emp_responsavel" ) ) );
				form.setCnpjCpf( rs.getString( "emp_cnpj_cpf" ) );
				form.setInscricaoEstadual( rs.getString( "emp_inscricao_estadual" ) );
				form.setAlvara( rs.getString( "emp_alvara" ) );
				form.setEndereco( rs.getString( "emp_endereco" ) );
				form.setBairroDistrito( rs.getString( "emp_bairro_distrito" ) );
				form.setFoneFax( rs.getString( "emp_fone_fax" ) );
				form.setLoginUsuario( rs.getString( "emp_login_usuario" ) );
				form.setLoginSenha( rs.getString( "emp_login_senha" ) );
				form.setObservacao( rs.getString( "emp_observacao" ) );
				form.setTipo( Integer.toString( rs.getInt( "tip_codigo" ) ) );
				form.setTipoDescricao( rs.getString( "tip_descricao" ) );
				form.setCondicao( rs.getString( "con_codigo" ) );	
				form.setCidade( rs.getString( "cid_codigo" ) );
				form.setCidadeNome( rs.getString( "cid_nome" ) );
				form.setCidadeEstadoSigla( rs.getString( "est_sigla" ) );
								
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
