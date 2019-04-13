<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<logic:notEmpty name="regiao">
  <table>
   <tr>
    <td class="tabelaTitulo"><bean:message key="dm.codigo" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.descricao" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.ativo" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.representante" /></td> 
   </tr>
   <tr>
    <td class="tabelaCelula"><bean:write name="regiao" property="codigo" /></td>
    <td class="tabelaCelula"><bean:write name="regiao" property="descricao" /></td>
    <td class="tabelaCelulaCentro">
     <logic:equal name="regiao" property="ativo" value="1">
      <bean:message key="dm.ativo.sim" />
     </logic:equal>
     <logic:equal name="regiao" property="ativo" value="0">
      <bean:message key="dm.ativo.nao" />
     </logic:equal>
    </td>
    <td class="tabelaCelula"><bean:write name="regiao" property="empresaNome" /></td>
   </tr>
  </table>
</logic:notEmpty>