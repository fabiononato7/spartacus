<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ page import="com.nonato.spartacus.util.BobEsponja" %>
<logic:notEmpty name="regioes">
 <html:form action="regiao.do?acao=exibir" >
 <div align="center">
  <table>
   <tr> 
    <td class="tabelaTitulo"><bean:message key="dm.codigo" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.descricao" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.ativo" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.representante" /></td>
    <td class="tabelaTituloOperacao"><bean:message key="rot.alterar" /></td>
    <td class="tabelaTituloOperacao"><bean:message key="rot.excluir" /></td>
    <td class="tabelaTituloOperacao"><bean:message key="rot.cidades" /></td>
   </tr>
   <% String inicio = request.getParameter( "inicio" ); %>
   <logic:iterate name="regioes" id="relatorio" offset="<%= inicio %>" length="<%= Integer.toString( BobEsponja.PAGINADOR ) %>">
   <tr>
    <td class="tabelaCelula"><bean:write name="relatorio" property="codigo" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="descricao" /></td>
    <td class="tabelaCelula">
     <logic:equal name="relatorio" property="ativo" value="1">
      <bean:message key="dm.ativo.sim" />
     </logic:equal>
     <logic:equal name="relatorio" property="ativo" value="0">
      <bean:message key="dm.ativo.nao" />
     </logic:equal>
    </td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="empresaNome" /></td>
    <td class="tabelaCelulaCentro">
     <a href="<%= request.getContextPath() %>/regiao.do?acao=telaAlterar&codigo=<bean:write name="relatorio" property="codigo" />">
      <img src="<html:rewrite page='/images/alterar.gif' />" border="0">
     </a>
    </td>
    <td class="tabelaCelulaCentro">
     <a href="<%= request.getContextPath() %>/regiao.do?acao=telaExcluir&codigo=<bean:write name="relatorio" property="codigo" />">
      <img src="<html:rewrite page='/images/excluir.gif' />" border="0">
     </a>
    </td>
    <td class="tabelaCelulaCentro">
     <a href="<%= request.getContextPath() %>/regiao.do?acao=listarCidades&codigo=<bean:write name="relatorio" property="codigo" />">
      <img src="<html:rewrite page='/images/cidade.gif' />" border="0">
     </a>
    </td>
   </tr>
   </logic:iterate>
  </table>
 </div>  
 </html:form>
</logic:notEmpty>