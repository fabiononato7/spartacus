<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<script type="text/javascript">
<!--

alterar.disabled = true;
excluir.disabled = true;

//-->
</script>
<html:form action="lote.do?acao=inserir" >
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
   <td><html:hidden property="codigo" value="0" /></td>
   <td><html:text property="descricao" size="20" maxlength="20" styleClass="caixaTexto" /></td>
   <td><html:text property="dataFabricacao" size="20" maxlength="10" onkeypress="formatarData(dataFabricacao)" styleClass="caixaTexto" /></td>
   <td><html:text property="dataValidade" size="20" maxlength="10" onkeypress="formatarData(dataValidade)" styleClass="caixaTexto" /></td>
   <td><html:text property="quantidadeProduzida" size="25" maxlength="4" styleClass="caixaNumero" onkeypress="somenteNumeros()" /></td>
   <td><html:text property="quantidadeDisponivel" size="25" maxlength="4" styleClass="caixaNumero" onkeypress="somenteNumeros()" /></td>
  </tr>
 </table>
 <table> 
  <tr>
   <td></td>
   <td><label class="rotulo"><bean:message key="dm.produto" /></td>
   <td><label class="rotulo"><bean:message key="dm.nome" /></td>
  </tr>
  <tr>
   <td>
    <a href="<%= request.getContextPath() %>/lote.do?acao=listarProduto">
     <img src="<html:rewrite page='/images/pasta.gif' />" border="0">
    </a>
   </td>
   <td><html:text property="produto" size="10" readonly="true" styleClass="caixaSelecao" /></td>
   <td><html:text property="produtoNome" size="47" readonly="true" styleClass="caixaTexto" /></td>
  </tr>
 </table>
</html:form>