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
   </tr>
   <% String inicio = request.getParameter( "inicio" ); %>
   <logic:iterate name="produtos" id="relatorio" offset="<%= inicio %>" length="<%= Integer.toString( BobEsponja.PAGINADOR ) %>">
   <tr>
    <td class="tabelaCelula"><bean:write name="relatorio" property="codigo" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="nome" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="preco" /></td>
    <td class="tabelaCelulaCentro"><bean:write name="relatorio" property="unidadeSigla" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="empresaNome" /></td>
   </tr>
   </logic:iterate>
  </table>
 </div> 
 </html:form>
</logic:notEmpty>