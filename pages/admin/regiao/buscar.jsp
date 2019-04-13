<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<html:form name="pesquisaRegiao" type="com.nonato.spartacus.forms.RegiaoForm" action="regiao.do?acao=pesquisar">
<table>
  <tr>
   <td><label class="rotulo"><bean:message key="dm.codigo" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.descricao" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.representante" /></label></td> 
  </tr>
  <tr>
   <td><html:text property="codigo" size="15" maxlength="3" styleClass="caixaNumero" onkeypress="somenteNumeros()" /></td>
   <td><html:text property="descricao" size="60" maxlength="60" styleClass="caixaTexto" /></td>    
   <td><html:text property="empresaNome" size="60" maxlength="60" styleClass="caixaTexto" /></td>
  </tr>
 </table>
</html:form>