<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<script>
<!--

function sair() {
 
 location.href = "<%=request.getContextPath()%>/menu.do?acao=principal";
 
}

//-->
</script>
<logic:notEmpty name="vendasPorRegiao">
 <html:form action="relatorio.do?acao=listarVendasPorRegiao" >
 <div align="center">
  <h3><bean:message key="msg.relatorio.vendas.regiao" /></h3>
  <table>
   <tr>
    <td class="tabelaTitulo"><bean:message key="dm.regiao" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.valor" /></td>  
   </tr>
   <logic:iterate name="vendasPorRegiao" id="relatorio">
   <tr>
    <td class="tabelaCelula"><bean:write name="relatorio" property="descricao" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="valor" /></td>
   </tr>
   </logic:iterate>
  </table>
 </div>
 </html:form>
</logic:notEmpty>