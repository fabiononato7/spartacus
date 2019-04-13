<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ page import="com.nonato.spartacus.util.BobEsponja" %>
<script type="text/javascript">
<!--

processar.disabled = true;
alterar.disabled = true;
excluir.disabled = true;

//-->
</script>
<logic:notEmpty name="cidades">
 <html:form action="cidadeRegiao.do?acao=listar" >
 <div align="center">
  <table>
   <tr> 
    <td class="tabelaTitulo"><bean:message key="dm.codigo" /></label></td>
    <td class="tabelaTitulo"><bean:message key="dm.nome" /></label></td>    
    <td class="tabelaTitulo"><bean:message key="dm.cep" /></label></td>
    <td class="tabelaTitulo"><bean:message key="dm.comentario" /></label></td>
    <td class="tabelaTituloOperacao"><bean:message key="rot.alterar" /></td>
    <td class="tabelaTituloOperacao"><bean:message key="rot.excluir" /></td>
   </tr>
   <% String inicio = request.getParameter( "inicio" ); %>
   <logic:iterate name="cidades" id="relatorio" offset="<%= inicio %>" length="<%= Integer.toString( BobEsponja.PAGINADOR ) %>">
   <tr>
    <td class="tabelaCelula"><bean:write name="relatorio" property="cidade" /></td>
    <td class="tabelaCelula">
     <bean:write name="relatorio" property="cidadeNome" />-<bean:write name="relatorio" property="cidadeEstadoSigla" />
    </td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="cidadeCep" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="comentario" /></td>
    <td class="tabelaCelulaCentro">
     <a href="<%= request.getContextPath() %>/cidadeRegiao.do?acao=telaAlterar&cidade=<bean:write name="relatorio" property="cidade" />&regiao=<bean:write name="relatorio" property="regiao" />">
      <img src="<html:rewrite page='/images/alterar.gif' />" border="0">
     </a>
    </td>
    <td class="tabelaCelulaCentro">
     <a href="<%= request.getContextPath() %>/cidadeRegiao.do?acao=telaExcluir&codigo=<bean:write name="relatorio" property="cidade" />&regiao=<bean:write name="relatorio" property="regiao" />">
      <img src="<html:rewrite page='/images/excluir.gif' />" border="0">
     </a>
    </td>
   </tr>
   </logic:iterate>
  </table>
 </div>
 </html:form>
</logic:notEmpty>