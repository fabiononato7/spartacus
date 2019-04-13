/*
 * Created on 11/08/2005
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

import com.nonato.spartacus.bo.CidadeBO;
import com.nonato.spartacus.bo.EstadoBO;
import com.nonato.spartacus.forms.CidadeForm;

import com.nonato.spartacus.to.CidadeTO;
import com.nonato.spartacus.util.Validacao;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class CidadeAction extends DispatchAction {

	public ActionForward inserir( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		CidadeForm cidadeForm = (CidadeForm) form;
		CidadeTO cidadeTO = new CidadeTO();
		BeanUtils.copyProperties( cidadeTO, cidadeForm );

		boolean sucesso = CidadeBO.inserir( cidadeTO );

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
		
		CidadeForm cidadeForm = (CidadeForm) form;
		CidadeTO cidadeTO = new CidadeTO();
		BeanUtils.copyProperties( cidadeTO, cidadeForm );

		boolean sucesso = CidadeBO.alterar( cidadeTO );

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

		CidadeForm cidadeForm = (CidadeForm) form;
		CidadeTO cidadeTO = new CidadeTO();
		BeanUtils.copyProperties( cidadeTO, cidadeForm );

		boolean sucesso = CidadeBO.excluir( cidadeTO );

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
	
	public CidadeForm exibir( ActionForm form ) {
		
		CidadeForm cidadeForm = (CidadeForm) form;
		
		int codigo = Validacao.stringParaInteiro( cidadeForm.getCodigo() );
		
		CidadeForm cidade = CidadeBO.listarPorCodigo( codigo );

		return cidade;
		
	}	
	
	public ActionForward telaInserir( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;
		
		CidadeForm cidadeForm = new CidadeForm();
		
		cidadeForm.reset( mapping, request );
		
		request.getSession().setAttribute( "cidadeForm", cidadeForm );
		
		listarFK( request );

		target = "tela_inserir";

		return ( mapping.findForward( target ) );
		
	}	
	
	public ActionForward telaAlterar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		CidadeForm cidadeForm = exibir( form );

		request.getSession().setAttribute( "cidadeForm", cidadeForm );
		
		listarFK( request );

		target = "tela_alterar";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward telaExcluir( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		CidadeForm cidadeForm = exibir( form );

		request.getSession().setAttribute( "cidadeForm", cidadeForm );

		listarFK( request );		

		target = "tela_excluir";

		return ( mapping.findForward( target ) );
		
	}
		
	public ActionForward listar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		Collection cidades = CidadeBO.listar();

		request.getSession().setAttribute( "cidades", cidades );

		listarFK( request );

		target = "listar";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward pesquisar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		CidadeForm cidadeForm = (CidadeForm) form;
		CidadeTO cidadeTO = new CidadeTO();
		BeanUtils.copyProperties( cidadeTO, cidadeForm );

		Collection cidades = CidadeBO.pesquisar( cidadeTO );

		request.getSession().setAttribute( "cidades", cidades );

		listarFK( request );		

		target = "listar";

		return ( mapping.findForward( target ) );
		
	}
	
	public void listarFK( HttpServletRequest request ) {

		Collection estados = getEstados();

		request.getSession().setAttribute( "estados", estados );
				
	}
	
	public Collection getEstados() {

		Collection estados = EstadoBO.listar();

		return estados;
		
	}
	
}