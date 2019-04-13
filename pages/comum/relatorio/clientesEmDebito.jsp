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
<logic:notEmpty name="clientesEmDebito">
 <html:form action="relatorio.do?acao=listarClientesEmDebito" >
 <div align="center">
  <h3><bean:message key="msg.relatorio.clientes.debito" /></h3>
  <table>
   <tr>
    <td class="tabelaTitulo"><bean:message key="dm.codigo" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.descricao" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.data.vencimento" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.valor" /></td> 
    <td class="tabelaTitulo"><bean:message key="dm.cliente" /></td> 
   </tr>
   <logic:iterate name="clientesEmDebito" id="relatorio">
   <tr>
    <td class="tabelaCelula"><bean:write name="relatorio" property="codigo" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="descricao" /></td>
    <td class="tabelaCelulaCentro"><bean:write name="relatorio" property="dataVencimento" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="valor" /></td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="pedidoEmpresaNome" /></td>
   </tr>
   </logic:iterate>
  </table>
 </div>
 </html:form>
</logic:notEmpty>