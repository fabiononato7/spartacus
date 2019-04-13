<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<table align="right">
 <tr>
  <td>
   <input type="button" name="novo" value="<bean:message key="btn.novo" />" onClick="novo()" class="botoesAzul">
  </td>
  <td>
   <input type="button" name="abrir" value="<bean:message key="btn.abrir" />" onClick="listar()" class="botoesAzul">
  </td>
  <td>
   <input type="button" name="pesquisar" value="<bean:message key="btn.pesquisar" />" onClick="enviar()" class="botoesAzul">
  </td>
  <td>
   <input type="button" name="imprimir" value="<bean:message key="btn.imprimir" />" onClick="" class="botoesAzul">
  </td>
  <td>
   <input type="button" name="sair" value="<bean:message key="btn.sair" />" onClick="principal()" class="botoesAzul">
  </td>
 </tr>
</table>