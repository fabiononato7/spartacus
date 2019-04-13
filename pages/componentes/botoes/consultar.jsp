<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<table align="right">
 <tr>
  <td>
   <input type="button" name="pesquisar" value="<bean:message key="btn.pesquisar" />" onClick="enviar()" class="botoesAzul">
  </td>
  <td>
   <input type="button" name="imprimir" value="<bean:message key="btn.imprimir" />" onClick="" class="botoesAzul">
  </td>
  <td>
   <input type="button" name="sair" value="<bean:message key="btn.sair" />" onClick="sair()" class="botoesAzul">
  </td>
 </tr>
</table>