<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<script type="text/javascript">
<!--

adicionar.disabled = true;
processar.disabled = true;
excluir.disabled = true;

//-->
</script>
<html:form action="produtoPromocao.do?acao=alterar" >
  <table>
   <tr>
    <td><label class="tabelaTituloOperacao"><bean:message key="form.produto.promocao" /></label></td>
   </tr>
  </table>
  <table>
   <tr>
    <td>
     <label class="rotulo"><bean:message key="dm.produto" /></label>
     <html:hidden property="promocao" />
   </td>
    <td><label class="rotulo"><bean:message key="dm.nome" /></label></td>
    <td><label class="rotulo"><bean:message key="dm.preco" /></label></td>
    <td><label class="rotulo"><bean:message key="dm.desconto" /></label></td> 
   </tr>
   <tr>
    <td><html:text property="produto" size="15" styleClass="caixaSelecao" readonly="true" /></td>
    <td><html:text property="produtoNome" size="30" styleClass="caixaTexto" readonly="true" /></td>
    <td><html:text property="produtoPreco" size="15" styleClass="caixaTexto" readonly="true" /></td>  
	<td><html:text property="desconto" size="15" styleClass="caixaNumero" /></td>
   </tr>
  </table>
</html:form>