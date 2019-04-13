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

import com.nonato.spartacus.bo.CondicaoBO;
import com.nonato.spartacus.forms.CondicaoForm;
import com.nonato.spartacus.to.CondicaoTO;
import com.nonato.spartacus.util.Validacao;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class CondicaoAction extends DispatchAction {

	public ActionForward inserir( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {
		
		String target;

		CondicaoForm condicaoForm = (CondicaoForm) form;
		CondicaoTO condicaoTO = new CondicaoTO();
		BeanUtils.copyProperties( condicaoTO, condicaoForm );

		boolean sucesso = CondicaoBO.inserir( condicaoTO );

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

		CondicaoForm condicaoForm = (CondicaoForm) form;
		CondicaoTO condicaoTO = new CondicaoTO();
		BeanUtils.copyProperties( condicaoTO, condicaoForm );

		boolean sucesso = CondicaoBO.alterar( condicaoTO );

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

		CondicaoForm condicaoForm = (CondicaoForm) form;
		CondicaoTO condicaoTO = new CondicaoTO();
		BeanUtils.copyProperties( condicaoTO, condicaoForm );

		boolean sucesso = CondicaoBO.excluir( condicaoTO );

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
	
	public CondicaoForm exibir( ActionForm form ) {

		CondicaoForm condicaoForm = (CondicaoForm) form;
		
		int codigo = Validacao.stringParaInteiro( condicaoForm.getCodigo() );
		
		CondicaoForm condicao = CondicaoBO.listarPorCodigo( codigo );

		return condicao;
		
	}	
	
	public ActionForward telaInserir( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;
		
		CondicaoForm condicaoForm = new CondicaoForm();
		
		condicaoForm.reset( mapping, request );
		
		request.getSession().setAttribute( "condicaoForm", condicaoForm );

		target = "tela_inserir";

		return ( mapping.findForward( target ) );
		
	}	
	
	public ActionForward telaAlterar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {
		
		String target;

		CondicaoForm condicaoForm = exibir( form );

		request.getSession().setAttribute( "condicaoForm", condicaoForm );

		target = "tela_alterar";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward telaExcluir( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		CondicaoForm condicaoForm = exibir( form );

		request.getSession().setAttribute( "condicaoForm", condicaoForm );

		target = "tela_excluir";

		return ( mapping.findForward( target ) );
		
	}
		
	public ActionForward listar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		Collection condicoes = CondicaoBO.listar();

		request.getSession().setAttribute( "condicoes", condicoes );

		target = "listar";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward pesquisar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		CondicaoForm condicaoForm = (CondicaoForm) form;
		CondicaoTO condicaoTO = new CondicaoTO();
		BeanUtils.copyProperties( condicaoTO, condicaoForm );

		Collection condicoes = CondicaoBO.pesquisar( condicaoTO );

		request.getSession().setAttribute( "condicoes", condicoes );

		target = "listar";

		return ( mapping.findForward( target ) );
		
	}
	
}
