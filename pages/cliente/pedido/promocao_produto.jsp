<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ page import="com.nonato.spartacus.util.BobEsponja" %>
<script>
<!--

processar.disabled = true;
carrinho.disabled = true;

-->
</script>
<script>
<!--

function adicionar() {
 
 acao( document.forms["produtoPromocaoForm"] );
 
}

function enviar() {
 
 acao( document.forms["produtoPromocaoForm"] );
 
}

-->
</script>
<logic:notEmpty name="produtos">
 <html:form action="produtoPromocao.do?acao=adicionarPedido" >
 <div align="center">
  <table>
   <tr> 
    <td class="tabelaTitulo"><bean:message key="dm.produto" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.nome" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.preco" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.desconto" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.valor" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.quantidade" /></td>  
   </tr>
   <% String inicio = request.getParameter( "inicio" ); %>
   <logic:iterate name="produtos" id="relatorio" offset="<%= inicio %>" length="<%= Integer.toString( BobEsponja.PAGINADOR ) %>">
   <tr>
    <td class="tabelaCelula"><bean:write name="relatorio" property="produto" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="produtoNome" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="produtoPreco" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="desconto" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="valor" /></td>
    <td class="tabelaCelulaCentro">
     <input type="hidden" name="produtos" value="<bean:write name="relatorio" property="produto" />">
     <html:text property="quantidades" value="" size="5" maxlength="3" onkeypress="somenteNumeros()" />
    </td>
   </tr>
   </logic:iterate>
  </table>
 </div>
 </html:form>
</logic:notEmpty>