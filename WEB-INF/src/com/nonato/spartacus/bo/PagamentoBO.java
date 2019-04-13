/*
 * Created on 25/08/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nonato.spartacus.bo;

import java.util.Collection;

import com.nonato.spartacus.dao.PagamentoDAO;
import com.nonato.spartacus.dao.PedidoDAO;
import com.nonato.spartacus.forms.PagamentoForm;
import com.nonato.spartacus.to.PagamentoTO;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class PagamentoBO {

	public static boolean inserir( PagamentoTO pagamento ) {
		
		boolean sucesso = false;
		
		sucesso = PagamentoDAO.inserir( pagamento );
		
		return sucesso;
		
	}
	
	public static boolean alterar( PagamentoTO pagamento ) {
		
		boolean sucesso = false;
		
		sucesso = PagamentoDAO.alterar( pagamento );
		
		return sucesso;
		
	}
	
	public static boolean excluir( PagamentoTO pagamento ) {
		
		boolean sucesso = false;
		
		sucesso = PagamentoDAO.excluir( pagamento );
		
		return sucesso;
		
	}

	public static Collection listar() {
		
		Collection pagamentos = null;
		
		pagamentos = PagamentoDAO.listar();
		
		return pagamentos;
		
	}
	
	public static PagamentoForm listarPorCodigo( int pagamento ) {
		
		PagamentoForm pagamentoForm = null;
		
		pagamentoForm = PagamentoDAO.listarPorCodigo( pagamento );
		
		return pagamentoForm;
		
	}
	
	public static Collection listarPorPedido( int pedido ) {
		
		Collection pagamentos = null;
		
		pagamentos = PagamentoDAO.listarPorPedido( pedido );
		
		return pagamentos;
		
	}
	
	public static boolean gerar( int pedido, int modo ) {
		
		boolean sucesso = false;
		
		boolean calcular = PedidoDAO.calcular( pedido, modo );
		
		if ( calcular == true ) {
			
			sucesso = PagamentoDAO.gerar( pedido );
			
		} else {
			
			return sucesso == false;
			
		}
		
		return sucesso;
		
	}	
	
	public static Collection pesquisar( PagamentoTO pagamento ) {
		
		Collection pagamentos = null;
		
		StringBuffer sql = new StringBuffer();
		
		sql.append( "select * from rel_pagamento " );
		
		if ( pagamento.getCodigo() != 0 ) {
			
			sql.append( "where pag_codigo = " + pagamento.getCodigo() );
			
		} else {
			
			
			
		}
		
		pagamentos = PagamentoDAO.listar( sql.toString() );
		
		return pagamentos;
		
	}	

}