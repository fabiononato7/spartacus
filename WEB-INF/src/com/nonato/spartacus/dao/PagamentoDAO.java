/*
 * Created on 25/08/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nonato.spartacus.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import com.nonato.spartacus.forms.PagamentoForm;
import com.nonato.spartacus.to.PagamentoTO;
import com.nonato.spartacus.util.JDBCBase;
import com.nonato.spartacus.util.Validacao;


/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class PagamentoDAO extends JDBCBase {

	public static boolean inserir( PagamentoTO pagamento ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;		
		String sql = null;
		
		boolean sucesso = false;
		
		try {			

			sql = "insert into tab_pagamento (pag_descricao, pag_data_vencimento, pag_valor, ped_codigo) values( ?, ?, ?, ? )";
							
			ps = con.prepareStatement( sql );
			ps.setString( 1, pagamento.getDescricao() );
			ps.setTimestamp( 2, Validacao.stringParaData( pagamento.getDataVencimento() ) );
			ps.setDouble( 3, pagamento.getValor() );
			ps.setInt( 4, pagamento.getPedido() );
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

	public static boolean alterar( PagamentoTO pagamento ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;		
		String sql = null;
		
		boolean sucesso = false;
		
		try {			

			sql = "update tab_pagamento set pag_data_pagamento = ?, pag_valor_pago = ? where pag_codigo = ?";
							
			ps = con.prepareStatement( sql );
			ps.setTimestamp( 1, Validacao.stringParaData( pagamento.getDataPagamento() ) );
			ps.setDouble( 2, pagamento.getValorPago() );
			ps.setInt( 3, pagamento.getCodigo() );
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

	public static boolean excluir( PagamentoTO pagamento ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;		
		String sql = null;
		
		boolean sucesso = false;
		
		try {			

			sql = "delete from tab_pagamento where pag_codigo = ?";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, pagamento.getCodigo() );
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
		Collection pagamentos = null;
		
		try {			

			sql = "select * from rel_pagamento order by pag_data_vencimento asc";
							
			ps = con.prepareStatement( sql );
			rs = ps.executeQuery();
			pagamentos = new ArrayList();
			
			while ( rs.next() ) {
				
				PagamentoForm form = new PagamentoForm();
				
				form.setCodigo( Integer.toString( rs.getInt( "pag_codigo" ) ) );
				form.setDescricao( rs.getString( "pag_descricao" ) );
				form.setDataVencimento( Validacao.dataParaString( rs.getTimestamp( "pag_data_vencimento" ) ) );
				form.setDataPagamento( Validacao.dataParaString( rs.getTimestamp( "pag_data_pagamento" ) ) );				
				form.setValor( Double.toString( rs.getDouble( "pag_valor" ) ) );
				form.setValorPago( Double.toString( rs.getDouble( "pag_valor_pago" ) ) );
				form.setPedido( Integer.toString( rs.getInt( "ped_codigo" ) ) );
				form.setPedidoEmpresaNome( rs.getString( "emp_nome_razao_social" ) );
				
				pagamentos.add( form );
				
			}
			
			return pagamentos;
		
		} catch ( SQLException se ) {
			
			System.out.println( "Erro: " + se.toString() );	
			se.printStackTrace();
						
		} catch ( Exception e ) {
			
			System.out.println( "Erro: " + e.toString() );
			e.printStackTrace();
			
        } finally {
			
			fecharConexao( con, ps, rs );
			
		} 
        
        return pagamentos;
		
	}
	
	public static Collection listar( String sql ) {
		
		Connection con = getConexao();
		Statement st = null;
		ResultSet rs = null;		
		Collection pagamentos = null;
		
		try {			
							
			st = con.createStatement();
			rs = st.executeQuery( sql );
			pagamentos = new ArrayList();
			
			while ( rs.next() ) {
				
				PagamentoForm form = new PagamentoForm();
				
				form.setCodigo( Integer.toString( rs.getInt( "pag_codigo" ) ) );
				form.setDescricao( rs.getString( "pag_descricao" ) );
				form.setDataVencimento( Validacao.dataParaString( rs.getTimestamp( "pag_data_vencimento" ) ) );
				form.setDataPagamento( Validacao.dataParaString( rs.getTimestamp( "pag_data_pagamento" ) ) );				
				form.setValor( Double.toString( rs.getDouble( "pag_valor" ) ) );
				form.setValorPago( Double.toString( rs.getDouble( "pag_valor_pago" ) ) );
				form.setPedido( Integer.toString( rs.getInt( "ped_codigo" ) ) );
				form.setPedidoEmpresaNome( rs.getString( "emp_nome_razao_social" ) );
				
				pagamentos.add( form );
				
			}
			
			return pagamentos;
		
		} catch ( SQLException se ) {
			
			System.out.println( "Erro: " + se.toString() );	
			se.printStackTrace();
						
		} catch ( Exception e ) {
			
			System.out.println( "Erro: " + e.toString() );
			e.printStackTrace();
			
        } finally {
			
			fecharConexao( con, st, rs );
			
		} 
        
        return pagamentos;
		
	}	
	
	public static PagamentoForm listarPorCodigo( int pagamento ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;		
		String sql = null;
		PagamentoForm form = null;
		
		try {			

			sql = "select * from rel_boleto where pag_codigo = ?";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, pagamento );
			rs = ps.executeQuery();
			
			while ( rs.next() ) {
				
				form = new PagamentoForm();
				
				form.setCodigo( Integer.toString( rs.getInt( "pag_codigo" ) ) );
				form.setDescricao( rs.getString( "pag_descricao" ) );
				form.setDataVencimento( Validacao.dataParaString( rs.getTimestamp( "pag_data_vencimento" ) ) );
				form.setDataPagamento( Validacao.dataParaString( rs.getTimestamp( "pag_data_pagamento" ) ) );				
				form.setValor( Double.toString( rs.getDouble( "pag_valor" ) ) );
				form.setValorPago( Double.toString( rs.getDouble( "pag_valor_pago" ) ) );
				form.setPedido( Integer.toString( rs.getInt( "ped_codigo" ) ) );
				form.setPedidoDataEmissao( Validacao.dataParaString( rs.getTimestamp( "ped_data_emissao" ) ) );
				form.setPedidoEmpresaNome( rs.getString( "emp_nome_razao_social" ) );
				form.setPedidoEmpresaCnpjCpf( rs.getString( "emp_cnpj_cpf" ) );
				form.setPedidoEmpresaEndereco( rs.getString( "emp_endereco" ) );
				form.setPedidoEmpresaBairroDistrito( rs.getString( "emp_bairro_distrito" ) );
				form.setPedidoEmpresaCep( rs.getString( "cid_cep" ) );
				form.setPedidoEmpresaCidade( rs.getString( "cid_nome" ) );
				form.setPedidoEmpresaEstado( rs.getString( "est_sigla" ) );
				
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
	
	public static Collection listarPorPedido( int pedido ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;		
		String sql = null;
		Collection pagamentos = null;
		
		try {			

			sql = "select * from rel_pagamento where ped_codigo = ? order by pag_data_vencimento desc";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, pedido );
			rs = ps.executeQuery();
			pagamentos = new ArrayList();
			
			while ( rs.next() ) {
				
				PagamentoForm form = new PagamentoForm();
				
				form.setCodigo( Integer.toString( rs.getInt( "pag_codigo" ) ) );
				form.setDescricao( rs.getString( "pag_descricao" ) );
				form.setDataVencimento( Validacao.dataParaString( rs.getTimestamp( "pag_data_vencimento" ) ) );
				form.setDataPagamento( Validacao.dataParaString( rs.getTimestamp( "pag_data_pagamento" ) ) );				
				form.setValor( Double.toString( rs.getDouble( "pag_valor" ) ) );
				form.setValorPago( Double.toString( rs.getDouble( "pag_valor_pago" ) ) );
				form.setPedido( Integer.toString( rs.getInt( "ped_codigo" ) ) );
				
				pagamentos.add( form );
				
			}
			
			return pagamentos;
		
		} catch ( SQLException se ) {
			
			System.out.println( "Erro: " + se.toString() );	
			se.printStackTrace();
						
		} catch ( Exception e ) {
			
			System.out.println( "Erro: " + e.toString() );
			e.printStackTrace();
			
        } finally {
			
			fecharConexao( con, ps, rs );
			
		} 
        
        return pagamentos;
		
	}
		
	public static boolean gerar( int pedido ) {
		
		Connection con = getConexao();
		CallableStatement cs = null;		
		ResultSet rs = null;
		String sql = null;
				
		boolean sucesso = false;
		
		try {			

			sql = "execute procedure stp_pagamento_gerar( ? )";
			
			cs = con.prepareCall( sql );
			cs.setInt( 1, pedido );
			cs.executeUpdate();
			
			return sucesso = true;
		
		} catch ( SQLException se ) {
			
			System.out.println( "Erro: " + se.toString() );	
			se.printStackTrace();
						
		} catch ( Exception e ) {
			
			System.out.println( "Erro: " + e.toString() );
			e.printStackTrace();
			
        } finally {
			
			fecharConexao( con, cs );
			
		} 
		
		return sucesso;
		
	}	

}