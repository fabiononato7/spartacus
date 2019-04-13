<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ page import="com.nonato.spartacus.util.BobEsponja" %>
<table align="left" class="fundo">
 <logic:present name="menu">
 <tr> 
   <td width="390"> 
    <div align="center">
     Nonato Consultoria e Sistemas S.A. - Spartacus 1.0 - Enterprise Web Suite 
     Copyright 2005/2006 - Todos os direitos reservados 
    </div>
   </td>
   <td class="traco">|</td>
   <td width="129">
     <div align="center">
      <script type="text/javascript">
      <!--
       escreverData();
      //-->
      </script>
     </div>
   </td>
   <td class="traco">|</td>
   <td width="24">
    <div align="center">
     <logic:equal name="menu" property="tipoDescricao" value="<%= BobEsponja.USUARIO_ADMINISTRADOR %>">
      <img src="<html:rewrite page='/images/admin.gif' />">
     </logic:equal>
     <logic:equal name="menu" property="tipoDescricao" value="<%= BobEsponja.USUARIO_CLIENTE %>">
      <img src="<html:rewrite page='/images/cliente.gif' />">
     </logic:equal>
    </div>
   </td>
   <td class="traco">|</td>
   <td width="30">
    <div align="center">
     <img src="<html:rewrite page='/images/recados.gif' />" width="16" height="16">
    </div>
   </td>
   <td class="traco">|</td>
   <td width="173">
    <div align="center">
     Seja bem vindo, <bean:write name="menu" property="primeiroNome" />
    </div>
   </td>
   <td class="traco">|</td>
   <td width="135">
    <div align="center"> 
     <input type="button" name="exit" value="<bean:message key="btn.desconectar" />" onClick="location.href='<%= request.getContextPath() %>/menu.do?acao=desconectar'" class="botoesAzulMaior">
    </div>
   </td>
 </tr>
 </logic:present>
 </table>