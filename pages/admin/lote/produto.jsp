<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ page import="com.nonato.spartacus.util.BobEsponja" %>
<logic:notEmpty name="produtos">
 <html:form action="lote.do?acao=exportarProduto" >
 <div align="center">
  <table>
   <tr> 
    <td class="tabelaTitulo"><bean:message key="dm.codigo" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.nome" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.preco" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.unidade" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.laboratorio" /></td>
    <td class="tabelaTituloOperacao"><bean:message key="rot.selecionar" /></td>
   </tr>
   <% String inicio = request.getParameter( "inicio" ); %>
   <logic:iterate name="produtos" id="relatorio" offset="<%= inicio %>" length="<%= Integer.toString( BobEsponja.PAGINADOR ) %>">
   <tr>
    <td class="tabelaCelula"><bean:write name="relatorio" property="produto" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="produtoNome" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="produtoPreco" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="produtoUnidadeSigla" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="produtoEmpresaNome" /></td>
    <td class="tabelaCelulaCentro">
     <a href="<%= request.getContextPath() %>/lote.do?acao=telaInserir&produto=<bean:write name="relatorio" property="produto" />&produtoNome=<bean:write name="relatorio" property="produtoNome" />">
      <img src="<html:rewrite page='/images/selecionar.gif' />" border="0"> 
     </a>
    </td>
   </tr>
   </logic:iterate>
  </table>
 </html:form>
</logic:notEmpty>