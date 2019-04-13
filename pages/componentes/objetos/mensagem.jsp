<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<table>
 <logic:messagesPresent>
  <html:messages id="error">
 <tr>
  <td width="37">
   <img src="<html:rewrite page='/images/erro.gif' />" width="37" height="37">
  </td>
  <td width="544">
   <div class="erro"> 
    <ul class="listaErro">
	 <li><bean:write name="error" /></li>
	</ul>
   </div>
  </td>
 </tr> 
  </html:messages>
 </logic:messagesPresent>
 <logic:messagesPresent message="true">
  <html:messages id="msg" message="true">
 <tr>
  <td width="37">
   <img src="<html:rewrite page='/images/mensagem.gif' />" width="37" height="37">
  </td>
  <td width="544">
   <div class="mensagem">
    <ul class="listaMensagem">
	 <li><bean:write name="msg" /></li>
	</ul>
   </div>
  </td>
 </tr> 
  </html:messages>
 </logic:messagesPresent>
</table>