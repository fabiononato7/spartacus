
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

import com.nonato.spartacus.bo.ItemBO;
import com.nonato.spartacus.bo.PedidoBO;
import com.nonato.spartacus.bo.PromocaoBO;

import com.nonato.spartacus.forms.MenuForm;
import com.nonato.spartacus.forms.ProdutoPromocaoForm;
import com.nonato.spartacus.forms.PromocaoForm;
import com.nonato.spartacus.to.PromocaoTO;
import com.nonato.spartacus.util.BobEsponja;

import com.nonato.spartacus.util.Validacao;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class PromocaoAction extends DispatchAction {

	public ActionForward inserir( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {
		
		String target;

		PromocaoForm promocaoForm = (PromocaoForm) form;
		PromocaoTO promocaoTO = new PromocaoTO();
		BeanUtils.copyProperties( promocaoTO, promocaoForm );

		boolean sucesso = PromocaoBO.inserir( promocaoTO );

		if ( sucesso == true ) {
						
			ActionMessages messages = new ActionMessages();
			messages.add( "operacao", new ActionMessage( "op.inserir.ok" ) );
			saveMessages( request, messages );
						
		} else {
			
			ActionErrors errors = new ActionErrors();
			errors.add( "erro", new ActionError( "op.inserir.erro" ) );
			saveErrors( request, errors );
			
		}

		target = "tela_inserir";

		return ( mapping.findForward( target ) );
		
	}	
	
	public ActionForward alterar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		PromocaoForm promocaoForm = (PromocaoForm) form;
		PromocaoTO promocaoTO = new PromocaoTO();
		BeanUtils.copyProperties( promocaoTO, promocaoForm );

		boolean sucesso = PromocaoBO.alterar( promocaoTO );

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

		PromocaoForm promocaoForm = (PromocaoForm) form;
		PromocaoTO promocaoTO = new PromocaoTO();
		BeanUtils.copyProperties( promocaoTO, promocaoForm );

		boolean sucesso = PromocaoBO.excluir( promocaoTO );

		if ( sucesso == true ) {
			
			ActionMessages messages = new ActionMessages();
			messages.add( "operacao", new ActionMessage( "op.excluir.ok" ) );
			saveMessages( request, messages );
			
		} else {
			
			ActionErrors errors = new ActionErrors();
			errors.add( "erro", new ActionError( "op.excluir.erro" ) );
			saveErrors( request, errors );
			
		}

		target = "tela_excluir";

		return ( mapping.findForward( target ) );
		
	}	
	
	public PromocaoForm exibir( ActionForm form ) {

		PromocaoForm promocaoForm = (PromocaoForm) form;
		
		int codigo = Validacao.stringParaInteiro( promocaoForm.getCodigo() );
		
		PromocaoForm promocao = PromocaoBO.listarPorCodigo( codigo );

		return promocao;
		
	}	
	
	public ActionForward telaInserir( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;
		
		PromocaoForm promocaoForm = new PromocaoForm();
		
		promocaoForm.reset( mapping, request );
		
		request.getSession().setAttribute( "promocaoForm", promocaoForm );	

		target = "tela_inserir";

		return ( mapping.findForward( target ) );
		
	}	
	
	public ActionForward telaAlterar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {
		
		String target;

		PromocaoForm promocaoForm = exibir( form );

		request.getSession().setAttribute( "promocaoForm", promocaoForm );

		target = "tela_alterar";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward telaExcluir( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		PromocaoForm promocaoForm = exibir( form );

		request.getSession().setAttribute( "promocaoForm", promocaoForm );

		target = "tela_excluir";

		return ( mapping.findForward( target ) );
		
	}
		
	public ActionForward listar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		Collection promocoes = PromocaoBO.listar();

		request.getSession().setAttribute( "promocoes", promocoes );

		target = "listar";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward pesquisar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		PromocaoForm promocaoForm = (PromocaoForm) form;
		PromocaoTO promocaoTO = new PromocaoTO();
		BeanUtils.copyProperties( promocaoTO, promocaoForm );

		Collection promocoes = PromocaoBO.pesquisar( promocaoTO );

		request.getSession().setAttribute( "promocoes", promocoes );

		target = "listar";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward listarProdutos( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {
		
		String target;

		PromocaoForm promocaoForm = (PromocaoForm) form;
		
		PromocaoForm promocao = PromocaoBO.listarPorCodigo( Validacao.stringParaInteiro( promocaoForm.getCodigo() ) );

		request.getSession().setAttribute( "promocao", promocao );

		target = "listar_produtos";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward listarValidos( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {
		
		String target;
		
		Collection promocoes = PromocaoBO.listarPorDataFinal();
		
		request.getSession().setAttribute( "promocoes", promocoes );

		target = "listar_validos";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward listarProdutosParaPedido( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {
		
		String target;

		PromocaoForm promocaoForm = (PromocaoForm) form;

		request.getSession().setAttribute( "promocao", promocaoForm );

		target = "listar_produtos_pedido";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward adicionar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		ProdutoPromocaoForm produtoPromocaoForm = (ProdutoPromocaoForm) request.getSession().getAttribute( "produtoPromocao" );
		
		Collection carrinho = ItemBO.montar( produtoPromocaoForm );

		request.getSession().setAttribute( "carrinhoPromocao", carrinho );
		
		target = "listar_carrinho";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward processar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;		

		MenuForm menuForm = (MenuForm) request.getSession().getAttribute( "menu" );
		Collection carrinho = (Collection) request.getSession().getAttribute( "carrinhoPromocao" );	
		int empresa = Validacao.stringParaInteiro( menuForm.getCodigo() );
		int modo = BobEsponja.PEDIDO_PROMOCAO;

		boolean sucesso = PedidoBO.processar( empresa, carrinho, modo  );
		
		if ( sucesso == true ) {
			
			ActionMessages messages = new ActionMessages();
			messages.add( "operacao", new ActionMessage( "op.pedido.ok" ) );
			saveMessages( request, messages );
			
		} else {
			
			ActionErrors errors = new ActionErrors();
			errors.add( "erro", new ActionError( "op.pedido.erro" ) );
			saveErrors( request, errors );
			
		}

		target = "listar_filtro_empresa";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward listarCarrinho( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		Collection carrinho = (Collection) request.getSession().getAttribute( "carrinhoPromocao" );

		target = "listar_carrinho_exibir";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward pesquisarPromocoes( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {
		
		String target;
		
		PromocaoForm promocaoForm = (PromocaoForm) form;
		PromocaoTO promocaoTO = new PromocaoTO();
		BeanUtils.copyProperties( promocaoTO, promocaoForm );
		
		Collection promocoes = PromocaoBO.pesquisar( promocaoTO );
		
		request.getSession().setAttribute( "promocoes", promocoes );

		target = "listar_validos";

		return ( mapping.findForward( target ) );
		
	}
		
}
