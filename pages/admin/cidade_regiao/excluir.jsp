<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<script type="text/javascript">
<!--

adicionar.disabled = true;
processar.disabled = true;
alterar.disabled = true;

//-->
</script>
<html:form action="cidadeRegiao.do?acao=excluir" >
  <table>
    <tr>
     <td><label class="tabelaTituloOperacao"><bean:message key="form.cidade.regiao" /></label></td>
    </tr>
  </table>
  <table>
    <tr>
     <td><label class="rotulo"><bean:message key="dm.cidade" /></label></td>
     <td><label class="rotulo"><bean:message key="dm.nome" /></label></td>    
     <td><label class="rotulo"><bean:message key="dm.estado" /></label></td>
     <td><label class="rotulo"><bean:message key="dm.cep" /></label></td>  
     <td><label class="rotulo"><bean:message key="dm.regiao" /></label></td>
     <td><label class="rotulo"><bean:message key="dm.descricao" /></label></td>         
    </tr>
    <tr>
     <td><html:text property="cidade" size="15" styleClass="caixaSelecao" readonly="true" /></td>
     <td><html:text property="cidadeNome" size="60" styleClass="caixaTexto" readonly="true" /></td>
     <td><html:text property="cidadeEstadoSigla" size="10" styleClass="caixaTexto" readonly="true" /></td>
     <td><html:text property="cidadeCep" size="10" styleClass="caixaTexto" readonly="true" /></td>
     <td><html:text property="regiao" size="15" styleClass="caixaSelecao" readonly="true" /></td>
     <td><html:text property="regiaoDescricao" size="36" styleClass="caixaTexto" readonly="true" /></td>
    </tr>
   </table>
   <table>
    <tr>
     <td><label class="rotulo"><bean:message key="dm.comentario" /></label></td>   
    </tr>
    <tr>
     <td><html:textarea property="comentario" rows="5" cols="187" styleClass="caixaTexto" readonly="true" /></td>
    </tr>
  </table>
</html:form>