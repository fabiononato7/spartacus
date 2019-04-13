/*
 * Created on 15/08/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nonato.spartacus.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Validacao {

	public static boolean valorNulo( String str ) {
		
		boolean teste;
		
		if ( ( str == null ) || ( quantidadeMenor( str, 1 ) ) ) {
			
			return teste = true;
						
		} else {
			
			return teste = false;
			
		}
		
	}
	
	public static boolean objetoNulo( Object obj ) {
		
		boolean teste;
		
		if ( obj == null ) {
			
			return teste = true;
			
		} else {
			
			return teste = false;
			
		}
		
	}
	
	public static boolean inteiroNulo( Object obj ) {
		
		boolean teste = true;
		
		if ( ! objetoNulo( obj ) ) {
			
			try {
			
				int inteiro = Integer.parseInt( obj.toString() );
				
				return teste = false;
				
			} catch ( NumberFormatException nfe ) {
				
				return teste = true;
				
			}	
			
		}
		
		return teste;
		
	}
	
	public static boolean flutuanteNulo( Object obj ) {
		
		boolean teste = true;
		
		if ( ! objetoNulo( obj ) ) {
			
			try {
			
				double flutuante = Double.parseDouble( obj.toString() );
				
				return teste = false;
				
			} catch ( NumberFormatException nfe ) {
				
				return teste = true;
				
			}	
			
		}
		
		return teste;
		
	}
	
	public static boolean quantidadeMenor( String str, int length ) {
		
		boolean teste;
		
		if ( str.length() < length ) {
			
			return teste = true;
			
		} else {
		
			return teste = false;
			
		}		
		
	}
	
	public static int stringParaInteiro( String str ) {
		
		int resultado = 0;
		
		try {
			
			resultado = Integer.parseInt( str );
			return resultado;
			
		} catch ( NumberFormatException nfe ) {			
			
		}
		
		return resultado;
		
	}
	
	public static double stringParaFlutuante( String str ) {
		
		double resultado = 0;
		
		try {
			
			resultado = Double.parseDouble( str );
			return resultado;
			
		} catch ( NumberFormatException nfe ) {			
			
			resultado = 0;
			
		}
		
		return resultado;
		
	}
	
	public static int objetoParaInteiro( Object objeto ) {

		int resultado = 0;
		
		String str = objeto.toString();
		resultado = Integer.parseInt( str );
		
		return resultado;
		
	}
		
	public static int[] arrayStringParaArrayInteiro( String[] arrayString ) {
		
		int[] arrayInteiro = new int[arrayString.length];
		
		for ( int i = 0; i < arrayString.length; i++ ) {
			
			try {
			
				arrayInteiro[i] = Integer.parseInt( arrayString[i] );
			
			} catch ( NumberFormatException nfe ) {
				
				arrayInteiro[i] = 0;
								
			}
			
		}
		
		return arrayInteiro;
		
	}
	
	public static double[] arrayStringParaArrayFlutuante( String[] arrayString ) {
		
		double[] arrayFlutuante = new double[arrayString.length];
		
		for ( int i = 0; i < arrayString.length; i++ ) {
			
			try {
			
				arrayFlutuante[i] = Double.parseDouble( arrayString[i] );
			
			} catch ( NumberFormatException nfe ) {
				
				arrayFlutuante[i] = 0;
								
			}
			
		}
		
		return arrayFlutuante;
		
	}

	public static Timestamp stringParaData( String obj ) {
	
		String data = null;
		
		String dia = obj.substring( 0, 2 );
		String mes = obj.substring( 3, 5 );
		String ano = obj.substring( 6, 10 );
		
		data = ano + "-" + mes + "-" + dia;
		
		data += " 00:00:00.0";
		
		return Timestamp.valueOf( data );
		
	}
	
	public static String dataParaString( Timestamp obj ) {
		
		String data = null;
		
		if ( objetoNulo( obj ) ) {
			
			return "";
			
		}
				
		data = obj.toString();
				
		String ano = data.substring( 0, 4 );
		String mes = data.substring( 5, 7 );
		String dia = data.substring( 8, 10 );
		
		data = dia + "/" + mes + "/" + ano;
		
		return data;
		
	}
	
	public static String getData() {
		
		Date hoje = new Date();
		DateFormat data = new SimpleDateFormat( "dd/MM/yyyy" );
		return data.format( hoje );		
		
	}
	
	public static String getPrimeiroNome( String nome ) {
		
		StringBuffer primeiroNome = new StringBuffer();
		
		if ( valorNulo( nome ) ) {
			
			return "";
			
		}
		
		for ( int i = 0; i < nome.length(); i++ ) {
			
			char c = nome.charAt(i);
			
			if ( c != ' ' ) {
			
				primeiroNome.append( c );
				
			} else {
				
				break;
				
			}
			
		}
		
		return primeiroNome.toString();
		
	}
	
	public static boolean itemValido( String item ) {
		
		boolean teste = false;
		
		if ( ! objetoNulo( item ) ) {
			
			String str = item.trim();
			
			if ( ! str.equals( "" ) && ( ! str.equals( "0" ) ) ) {
				
				return true;
					
			} 
			
		}				
		
		return teste;
		
	}
	
	public static String converteParaReal( String valor ) {
		
		StringBuffer valorReal = new StringBuffer();
		
		char[] array = valor.toCharArray();
		char aux = 0;
		
		for ( int i = 0; i < array.length; i++ ) {
			
			if ( array[i] == '.' ) {
				
				continue;
				
			} 
			
			if ( array[i] == ',' ) {
				
				aux = '.';
				
			}
			
			aux = array[i];
			
			valorReal.append( aux );
			
		}
		
		return valorReal.toString();
		
	}
	
}