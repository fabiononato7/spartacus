<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<%@ page import="com.nonato.spartacus.util.BobEsponja" %>
<script type="text/javascript">
<!--

adicionar.disabled = true
alterar.disabled = true;
excluir.disabled = true;

//-->
</script>
<logic:notEmpty name="cidades">
 <html:form action="cidadeRegiao.do?acao=inserir" >
  <input type="hidden" name="regiao" value="<bean:write name="regiao" property="codigo" />"> 
  <div align="center"> 
  <table>
   <tr> 
    <td class="tabelaTitulo"><bean:message key="rot.selecionar" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.codigo" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.nome" /></td>    
    <td class="tabelaTitulo"><bean:message key="dm.cep" /></td>   
   </tr>
   <% String inicio = request.getParameter( "inicio" ); %>
   <logic:iterate name="cidades" id="relatorio" offset="<%= inicio %>" length="<%= Integer.toString( BobEsponja.PAGINADOR ) %>">
   <tr>
    <td class="tabelaCelulaCentro">
     <html:multibox name="cidadeRegiaoForm" property="cidades" styleClass="caixaTexto">
      <bean:write name="relatorio" property="codigo" />
     </html:multibox>
    </td>
    <td class="tabelaCelula"><bean:write name="relatorio" property="codigo" /></td>
    <td class="tabelaCelula">
     <bean:write name="relatorio" property="nome" />-<bean:write name="relatorio" property="estadoSigla" />
    </td>
    <td class="tabelaCelulaCentro"><bean:write name="relatorio" property="cep" /></td>
    </td>
   </tr>
   </logic:iterate>
  </table>
  </div>
 </html:form>
</logic:notEmpty>