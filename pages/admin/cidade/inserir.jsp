<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<script type="text/javascript">
<!--

alterar.disabled = true;
excluir.disabled = true;

//-->
</script>
<script>
<!--

function validacao() {

 if ( document.forms[0].nome.value == "" ) {
 
 	alert( "Preencha o nome da cidade" );
 	document.forms[0].nome.focus();
 	return false;
 
 }

}

//-->
</script>
<html:form action="cidade.do?acao=inserir" onsubmit="javascript:return validacao()" >
 <table>
  <tr>
   <td><label class="tabelaTituloOperacao"><bean:message key="form.cidade" /></label></td>
  </tr>
  <tr>
   <td><label class="rotulo"><bean:message key="dm.codigo" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.nome" /></label></td>    
   <td><label class="rotulo"><bean:message key="dm.cep" /></label></td> 
   <td><label class="rotulo"><bean:message key="dm.estado" /></label></td>        
  </tr>
  <tr>
   <td><html:hidden property="codigo" value="0" /></d>
   <td><html:text property="nome" size="60" maxlength="60" styleClass="caixaTexto" /></td>
   <td><html:text property="cep" size="15" maxlength="9" styleClass="caixaNumero" onkeypress="formatarCep(cep)" /></td>
   <td>
	 <logic:present name="estados">
      <html:select property="estado" styleClass="caixaSelecao" >
       <html:options collection="estados" property="codigo" labelProperty="nome" />
      </html:select>
     </logic:present>
   </td>
  </tr>
 </table>
</html:form>