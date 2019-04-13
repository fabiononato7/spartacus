<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<html:form name="pesquisaEmpresa" type="com.nonato.spartacus.forms.EmpresaForm" action="empresa.do?acao=pesquisar">
 <table>
  <tr>
    <td><label class="rotulo"><bean:message key="dm.codigo" /></label></td>
    <td><label class="rotulo"><bean:message key="dm.nome.razaosocial" /></label></td>
    <td><label class="rotulo"><bean:message key="dm.responsavel" /></label></td>
    <td><label class="rotulo"><bean:message key="dm.tipo" /></label></td>
    <td><label class="rotulo"><bean:message key="dm.cnpj.cpf" /></label></td>    
  </tr>
  <tr>
    <td><html:text property="codigo" size="10" maxlength="3" styleClass="caixaNumero" onkeypress="somenteNumeros()" /></td>
    <td><html:text property="nomeRazaoSocial" size="50" maxlength="60" styleClass="caixaTexto" /></td>
    <td><html:text property="responsavel" size="50" maxlength="60" styleClass="caixaTexto" /></td>
    <td>
     <html:select property="tipo" styleClass="caixaSelecao" >
      <html:option value="4" >ADMINISTRADOR</html:option>
	  <html:option value="1" >CLIENTE</html:option>
	  <html:option value="2" >FORNECEDOR</html:option>	
	  <html:option value="3" >REPRESENTANTE</html:option>
     </html:select>
    </td>
    <td><html:text property="cnpjCpf" size="15" maxlength="20" styleClass="caixaNumero" /></td>
  </tr>
 </table>
</html:form>