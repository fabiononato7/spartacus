/*
 * Created on 23/08/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nonato.spartacus.util;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public interface BobEsponja {

	String ARQUIVO_BANCO = "c:\\work\\spartacus\\Spartacus.ini";
	
	String USUARIO_CLIENTE = "CLIENTE";
	String USUARIO_ADMINISTRADOR = "ADMINISTRADOR";
	String USUARIO_REPRESENTANTE = "REPRESENTANTE";
	String USUARIO_FORNECEDOR = "FORNECEDOR";
	
	int ADMINISTRADOR = 4;
	int CLIENTE = 1;
	int FORNECEDOR = 2;
	int REPRESENTANTE = 3;
			
	int PEDIDO_NORMAL = 0;
	int PEDIDO_PROMOCAO = 1;
	
	int PAGINADOR = 5;
	
}
