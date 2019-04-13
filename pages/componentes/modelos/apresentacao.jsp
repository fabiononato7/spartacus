<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-tiles.tld" prefix="tiles" %>
<html>
 <head>
  <title>
   <tiles:getAsString name="titulo" />
  </title>
  <html:base />
  <tiles:get name="estilo" />
  <tiles:get name="roteiro" />
 </head>
 <body>
  <table>
   <tr>
    <td>
      <tiles:get name="cabecalho" />
    </td>
   </tr>
   <tr>
    <td>
      <tiles:get name="menu" />
    </td>
   </tr>
   <tr>
     <td>
      <tiles:get name="mensagem" />
     </td>
   </tr>
   <tr>
     <td>
      <tiles:get name="formulario" />
     </td>
   </tr>
   <tr>
     <td>
      <tiles:get name="rodape" />
     </td>
   </tr>
  </table>
 </body>
</html>