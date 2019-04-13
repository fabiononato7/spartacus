/*
 * Created on 10/08/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nonato.spartacus.util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class JDBCBase {

	public static Connection getConexao() {
		
		JDBCConexao conexao = new JDBCConexao();
		conexao.config( BobEsponja.ARQUIVO_BANCO );
		return conexao.getConexao();
		
	}
	
	public static void fecharConexao( Connection con, Statement st,
			ResultSet rs ) {
		
		JDBCConexao conexao = new JDBCConexao();
		conexao.fecharConexao( con, st, rs );
		
	}
	
	public static void fecharConexao( Connection con, PreparedStatement ps,
			ResultSet rs ) {
		
		JDBCConexao conexao = new JDBCConexao();
		conexao.fecharConexao( con, ps, rs );
		
	}
	
	public static void fecharConexao( Connection con, CallableStatement cs,
			ResultSet rs ) {
		
		JDBCConexao conexao = new JDBCConexao();
		conexao.fecharConexao( con, cs, rs );
		
	}
		
	public static void fecharConexao( Connection con, Statement st ) {
		
		JDBCConexao conexao = new JDBCConexao();
		conexao.fecharConexao( con, st );
		
	}
	
	public static void fecharConexao( Connection con, PreparedStatement ps ) {
		
		JDBCConexao conexao = new JDBCConexao();
		conexao.fecharConexao( con, ps );
		
	}
	
	public static void fecharConexao( Connection con, CallableStatement cs ) {
		
		JDBCConexao conexao = new JDBCConexao();
		conexao.fecharConexao( con, cs );
		
	}
	
}