<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<html:form name="pesquisaLote" type="com.nonato.spartacus.forms.LoteForm" action="lote.do?acao=pesquisar">
 <table>
  <tr>
   <td><label class="rotulo"><bean:message key="dm.codigo" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.descricao" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.data.fabricacao" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.data.validade" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.produto" /></label></td>  
  </tr>
  <tr>
   <td><html:text property="codigo" size="15" maxlength="3" styleClass="caixaNumero" onkeypress="somenteNumeros()" /></td>
   <td><html:text property="descricao" size="20" maxlength="20" styleClass="caixaTexto" /></td>
   <td><html:text property="dataFabricacao" size="20" maxlength="10" onkeypress="formatarData(dataFabricacao)" styleClass="caixaTexto" /></td>
   <td><html:text property="dataValidade" size="20" maxlength="10" onkeypress="formatarData(dataValidade)" styleClass="caixaTexto" /></td>
   <td><html:text property="produtoNome" size="47" maxlength="40" styleClass="caixaTexto" /></td>
  </tr>
 </table>
</html:form>