<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<script type="text/javascript">
<!--

alterar.disabled = true;
excluir.disabled = true;

//-->
</script>
<html:form action="condicao.do?acao=inserir" >
 <table>
  <tr>
   <td><label class="tabelaTituloOperacao"><bean:message key="form.condicao" /></label></td>
  </tr>
  <tr>
   <td><label class="rotulo"><bean:message key="dm.codigo" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.dias" /></label></td>    
   <td><label class="rotulo"><bean:message key="dm.juros" /></label></td>    
   <td><label class="rotulo"><bean:message key="dm.multa" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.parcelas" /></label></td>        
  </tr>
  <tr>
   <td><html:hidden property="codigo" value="0" /></td>
   <td><html:text property="dias" size="20" maxlength="2" styleClass="caixaNumero" onkeypress="somenteNumeros()" /></td>
   <%--
   <td><html:text property="juros" size="30" maxlength="4" styleClass="caixaNumero" onkeypress="formatarPorcentagem(juros)" /></td>
   <td><html:text property="multa" size="30" maxlength="4" styleClass="caixaNumero" onkeypress="formatarPorcentagem(multa)" /></td>
   --%>
   <td><html:text property="juros" size="30" maxlength="4" styleClass="caixaNumero" /></td>
   <td><html:text property="multa" size="30" maxlength="4" styleClass="caixaNumero" /></td>
   <td><html:text property="parcelas" size="25" maxlength="2" styleClass="caixaNumero" onkeypress="somenteNumeros()" /></td>
  </tr>
 </table>
</html:form>