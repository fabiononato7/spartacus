<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ page import="com.nonato.spartacus.util.BobEsponja" %>
<logic:notEmpty name="pedidos">
 <html:form action="pedido.do?acao=listar" >
 <div align="center">
 <table>
  <tr>
   <td class="tabelaTitulo"><bean:message key="dm.codigo" /></td>
   <td class="tabelaTitulo"><bean:message key="dm.data.emissao" /></td>
   <td class="tabelaTitulo"><bean:message key="dm.data.entrega" /></td>
   <td class="tabelaTitulo"><bean:message key="dm.valor" /></td>
   <td class="tabelaTitulo"><bean:message key="dm.cliente" /></td>
   <td class="tabelaTitulo"><bean:message key="rot.nota" /></td>
  </tr>
  <% String inicio = request.getParameter( "inicio" ); %>
  <logic:iterate id="relatorio" name="pedidos" offset="<%= inicio %>" length="<%= Integer.toString( BobEsponja.PAGINADOR ) %>">
  <tr>
   <td class="tabelaCelula"><bean:write name="relatorio" property="codigo" /></td>
   <td class="tabelaCelulaCentro"><bean:write name="relatorio" property="dataEmissao" /></td>
   <td class="tabelaCelulaCentro"><bean:write name="relatorio" property="dataEntrega" /></td>
   <td class="tabelaCelula"><bean:write name="relatorio" property="valor" /></td>
   <td class="tabelaCelula"><bean:write name="relatorio" property="empresaNome" /></td>
   <td class="tabelaCelulaCentro">
    <a href="<%= request.getContextPath() %>/pedido.do?acao=notaFiscal&codigo=<bean:write name="relatorio" property="codigo" />">
     <img src="<html:rewrite page='/images/detalhes.gif' />" border="0">
    </a>
   </td>
  </tr>
  </logic:iterate>
 </table>
 </div> 
 </html:form>
</logic:notEmpty>