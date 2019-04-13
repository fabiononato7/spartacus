<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<table>
 <tr>
  <td>
   <a href="<%= request.getContextPath() %>/relatorio.do?acao=listarClientesEmDebito">
    <bean:message key="msg.relatorio.clientes.debito" />
   </a>
  </td>
 </tr>
 <tr>
  <td>
   <a href="<%= request.getContextPath() %>/relatorio.do?acao=listarProdutosMaisVendidos">
    <bean:message key="msg.relatorio.produtos.vendido" />
   </a>
  </td>
 </tr>
 <tr>
  <td>
   <a href="<%= request.getContextPath() %>/relatorio.do?acao=listarVendasPorRegiao">
    <bean:message key="msg.relatorio.vendas.regiao" />
   </a>
  </td>
 </tr>
</table>