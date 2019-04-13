<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<logic:notEmpty name="menu">
  <table>
   <tr>
    <td class="tabelaTitulo"><bean:message key="dm.codigo" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.nome" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.representante" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.cnpj.cpf" /></td>         
   </tr>
   <tr>
    <td class="tabelaCelula"><bean:write name="menu" property="codigo" /></td>
    <td class="tabelaCelula"><bean:write name="menu" property="nomeRazaoSocial" /></td>
    <td class="tabelaCelula"><bean:write name="menu" property="responsavel" /></td>
    <td class="tabelaCelulaCentro"><bean:write name="menu" property="cnpjCpf" /></td>
   </tr>
  </table>
</logic:notEmpty>