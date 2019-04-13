/*
 * Created on 19/08/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nonato.spartacus.bo;

import java.util.Collection;

import com.nonato.spartacus.dao.EmpresaDAO;
import com.nonato.spartacus.forms.EmpresaForm;
import com.nonato.spartacus.to.EmpresaTO;
import com.nonato.spartacus.util.Validacao;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class EmpresaBO {

	public static boolean inserir( EmpresaTO empresa ) {
		
		boolean sucesso = false;
		
		sucesso = EmpresaDAO.inserir( empresa );
		
		return sucesso;
		
	}
	
	public static boolean alterar( EmpresaTO empresa ) {
		
		boolean sucesso = false;
		
		sucesso = EmpresaDAO.alterar( empresa );
		
		return sucesso;
		
	}
	
	public static boolean excluir( EmpresaTO empresa ) {
		
		boolean sucesso = false;
		
		sucesso = EmpresaDAO.excluir( empresa );
		
		return sucesso;
		
	}
	
	public static Collection listar() {
		
		Collection empresas = null;
		
		empresas = EmpresaDAO.listar();
		
		return empresas;
		
	}
	
	public static EmpresaForm listarPorCodigo( int empresa ) {
		
		EmpresaForm form = null;
		
		form = EmpresaDAO.listarPorCodigo( empresa );
		
		return form;
		
	}
	
	public static Collection listarCidades() {
		
		Collection empresas = null;
		
		empresas = EmpresaDAO.listarCidades();
		
		return empresas;
		
	}
	
	public static Collection listarCondicoes() {
		
		Collection empresas = null;
		
		empresas = EmpresaDAO.listarCondicoes();
		
		return empresas;
		
	}
	
	public static Collection pesquisar( EmpresaTO empresa ) {
		
		Collection empresas = null;
		
		StringBuffer sql = new StringBuffer();
		
		sql.append( "select * from rel_empresa " );
		
		if ( empresa.getCodigo() != 0 ) {
			
			sql.append( "where emp_codigo = " + empresa.getCodigo() );
			
		} else {
			
			if ( Validacao.valorNulo( empresa.getNomeRazaoSocial() ) ) {
				
				if ( Validacao.valorNulo( empresa.getResponsavel() ) ) {
					
					if ( Validacao.valorNulo( empresa.getCnpjCpf() ) ) {
						
						if ( empresa.getTipo() != 0 ) {
							
							sql.append( "where tip_codigo = " + empresa.getTipo() );
							
						}
						
					} else {
						
						sql.append( "where emp_cnpj_cpf like '%"  + empresa.getCnpjCpf() + "%'" );
						
					}
					
				} else {
					
					sql.append( "where emp_responsavel like '%" + empresa.getResponsavel() + "%'" );
					
				}
				
			} else {
				
				sql.append( "where emp_nome_razao_social like '%" + empresa.getNomeRazaoSocial() + "%'" );
				
			}
			
		}
		
		empresas = EmpresaDAO.listar( sql.toString() );
		
		return empresas;
		
	}	

}