<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ page import="com.nonato.spartacus.util.BobEsponja" %>
<logic:notEmpty name="condicoes">
 <html:form action="condicao.do?acao=exibir" >
 <div align="center">
  <table>
   <tr> 
    <td class="tabelaTitulo"><bean:message key="dm.codigo" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.dias" /></td>    
    <td class="tabelaTitulo"><bean:message key="dm.juros" /></td>    
    <td class="tabelaTitulo"><bean:message key="dm.multa" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.parcelas" /></td>   
    <td class="tabelaTituloOperacao"><bean:message key="rot.alterar" /></td>
    <td class="tabelaTituloOperacao"><bean:message key="rot.excluir" /></td>
   </tr>
   <% String inicio = request.getParameter( "inicio" ); %>
   <logic:iterate name="condicoes" id="relatorio" offset="<%= inicio %>" length="<%= Integer.toString( BobEsponja.PAGINADOR ) %>">
   <tr>
    <td class="tabelaCelula"><bean:write name="relatorio" property="codigo" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="dias" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="juros" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="multa" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="parcelas" /></td>
    <td class="tabelaCelulaCentro">
     <a href="<%= request.getContextPath() %>/condicao.do?acao=telaAlterar&codigo=<bean:write name="relatorio" property="codigo" />">
      <img src="<html:rewrite page='/images/alterar.gif' />" border="0">
     </a>
    </td>
    <td class="tabelaCelulaCentro">
     <a href="<%= request.getContextPath() %>/condicao.do?acao=telaExcluir&codigo=<bean:write name="relatorio" property="codigo" />">
      <img src="<html:rewrite page='/images/excluir.gif' />" border="0">
     </a>
    </td>
   </tr>
   </logic:iterate>
  </table>
 </div>
 </html:form>
</logic:notEmpty>