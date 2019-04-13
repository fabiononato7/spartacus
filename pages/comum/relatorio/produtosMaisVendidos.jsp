<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<script>
<!--

function sair() {
 
 location.href = "<%=request.getContextPath()%>/menu.do?acao=principal";
 
}

//-->
</script>
<logic:notEmpty name="produtosMaisVendidos">
 <html:form action="relatorio.do?acao=listarProdutosMaisVendidos" >
 <div align="center">
  <h3><bean:message key="msg.relatorio.produtos.vendido" /></h3>
  <table>
   <tr> 
    <td class="tabelaTitulo"><bean:message key="dm.codigo" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.nome" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.preco" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.quantidade" /></td> 
   </tr>
   <logic:iterate name="produtosMaisVendidos" id="relatorio">
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