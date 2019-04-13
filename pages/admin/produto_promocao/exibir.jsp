<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<script type="text/javascript">
<!--

processar.disabled = true;
alterar.disabled = true;
excluir.disabled = true;

//-->
</script>
<%@ page import="com.nonato.spartacus.util.BobEsponja" %>
<logic:notEmpty name="produtos">
 <html:form action="produtoPromocao.do?acao=listar" >
 <div align="center">
  <table>
   <tr> 
    <td class="tabelaTitulo"><bean:message key="dm.produto" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.nome" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.preco" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.desconto" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.valor" /></td> 
    <td class="tabelaTituloOperacao"><bean:message key="rot.alterar" /></td>
    <td class="tabelaTituloOperacao"><bean:message key="rot.excluir" /></td>  
   </tr>
   <% String inicio = request.getParameter( "inicio" ); %>
   <logic:iterate name="produtos" id="relatorio" offset="<%= inicio %>" length="<%= Integer.toString( BobEsponja.PAGINADOR ) %>">
   <tr>
    <td class="tabelaCelula"><bean:write name="relatorio" property="produto" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="produtoNome" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="produtoPreco" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="desconto" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="valor" /></td>
    <td class="tabelaCelulaCentro">
     <a href="<%= request.getContextPath() %>/produtoPromocao.do?acao=telaAlterar&produto=<bean:write name="relatorio" property="produto" />&promocao=<bean:write name="relatorio" property="promocao" />">
      <img src="<html:rewrite page='/images/alterar.gif' />" border="0"> 
     </a>
    </td>
    <td class="tabelaCelulaCentro">
     <a href="<%= request.getContextPath() %>/produtoPromocao.do?acao=telaExcluir&produto=<bean:write name="relatorio" property="produto" />&promocao=<bean:write name="relatorio" property="promocao" />">
      <img src="<html:rewrite page='/images/excluir.gif' />" border="0"> 
     </a>
    </td>
   </tr>
   </logic:iterate>
  </table>
 </div>
 </html:form>
</logic:notEmpty>