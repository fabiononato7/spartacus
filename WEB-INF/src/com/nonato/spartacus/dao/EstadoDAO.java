/*
 * Created on 15/08/2005
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

import com.nonato.spartacus.to.EstadoTO;
import com.nonato.spartacus.util.JDBCBase;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class EstadoDAO extends JDBCBase {

	public static Collection listar() {
		
		Connection con = getConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;		
		String sql = null;
		Collection estados = null;
		
		try {			

			sql = "select * from tab_estado order by est_nome";
							
			ps = con.prepareStatement( sql );
			rs = ps.executeQuery();
			estados = new ArrayList();
			
			while ( rs.next() ) {
				
				EstadoTO estado = new EstadoTO();
				estado.setCodigo( rs.getInt( "est_codigo" ) );
				estado.setNome( rs.getString( "est_nome" ) );
				estado.setSigla( rs.getString( "est_sigla" ) );
				
				estados.add( estado );
				
			}
			
			return estados;
		
		} catch ( SQLException se ) {
			
			System.out.println( "Erro: " + se.toString() );	
			se.printStackTrace();
						
		} catch ( Exception e ) {
			
			System.out.println( "Erro: " + e.toString() );
			e.printStackTrace();
			
        } finally {
			
			fecharConexao( con, ps, rs );
			
		} 
        
        return estados;
		
	}
	
}
