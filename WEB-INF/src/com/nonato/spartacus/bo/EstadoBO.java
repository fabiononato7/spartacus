/*
 * Created on 15/08/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nonato.spartacus.bo;

import java.util.Collection;

import com.nonato.spartacus.dao.EstadoDAO;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class EstadoBO {
	
	public static Collection listar() {
		
		Collection cidades = null;
		
		cidades = EstadoDAO.listar();
		
		return cidades;
		
	}
	
}