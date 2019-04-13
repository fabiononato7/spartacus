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
<html:form action="promocao.do?acao=excluir" >
 <table>
  <tr>
   <td><label class="tabelaTituloOperacao"><bean:message key="form.promocao" /></label></td>
  </tr>
  <tr>
   <td><label class="rotulo"><bean:message key="dm.codigo" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.descricao" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.data.inicio" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.data.final" /></label></td>      
  </tr>
  <tr>
   <td><html:text property="codigo" size="15" styleClass="caixaSelecao" readonly="true" /></td>
   <td><html:text property="descricao" size="25" styleClass="caixaTexto" readonly="true" /></td>
   <td><html:text property="dataInicio" size="25" styleClass="caixaTexto" readonly="true" /></td>
   <td><html:text property="dataFinal" size="25" styleClass="caixaTexto" readonly="true" /></td>
  </tr>
 </table>
</html:form>