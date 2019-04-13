<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ page import="com.nonato.spartacus.util.BobEsponja" %>
<logic:present name="menu">
 <logic:equal name="menu" property="tipoDescricao" value="<%= BobEsponja.USUARIO_ADMINISTRADOR %>">
   <%@ include file="/pages/componentes/objetos/menu_admin.jsp" %>
 </logic:equal>
 <logic:equal name="menu" property="tipoDescricao" value="<%= BobEsponja.USUARIO_CLIENTE %>">
   <%@ include file="/pages/componentes/objetos/menu_cliente.jsp" %>
 </logic:equal>
</logic:present>