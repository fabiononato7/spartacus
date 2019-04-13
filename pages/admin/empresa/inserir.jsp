<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<script type="text/javascript">
<!--

alterar.disabled = true;
excluir.disabled = true;

//-->
</script>
<html:form action="empresa.do?acao=inserir" >
 <table>
  <tr>
   <td><label class="tabelaTituloOperacao"><bean:message key="form.empresa" /></label></td>
  </tr>
 </table>
 <table>
  <tr>
    <td><label class="rotulo"><bean:message key="dm.codigo" /></label></td>
    <td><label class="rotulo"><bean:message key="dm.nome.razaosocial" /></label></td>
    <td><label class="rotulo"><bean:message key="dm.responsavel" /></label></td>
    <td><label class="rotulo"><bean:message key="dm.tipo" /></label></td>
    <td><label class="rotulo"><bean:message key="dm.cnpj.cpf" /></label></td>    
  </tr>
  <tr>
    <td>
     <html:hidden property="codigo" value="0" />
     <html:hidden property="ativo" value="1" />
    </td>
    <td><html:text property="nomeRazaoSocial" size="60" maxlength="60" styleClass="caixaTexto" /></td>
    <td><html:text property="responsavel" size="60" maxlength="60" styleClass="caixaTexto" /></td>
    <td>
     <html:select property="tipo" styleClass="caixaSelecao" >
      <html:option value="4" >ADMINISTRADOR</html:option>
	  <html:option value="1" >CLIENTE</html:option>
	  <html:option value="2" >FORNECEDOR</html:option>	
	  <html:option value="3" >REPRESENTANTE</html:option>
     </html:select>
    </td>
    <td><html:text property="cnpjCpf" size="15" maxlength="20" styleClass="caixaNumero" onkeypress="somenteNumeros()" /></td>
  </tr>
 </table>
 <table> 
  <tr>
    <td><label class="rotulo"><bean:message key="dm.endereco" /></label></td>
    <td><label class="rotulo"><bean:message key="dm.bairro.distrito" /></label></td>
    <td><label class="rotulo"><bean:message key="dm.fone.fax" /></label></td>
  </tr>
  <tr>
    <td><html:text property="endereco" size="69" maxlength="60" styleClass="caixaTexto" /></td>
    <td><html:text property="bairroDistrito" size="60" maxlength="40" styleClass="caixaTexto" /></td>
    <td><html:text property="foneFax" size="42" maxlength="12" styleClass="caixaNumero" onkeypress="formatarFoneFax(foneFax)" /></td>    
  </tr>
 </table>
 <table>
  <tr>
   <td></td>
   <td><label class="rotulo"><bean:message key="dm.cidade" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.nome" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.estado" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.cep" /></label></td>
  </tr>
  <tr>
   <td>
    <a href="<%= request.getContextPath() %>/empresa.do?acao=listarCidade">
     <img src="<html:rewrite page='/images/pasta.gif' />" border="0">
    </a>
   </td>
   <td><html:text property="cidade" size="10" readonly="true" styleClass="caixaSelecao" /></td>
   <td><html:text property="cidadeNome" size="115" readonly="true" styleClass="caixaTexto" /></td>
   <td><html:text property="cidadeEstadoSigla" size="10" readonly="true" styleClass="caixaTexto" /></td>
   <td><html:text property="cidadeCep" size="24" readonly="true" styleClass="caixaNumero" /></td>
  </tr>
 </table>
 <table>
  <tr>
   <td><label class="rotulo"><bean:message key="dm.email" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.alvara" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.inscricao.estadual" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.login.usuario" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.login.senha" /></label></td>
  </tr>
  <tr>
    <td><html:text property="email" size="69" maxlength="60" styleClass="caixaTexto" /></td>
    <td><html:text property="alvara" size="30" maxlength="30" styleClass="caixaTexto" /></td>
    <td><html:text property="inscricaoEstadual" size="23" maxlength="30" styleClass="caixaTexto" /></td>
    <td><html:text property="loginUsuario" size="17" maxlength="10" styleClass="caixaLogin" /></td>
    <td><html:password property="loginSenha" size="17" maxlength="10" styleClass="caixaLogin" /></td>   
  </tr>
 </table>
 <table>
  <tr>
    <td></td>
    <td><label class="rotulo"><bean:message key="dm.condicao" /></label></td> 
    <td><label class="rotulo"><bean:message key="dm.dias" /></label></td> 
    <td><label class="rotulo"><bean:message key="dm.juros" /></label></td> 
    <td><label class="rotulo"><bean:message key="dm.multa" /></label></td> 
    <td><label class="rotulo"><bean:message key="dm.parcelas" /></label></td>       
  </tr>
  <tr>
    <td>
     <a href="<%= request.getContextPath() %>/empresa.do?acao=listarCondicao">
      <img src="<html:rewrite page='/images/pasta.gif' />" border="0">
     </a>
    </td>
    <td><html:text property="condicao" size="10" readonly="true" styleClass="caixaSelecao" /></td>
    <td><html:text property="condicaoDias" size="48" readonly="true" styleClass="caixaNumero" /></td>
    <td><html:text property="condicaoJuros" size="30" readonly="true" styleClass="caixaNumero" /></td>
    <td><html:text property="condicaoMulta" size="30" readonly="true" styleClass="caixaNumero" /></td>
    <td><html:text property="condicaoParcelas" size="33" readonly="true" styleClass="caixaNumero" /></td>
  </tr>
 </table>
 <table>
   <tr>
    <td><label class="rotulo"><bean:message key="dm.observacao" /></label></td>  
   </tr>
   <tr>
    <td><html:textarea property="observacao" rows="5" cols="187" styleClass="caixaTexto" /></td>
   </tr>
 </table>
</html:form>