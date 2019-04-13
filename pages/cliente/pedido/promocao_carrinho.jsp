<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ page import="com.nonato.spartacus.util.BobEsponja" %>
<script>
<!--

processar.disabled = true;

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
<logic:notEmpty name="carrinhoPromocao">
 <html:form action="promocao.do?acao=alterarElementoCarrinho" >
 <div align="center">
  <table>
   <tr> 
    <td class="tabelaTitulo"><bean:message key="dm.codigo" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.nome" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.preco" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.quantidade" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.quantidade" /></td>
    <td class="tabelaTituloOperacao"><bean:message key="rot.excluir" /></td>   
   </tr>
   <% String inicio = request.getParameter( "inicio" ); %>
   <logic:iterate name="carrinhoPromocao" id="relatorio" offset="<%= inicio %>" length="<%= Integer.toString( BobEsponja.PAGINADOR ) %>">   
   <tr>
    <td class="tabelaCelula"><bean:write name="relatorio" property="produto" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="produtoNome" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="produtoPreco" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="quantidade" /></td>
    <td class="tabelaCelulaCentro">
     <input type="hidden" name="produtos" value="<bean:write name="relatorio" property="produto" />">
     <input type="text" name="quantidades" value="<bean:write name="relatorio" property="quantidade" />" size="3" maxlength="3" onkeypress="somenteNumeros()" >
    </td>
    <td class="tabelaCelulaCentro">
     <a href="<%= request.getContextPath() %>/promocao.do?acao=excluirElementoCarrinho&codigo=<bean:write name="relatorio" property="produto" />">
      <img src="<html:rewrite page='/images/excluir.gif' />" border="0">
     </a>
    </td>
   </tr>
   </logic:iterate>
  </table>
 </div>
 </html:form>
</logic:notEmpty>