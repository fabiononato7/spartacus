/*
 * Created on 15/09/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nonato.spartacus.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.nonato.spartacus.bo.ItemBO;
import com.nonato.spartacus.forms.ItemForm;
import com.nonato.spartacus.forms.PedidoForm;
import com.nonato.spartacus.to.ItemTO;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Colecao {

	public static boolean gravar( PedidoForm pedido, Collection produtos ) {
		
		boolean sucesso = true;
		
		Iterator it = produtos.iterator();
		
		while ( ( it.hasNext() ) && ( sucesso == true ) ) {
			
			ItemForm itemForm = (ItemForm) it.next();
			
			ItemTO itemTO = new ItemTO();			
			itemTO.setPedido( Integer.parseInt( pedido.getCodigo() ) );
			itemTO.setProduto( Integer.parseInt( itemForm.getProduto() ) );
			itemTO.setQuantidade( Integer.parseInt( itemForm.getQuantidade() ) );
			
			sucesso = ItemBO.inserir( itemTO );
			
		}
		
		return sucesso;
		
	}
	
	public static Collection alterar( Collection produtos, int item, int quantidade ) {
		/*
		ItemForm form = new ItemForm();
		form.setProduto( Integer.toString( item ) );
		form.setQuantidade( Integer.toString( quantidade ) );
		
		int indice = pesquisar( produtos, item );
		
		if ( indice != -1 ) {
			
			ArrayList lista = (ArrayList) produtos;
			
			ItemForm itemForm = localizar( produtos, item );
			
			lista.remove( itemForm );
			
			lista.add( indice, form );
			
			produtos = lista;
			
		}
		*/
		return produtos;
		
	}
	
	public static Collection excluir( Collection produtos, int item ) {
		
		ItemForm itemForm = localizar( produtos, item );
		
		produtos.remove( itemForm );
		
		return produtos;	
		
	}
	
	public static ItemForm localizar( Collection produtos, int item ) {
		
		ArrayList lista = (ArrayList) produtos;
		
		ItemForm itemForm = null;
		
		int indice = pesquisar( produtos, item );
		
		if ( indice != -1 ) {
			
			itemForm = (ItemForm) lista.get( indice );
			
			return itemForm;
			
		}
		
		return itemForm;
		
	}
	
	public static int pesquisar( Collection produtos, int item ) {
		
		int indice = -1;
		
		Iterator it = produtos.iterator();
		
		while ( it.hasNext() ) {
			
			ItemForm itemForm = (ItemForm) it.next();
			
			//if ( Validacao.stringParaInteiro( itemForm.getCodigo() ) == item ) {
			if ( itemForm.getProduto().equals( Integer.toString( item ) ) ) {
				
				ArrayList lista = (ArrayList) produtos;
				
				indice = lista.indexOf( itemForm );
				
				return indice;
				
			}
			
		}
		
		return indice;
		
	}
	
}