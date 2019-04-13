<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<script type="text/javascript">
<!--

gravar.disabled = true;
excluir.disabled = true;

//-->
</script>
<html:form action="pagamento.do?acao=alterar" >
 <table>
  <tr>
   <td><label class="tabelaTituloOperacao"><bean:message key="form.pagamento" /></label></td>
  </tr>
 </table>
 <table>
  <tr>
   <td><label class="rotulo"><bean:message key="dm.codigo" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.descricao" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.data.vencimento" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.valor" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.data.pagamento" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.valor.pago" /></label></td>
  <tr>         
  </tr>
  <tr>
   <td><html:text property="codigo" size="15" styleClass="caixaSelecao" readonly="true" /></td>
   <td><html:text property="descricao" size="30" styleClass="caixaTexto" readonly="true" /></td>
   <td><html:text property="dataVencimento" size="30" readonly="true" styleClass="caixaTexto" /></td>
   <td><html:text property="valor" styleClass="caixaNumero" /></td>
   <td><html:text property="dataPagamento" size="30" maxlength="10" onkeypress="somenteNumeros()" styleClass="caixaTexto" /></td>
   <td><html:text property="valorPago" styleClass="caixaNumero" /></td>
  </tr>
 </table>
 <table>
  <tr>
   <td><label class="rotulo"><bean:message key="dm.pedido" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.cliente" /></label></td>  
  </tr>
  <tr>
   <td><html:text property="pedido" size="15" styleClass="caixaSelecao" readonly="true" /></td>
   <td><html:text property="pedidoEmpresaNome" size="70" styleClass="caixaTexto" readonly="true" /></td>
  </tr>
 </table>
</html:form>