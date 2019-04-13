<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<html>
 <head>
 <title>Nonato</title>
 <meta http-equiv="refresh" content="5;URL=<%= request.getContextPath() %>/menu.do?acao=login">
 <style type="text/css">
 <!--
 p {
	position: relative;
	top: 15%;
	width: auto;
 }
 -->
 </style>
 </head>
 <body>
  <div align="center">
   <p>
     <img src="<html:rewrite page='/images/nonato_2005.jpg' />" width="495" height="305" border="0">
   </p>
  </div>
 </body>
</html>