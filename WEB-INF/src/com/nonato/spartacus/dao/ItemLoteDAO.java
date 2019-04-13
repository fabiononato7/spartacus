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
import java.util.ArrayList;
import java.util.Collection;

import com.nonato.spartacus.forms.ItemLoteForm;
import com.nonato.spartacus.to.ItemLoteTO;
import com.nonato.spartacus.util.JDBCBase;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ItemLoteDAO extends JDBCBase {

	public static boolean inserir( ItemLoteTO itemLote ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;		
		String sql = null;
		
		boolean sucesso = false;
		
		try {			

			sql = "insert into tab_item_lote (ite_codigo, lot_codigo, il_quantidade) values( ?, ?, ? )";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, itemLote.getItem() );
			ps.setInt( 2, itemLote.getLote() );
			ps.setInt( 3, itemLote.getQuantidade() );
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
		
	public static Collection listarPorPedido( int pedido ) {
		
		Connection con = getConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;		
		String sql = null;
		Collection itensLotes = null;
		
		try {			

			sql = "select * from rel_item_lote where ped_codigo = ? order by pro_nome, lot_descricao";
							
			ps = con.prepareStatement( sql );
			ps.setInt( 1, pedido );
			rs = ps.executeQuery();	
			itensLotes = new ArrayList();
			
			while ( rs.next() ) {
				
				ItemLoteForm form = new ItemLoteForm();
				
				form.setItem( rs.getString( "ite_codigo" ) );
				form.setProduto( rs.getString( "pro_codigo" ) );
				form.setProdutoNome( rs.getString( "pro_nome" ) );
				form.setProdutoPreco( rs.getString( "pro_preco" ) );
				form.setProdutoUnidadeSigla( rs.getString( "uni_sigla" ) );
				form.setItemQuantidade( rs.getString( "ite_quantidade" ) );
				form.setLote( rs.getString( "lot_codigo" ) );
				form.setLoteDescricao( rs.getString( "lot_descricao" ) );
				form.setQuantidade( rs.getString( "il_quantidade" ) );
				
				itensLotes.add( form );
								
			}
			
			return itensLotes;
		
		} catch ( SQLException se ) {
			
			System.out.println( "Erro: " + se.toString() );	
			se.printStackTrace();
						
		} catch ( Exception e ) {
			
			System.out.println( "Erro: " + e.toString() );
			e.printStackTrace();
			
        } finally {
			
			fecharConexao( con, ps, rs );
			
		} 
        
        return itensLotes;
		
	}
	
}