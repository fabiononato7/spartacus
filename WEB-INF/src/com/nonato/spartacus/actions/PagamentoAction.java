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

import com.nonato.spartacus.bo.PagamentoBO;
import com.nonato.spartacus.forms.PagamentoForm;
import com.nonato.spartacus.to.PagamentoTO;
import com.nonato.spartacus.util.Validacao;


/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class PagamentoAction extends DispatchAction {
	
	public ActionForward alterar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		PagamentoForm pagamentoForm = (PagamentoForm) form;
		PagamentoTO pagamentoTO = new PagamentoTO();
		BeanUtils.copyProperties( pagamentoTO, pagamentoForm );

		boolean sucesso = PagamentoBO.alterar( pagamentoTO );

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

		PagamentoForm pagamentoForm = (PagamentoForm) form;
		PagamentoTO pagamentoTO = new PagamentoTO();
		BeanUtils.copyProperties( pagamentoTO, pagamentoForm );

		boolean sucesso = PagamentoBO.excluir( pagamentoTO );

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
	
	public PagamentoForm exibir( ActionForm form ) {
		
		PagamentoForm pagamentoForm = (PagamentoForm) form;
		
		int codigo = Validacao.stringParaInteiro( pagamentoForm.getCodigo() );
				
		PagamentoForm pagamento = PagamentoBO.listarPorCodigo( codigo );

		return pagamento;
		
	}	
	
	public ActionForward telaInserir( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		PagamentoForm pagamentoForm = new PagamentoForm();
		
		pagamentoForm.reset( mapping, request );
		
		request.setAttribute( "pagamentoForm", pagamentoForm );
		
		target = "tela_inserir";

		return ( mapping.findForward( target ) );
		
	}	
	
	public ActionForward telaAlterar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {
		
		String target;

		PagamentoForm pagamentoForm = exibir( form );

		request.getSession().setAttribute( "pagamento", pagamentoForm );
		request.getSession().setAttribute( mapping.getAttribute(), pagamentoForm );

		target = "tela_alterar";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward telaExcluir( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		PagamentoForm pagamentoForm = exibir( form );

		request.getSession().setAttribute( "pagamento", pagamentoForm );
		request.getSession().setAttribute( mapping.getAttribute(), pagamentoForm );

		target = "tela_excluir";

		return ( mapping.findForward( target ) );
		
	}
		
	public ActionForward listar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		Collection pagamentos = PagamentoBO.listar();

		request.getSession().setAttribute( "pagamentos", pagamentos );

		target = "listar";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward pesquisar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		PagamentoForm pagamentoForm = (PagamentoForm) form;
		PagamentoTO pagamentoTO = new PagamentoTO();
		BeanUtils.copyProperties( pagamentoTO, pagamentoForm );

		Collection pagamentos = PagamentoBO.pesquisar( pagamentoTO );

		request.getSession().setAttribute( "pagamentos", pagamentos );

		target = "listar";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward pesquisarConsulta( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		PagamentoForm pagamentoForm = (PagamentoForm) form;
		PagamentoTO pagamentoTO = new PagamentoTO();
		BeanUtils.copyProperties( pagamentoTO, pagamentoForm );

		Collection pagamentos = PagamentoBO.pesquisar( pagamentoTO );

		request.getSession().setAttribute( "pagamentos", pagamentos );

		target = "consultar";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward consultar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		Collection pagamentos = PagamentoBO.listar();

		request.getSession().setAttribute( "pagamentos", pagamentos );

		target = "consultar";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward boletoBancario( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		PagamentoForm pagamentoForm = exibir( form );
				
		request.getSession().setAttribute( "boletoBancario", pagamentoForm );
		
		target = "boleto_bancario";

		return ( mapping.findForward( target ) );
		
	}
	
}
