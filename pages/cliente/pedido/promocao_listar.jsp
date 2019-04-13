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
    <td class="tabelaTituloOperacao"><bean:message key="rot.selecionar" /></td>    
   </tr>
   <% String inicio = request.getParameter( "inicio" ); %>
   <logic:iterate name="promocoes" id="relatorio" offset="<%= inicio %>" length="<%= Integer.toString( BobEsponja.PAGINADOR ) %>">
   <tr>
    <td class="tabelaCelula"><bean:write name="relatorio" property="codigo" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="descricao" /></td>
    <td class="tabelaCelulaCentro"><bean:write name="relatorio" property="dataInicio" /></td>
    <td class="tabelaCelulaCentro"><bean:write name="relatorio" property="dataFinal" /></td>
    <td class="tabelaCelulaCentro">
     <a href="<%= request.getContextPath() %>/promocao.do?acao=listarProdutosParaPedido&codigo=<bean:write name="relatorio" property="codigo" />">
       <img src="<html:rewrite page='/images/selecionar.gif' />" border="0"> 
     </a>
    </td>
   </tr>
   </a>
   </logic:iterate>
  </table>
 </div>
 </html:form>
</logic:notEmpty>