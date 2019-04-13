/*
 * Created on 08/12/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nonato.spartacus.bo;

import java.util.Collection;

import com.nonato.spartacus.dao.RelatorioDAO;

/**
 * @author XP
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class RelatorioBO {

	public static Collection clientesEmDebito() {
		
		Collection pagamentos = null;
		
		pagamentos = RelatorioDAO.clientesEmDebito();
		
		return pagamentos;
		
	}
	
	public static Collection produtosMaisVendidos() {
		
		Collection produtos = null;
		
		produtos = RelatorioDAO.produtosMaisVendidos();
		
		return produtos;
		
	}
	
	public static Collection vendasPorRegiao() {
		
		Collection vendas = null;
		
		vendas = RelatorioDAO.vendasPorRegiao();
		
		return vendas;
		
	}
	
}
