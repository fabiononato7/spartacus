<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ page import="com.nonato.spartacus.util.BobEsponja" %>
<logic:notEmpty name="pagamentos">
 <html:form action="pagamento.do?acao=exibir" >
 <div align="center">
  <table>
   <tr>
    <td class="tabelaTitulo"><bean:message key="dm.codigo" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.descricao" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.data.vencimento" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.valor" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.data.pagamento" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.valor.pago" /></td> 
    <td class="tabelaTitulo"><bean:message key="dm.cliente" /></td> 
   </tr>
   <% String inicio = request.getParameter( "inicio" ); %>
   <logic:iterate name="pagamentos" id="relatorio" offset="<%= inicio %>" length="<%= Integer.toString( BobEsponja.PAGINADOR ) %>">
   <tr>
    <td class="tabelaCelula"><bean:write name="relatorio" property="codigo" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="descricao" /></td>
    <td class="tabelaCelulaCentro"><bean:write name="relatorio" property="dataVencimento" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="valor" /></td>
    <td class="tabelaCelulaCentro"><bean:write name="relatorio" property="dataPagamento" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="valorPago" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="pedidoEmpresaNome" /></td>
   </tr>
   </logic:iterate>
  </table>
 </div>
 </html:form>
</logic:notEmpty>