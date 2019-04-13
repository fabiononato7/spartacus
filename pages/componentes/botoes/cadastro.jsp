<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<table align="right">
 <tr>
  <td>
   <input type="button" name="novo" value="<bean:message key="btn.novo" />" onClick="novo()" class="botoesAzul">
  </td>
  <td>
   <input type="button" name="limpar" value="<bean:message key="btn.limpar" />" onClick="limpar()" class="botoesAzul"">
  </td>
  <td>
   <input type="button" name="gravar" value="<bean:message key="btn.gravar" />" onClick="enviar()" class="botoesAzul"">
  </td>
  <td>
   <input type="button" name="alterar" value="<bean:message key="btn.alterar" />" onClick="enviar()" class="botoesAzul"">	
  </td>
  <td>
   <input type="button" name="excluir" value="<bean:message key="btn.excluir" />" onClick="enviar()" class="botoesAzul"">
  </td>
  <td>
   <input type="button" name="abrir" value="<bean:message key="btn.abrir" />" onClick="listar()" class="botoesAzul"">
  </td>
  <td>
   <input type="button" name="imprimir" value="<bean:message key="btn.imprimir" />" onClick="" class="botoesAzul">
  </td>
  <td>
   <input type="button" name="sair" value="<bean:message key="btn.sair" />" onClick="sair()" class="botoesAzul"">
  </td>
 </tr>
</table>