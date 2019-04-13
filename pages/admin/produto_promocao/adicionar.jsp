<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ page import="com.nonato.spartacus.util.BobEsponja" %>
<script type="text/javascript">
<!--

adicionar.disabled = true;
alterar.disabled = true;
excluir.disabled = true;

//-->
</script>
<logic:notEmpty name="produtos">
 <html:form action="produtoPromocao.do?acao=inserir" >
  <input type="hidden" name="promocao" value="<bean:write name="promocao" property="codigo" />">  
  <div align="center">
  <table>
   <tr> 
    <td class="tabelaTitulo"><bean:message key="dm.produto" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.nome" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.preco" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.desconto" /></td>
   </tr>
   <% String inicio = request.getParameter( "inicio" ); %>
   <logic:iterate name="produtos" id="relatorio" offset="<%= inicio %>" length="<%= Integer.toString( BobEsponja.PAGINADOR ) %>">
   <tr>
    <td class="tabelaCelula"><bean:write name="relatorio" property="codigo" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="nome" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="preco" /></td>
    <td class="tabelaCelulaCentro">
     <input type="text" name="descontos" size="5" maxlenght="3">
     <input type="hidden" name="produtos" value="<bean:write name="relatorio" property="codigo" />">
    </td>
    </td>
   </tr>
   </logic:iterate>
  </table>
  </div>
 </html:form>
</logic:notEmpty>