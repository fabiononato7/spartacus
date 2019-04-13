<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<html:form action="menu.do?acao=conectar">
<table align="center">
 <tr> 
  <td colspan="3">&nbsp;</td>
 </tr>
 <tr>
  <td><label class="rotulo"><bean:message key="dm.login.usuario" /></label></td>
  <td><label class="rotulo"><bean:message key="dm.login.senha" /></label></td>
  <td>&nbsp;</td>
 </tr>
  <td><html:text property="loginUsuario" styleClass="caixaLogin" /></td>
  <td><html:password property="loginSenha" styleClass="caixaLogin" /></td>
  <td><html:submit styleClass="botoesLogin" ><bean:message key="btn.conectar" /></html:submit></td>
 </tr>
 <tr> 
  <td colspan="3">&nbsp;</td>
 </tr>
</table>
</html:form>
