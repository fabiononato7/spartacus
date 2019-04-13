<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<html:form name="pesquisaCidade" type="com.nonato.spartacus.forms.CidadeForm" action="cidade.do?acao=pesquisar">
 <table>
  <tr>
   <td><label class="rotulo"><bean:message key="dm.codigo" /></label></td>
   <td><label class="rotulo"><bean:message key="dm.nome" /></label></td>    
   <td><label class="rotulo"><bean:message key="dm.cep" /></label></td> 
   <td><label class="rotulo"><bean:message key="dm.estado" /></label></td> 
  </tr>
  <tr>
   <td><html:text property="codigo" size="15" maxlength="3" styleClass="caixaNumero" onkeypress="somenteNumeros()" /></td>
   <td><html:text property="nome" size="60" maxlength="60" styleClass="caixaTexto" /></td>
   <td><html:text property="cep" size="15" maxlength="9" styleClass="caixaNumero" onkeypress="formatarCep(cep)" /></td>
   <td>
	 <logic:present name="estados">
      <html:select property="estado" styleClass="caixaSelecao" >
       <html:options collection="estados" property="codigo" labelProperty="nome" />
      </html:select>
     </logic:present>
   </td>
  </tr>
 </table>
</html:form>