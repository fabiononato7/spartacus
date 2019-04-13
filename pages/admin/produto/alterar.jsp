<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<script type="text/javascript">
<!--

gravar.disabled = true;
excluir.disabled = true;

//-->
</script>
<html:form action="produto.do?acao=alterar" >
 <table>
  <tr>
   <td><label class="tabelaTituloOperacao"><bean:message key="form.produto" /></label></td>
  </tr>
  <tr>
   <td><label class="rotulo"><bean:message key="dm.codigo" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.nome" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.preco" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.unidade" /></label></td>
   <td></td>
   <td><label class="rotulo"><bean:message key="dm.laboratorio" /></label></td> 
   <td><label class="rotulo"><bean:message key="dm.nome" /></label></td>      
  </tr>
  <tr>
   <td><html:text property="codigo" size="15" styleClass="caixaSelecao" readonly="true" /></td>
   <td><html:text property="nome" size="30" maxlength="30" styleClass="caixaTexto" /></td>
   <%-- <td><html:text property="preco" size="15" maxlength="20" styleClass="caixaDinheiro" onkeydown="formatarDinheiro(preco, 20)" /></td> --%>
   <td><html:text property="preco" size="15" maxlength="20" styleClass="caixaDinheiro" /></td>
   <td>
    <html:select property="unidade" styleClass="caixaSelecao" >
     <html:option value="1" >CAIXA</html:option>
	 <html:option value="2" >FRASCO</html:option>
	 <html:option value="3" >TUBO</html:option>	
	 <html:option value="4" >VIDRO</html:option>
    </html:select>
   </td>
   <td>
    <a href="<%= request.getContextPath() %>/produto.do?acao=listarEmpresa">
     <img src="<html:rewrite page='/images/pasta.gif' />" border="0">
    </a>
   </td>
   <td><html:text property="empresa" size="10" readonly="true" styleClass="caixaSelecao" /></td>
   <td><html:text property="empresaNome" size="47" readonly="true" styleClass="caixaTexto" /></td>
  </tr>
 </table>
</html:form>