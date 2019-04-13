<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ page import="com.nonato.spartacus.util.BobEsponja" %>
<logic:notEmpty name="condicoes">
 <html:form action="empresa.do?acao=telaInserir" >
 <div align="center">
  <table>
   <tr> 
    <td class="tabelaTitulo"><bean:message key="dm.codigo" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.dias" /></td>    
    <td class="tabelaTitulo"><bean:message key="dm.juros" /></td>    
    <td class="tabelaTitulo"><bean:message key="dm.multa" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.parcelas" /></td>
    <td class="tabelaTituloOperacao"><bean:message key="rot.selecionar" /></td>
   </tr>
   <% String inicio = request.getParameter( "inicio" ); %>
   <logic:iterate name="condicoes" id="relatorio" offset="<%= inicio %>" length="<%= Integer.toString( BobEsponja.PAGINADOR ) %>">
   <tr>
    <td class="tabelaCelula"><bean:write name="relatorio" property="condicao" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="condicaoDias" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="condicaoJuros" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="condicaoMulta" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="condicaoParcelas" /></td>
    <td class="tabelaCelulaCentro">
     <a href="<%= request.getContextPath() %>/empresa.do?acao=telaInserir&condicao=<bean:write name="relatorio" property="condicao" />&condicaoDias=<bean:write name="relatorio" property="condicaoDias" />&condicaoMulta=<bean:write name="relatorio" property="condicaoMulta" />&condicaoJuros=<bean:write name="relatorio" property="condicaoJuros" />&condicaoParcelas=<bean:write name="relatorio" property="condicaoParcelas" />">
      <img src="<html:rewrite page='/images/selecionar.gif' />" border="0">  
     </a>
    </td>
   </tr>
   </logic:iterate>
  </table>
 </div>
 </html:form>
</logic:notEmpty>