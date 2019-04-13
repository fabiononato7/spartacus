/*
 * Created on 10/08/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nonato.spartacus.util;

import java.io.FileInputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class JDBCConexao {

	private String driver;
	private String url;
	private String username;
	private String password;
	
	/**
	 * Este método adquiri uma conexão com o <code>Banco de Dados</code>
	 * @return um <code>Connection</code> referindo-se a conexão estabelecida
	 * @see #setConexao(String, String, String, String)
	 */
	public Connection getConexao() {	
		
		Connection con = null;
		
		try {
		
			Class.forName( this.getDriver() );
			con = DriverManager.getConnection( this.getUrl(),
					this.getUsername(), this.getPassword() );
			
			return con;
		
		} catch ( ClassNotFoundException cnfe ) {
			
			System.out.println( "erro: " + cnfe.toString() );
			
		} catch ( SQLException se ) {
			
			System.out.println( "erro: " + se.toString() );
			
		}
		
		return con;
		
	}

    /**
     * Este método seta os parâmetros necessários para se obter
     * uma conexão com o <code>Banco de Dados</code>
     * @param driver <em>dispositivo</em> de acesso ao <code>Banco de Dados</code> há ser carregado
     * @param url <em>caminho</em> do <code>Banco de Dados</code> há ser conectado
     * @param username <em>nome</em> do usuário no <code>Banco de Dados</code> a ser utilizado
     * @param password <em>senha</em> do usuário no <code>Banco de Dados</code> a ser utilizado
     * @see #getConexao()
     */
	public void setConexao( String driver, String url,
			String username, String password ) {
		
		this.setDriver( driver );
		this.setUrl( url );
		this.setUsername( username );
		this.setPassword( password );
	
	}
	
	public void fecharConexao( Connection con, Statement st,
			ResultSet rs ) {
		
		try {
			
			if ( rs != null ) {
				rs.close();
			}
			
			fecharConexao( con, st );
			
		} catch ( Exception e ) {
			
		} 
		
	} 
	
	/**
	 * Este método fecha os objetos <code>Connection</code>, <code>PreparedStatement</code> e
	 * <code>ResultSet</code> passados como parâmetros
	 * @param con objeto <code>Connection</code> a ser fechado
	 * @param ps objeto <code>PreparedStatement</code> a ser fechado
	 * @param rs objeto <code>ResultSet</code> a ser fechado
	 * @see #fecharConexao(Connection, PreparedStatement)
	 */
	public void fecharConexao( Connection con, PreparedStatement ps,
			ResultSet rs ) {
		
		try {
			
			if ( rs != null ) {
				rs.close();
			}
			
			fecharConexao( con, ps );
			
		} catch ( Exception e ) {
			
		} 
		
	} 
	
	/**
	 * Este método fecha os objetos <code>Connection</code>, <code>PreparedStatement</code> e
	 * <code>ResultSet</code> passados como parâmetros
	 * @param con objeto <code>Connection</code> a ser fechado
	 * @param cs objeto <code>CallableStatement</code> a ser fechado
	 * @param rs objeto <code>ResultSet</code> a ser fechado
	 * @see #fecharConexao(Connection, CallableStatement)
	 */
	public void fecharConexao( Connection con, CallableStatement cs,
			ResultSet rs ) {
		
		try {
			
			if ( rs != null ) {
				rs.close();
			}
			
			fecharConexao( con, cs );
			
		} catch ( Exception e ) {
			
		} 
		
	} 
	
	public void fecharConexao( Connection con, Statement st ) {
		
		try {
			
			if ( st != null ) {
				st.close();
			}
			
			if ( con != null ) {
				con.close();
			}
			
		} catch ( Exception e ) {
			
		}
		
	} 
	
	/**
	 * Este método fecha os objetos <code>Connection</code> e <code>PreparedStatement</code>
	 * passados como parâmetros
	 * @param con objeto <code>Connection</code> a ser fechado
	 * @param ps objeto <code>PreparedStatement</code> a ser fechado
	 */
	public void fecharConexao( Connection con, PreparedStatement ps ) {
		
		try {
			
			if ( ps != null ) {
				ps.close();
			}
			
			if ( con != null ) {
				con.close();
			}
			
		} catch ( Exception e ) {
			
		}
		
	} 

	/**
	 * Este método fecha os objetos <code>Connection</code> e <code>CallableStatement</code>
	 * passados como parâmetros
	 * @param con objeto <code>Connection</code> a ser fechado
	 * @param cs objeto <code>CallableStatement</code> a ser fechado
	 */
	public void fecharConexao( Connection con, CallableStatement cs ) {
		
		try {
			
			if ( cs != null ) {
				cs.close();
			}
			
			if ( con != null ) {
				con.close();
			}
			
		} catch ( Exception e ) {
			
		}
		
	}
	
	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getPassword() {
		return password;
	} 

	public void setPassword(String password) {
		this.password = password;
	} 
	
	public String getUrl() {
		return url;
	} 

	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	} 
	
	public void config( String arquivo ) {
		
		Properties pro = new Properties();
		
		try {
			
			FileInputStream ini = new FileInputStream( arquivo );
			pro.load( ini );
			
			setDriver( pro.getProperty( "driver" ) );
			setUrl( pro.getProperty( "url" ) );
			setUsername( pro.getProperty( "username" ) );
			setPassword( pro.getProperty( "password" ) );
			
		} catch ( Exception e ) {
			
			reset();
			
			System.out.println( "erro: " + e.toString() );
			
		}
		
	} 
	
	public void reset() {
		
		setDriver( "" );
		setUrl( "" );
		setUsername( "" );
		setPassword( "" );
		
	}
	
}