/*
 * Created on 22/09/2005
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

import com.nonato.spartacus.bo.ProdutoBO;
import com.nonato.spartacus.forms.ProdutoForm;
import com.nonato.spartacus.to.ProdutoTO;
import com.nonato.spartacus.util.Validacao;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ProdutoAction extends DispatchAction {

	public ActionForward inserir( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {
		
		String target;

		ProdutoForm produtoForm = (ProdutoForm) form;		
		ProdutoTO produtoTO = new ProdutoTO();
		BeanUtils.copyProperties( produtoTO, produtoForm );

		boolean sucesso = ProdutoBO.inserir( produtoTO );

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

		ProdutoForm produtoForm = (ProdutoForm) form;
		ProdutoTO produtoTO = new ProdutoTO();
		BeanUtils.copyProperties( produtoTO, produtoForm );

		boolean sucesso = ProdutoBO.alterar( produtoTO );

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

		ProdutoForm produtoForm = (ProdutoForm) form;
		ProdutoTO produtoTO = new ProdutoTO();
		BeanUtils.copyProperties( produtoTO, produtoForm );

		boolean sucesso = ProdutoBO.excluir( produtoTO );

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
	
	public ProdutoForm exibir( ActionForm form ) {

		ProdutoForm produtoForm = (ProdutoForm) form;
		
		int codigo = Validacao.stringParaInteiro( produtoForm.getCodigo() );
		
		ProdutoForm produto = ProdutoBO.listarPorCodigo( codigo );

		return produto;
		
	}	
		
	public ActionForward telaInserir( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;
		
		ProdutoForm produtoForm = new ProdutoForm();
		
		produtoForm.reset( mapping, request );
		
		/* refactory */
		request.setAttribute( "produtoForm", produtoForm );

		target = "tela_inserir";

		return ( mapping.findForward( target ) );
		
	}	
	
	public ActionForward telaAlterar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {
		
		String target;

		ProdutoForm produtoForm = exibir( form );

		request.getSession().setAttribute( "produtoForm", produtoForm );

		target = "tela_alterar";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward telaExcluir( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		ProdutoForm produtoForm = exibir( form );

		request.getSession().setAttribute( "produtoForm", produtoForm );

		target = "tela_excluir";

		return ( mapping.findForward( target ) );
		
	}
		
	public ActionForward listar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		Collection produtos = ProdutoBO.listar();

		request.getSession().setAttribute( "produtos", produtos );

		target = "listar";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward consultar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		Collection produtos = ProdutoBO.listar();

		request.getSession().setAttribute( "produtos", produtos );

		target = "consultar";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward listarEmpresa( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;
				
		Collection empresas = ProdutoBO.listarLaboratorios();
		
		request.getSession().setAttribute( "empresas", empresas );

		target = "listar_empresa";

		return ( mapping.findForward( target ) );
		
	}	
	
	public ActionForward pesquisar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		ProdutoForm produtoForm = (ProdutoForm) form;
		ProdutoTO produtoTO = new ProdutoTO();
		BeanUtils.copyProperties( produtoTO, produtoForm );

		Collection produtos = ProdutoBO.pesquisar( produtoTO );

		request.getSession().setAttribute( "produtos", produtos );

		target = "listar";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward pesquisarConsulta( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		ProdutoForm produtoForm = (ProdutoForm) form;
		ProdutoTO produtoTO = new ProdutoTO();
		BeanUtils.copyProperties( produtoTO, produtoForm );

		Collection produtos = ProdutoBO.pesquisar( produtoTO );

		request.getSession().setAttribute( "produtos", produtos );

		target = "consultar";

		return ( mapping.findForward( target ) );
		
	}
		
}