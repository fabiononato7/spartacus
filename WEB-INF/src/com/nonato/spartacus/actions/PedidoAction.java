/*
 * Created on 26/08/2005
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
import com.nonato.spartacus.bo.ItemLoteBO;
import com.nonato.spartacus.bo.PagamentoBO;
import com.nonato.spartacus.bo.PedidoBO;
import com.nonato.spartacus.bo.ProdutoBO;
import com.nonato.spartacus.dao.EmpresaDAO;
import com.nonato.spartacus.forms.EmpresaForm;
import com.nonato.spartacus.forms.ItemForm;
import com.nonato.spartacus.forms.MenuForm;
import com.nonato.spartacus.forms.PedidoForm;
import com.nonato.spartacus.to.PedidoTO;
import com.nonato.spartacus.util.BobEsponja;
import com.nonato.spartacus.util.Colecao;
import com.nonato.spartacus.util.Validacao;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class PedidoAction extends DispatchAction {
	
	public ActionForward adicionar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		ItemForm itemForm = (ItemForm) form;

		Collection carrinho = ItemBO.montar( itemForm );

		request.getSession().setAttribute( "carrinho", carrinho );
		
		target = "carrinho";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward excluirElementoCarrinho( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		ItemForm itemForm = (ItemForm) form;
		
		int item = Validacao.stringParaInteiro( itemForm.getCodigo() );

		Collection carrinho = (Collection) request.getSession().getAttribute( "carrinho" );
		
		Collection produtos = Colecao.excluir( carrinho, item );
		
		request.getSession().setAttribute( "carrinho", produtos );
		
		target = "carrinho";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward alterarElementoCarrinho( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;
				
		ItemForm itemForm = (ItemForm) form;

		Collection carrinho = ItemBO.montar( itemForm );

		request.getSession().setAttribute( "carrinho", carrinho );

		target = "carrinho";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward exibirCarrinho( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		Collection carrinho = (Collection) request.getSession().getAttribute( "carrinho" );

		target = "listar_carrinho";

		return ( mapping.findForward( target ) );
		
	}

	public ActionForward processar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;		
		
		MenuForm menuForm = (MenuForm) request.getSession().getAttribute( "menu" );
		Collection carrinho = (Collection) request.getSession().getAttribute( "carrinho" );	
		int empresa = Validacao.stringParaInteiro( menuForm.getCodigo() );
		int modo = BobEsponja.PEDIDO_NORMAL;
		
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
	
	public ActionForward listar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		Collection pedidos = PedidoBO.listar();

		request.getSession().setAttribute( "pedidos", pedidos );

		target = "listar";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward pesquisar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		PedidoForm pedidoForm = (PedidoForm) form;
		PedidoTO pedidoTO = new PedidoTO();
		BeanUtils.copyProperties( pedidoTO, pedidoForm );

		Collection pedidos = PedidoBO.pesquisar( pedidoTO );

		request.getSession().setAttribute( "pedidos", pedidos );

		target = "listar";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward listarCarrinho( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		Collection carrinho = (Collection) request.getSession().getAttribute( "carrinho" );

		target = "listar_carrinho";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward listarPorEmpresa( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		MenuForm menuForm = (MenuForm) request.getSession().getAttribute( "menu" );
		int empresa = Validacao.stringParaInteiro( menuForm.getCodigo() );
		
		Collection pedidos = PedidoBO.listarPorEmpresa( empresa );

		request.getSession().setAttribute( "pedidos", pedidos );

		target = "listar_cliente";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward notaFiscal( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		ItemForm itemForm = (ItemForm) form;
		
		int pedidoCodigo = Validacao.stringParaInteiro( itemForm.getCodigo() );
		
		PedidoForm pedido = PedidoBO.listarPorCodigo( pedidoCodigo );
		Collection pagamentos = PagamentoBO.listarPorPedido( pedidoCodigo );
		Collection itens = ItemBO.listarPorPedido( pedidoCodigo );
		Collection itensLotes = ItemLoteBO.listarPorPedido( pedidoCodigo );

		request.getSession().setAttribute( "notaPedido", pedido );
		request.getSession().setAttribute( "notaPagamentos", pagamentos );
		request.getSession().setAttribute( "notaItens", itens );
		request.getSession().setAttribute( "notaItensLotes", itensLotes );
		
		target = "nota_fiscal";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward printNotaFiscal( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		ItemForm itemForm = (ItemForm) form;
		
		int pedidoCodigo = Validacao.stringParaInteiro( itemForm.getCodigo() );
		
		PedidoForm pedido = PedidoBO.listarPorCodigo( pedidoCodigo );
		Collection pagamentos = PagamentoBO.listarPorPedido( pedidoCodigo );
		Collection itens = ItemBO.listarPorPedido( pedidoCodigo );
		Collection itensLotes = ItemLoteBO.listarPorPedido( pedidoCodigo );

		request.getSession().setAttribute( "notaPedido", pedido );
		request.getSession().setAttribute( "notaPagamentos", pagamentos );
		request.getSession().setAttribute( "notaItens", itens );
		request.getSession().setAttribute( "notaItensLotes", itensLotes );
		
		target = "imprimir_nota_fiscal";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward listarProdutos( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;
		
		MenuForm menuForm = (MenuForm) request.getSession().getAttribute( "menu" );
		
		EmpresaForm cliente = EmpresaDAO.listarPorCodigo( Validacao.stringParaInteiro( menuForm.getCodigo() ) );
		request.getSession().setAttribute( BobEsponja.USUARIO_CLIENTE, cliente );
		
		ItemForm item = new ItemForm();
		item.setPedidoEmpresa( cliente.getCodigo() );
		request.getSession().setAttribute( mapping.getAttribute(), item  );
	
		Collection produtos = ProdutoBO.listar();
		
		request.getSession().setAttribute( "produtos", produtos );

		target = "listar_produtos";

		return ( mapping.findForward( target ) );
		
	}

	public ActionForward paginarProdutos( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;
			
		Collection produtos = ProdutoBO.listar();

		request.getSession().setAttribute( "produtos", produtos );

		target = "listar_produtos";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward pesquisarProdutos( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		ItemForm itemForm = (ItemForm) form;

		Collection produtos = PedidoBO.pesquisarProdutos( itemForm );

		request.getSession().setAttribute( "produtos", produtos );

		target = "listar_produtos";

		return ( mapping.findForward( target ) );
		
	}

}
