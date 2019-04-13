<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<html:form name="consultaPagamento" type="com.nonato.spartacus.forms.PagamentoForm" action="pagamento.do?acao=pesquisarConsulta">
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
   <td><html:text property="codigo" size="15" maxlength="3" styleClass="caixaNumero" onkeypress="somenteNumeros()" /></td>
   <td><html:text property="descricao" size="30" maxlength="5" styleClass="caixaTexto" /></td>
   <td><html:text property="dataVencimento" size="30" maxlength="10" onkeypress="formatarData(dataVencimento)" styleClass="caixaTexto" /></td>
   <td><html:text property="valor" styleClass="caixaNumero" /></td>
   <td><html:text property="dataPagamento" size="30" maxlength="10" onkeypress="formatarData(dataPagamento)" styleClass="caixaTexto" /></td>
   <td><html:text property="valorPago" styleClass="caixaNumero" /></td>
  </tr>
 </table>
</html:form>