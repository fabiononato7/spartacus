<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<html:form name="pesquisaPromocao" type="com.nonato.spartacus.forms.PromocaoForm" action="promocao.do?acao=pesquisar">
 <table>
  <tr>
   <td><label class="rotulo"><bean:message key="dm.codigo" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.descricao" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.data.inicio" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.data.final" /></label></td>      
  </tr>
  <tr>
   <td><html:text property="codigo" size="15" maxlength="3" styleClass="caixaNumero" onkeypress="somenteNumeros()" /></td>
   <td><html:text property="descricao" size="25" maxlength="20" styleClass="caixaTexto" /></td>
   <td><html:text property="dataInicio" size="25" maxlength="10" onkeypress="formatarData(dataInicio)" styleClass="caixaTexto" /></td>
   <td><html:text property="dataFinal" size="25" maxlength="10" onkeypress="formatarData(dataFinal)" styleClass="caixaTexto" /></td>
  </tr>
 </table>
</html:form>