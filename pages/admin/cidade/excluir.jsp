<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<script type="text/javascript">
<!--

limpar.disabled = true;
gravar.disabled = true;
alterar.disabled = true;

//-->
</script>
<html:form action="cidade.do?acao=excluir" >
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
   <td><html:text property="codigo" size="15" styleClass="caixaSelecao" readonly="true" /></td>
   <td><html:text property="nome" size="60" styleClass="caixaTexto" readonly="true" /></td>
   <td><html:text property="cep" size="15" styleClass="caixaNumero" readonly="true"  /></td>
   <td><html:text property="estadoSigla" size="15" styleClass="caixaSelecao" readonly="true"  /></td>
  </tr>
 </table>
</html:form>