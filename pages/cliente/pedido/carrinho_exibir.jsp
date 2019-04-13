<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<script>
<!--

adicionar.disabled = true;

-->
</script>
<script>
<!--

function adicionar() {
 
 acao( document.forms["itemForm"] );
 
}

function enviar() {
 
 acao( document.forms["itemForm"] );
 
}

-->
</script>
<%@ page import="com.nonato.spartacus.util.BobEsponja" %>
<logic:notEmpty name="carrinho">
 <html:form action="pedido.do?acao=processar" >
 <div align="center">
  <table>
   <tr> 
    <td class="tabelaTitulo"><bean:message key="dm.codigo" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.nome" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.preco" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.quantidade" /></td>   
   </tr>
   <% String inicio = request.getParameter( "inicio" ); %>
   <logic:iterate name="carrinho" id="relatorio" offset="<%= inicio %>" length="<%= Integer.toString( BobEsponja.PAGINADOR ) %>">   
   <tr>
    <td class="tabelaCelula"><bean:write name="relatorio" property="produto" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="produtoNome" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="produtoPreco" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="quantidade" /></td>
   </tr>
   </logic:iterate>
  </table>
 </div>
 </html:form>
</logic:notEmpty>