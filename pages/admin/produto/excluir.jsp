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
<html:form action="produto.do?acao=excluir" >
 <table>
  <tr>
   <td><label class="tabelaTituloOperacao"><bean:message key="form.produto" /></label></td>
  </tr>
  <tr>
   <td><label class="rotulo"><bean:message key="dm.codigo" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.nome" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.preco" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.unidade" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.laboratorio" /></label></td> 
   <td><label class="rotulo"><bean:message key="dm.nome" /></label></td>      
  </tr>
  <tr>
   <td><html:text property="codigo" size="15" styleClass="caixaSelecao" readonly="true" /></td>
   <td><html:text property="nome" size="30" styleClass="caixaTexto" readonly="true" /></td>
   <td><html:text property="preco" size="15" styleClass="caixaNumero" readonly="true" /></td>
   <td><html:text property="unidadeSigla" size="15" styleClass="caixaSelecao" readonly="true" /></td>
   <td><html:text property="empresa" size="10" readonly="true" styleClass="caixaSelecao" /></td>
   <td><html:text property="empresaNome" size="47" readonly="true" styleClass="caixaTexto" /></td>
  </tr>
 </table>
</html:form>