<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ page import="com.nonato.spartacus.util.BobEsponja" %>
<logic:notEmpty name="produtos">
 <table align="right">
  <tr>
   <bean:size name="produtos" id="registros" />
   <%
    int paginador = BobEsponja.PAGINADOR;
    int total = Integer.parseInt( registros.toString() );
    int paginas = (total / paginador);
    int contador = 0;
    for ( int i = 0; i <= paginas; i++ ) {
     %>
      <td class="tabelaCelulaCentro">
       <a href="<%= request.getContextPath() %>/pedido.do?acao=paginarProdutos&inicio=<%= contador %>"><%= (i + 1) %></a>
      </td>
     <%
     contador += paginador;
    }    
   %>
  </tr>
 </table>
</logic:notEmpty>
<%-- estou testando o m�todo paginarProdutos de Pedido --%>