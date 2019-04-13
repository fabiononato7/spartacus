/*
 * Created on 19/08/2005
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

import com.nonato.spartacus.bo.RegiaoBO;
import com.nonato.spartacus.forms.RegiaoForm;
import com.nonato.spartacus.to.RegiaoTO;
import com.nonato.spartacus.util.Validacao;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class RegiaoAction extends DispatchAction {

	public ActionForward inserir( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		RegiaoForm regiaoForm = (RegiaoForm) form;
		RegiaoTO regiaoTO = new RegiaoTO();
		BeanUtils.copyProperties( regiaoTO, regiaoForm );

		boolean sucesso = RegiaoBO.inserir( regiaoTO );

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

		RegiaoForm regiaoForm = (RegiaoForm) form;
		RegiaoTO regiaoTO = new RegiaoTO();
		BeanUtils.copyProperties( regiaoTO, regiaoForm );

		boolean sucesso = RegiaoBO.alterar( regiaoTO );

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

		RegiaoForm regiaoForm = (RegiaoForm) form;
		RegiaoTO regiaoTO = new RegiaoTO();
		BeanUtils.copyProperties( regiaoTO, regiaoForm );

		boolean sucesso = RegiaoBO.excluir( regiaoTO );

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
	
	public RegiaoForm exibir( ActionForm form ) {

		RegiaoForm regiaoForm = (RegiaoForm) form;
		
		int codigo =  Validacao.stringParaInteiro( regiaoForm.getCodigo() );
		
		RegiaoForm regiao = RegiaoBO.listarPorCodigo( codigo );

		return regiao;
		
	}	
	
	public ActionForward telaInserir( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;
		
		RegiaoForm regiaoForm = new RegiaoForm();
		
		regiaoForm.reset( mapping, request );
		
		/* refactory */
		request.setAttribute( "regiaoForm", regiaoForm );

		target = "tela_inserir";

		return ( mapping.findForward( target ) );
		
	}
		
	public ActionForward telaAlterar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		RegiaoForm regiaoForm = exibir( form );

		request.getSession().setAttribute( "regiaoForm", regiaoForm );

		target = "tela_alterar";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward telaExcluir( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		RegiaoForm regiaoForm = exibir( form );

		request.getSession().setAttribute( "regiaoForm", regiaoForm );

		target = "tela_excluir";

		return ( mapping.findForward( target ) );
		
	}
		
	public ActionForward listar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		Collection regioes = RegiaoBO.listar();

		request.getSession().setAttribute( "regioes", regioes );

		target = "listar";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward pesquisar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		RegiaoForm regiaoForm = (RegiaoForm) form;
		RegiaoTO regiaoTO = new RegiaoTO();
		BeanUtils.copyProperties( regiaoTO, regiaoForm );

		Collection regioes = RegiaoBO.pesquisar( regiaoTO );

		request.getSession().setAttribute( "regioes", regioes );

		target = "listar";

		return ( mapping.findForward( target ) );
		
	}
		
	public ActionForward listarCidades( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		RegiaoForm regiaoForm = (RegiaoForm) form;	
		
		RegiaoForm regiao = RegiaoBO.listarPorCodigo( Validacao.stringParaInteiro( regiaoForm.getCodigo() ) );

		request.getSession().setAttribute( "regiao", regiao );

		target = "listar_cidades";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward listarEmpresa( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;
		
		Collection empresas = RegiaoBO.listarRepresentantes();
		
		request.getSession().setAttribute( "empresas", empresas );

		target = "listar_empresa";

		return ( mapping.findForward( target ) );
		
	}	
	
}
