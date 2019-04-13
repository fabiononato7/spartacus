/*
 * Created on 25/08/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nonato.spartacus.bo;

import java.util.ArrayList;
import java.util.Collection;

import com.nonato.spartacus.dao.ItemDAO;
import com.nonato.spartacus.dao.ProdutoDAO;
import com.nonato.spartacus.forms.ItemForm;
import com.nonato.spartacus.forms.ProdutoForm;
import com.nonato.spartacus.forms.ProdutoPromocaoForm;

import com.nonato.spartacus.to.ItemTO;
import com.nonato.spartacus.to.ProdutoTO;
import com.nonato.spartacus.util.Validacao;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ItemBO {

	public static boolean inserir( ItemTO item ) {
		
		boolean sucesso = false;
		
		sucesso = ItemDAO.inserir( item );
		
		return sucesso;
		
	}
	
	public static Collection listarPorPedido( int pedido ) {
		
		Collection itensLotes = null;
		
		itensLotes = ItemDAO.listarPorPedido( pedido );
		
		return itensLotes;
		
	}

	public static ItemForm getItem( String produto, String quantidade ) {
		
		ItemForm itemForm = null;
		
		ProdutoTO produtoTO = new ProdutoTO();
		produtoTO.setCodigo( Validacao.stringParaInteiro( produto ) );
		
		ProdutoForm produtoForm = ProdutoDAO.listarPorCodigo( produtoTO.getCodigo() );
		
		if ( ! Validacao.objetoNulo( produtoForm ) ) {
			
			itemForm = new ItemForm();
			
			itemForm.setProduto( produtoForm.getCodigo() );
			itemForm.setProdutoNome( produtoForm.getNome() );
			itemForm.setProdutoPreco( produtoForm.getPreco() );
			itemForm.setQuantidade( quantidade );
			
			return itemForm;
			
		}
		
		return itemForm;
		
	}
	
	public static ItemForm getItem( int produto, int quantidade ) {
		
		ItemForm itemForm = null;
		
		ProdutoTO produtoTO = new ProdutoTO();
		produtoTO.setCodigo( produto );
		
		ProdutoForm produtoForm = ProdutoDAO.listarPorCodigo( produtoTO.getCodigo() );
		
		if ( ! Validacao.objetoNulo( produtoForm ) ) {
			
			itemForm = new ItemForm();
			
			itemForm.setProduto( produtoForm.getCodigo() );
			itemForm.setProdutoNome( produtoForm.getNome() );
			itemForm.setProdutoPreco( produtoForm.getPreco() );
			itemForm.setQuantidade( Integer.toString( quantidade ) );
			
			return itemForm;
			
		}
		
		return itemForm;
		
	}

	public static Collection montar( ItemForm item ) {
	
		Collection carrinho = new ArrayList();
		
		String[] produtos = item.getProdutos();
		String[] quantidades = item.getQuantidades();
				
		for ( int i = 0; i < quantidades.length; i++ ) {
			
			if ( Validacao.itemValido( quantidades[i] ) == true ) {			
	
				ItemForm itemForm = getItem( produtos[i], quantidades[i]  );
	
				carrinho.add( itemForm );
				
			}			
			
		}
		
		return carrinho;
		
	}

	public static Collection montar( ProdutoPromocaoForm produtoPromocao ) {
	
		Collection carrinho = new ArrayList();
		
		String[] produtos = produtoPromocao.getProdutos();
		String[] quantidades = produtoPromocao.getQuantidades();
				
		for ( int i = 0; i < quantidades.length; i++ ) {
			
			if ( Validacao.itemValido( quantidades[i] ) == true ) {			
	
				ItemForm itemForm = getItem( produtos[i], quantidades[i]  );
	
				carrinho.add( itemForm );
				
			}			
			
		}
		
		return carrinho;
		
	}
	
}
