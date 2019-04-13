<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ page import="com.nonato.spartacus.util.BobEsponja" %>
<logic:notEmpty name="empresas">
 <html:form action="produto.do?acao=exportarEmpresa" >
 <div align="center"> 
  <table>
   <tr> 
    <td class="tabelaTitulo"><bean:message key="dm.codigo" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.nome.razaosocial" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.cnpj.cpf" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.fone.fax" /></td>
    <td class="tabelaTituloOperacao"><bean:message key="rot.selecionar" /></td>
   </tr>
   <% String inicio = request.getParameter( "inicio" ); %>
   <logic:iterate name="empresas" id="relatorio" offset="<%= inicio %>" length="<%= Integer.toString( BobEsponja.PAGINADOR ) %>">
   <tr>
    <td class="tabelaCelula"><bean:write name="relatorio" property="empresa" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="empresaNome" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="empresaCnpjCpf" /></td>
    <td class="tabelaCelulaCentro"><bean:write name="relatorio" property="empresaFoneFax" /></td>
    <td class="tabelaCelulaCentro">
     <a href="<%= request.getContextPath() %>/produto.do?acao=telaInserir&empresa=<bean:write name="relatorio" property="empresa" />&empresaNome=<bean:write name="relatorio" property="empresaNome" />">
      <img src="<html:rewrite page='/images/selecionar.gif' />" border="0">
     </a>
    </td>
   </tr>
   </logic:iterate>
  </table>
 </div>
 </html:form>
</logic:notEmpty>