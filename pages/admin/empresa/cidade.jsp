<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ page import="com.nonato.spartacus.util.BobEsponja" %>
<logic:notEmpty name="cidades">
 <html:form action="empresa.do?acao=telaInserir" >
 <div align="center">
  <table>
   <tr> 
    <td class="tabelaTitulo"><bean:message key="dm.codigo" /></label></td>
    <td class="tabelaTitulo"><bean:message key="dm.nome" /></label></td>
    <td class="tabelaTitulo"><bean:message key="dm.estado" /></label></td>     
    <td class="tabelaTitulo"><bean:message key="dm.cep" /></label></td> 
    <td class="tabelaTituloOperacao"><bean:message key="rot.selecionar" /></td>
   </tr>
   <% String inicio = request.getParameter( "inicio" ); %>
   <logic:iterate name="cidades" id="relatorio" offset="<%= inicio %>" length="<%= Integer.toString( BobEsponja.PAGINADOR ) %>">
   <tr>
    <td class="tabelaCelula"><bean:write name="relatorio" property="cidade" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="cidadeNome" /></td>
    <td class="tabelaCelulaCentro"><bean:write name="relatorio" property="cidadeEstadoSigla" /></td>
    <td class="tabelaCelulaCentro"><bean:write name="relatorio" property="cidadeCep" /></td>
     <td class="tabelaCelulaCentro">
     <a href="<%= request.getContextPath() %>/empresa.do?acao=telaInserir&cidade=<bean:write name="relatorio" property="cidade" />&cidadeNome=<bean:write name="relatorio" property="cidadeNome" />&cidadeEstadoSigla=<bean:write name="relatorio" property="cidadeEstadoSigla" />&cidadeCep=<bean:write name="relatorio" property="cidadeCep" />">
      <img src="<html:rewrite page='/images/selecionar.gif' />" border="0">  
     </a>
    </td>
   </tr>
   </logic:iterate>
  </table>
 </div>
 </html:form>
</logic:notEmpty>