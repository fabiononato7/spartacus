/*
 * Created on 08/12/2005
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

import com.nonato.spartacus.forms.ItemForm;
import com.nonato.spartacus.forms.PagamentoForm;
import com.nonato.spartacus.forms.RegiaoForm;
import com.nonato.spartacus.util.JDBCBase;
import com.nonato.spartacus.util.Validacao;

/**
 * @author XP
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class RelatorioDAO extends JDBCBase {

	public static Collection clientesEmDebito() {
		
		Connection con = getConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;		
		String sql = null;
		Collection pagamentos = null;
		
		try {			

			sql = "select * from rel_clientes_debito order by pag_data_vencimento desc";
							
			ps = con.prepareStatement( sql );
			rs = ps.executeQuery();
			pagamentos = new ArrayList();
			
			while ( rs.next() ) {
								
				PagamentoForm pagamentoForm = new PagamentoForm();
				
				pagamentoForm.setCodigo( Integer.toString( rs.getInt( "pag_codigo" ) ) );
				pagamentoForm.setDescricao( rs.getString( "pag_descricao" ) );
				pagamentoForm.setDataVencimento( Validacao.dataParaString( rs.getTimestamp( "pag_data_vencimento" ) ) );
				pagamentoForm.setValor( Double.toString( rs.getDouble( "pag_valor" ) ) );
				pagamentoForm.setPedido( Integer.toString( rs.getInt( "ped_codigo" ) ) );
				pagamentoForm.setPedidoEmpresaNome( rs.getString( "emp_nome_razao_social" ) );
				
				pagamentos.add( pagamentoForm );
				
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
	
	public static Collection produtosMaisVendidos() {
		
		Connection con = getConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;		
		String sql = null;
		Collection produtos = null;
		
		try {			

			sql = "select * from rel_produtos_mais_vendidos order by pro_nome desc";
							
			ps = con.prepareStatement( sql );
			rs = ps.executeQuery();
			produtos = new ArrayList();
			
			while ( rs.next() ) {
								
				ItemForm itemForm = new ItemForm();
				
				itemForm.setProduto( rs.getString( "pro_codigo" ) );
				itemForm.setProdutoNome( rs.getString( "pro_nome" ) );
				itemForm.setProdutoPreco( rs.getString( "pro_preco" ) );
				itemForm.setQuantidade( rs.getString( "quantidade" ) );
							
				produtos.add( itemForm );
				
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
	
	public static Collection vendasPorRegiao() {
		
		Connection con = getConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;		
		String sql = null;
		Collection vendas = null;
		
		try {			

			sql = "select * from rel_vendas_por_regiao order by reg_descricao desc";
							
			ps = con.prepareStatement( sql );
			rs = ps.executeQuery();
			vendas = new ArrayList();
			
			while ( rs.next() ) {
								
				RegiaoForm regiaoForm = new RegiaoForm();
								
				regiaoForm.setDescricao( rs.getString( "reg_descricao" ) );
				regiaoForm.setValor( rs.getString( "valor" ) );
											
				vendas.add( regiaoForm );
				
			}
			
			return vendas;
		
		} catch ( SQLException se ) {
			
			System.out.println( "Erro: " + se.toString() );	
			se.printStackTrace();
						
		} catch ( Exception e ) {
			
			System.out.println( "Erro: " + e.toString() );
			e.printStackTrace();
			
        } finally {
			
			fecharConexao( con, ps, rs );
			
		} 
        
        return vendas;
		
	}
	
}
