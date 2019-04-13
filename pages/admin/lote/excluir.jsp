<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<script type="text/javascript">
<!--

limpar.disabled = true;
gravar.disabled = true;
alterar.disabled = true;

//-->
</script>
<html:form action="lote.do?acao=excluir" >
<table>
  <tr>
   <td><label class="tabelaTituloOperacao"><bean:message key="form.lote" /></label></td>
  </tr>
  <tr>
   <td><label class="rotulo"><bean:message key="dm.codigo" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.descricao" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.data.fabricacao" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.data.validade" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.quantidade.produzida" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.quantidade.disponivel" /></label></td>  
  </tr>
  <tr>
   <td><html:text property="codigo" size="15" styleClass="caixaSelecao" readonly="true" /></td>
   <td><html:text property="descricao" size="20" styleClass="caixaTexto" readonly="true" /></td>
   <td><html:text property="dataFabricacao" size="20" styleClass="caixaTexto" readonly="true" /></td>
   <td><html:text property="dataValidade" size="20" styleClass="caixaTexto" readonly="true" /></td>
   <td><html:text property="quantidadeProduzida" size="25" styleClass="caixaNumero" readonly="true" /></td>
   <td><html:text property="quantidadeDisponivel" size="25" styleClass="caixaNumero" readonly="true" /></td>
  </tr>
 </table>
 <table> 
  <tr>
   <td><label class="rotulo"><bean:message key="dm.produto" /></td>
   <td><label class="rotulo"><bean:message key="dm.nome" /></td>
  </tr>
  <tr>
   <td><html:text property="produto" size="10" readonly="true" styleClass="caixaSelecao" /></td>
   <td><html:text property="produtoNome" size="47" readonly="true" styleClass="caixaTexto" /></td>
  </tr>
 </table>
</html:form>
