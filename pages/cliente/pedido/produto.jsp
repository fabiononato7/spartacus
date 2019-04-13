<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ page import="com.nonato.spartacus.util.BobEsponja" %>
<script>
<!--

processar.disabled = true;
carrinho.disabled = true;

-->
</script>
<script>
<!--

function adicionar() {
 
 acao( document.forms["itemForm"] );
 
}

function enviar() {
 
 acao( document.forms["itemForm"] );
 
}

-->
</script>
<logic:notEmpty name="produtos">
 <html:form action="pedido.do?acao=adicionar" >
 <div align="center">
  <table>
   <tr> 
    <td class="tabelaTitulo"><bean:message key="dm.codigo" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.nome" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.preco" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.unidade" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.quantidade" /></td>
   </tr>
   <% String inicio = request.getParameter( "inicio" ); %>
   <logic:iterate name="produtos" id="relatorio" offset="<%= inicio %>" length="<%= Integer.toString( BobEsponja.PAGINADOR ) %>">   
   <tr>
    <td class="tabelaCelula"><bean:write name="relatorio" property="codigo" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="nome" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="preco" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="unidadeSigla" /></td>
    <td class="tabelaCelulaCentro">
     <input type="hidden" name="produtos" value="<bean:write name="relatorio" property="codigo" />">
     <html:text property="quantidades" value="" size="5" maxlength="3" onkeypress="somenteNumeros()" />
    </td>
   </tr>
   </logic:iterate>
  </table>
 </div>
 </html:form>
</logic:notEmpty>