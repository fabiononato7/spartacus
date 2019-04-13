<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ page import="com.nonato.spartacus.util.BobEsponja" %>
<logic:notEmpty name="promocoes">
 <html:form action="promocao.do?acao=exibir" >
 <div align="center">
  <table>
   <tr>
    <td class="tabelaTitulo"><bean:message key="dm.codigo" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.descricao" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.data.inicio" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.data.final" /></td>  
    <td class="tabelaTituloOperacao"><bean:message key="rot.alterar" /></td>
    <td class="tabelaTituloOperacao"><bean:message key="rot.excluir" /></td>
    <td class="tabelaTituloOperacao"><bean:message key="rot.produtos" /></td>
   </tr>
   <% String inicio = request.getParameter( "inicio" ); %>
   <logic:iterate name="promocoes" id="relatorio" offset="<%= inicio %>" length="<%= Integer.toString( BobEsponja.PAGINADOR ) %>">
   <tr>
    <td class="tabelaCelula"><bean:write name="relatorio" property="codigo" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="descricao" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="dataInicio" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="dataFinal" /></td>
    <td class="tabelaCelulaCentro">
     <a href="<%= request.getContextPath() %>/promocao.do?acao=telaAlterar&codigo=<bean:write name="relatorio" property="codigo" />">
      <img src="<html:rewrite page='/images/alterar.gif' />" border="0">
     </a>
    </td>
    <td class="tabelaCelulaCentro">
     <a href="<%= request.getContextPath() %>/promocao.do?acao=telaExcluir&codigo=<bean:write name="relatorio" property="codigo" />">
      <img src="<html:rewrite page='/images/excluir.gif' />" border="0">
     </a>
    </td>
    <td class="tabelaCelulaCentro">
     <a href="<%= request.getContextPath() %>/promocao.do?acao=listarProdutos&codigo=<bean:write name="relatorio" property="codigo" />">
      <img src="<html:rewrite page='/images/produto.gif' />" border="0">
     </a>
    </td>
   </tr>
   </logic:iterate>
  </table>
 </div>  
 </html:form>
</logic:notEmpty>