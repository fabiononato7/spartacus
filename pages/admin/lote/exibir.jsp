<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ page import="com.nonato.spartacus.util.BobEsponja" %>
<logic:notEmpty name="lotes">
 <html:form action="lote.do?acao=exibir" >
 <div align="center">
  <table>
   <tr> 
    <td class="tabelaTitulo"><bean:message key="dm.codigo" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.descricao" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.data.fabricacao" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.data.validade" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.quantidade.produzida" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.quantidade.disponivel" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.produto" /></td>
    <td class="tabelaTituloOperacao"><bean:message key="rot.alterar" /></td>
    <td class="tabelaTituloOperacao"><bean:message key="rot.excluir" /></td>
   </tr>
   <% String inicio = request.getParameter( "inicio" ); %>
   <logic:iterate name="lotes" id="relatorio" offset="<%= inicio %>" length="<%= Integer.toString( BobEsponja.PAGINADOR ) %>">
   <tr>
    <td class="tabelaCelula"><bean:write name="relatorio" property="codigo" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="descricao" /></td>
    <td class="tabelaCelulaCentro"><bean:write name="relatorio" property="dataFabricacao" /></td>
    <td class="tabelaCelulaCentro"><bean:write name="relatorio" property="dataValidade" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="quantidadeProduzida" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="quantidadeDisponivel" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="produtoNome" /></td>
    <td class="tabelaCelula">
     <a href="<%= request.getContextPath() %>/lote.do?acao=telaAlterar&codigo=<bean:write name="relatorio" property="codigo" />&produto=<bean:write name="relatorio" property="produto" />">
      <img src="<html:rewrite page='/images/alterar.gif' />" border="0"> 
     </a>
    </td>
    <td class="tabelaCelula">
     <a href="<%= request.getContextPath() %>/lote.do?acao=telaExcluir&codigo=<bean:write name="relatorio" property="codigo" />&produto=<bean:write name="relatorio" property="produto" />">
      <img src="<html:rewrite page='/images/excluir.gif' />" border="0">
     </a>
    </td>
   </tr>
   </logic:iterate>
  </table>
 </div>
 </html:form>
</logic:notEmpty>