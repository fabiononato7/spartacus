<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ page import="com.nonato.spartacus.util.BobEsponja" %>
<logic:notEmpty name="pagamentos">
 <table align="right">
  <tr>
   <bean:size name="pagamentos" id="registros" />
   <%
    int paginador = BobEsponja.PAGINADOR;
    int total = Integer.parseInt( registros.toString() );
    int paginas = (total / paginador);
    int contador = 0;
    for ( int i = 0; i <= paginas; i++ ) {
     %>
      <td class="tabelaCelulaCentro">
       <a href="<%= request.getContextPath() %>/pagamento.do?acao=listar&inicio=<%= contador %>"><%= (i + 1) %></a>
      </td>
     <%
     contador += paginador;
    }    
   %>
  </tr>
 </table>
</logic:notEmpty>