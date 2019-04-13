<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ page import="com.nonato.spartacus.util.BobEsponja" %>
<logic:notEmpty name="produtos">
 <html:form action="produto.do?acao=exibir" >
 <div align="center">
  <table>
   <tr> 
    <td class="tabelaTitulo"><bean:message key="dm.codigo" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.nome" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.preco" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.unidade" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.laboratorio" /></td>
    <td class="tabelaTituloOperacao"><bean:message key="rot.alterar" /></td>
    <td class="tabelaTituloOperacao"><bean:message key="rot.excluir" /></td>
   </tr>
   <% String inicio = request.getParameter( "inicio" ); %>
   <logic:iterate name="produtos" id="relatorio" offset="<%= inicio %>" length="<%= Integer.toString( BobEsponja.PAGINADOR ) %>">
   <tr>
    <td class="tabelaCelula"><bean:write name="relatorio" property="codigo" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="nome" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="preco" /></td>
    <td class="tabelaCelulaCentro"><bean:write name="relatorio" property="unidadeSigla" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="empresaNome" /></td>
    <td class="tabelaCelulaCentro">
     <a href="<%= request.getContextPath() %>/produto.do?acao=telaAlterar&codigo=<bean:write name="relatorio" property="codigo" />">
      <img src="<html:rewrite page='/images/alterar.gif' />" border="0">
     </a>
    </td>
    <td class="tabelaCelulaCentro">
     <a href="<%= request.getContextPath() %>/produto.do?acao=telaExcluir&codigo=<bean:write name="relatorio" property="codigo" />">
      <img src="<html:rewrite page='/images/excluir.gif' />" border="0">
     </a>
    </td>
   </tr>
   </logic:iterate>
  </table>
 </div> 
 </html:form>
</logic:notEmpty>