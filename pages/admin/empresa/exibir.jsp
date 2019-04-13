<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ page import="com.nonato.spartacus.util.BobEsponja" %>
<logic:notEmpty name="empresas">
 <html:form action="empresa.do?acao=exibir" >
 <div align="center">
  <table>
   <tr> 
    <td class="tabelaTitulo"><bean:message key="dm.codigo" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.nome.razaosocial" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.tipo" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.cidade" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.cnpj.cpf" /></td>
    <td class="tabelaTituloOperacao"><bean:message key="rot.alterar" /></td>
    <td class="tabelaTituloOperacao"><bean:message key="rot.excluir" /></td>
   </tr>
   <% String inicio = request.getParameter( "inicio" ); %>
   <logic:iterate name="empresas" id="relatorio" offset="<%= inicio %>" length="<%= Integer.toString( BobEsponja.PAGINADOR ) %>">
   <tr>
    <td class="tabelaCelula"><bean:write name="relatorio" property="codigo" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="nomeRazaoSocial" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="tipoDescricao" /></td>   
    <td class="tabelaCelula">
      <bean:write name="relatorio" property="cidadeNome" />-<bean:write name="relatorio" property="cidadeEstadoSigla" />
    </td>
    <td class="tabelaCelulaCentro"><bean:write name="relatorio" property="cnpjCpf" /></td>
    <td class="tabelaCelulaCentro">
     <a href="<%= request.getContextPath() %>/empresa.do?acao=telaAlterar&codigo=<bean:write name="relatorio" property="codigo" />&tipo=<bean:write name="relatorio" property="tipo" />&condicao=<bean:write name="relatorio" property="condicao" />&cidade=<bean:write name="relatorio" property="cidade" />">
      <img src="<html:rewrite page='/images/alterar.gif' />" border="0">
     </a>
    </td>
    <td class="tabelaCelulaCentro">
     <a href="<%= request.getContextPath() %>/empresa.do?acao=telaExcluir&codigo=<bean:write name="relatorio" property="codigo" />&tipo=<bean:write name="relatorio" property="tipo" />&condicao=<bean:write name="relatorio" property="condicao" />&cidade=<bean:write name="relatorio" property="cidade" />">
      <img src="<html:rewrite page='/images/excluir.gif' />" border="0">
     </a>
    </td>
   </tr>
   </logic:iterate>
  </table>
 </div>  
 </html:form>
</logic:notEmpty>