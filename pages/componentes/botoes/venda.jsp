<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<table align="right">
 <tr>
  <td>
   <input type="button" name="adicionar" value="<bean:message key="btn.adicionar" />" onClick="adicionar()" class="botoesAzul">
  </td>
  <td>
   <input type="button" name="processar" value="<bean:message key="btn.processar" />" onClick="enviar()" class="botoesAzul">
  </td>
  <td>
   <input type="button" name="pesquisar" value="<bean:message key="btn.pesquisar" />" onClick="pesquisar()" class="botoesAzul">
  </td>
  <td>
   <input type="button" name="carrinho" value="<bean:message key="btn.carrinho" />" onClick="carrinho()" class="botoesAzul">
  </td>
  <td>
   <input type="button" name="sair" value="<bean:message key="btn.sair" />" onClick="principal()" class="botoesAzul">
  </td>
 </tr>
</table>