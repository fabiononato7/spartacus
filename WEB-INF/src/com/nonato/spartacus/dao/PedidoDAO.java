/*
 * Created on 24/08/2005
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
import java.util.Iterator;

import com.nonato.spartacus.forms.PedidoForm;
import com.nonato.spartacus.to.ItemLoteTO;
import com.nonato.spartacus.to.ItemTO;
import com.nonato.spartacus.to.PedidoTO;
import com.nonato.spartacus.util.JDBCBase;
import com.nonato.spartacus.util.BobEsponja;
import com.nonato.spartacus.util.Validacao;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class PedidoDAO extends JDBCBase {

	public static boolean inserir( PedidoTO pedido ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;		
		String sql = null;
		
		boolean sucesso = false;
		
		try {			

			sql = "insert into tab_pedido (ped_data_emissao, emp_codigo) values( ?, ? )";
							
			ps = con.prepareStatement( sql );
			ps.setTimestamp( 1, Validacao.stringParaData( pedido.getDataEmissao() ) );
			ps.setInt( 2, pedido.getEmpresa() );
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

	public static boolean alterar( PedidoTO pedido ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;		
		String sql = null;
		
		boolean sucesso = false;
		
		try {			
	
			sql = "update tab_pedido set ped_valor = ? where ped_codigo = ?";
							
			ps = con.prepareStatement( sql );
			ps.setDouble( 1, pedido.getValor() );
			ps.setInt( 2, pedido.getCodigo() );
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
	
	public static boolean excluir( PedidoTO pedido ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;		
		String sql = null;
		
		boolean sucesso = false;
		
		try {			

			sql = "delete from tab_pedido where ped_codigo = ?";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, pedido.getCodigo() );
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
		Collection pedidos = null;
		
		try {			

			sql = "select * from rel_pedido order by ped_codigo desc";
							
			ps = con.prepareStatement( sql );
			rs = ps.executeQuery();
			pedidos = new ArrayList();
			
			while ( rs.next() ) {
				
				PedidoForm pedido = new PedidoForm();
				
				pedido.setCodigo( rs.getString( "ped_codigo" ) );
				pedido.setDataEmissao( Validacao.dataParaString( rs.getTimestamp( "ped_data_emissao" ) ) );
				pedido.setDataEntrega( Validacao.dataParaString( rs.getTimestamp( "ped_data_entrega" ) ) );
				pedido.setValor( rs.getString( "ped_valor" ) );

				pedido.setEmpresa( rs.getString( "emp_codigo" ) );
				pedido.setEmpresaNome( rs.getString( "emp_nome_razao_social" ) );
				pedido.setEmpresaResponsavel( rs.getString( "emp_responsavel" ) );
				pedido.setEmpresaCnpjCpf( rs.getString( "emp_cnpj_cpf" ) );
								
				pedidos.add( pedido );
				
			}
			
			return pedidos;
		
		} catch ( SQLException se ) {
			
			System.out.println( "Erro: " + se.toString() );	
			se.printStackTrace();
						
		} catch ( Exception e ) {
			
			System.out.println( "Erro: " + e.toString() );
			e.printStackTrace();
			
        } finally {
			
			fecharConexao( con, ps, rs );
			
		} 
        
        return pedidos;
		
	}
	
	public static Collection listar( String sql ) {
		
		Connection con = getConexao();
		Statement st = null;
		ResultSet rs = null;		
		Collection pedidos = null;
		
		try {			
							
			st = con.createStatement();
			rs = st.executeQuery( sql );
			pedidos = new ArrayList();
			
			while ( rs.next() ) {
				
				PedidoForm pedido = new PedidoForm();
				
				pedido.setCodigo( rs.getString( "ped_codigo" ) );
				pedido.setDataEmissao( Validacao.dataParaString( rs.getTimestamp( "ped_data_emissao" ) ) );
				pedido.setDataEntrega( Validacao.dataParaString( rs.getTimestamp( "ped_data_entrega" ) ) );
				pedido.setValor( rs.getString( "ped_valor" ) );

				pedido.setEmpresa( rs.getString( "emp_codigo" ) );
				pedido.setEmpresaNome( rs.getString( "emp_nome_razao_social" ) );
				pedido.setEmpresaResponsavel( rs.getString( "emp_responsavel" ) );
				pedido.setEmpresaCnpjCpf( rs.getString( "emp_cnpj_cpf" ) );
								
				pedidos.add( pedido );
				
			}
			
			return pedidos;
		
		} catch ( SQLException se ) {
			
			System.out.println( "Erro: " + se.toString() );	
			se.printStackTrace();
						
		} catch ( Exception e ) {
			
			System.out.println( "Erro: " + e.toString() );
			e.printStackTrace();
			
        } finally {
			
			fecharConexao( con, st, rs );
			
		} 
        
        return pedidos;
		
	}	
				
	public static PedidoForm listarPorCodigo( int pedido ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;		
		String sql = null;
		PedidoForm form = null;
		
		try {			

			sql = "select * from rel_pedido where ped_codigo = ?";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, pedido );
			rs = ps.executeQuery();			
			
			if ( rs.next() ) {
				
				form = new PedidoForm();
				
				form.setCodigo( Integer.toString( rs.getInt( "ped_codigo" ) ) );
				form.setDataEmissao( Validacao.dataParaString( rs.getTimestamp( "ped_data_emissao" ) ) );
				form.setDataEntrega( Validacao.dataParaString( rs.getTimestamp( "ped_data_entrega" ) ) );
				form.setValor( Double.toString( rs.getDouble( "ped_valor" ) ) );
				
				form.setEmpresa( rs.getString( "emp_codigo" ) );
				form.setEmpresaNome( rs.getString( "emp_nome_razao_social" ) );
				form.setEmpresaResponsavel( rs.getString( "emp_responsavel" ) );
				form.setEmpresaCnpjCpf( rs.getString( "emp_cnpj_cpf" ) );
				
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
		
	public static Collection listarPorEmpresa( int empresa ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;		
		String sql = null;
		Collection pedidos = null;
		
		try {			

			sql = "select * from rel_pedido where emp_codigo = ? order by ped_codigo desc";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, empresa );
			rs = ps.executeQuery();
			pedidos = new ArrayList();
			
			while ( rs.next() ) {
				
				PedidoForm pedido = new PedidoForm();
				
				pedido.setCodigo( rs.getString( "ped_codigo" ) );
				pedido.setDataEmissao( Validacao.dataParaString( rs.getTimestamp( "ped_data_emissao" ) ) );
				pedido.setDataEntrega( Validacao.dataParaString( rs.getTimestamp( "ped_data_entrega" ) ) );
				pedido.setEmpresa( rs.getString( "emp_codigo" ) ); 
				pedido.setValor( rs.getString( "ped_valor" ) );
				
				pedido.setEmpresa( rs.getString( "emp_codigo" ) );
				pedido.setEmpresaNome( rs.getString( "emp_nome_razao_social" ) );
				pedido.setEmpresaResponsavel( rs.getString( "emp_responsavel" ) );
				pedido.setEmpresaCnpjCpf( rs.getString( "emp_cnpj_cpf" ) );
				
				pedidos.add( pedido );
				
			}
			
			return pedidos;
		
		} catch ( SQLException se ) {
			
			System.out.println( "Erro: " + se.toString() );	
			se.printStackTrace();
						
		} catch ( Exception e ) {
			
			System.out.println( "Erro: " + e.toString() );
			e.printStackTrace();
			
        } finally {
			
			fecharConexao( con, ps, rs );
			
		} 
        
        return pedidos;
		
	}
	
	public static PedidoForm getCodigo( int empresa, String dataEmissao ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;		
		String sql = null;
		PedidoForm form = null;
		
		try {			

			sql = "select max(ped_codigo) from tab_pedido where emp_codigo = ? and ped_data_emissao = ?";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, empresa );
			ps.setTimestamp( 2, Validacao.stringParaData( dataEmissao ) );
			rs = ps.executeQuery();			
			
			if ( rs.next() ) {
											
				int codigo = rs.getInt( 1 );
			
				form = listarPorCodigo( codigo );				
				
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

	public static boolean montar( int pedido ) {
		
		Collection itensPedidos = ItemDAO.listarParaMontagem( pedido );
		Iterator itensPedidosIT = itensPedidos.iterator();
		boolean sucesso = false;
		
		while ( itensPedidosIT.hasNext() ) {
			
			ItemTO itemTO = (ItemTO) itensPedidosIT.next();
			
			Collection itensLotes = ItemDAO.processar( itemTO );
			Iterator itensLotesIT = itensLotes.iterator();
			
			while ( itensLotesIT.hasNext() ) {
				
				ItemLoteTO itemLoteTO = (ItemLoteTO) itensLotesIT.next();
				
				sucesso = ItemLoteDAO.inserir( itemLoteTO );
				
			}		
			
		}
		
		return sucesso;
		
	}
	
	public static double getValor( int pedido, int modo ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;
		StringBuffer sb = new StringBuffer();
		double valor = 0;
		
		try {	
			
			if ( modo == BobEsponja.PEDIDO_NORMAL ) {
			
				sb.append( "select coalesce( sum( pn.pn_valor ), 0 ) " );
				sb.append( "from rel_pedido_normal pn " );
				sb.append( "where pn.ped_codigo = ?" );
				
			} else if ( modo == BobEsponja.PEDIDO_PROMOCAO ) {
				
				sb.append( "select coalesce( sum( pp.pp_valor ), 0 ) " );
				sb.append( "from rel_pedido_promocao pp " );
				sb.append( "where pp.ped_codigo = ?" );
				
			}
								
			ps = con.prepareStatement( sb.toString() );
			ps.setInt( 1, pedido );
			rs = ps.executeQuery();
				
			if ( rs.next() ) {
				
				return valor = rs.getDouble( 1 );
				
			}
		
		} catch ( SQLException se ) {
			
			System.out.println( "Erro: " + se.toString() );	
			se.printStackTrace();
						
		} catch ( Exception e ) {
			
			System.out.println( "Erro: " + e.toString() );
			e.printStackTrace();
			
	    } finally {
			
			fecharConexao( con, ps );
			
		} 
		
		return valor;
				
	}
	
	public static boolean calcular( int pedido, int modo ) {
		
		boolean alterou = false;
		
		double valor = getValor( pedido, modo );
		
		PedidoTO pedidoTO = new PedidoTO();
		pedidoTO.setCodigo( pedido );
		pedidoTO.setValor( valor );
		
		alterou = PedidoDAO.alterar( pedidoTO );
		
		return alterou;
		
	}
	
}
