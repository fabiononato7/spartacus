<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<logic:notEmpty name="promocao">
  <table>
   <tr>
   <tr>
    <td class="tabelaTitulo"><bean:message key="dm.codigo" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.descricao" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.data.inicio" /></td>
    <td class="tabelaTitulo""><bean:message key="dm.data.final" /></td>        
   </tr>
   <tr>
    <td class="tabelaCelula"><bean:write name="promocao" property="codigo" /></td>
    <td class="tabelaCelula"><bean:write name="promocao" property="descricao" /></td>
    <td class="tabelaCelulaCentro"><bean:write name="promocao" property="dataInicio" /></td>
    <td class="tabelaCelulaCentro"><bean:write name="promocao" property="dataFinal" /></td>
   </tr>
  </table>
</logic:notEmpty>