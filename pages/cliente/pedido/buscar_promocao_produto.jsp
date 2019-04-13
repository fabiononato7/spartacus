<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<html:form name="pesProdutoPromocao" type="com.nonato.spartacus.forms.ProdutoPromocaoForm" action="produtoPromocao.do?acao=pesquisarProdutos">
<table>
  <input type="hidden" name="promocao" value="<%= request.getParameter( "codigo" ) %>">
  <tr>
   <td><label class="rotulo"><bean:message key="dm.codigo" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.nome" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.preco" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.unidade" /></label></td>
  </tr>
  <tr>
   <td><html:text property="produto" size="15" styleClass="caixaNumero" onkeypress="somenteNumeros()" /></td>
   <td><html:text property="produtoNome" size="30" maxlength="30" styleClass="caixaTexto" /></td>
   <td><html:text property="produtoPreco" size="15" maxlength="9" styleClass="caixaNumero" /></td>
   <td>
    <html:select property="produtoUnidade" styleClass="caixaSelecao" >
     <html:option value="1" >CAIXA</html:option>
	 <html:option value="2" >FRASCO</html:option>
	 <html:option value="3" >TUBO</html:option>	
	 <html:option value="4" >VIDRO</html:option>
    </html:select>
   </td>
  </tr>
 </table>
</html:form>
<script>
<!--

function pesquisar() {

 acao( document.pesProdutoPromocao );

}

//-->
</script>