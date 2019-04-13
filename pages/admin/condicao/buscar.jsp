<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<html:form name="pesquisaCondicao" type="com.nonato.spartacus.forms.CondicaoForm" action="condicao.do?acao=pesquisar">
 <table>
  <tr>
   <td><label class="rotulo"><bean:message key="dm.codigo" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.dias" /></label></td>    
   <td><label class="rotulo"><bean:message key="dm.juros" /></label></td>    
   <td><label class="rotulo"><bean:message key="dm.multa" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.parcelas" /></label></td>        
  </tr>
  <tr>
   <td><html:text property="codigo" size="15" maxlength="3" styleClass="caixaNumero" onkeypress="somenteNumeros()" /></td>
   <td><html:text property="dias" size="20" maxlength="2" styleClass="caixaNumero" onkeypress="somenteNumeros()" /></td>
   <td><html:text property="juros" size="30" maxlength="4" styleClass="caixaNumero" /></td>
   <td><html:text property="multa" size="30" maxlength="4" styleClass="caixaNumero" /></td>
   <td><html:text property="parcelas" size="25" maxlength="2" styleClass="caixaNumero" onkeypress="somenteNumeros()" /></td>
  </tr>
 </table>
</html:form>