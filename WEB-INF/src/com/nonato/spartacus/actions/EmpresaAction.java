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

import com.nonato.spartacus.bo.EmpresaBO;
import com.nonato.spartacus.forms.EmpresaForm;
import com.nonato.spartacus.to.EmpresaTO;
import com.nonato.spartacus.util.Validacao;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class EmpresaAction extends DispatchAction {

	public ActionForward inserir( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		EmpresaForm empresaForm = (EmpresaForm) form;
		EmpresaTO empresaTO = new EmpresaTO();
		BeanUtils.copyProperties( empresaTO, empresaForm );

		boolean sucesso = EmpresaBO.inserir( empresaTO );

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

		EmpresaForm empresaForm = (EmpresaForm) form;
		EmpresaTO empresaTO = new EmpresaTO();
		BeanUtils.copyProperties( empresaTO, empresaForm );

		boolean sucesso = EmpresaBO.alterar( empresaTO );

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

		EmpresaForm empresaForm = (EmpresaForm) form;
		EmpresaTO empresaTO = new EmpresaTO();
		BeanUtils.copyProperties( empresaTO, empresaForm );

		boolean sucesso = EmpresaBO.excluir( empresaTO );

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
	
	public EmpresaForm exibir( ActionForm form ) {

		EmpresaForm empresaForm = (EmpresaForm) form;
		
		int codigo = Validacao.stringParaInteiro( empresaForm.getCodigo() );
	
		EmpresaForm empresa = EmpresaBO.listarPorCodigo( codigo );

		return empresa;
		
	}	
	
	public ActionForward telaInserir( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;
		
		EmpresaForm empresaForm = new EmpresaForm();
		
		empresaForm.reset( mapping, request );
		
		/* refactory */
		request.setAttribute( "empresaForm", empresaForm );

		target = "tela_inserir";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward telaAlterar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {
		
		String target;

		EmpresaForm empresaForm = exibir( form );

		request.getSession().setAttribute( "empresaForm", empresaForm );
		
		target = "tela_alterar";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward telaExcluir( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		EmpresaForm empresaForm = exibir( form );

		request.getSession().setAttribute( "empresaForm", empresaForm );

		target = "tela_excluir";

		return ( mapping.findForward( target ) );
		
	}

	public ActionForward listar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;
	
		Collection empresas = EmpresaBO.listar();

		request.getSession().setAttribute( "empresas", empresas );

		target = "listar";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward pesquisar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		EmpresaForm empresaForm = (EmpresaForm) form;
		EmpresaTO empresaTO = new EmpresaTO();
		BeanUtils.copyProperties( empresaTO, empresaForm );

		Collection empresas = EmpresaBO.pesquisar( empresaTO );

		request.getSession().setAttribute( "empresas", empresas );

		target = "listar";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward listarCidade( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		Collection cidades = EmpresaBO.listarCidades();
		
		request.setAttribute( "cidades", cidades );
		
		target = "listar_cidade";

		return ( mapping.findForward( target ) );
		
	}	
	
	public ActionForward listarCondicao( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;
		
		Collection condicoes = EmpresaBO.listarCondicoes();
		
		request.setAttribute( "condicoes", condicoes );

		target = "listar_condicao";

		return ( mapping.findForward( target ) );
		
	}	
	
}