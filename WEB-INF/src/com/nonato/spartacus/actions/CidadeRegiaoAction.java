/*
 * Created on 21/08/2005
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
import com.nonato.spartacus.bo.CidadeRegiaoBO;
import com.nonato.spartacus.forms.CidadeRegiaoForm;
import com.nonato.spartacus.forms.RegiaoForm;
import com.nonato.spartacus.to.CidadeRegiaoTO;
import com.nonato.spartacus.util.Validacao;

/**
 * @author Nonato
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class CidadeRegiaoAction extends DispatchAction {
		
	public ActionForward inserir( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		CidadeRegiaoForm cidadeRegiaoForm = (CidadeRegiaoForm) form;
		CidadeRegiaoTO cidadeRegiaoTO = new CidadeRegiaoTO();
		BeanUtils.copyProperties( cidadeRegiaoTO, cidadeRegiaoForm );

		boolean sucesso = CidadeRegiaoBO.inserir( cidadeRegiaoTO );

		if ( sucesso == true ) {
						
			ActionMessages messages = new ActionMessages();
			messages.add( "operacao", new ActionMessage( "op.inserir.ok" ) );
			saveMessages( request, messages );
						
		} else {
			
			ActionErrors errors = new ActionErrors();
			errors.add( "erro", new ActionError( "op.inserir.erro" ) );
			saveErrors( request, errors );
			
		}

		target = "listar_cidades";

		return ( mapping.findForward( target ) );
		
	}	
	
	public ActionForward alterar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		CidadeRegiaoForm cidadeRegiaoForm = (CidadeRegiaoForm) form;
		CidadeRegiaoTO cidadeRegiaoTO = new CidadeRegiaoTO();
		BeanUtils.copyProperties( cidadeRegiaoTO, cidadeRegiaoForm );
		
		boolean sucesso = CidadeRegiaoBO.alterar( cidadeRegiaoTO );

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

		CidadeRegiaoForm cidadeRegiaoForm = (CidadeRegiaoForm) form;
		CidadeRegiaoTO cidadeRegiaoTO = new CidadeRegiaoTO();
		BeanUtils.copyProperties( cidadeRegiaoTO, cidadeRegiaoForm );
		
		boolean sucesso = CidadeRegiaoBO.excluir( cidadeRegiaoTO );

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
	
	public CidadeRegiaoForm exibir( ActionForm form ) {

		CidadeRegiaoForm cidadeRegiaoForm = (CidadeRegiaoForm) form;
		
		int cidade = Validacao.stringParaInteiro( cidadeRegiaoForm.getCidade() );
		int regiao = Validacao.stringParaInteiro( cidadeRegiaoForm.getRegiao() );
	
		CidadeRegiaoForm cidadeRegiao = CidadeRegiaoBO.listarPorCodigo( cidade, regiao );

		return cidadeRegiao;
		
	}	
	
	public ActionForward telaAdicionar( ActionMapping mapping, ActionForm cidade,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;
		
		RegiaoForm regiaoForm = (RegiaoForm) request.getSession().getAttribute( "regiao" );
		
		Collection cidades = CidadeBO.listarNaoRelacionados( Validacao.stringParaInteiro( regiaoForm.getCodigo() ) );

		request.getSession().setAttribute( "cidades", cidades );		

		target = "tela_adicionar";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward telaAlterar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		CidadeRegiaoForm cidadeRegiaoForm = exibir( form );

		request.getSession().setAttribute( "cidadeRegiaoForm", cidadeRegiaoForm );

		target = "tela_alterar";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward telaExcluir( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		CidadeRegiaoForm cidadeRegiaoForm = exibir( form );

		request.getSession().setAttribute( "cidadeRegiaoForm", cidadeRegiaoForm );

		target = "tela_excluir";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward listar( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;

		Collection cidadesRegioes = CidadeRegiaoBO.listar();

		request.getSession().setAttribute( "cidadesRegioes", cidadesRegioes );

		target = "listar";

		return ( mapping.findForward( target ) );
		
	}
	
	public ActionForward listarCidades( ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response ) 
			throws Exception {

		String target;
		
		RegiaoForm regiaoForm = (RegiaoForm) request.getSession().getAttribute( "regiao" );

		Collection cidadesRegioes = CidadeRegiaoBO.listarPorRegiao( Validacao.stringParaInteiro( regiaoForm.getCodigo() ) );

		request.getSession().setAttribute( "cidades", cidadesRegioes );		

		target = "listar";

		return ( mapping.findForward( target ) );
		
	}
	
}