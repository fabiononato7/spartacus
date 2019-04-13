<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<script type="text/javascript">
<!--

gravar.disabled = true;
excluir.disabled = true;

//-->
</script>
<html:form action="regiao.do?acao=alterar" >
 <table>
  <tr>
   <td><label class="tabelaTituloOperacao"><bean:message key="form.regiao" /></label></td>
  </tr>
  <tr>
   <td><label class="rotulo"><bean:message key="dm.codigo" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.descricao" /></label></td>
   <td></td>  
   <td><label class="rotulo"><bean:message key="dm.representante" /></label></td> 
   <td><label class="rotulo"><bean:message key="dm.nome" /></label></td> 
  </tr>
  <tr>
   <td><html:text property="codigo" size="15" styleClass="caixaSelecao" /></td>
   <td><html:text property="descricao" size="60" maxlength="60" styleClass="caixaTexto" /></td>    
   <td>
    <a href="<%= request.getContextPath() %>/regiao.do?acao=listarEmpresa">
     <img src="<html:rewrite page='/images/pasta.gif' />" border="0">
    </a>
   </td>
   <td><html:text property="empresa" size="15" readonly="true" styleClass="caixaSelecao" /></td>
   <td><html:text property="empresaNome" size="60" readonly="true" styleClass="caixaTexto" /></td>
  </tr>
 </table>
</html:form>