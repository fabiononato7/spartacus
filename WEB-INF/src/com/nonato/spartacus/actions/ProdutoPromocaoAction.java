/*
 * Created on 23/09/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package com.nonato.spartacus.actions;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.actions.DispatchAction;

import com.nonato.spartacus.bo.PedidoBO;
import com.nonato.spartacus.bo.ProdutoBO;
import com.nonato.spartacus.bo.ProdutoPromocaoBO;
import com.nonato.spartacus.forms.ProdutoPromocaoForm;
import com.nonato.spartacus.forms.PromocaoForm;
import com.nonato.spartacus.to.ProdutoPromocaoTO;
import com.nonato.spartacus.util.Validacao;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ProdutoPromocaoAction extends DispatchAction {
	
	public ActionForward inserir( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;
		
		ProdutoPromocaoForm produtoPromocaoForm = (ProdutoPromocaoForm) form;
		
		boolean sucesso = ProdutoPromocaoBO.inserir( produtoPromocaoForm.getProdutos(), produtoPromocaoForm.getDescontos(),
			produtoPromocaoForm.getPromocao() );
		
		if ( sucesso == true ) {
						
			ActionMessages messages = new ActionMessages();
			messages.add( "operacao", new ActionMessage( "op.inserir.ok" ) );
			saveMessages( request, messages );
						
		} else {
			
			ActionErrors errors = new ActionErrors();
			errors.add( "erro", new ActionError( "op.inserir.erro" ) );
			saveErrors( request, errors );
			
		}

		target = "listar_produtos";

		return ( mapping.findForward( target ) );
		
	}	
	
	public ActionForward alterar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;
	
		ProdutoPromocaoForm produtoPromocaoForm = (ProdutoPromocaoForm) form;
		ProdutoPromocaoTO produtoPromocaoTO = new ProdutoPromocaoTO();
		BeanUtils.copyProperties( produtoPromocaoTO, produtoPromocaoForm );

		boolean sucesso = ProdutoPromocaoBO.alterar( produtoPromocaoTO );

		if ( sucesso == true ) {
			
			ActionMessages messages = new ActionMessages();
			messages.add( "operacao", new ActionMessage( "op.alterar.ok" ) );
			saveMessages( request, messages );
			
		} else {
						
			ActionErrors errors = new ActionErrors();
			errors.add( "erro", new ActionError( "op.alterar.erro" ) );
			saveErrors( request, errors );
			
		}

		target = "tela_alterar";

		return ( mapping.findForward( target ) );
		
	}	
	
	public ActionForward excluir( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;
	
		ProdutoPromocaoForm produtoPromocaoForm = (ProdutoPromocaoForm) form;
		ProdutoPromocaoTO produtoPromocaoTO = new ProdutoPromocaoTO();
		BeanUtils.copyProperties( produtoPromocaoTO, produtoPromocaoForm );

		boolean sucesso = ProdutoPromocaoBO.excluir( produtoPromocaoTO );

		if ( sucesso == true ) {
			
			ActionMessages messages = new ActionMessages();
			messages.add( "operacao", new ActionMessage( "op.alterar.ok" ) );
			saveMessages( request, messages );
			
		} else {
						
			ActionErrors errors = new ActionErrors();
			errors.add( "erro", new ActionError( "op.alterar.erro" ) );
			saveErrors( request, errors );
			
		}

		target = "tela_excluir";

		return ( mapping.findForward( target ) );
		
	}	
	
	public ProdutoPromocaoForm exibir( ActionForm form ) {

		ProdutoPromocaoForm produtoPromocaoForm = (ProdutoPromocaoForm) form;
		
		int produto = Validacao.stringParaInteiro( produtoPromocaoForm.getProduto() );
		int promocao = Validacao.stringParaInteiro( produtoPromocaoForm.getPromocao() );
	
		ProdutoPromocaoForm produtoPromocao = ProdutoPromocaoBO.listarPorCodigo( produto, promocao );

		return produtoPromocao;
		
	}	
	
	public ActionForward telaAdicionar( ActionMapping mapping, ActionForm cidade,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		PromocaoForm promocaoForm = (PromocaoForm) request.getSession().getAttribute( "promocao" );

		Collection produtos = ProdutoBO.listarNaoRelacionados( Validacao.stringParaInteiro( promocaoForm.getCodigo() ) );

		request.getSession().setAttribute( "produtos", produtos );		

		target = "tela_adicionar";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward telaAlterar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		ProdutoPromocaoForm produtoPromocaoForm = exibir( form );

		request.getSession().setAttribute( "produtoPromocaoForm", produtoPromocaoForm );
		
		target = "tela_alterar";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward telaExcluir( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		ProdutoPromocaoForm produtoPromocaoForm = exibir( form );

		request.getSession().setAttribute( "produtoPromocaoForm", produtoPromocaoForm );

		target = "tela_excluir";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward listar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		Collection produtosPromocoes = ProdutoPromocaoBO.listar();

		request.getSession().setAttribute( "produtosPromocoes", produtosPromocoes );

		target = "listar";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward listarProdutos( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;
		
		PromocaoForm promocaoForm = (PromocaoForm) request.getSession().getAttribute( "promocao" );
		
		Collection produtosPromocoes = ProdutoPromocaoBO.listarPorPromocao( Validacao.stringParaInteiro( promocaoForm.getCodigo() ) );

		request.getSession().setAttribute( "produtos", produtosPromocoes );		

		target = "listar";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward listarProdutosParaPedido( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;
		
		PromocaoForm promocaoForm = (PromocaoForm) request.getSession().getAttribute( "promocao" );
		
		Collection produtosPromocoes = ProdutoPromocaoBO.listarPorPromocao( Validacao.stringParaInteiro( promocaoForm.getCodigo() ) );

		request.getSession().setAttribute( "produtos", produtosPromocoes );		

		target = "listar_pedido";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward adicionarPedido( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		ProdutoPromocaoForm produtoPromocaoForm = (ProdutoPromocaoForm) form;
		
		request.getSession().setAttribute( "produtoPromocao", produtoPromocaoForm );

		target = "adicionar_pedido";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward pesquisarProdutos( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;
		
		ProdutoPromocaoForm ppf = (ProdutoPromocaoForm) form;
		
		Collection produtosPromocoes = PedidoBO.pesquisarProdutosEmPromocao( ppf );

		request.getSession().setAttribute( "produtos", produtosPromocoes );		

		target = "listar_pedido";

		return ( mapping.findForward( target ) );
		
	}
			
}
