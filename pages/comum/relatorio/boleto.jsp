<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<html>
<head>
 <title>Boleto Banc&aacute;rio</title>
</head>

<body bgcolor="#FFFFFF">
<logic:present name="boletoBancario" >
<center>
<H2>Boleto Banc&aacute;rio</H2>

<table WIDTH="640" CELLSPACING="1" CELLPADDING="0" BORDER="0">
 <tr>
  <td colspan="2">
   <img src="<html:rewrite page='/images/cortar.gif' />" border="0">
  </td>
 </tr>
</table>
  
<br>
  
<table WIDTH="640" CELLSPACING="1" CELLPADDING="1" BORDER="0">
 <tr>
  <td WIDTH="350">
   <img src="<html:rewrite page='/images/banco_bb.gif' />" border="0" valign="bottom" align="top">
   <b><font size=2>| 001-9 |</font></b>
  </td>         
  <td ALIGN="RIGHT" VALIGN="BOTTOM" WIDTH="320">
   <font FACE="arial" size="2">
   <b>RECIBO DO SACADO</b>
   </font>
  </td>
 </tr>
</table>
    
<table WIDTH="640" BORDER="01" CELLSPACING="0" CELLPADDING="02">
 <tr> 
  <td width="247" align="left">
   <font face="Arial, Helvetica, sans-serif" size="1">Cedente:<br>
    SPARTACUS <br></font>
  </td>
  <td width="137" align="left">
   <font face="Arial, Helvetica, sans-serif" size="1">Agência/Cód. Cedente<br>
   00508-8/4673-6 <br></font>
  </td>
  <td width="117" align="left">
   <font face="Arial, Helvetica, sans-serif" size="1">Data Emissão<br>
   <bean:write name="boletoBancario" property="pedidoDataEmissao" /><br></font>
  </td>
  <td width="113" align="right">
   <font face="Arial, Helvetica, sans-serif" size="1">Vencimento<br>
   <bean:write name="boletoBancario" property="dataVencimento" /><br></font>
  </td>
 </tr>
 <tr align="left"> 
  <td width="247" align="left">
   <font face="arial" size="1">Sacado<br>
   <bean:write name="boletoBancario" property="pedidoEmpresaNome" />
   </font>
  </td>
  <td width="137" align="left">
   <font face="arial" size="1">Nosso Número<br>
   84570846053-5<br></font>
  </td>
  <td width="117" align="left">
   <font face="arial" size="1">Número Documento<br>
   <bean:write name="boletoBancario" property="codigo" /><br></font>
  </td>
  <td width="113" align="right">
   <font face="arial" size="1">Valor do Documento<br>
   <bean:write name="boletoBancario" property="valor" /><br></font>
  </td>
 </tr>
 <tr>
  <td width="100%" align="left">
   <font FACE="arial" SIZE="1">Referência:<br>
    Pedido Eletrônico    
   <br><br></font>
  </td>
 </tr>
</table>

<table WIDTH="640" BORDER="00" CELLSPACING="0" CELLPADDING="02">
 <tr>
  <td width="100%" align="right">
   <font FACE="arial" SIZE="2"><b>Autenticação Mecânica</b></font><br>
  </td>
 </tr>
 <tr>
  <td width="100%" align="center">&nbsp;</td>
 </tr>
</table>
    
<table WIDTH="640" CELLSPACING="0" CELLPADDING="0" BORDER="0">
 <tr>
  <td colspan="2">
   <img src="<html:rewrite page='/images/cortar.gif' />" border="0">
  </td>
 </tr>
</table>

<br>

<table WIDTH="640" CELLSPACING="1" CELLPADDING="1" BORDER="0">
 <tr>
  <td>
   <img src="<html:rewrite page='/images/banco_bb.gif' />" border="0" valign="bottom" align="top">
   <b><font size=2>| 001-9 |</font></b>
  </td>
  <td ALIGN="RIGHT" VALIGN="BOTTOM">
   <tt><font FACE="arial" size="2"><b>00192.18676&nbsp;&nbsp;70000.000003&nbsp;&nbsp;00000.001214&nbsp;&nbsp;7&nbsp;&nbsp;&nbsp;&nbsp;29870010000000</b>
   </font></tt>
  </td>
 </tr>
</table>

<table WIDTH="640" BORDER="1" CELLSPACING="0" CELLPADDING="01">
 <tr>
  <td COLSPAN="7">
   <table WIDTH="100%" BORDER="0" CELLSPACING="0" CELLPADDING="0">
    <tr>
     <td valign="top" width="120">
      <font FACE="arial" SIZE="1">Local de Pagamento:</font><br>
     </td>
     <td valign="top" width="370">
      <font FACE="arial" SIZE="1">ATÉ O VENCIMENTO PAGÁVEL EM QUALQUER BANCO.</font>
     </td>
    </tr>
   </table>
  </td>
  <td width="150">
   <table BORDER="0" CELLSPACING="0" CELLPADDING="0" HEIGHT="100%" WIDTH="100%">
    <tr>
     <td BGCOLOR="lightgrey">
      <font FACE="Arial" SIZE="1">Vencimento</font><br>
     </td>
    </tr><tr>
     <td ALIGN="RIGHT" BGCOLOR="lightgrey">
      <font FACE="Arial" SIZE="2"><b><bean:write name="boletoBancario" property="dataVencimento" /></b></font><br>
     </td>
    </tr>
   </table>
  </td>
 </tr>
 <tr>
  <td COLSPAN="7" width="490" valign="top">
   <table WIDTH="100%" BORDER="0" CELLSPACING="0" CELLPADDING="0">
    <tr>
     <td valign="top">
      <font FACE="arial" SIZE="1">Cedente</font><br>
     </td>
    </tr><tr>
     <td valign="top">
      <font FACE="arial" SIZE="2">SPARTACUS</font><br>
     </td>
    </tr>
   </table>
  </td>
  <td>
   <table WIDTH="100%" BORDER="0" CELLSPACING="1" CELLPADDING="1">
    <tr>
     <td>
      <font FACE="arial" SIZE="1">Agência/Cód. Cedente</font><br>
     </td>
    </tr><tr>
     <td ALIGN="RIGHT">
      <font FACE="arial" SIZE="1"><b>00508-8/4673-6</b></font><br>
     </td>
    </tr>
   </table>
  </td>
 </tr>
 <tr>
  <td WIDTH="130" colspan="2">
   <table WIDTH="100%" BORDER="0" CELLSPACING="0" CELLPADDING="0">
    <tr>
     <td>
      <font FACE="arial" SIZE="1">Data do documento:</font><br>
     </td>
    </tr><tr>
     <td ALIGN="CENTER">
      <font FACE="arial" SIZE="1"><b><bean:write name="boletoBancario" property="pedidoDataEmissao" /></b></font><br>
     </td>
    </tr>
   </table>
  </td>
  <td WIDTH="120" colspan="2">
   <table WIDTH="100%" BORDER="0" CELLSPACING="0" CELLPADDING="0">
    <tr>
     <td>
      <font FACE="arial" SIZE="1">No. do documento</font><br>
     </td>
    </tr><tr>
     <td ALIGN="CENTER">
      <font FACE="arial" SIZE="1"><b><bean:write name="boletoBancario" property="codigo" /></b></font><br>
     </td>
    </tr>
   </table>
  </td>
  <td WIDTH="80">
   <table WIDTH="100%" BORDER="0" CELLSPACING="0" CELLPADDING="0">
    <tr>
     <td>
      <font FACE="arial" SIZE="1">Espécie doc.</font><br>
     </td>
    </tr>
    <tr>
     <td ALIGN="CENTER">
      <font FACE="arial" SIZE="1"><b>Outro</b></font><br>
     </td>
    </tr>
   </table>
  </td>
  <td WIDTH="40">
   <table WIDTH="100%" BORDER="0" CELLSPACING="0" CELLPADDING="0">
    <tr>
     <td>
      <font FACE="arial" SIZE="1">Aceite</font><br>
     </td>
    </tr><tr>
     <td ALIGN="CENTER">
      <font FACE="arial" SIZE="1"><b>N</b></font><br>
     </td>
    </tr>
   </table>
  </td>
  <td WIDTH="120">
   <table WIDTH="100%" BORDER="0" CELLSPACING="0" CELLPADDING="0">
    <tr>
     <td>
      <font FACE="arial" SIZE="1">Data Processamento</font>
     </td>
    </tr><tr>
     <td ALIGN="CENTER">
      <font FACE="arial" SIZE="1"><b><bean:write name="boletoBancario" property="pedidoDataEmissao" /></b></font>
     </td>
    </tr>
   </table>
  </td>
  <td WIDTH="140">
   <table WIDTH="100%" BORDER="0" CELLSPACING="0" CELLPADDING="0">
    <tr>
     <td>
      <font FACE="arial" SIZE="1">Nosso Número</font><br>
     </td>
    </tr><tr>
     <td ALIGN="RIGHT">
      <font FACE="arial" SIZE="1"><b>84570846053-5</b></font><br>
     </td>
    </tr>
   </table>
  </td>
 </tr><tr>
  <td WIDTH="90">
   <table WIDTH="100%" BORDER="0" CELLSPACING="0" CELLPADDING="0">
    <tr>
     <td>
      <font FACE="arial" SIZE="1">Uso do Banco</font><br>
     </td>
    </tr><tr>
     <td ALIGN="CENTER">
      <font FACE="arial" SIZE="1"><b>&nbsp;</b></font><br>
     </td>
    </tr>
   </table>
  </td>
  <td WIDTH="40">
   <table WIDTH="100%" BORDER="0" CELLSPACING="0" CELLPADDING="0">
    <tr>
     <td>
      <font FACE="arial" SIZE="1">Cip</font><br>
     </td>
    </tr><tr>
     <td ALIGN="CENTER">
      <font FACE="arial" SIZE="1"><b>&nbsp;</b></font><br>
     </td>
    </tr>
   </table>
  </td>
  <td WIDTH="40">
   <table WIDTH="100%" BORDER="0" CELLSPACING="0" CELLPADDING="0">
    <tr>
     <td>
      <font FACE="arial" SIZE="1">Carteira</font><br>
     </td>
    </tr><tr>
     <td ALIGN="CENTER">
      <font FACE="arial" SIZE="1"><b>18</b></font><br>
     </td>
    </tr>
   </table>
  </td>
  <td WIDTH="80">
   <table WIDTH="100%" BORDER="0" CELLSPACING="0" CELLPADDING="0">
    <tr>
     <td>
      <font FACE="arial" SIZE="1">Espécie Moeda</font><br>
     </td>
    </tr><tr ALIGN="CENTER">
     <td>
      <font FACE="arial" SIZE="1"><b>R$</b></font><br>
     </td>
    </tr>
   </table>
  </td>
  <td WIDTH="120" colspan="2">
   <table WIDTH="100%" BORDER="0" CELLSPACING="0" CELLPADDING="0">
    <tr>
     <td>
      <font FACE="arial" SIZE="1">Quantidade</font><br>
     </td>
    </tr><tr>
     <td ALIGN="CENTER">
      <font FACE="arial" SIZE="1"><b>&nbsp;</b></font><br>
     </td>
    </tr>
   </table>
  </td>
  <td WIDTH="120">
   <table WIDTH="100%" BORDER="0" CELLSPACING="0" CELLPADDING="0">
    <tr>
     <td>
      <font FACE="arial" SIZE="1">Valor</font><br>
     </td>
    </tr><tr>
     <td>
      <font FACE="arial" SIZE="1"><b><bean:write name="boletoBancario" property="valor" /></b></font><br>
     </td>
    </tr>
   </table>
  </td>
  <td WIDTH="150">
   <table BORDER="0" HEIGHT="100%" WIDTH="100%" CELLPADDING="0" CELLSPACING="0">
    <tr>
     <td HEIGHT="50%" BGCOLOR="lightgrey">
      <font FACE="arial" SIZE="1">(=) Valor do Documento</font><br>
     </td>
    </tr><tr>
     <td ALIGN="RIGHT" HEIGHT="50%" BGCOLOR="lightgrey">
      <font FACE="arial" SIZE="2"><b><bean:write name="boletoBancario" property="valor" /></b></font><br>
     </td>
    </tr>
   </table>
  </td>
 </tr><tr>
  <td COLSPAN="7" VALIGN="TOP">
   <table WIDTH="100%" BORDER="0" CELLSPACING="0" CELLPADDING="0">
    <tr VALIGN="MIDDLE">
     <td HEIGHT="23">
      <font FACE="arial" SIZE="1"><b>Instruções</b><br></font>
     </td>
    </tr>
    <tr VALIGN="TOP">
     <td>
      <font FACE="arial" SIZE="1">Caixa: Não receber após data de vencimento
      <br></font>
     </td>
    </tr>
   </table>
  </td>
  <td>
   <table WIDTH="100%" BORDER="1" CELLSPACING="0" CELLPADDING="0">
    <tr VALIGN="TOP">
     <td HEIGHT="23">
      <font FACE="arial" SIZE="1">(-) Descontos/Abatimento<br></font>
     </td>
    </tr><tr VALIGN="TOP">
     <td HEIGHT="23">
      <font FACE="arial" SIZE="1">(-) Outras Deduções<br></font>
     </td>
    </tr><tr VALIGN="TOP">
     <td HEIGHT="23">
      <font FACE="arial" SIZE="1">(+) Mora/Multa</font><br>
     </td>
    </tr><tr VALIGN="TOP">
     <td HEIGHT="23">
      <font FACE="arial" SIZE="1">(+) Outros Acréscimos<br></font>
     </td>
    </tr><tr VALIGN="TOP">
     <td BGCOLOR="lightgrey" HEIGHT="23">
      <font FACE="arial" SIZE="1">(=) Valor Cobrado</font><br>
     </td>
    </tr>
   </table>
  </td>
 </tr><tr>
  <td COLSPAN="6">
   <table WIDTH="100%" BORDER="0" CELLSPACING="0" CELLPADDING="0">
    <tr>
     <td valign="top" width="100">
      <font FACE="arial" SIZE="1">Sacado:</font><br>
     </td>
     <td WIDTH="100%" valign="top"> <font FACE="arial" SIZE="1">
      <bean:write name="boletoBancario" property="pedidoEmpresaNome" />
      &nbsp;-&nbsp;
      <bean:write name="boletoBancario" property="pedidoEmpresaCnpjCpf" />
      <br>
      <bean:write name="boletoBancario" property="pedidoEmpresaEndereco" />-<bean:write name="boletoBancario" property="pedidoEmpresaBairroDistrito" /><br>
      <bean:write name="boletoBancario" property="pedidoEmpresaCep" />,<bean:write name="boletoBancario" property="pedidoEmpresaCidade" />-<bean:write name="boletoBancario" property="pedidoEmpresaEstado" /><br>
      Sacador/Avalista: SPARTACUS</font>
     </td>
    </tr>
   </table>
  </td>
  <td colspan="2" valign="bottom" align="center">
   <font FACE="arial" SIZE="2"><b>Ficha de Compensação</b></font>
  </td>
 </tr>
</table>


<table WIDTH="640" CELLSPACING="0" CELLPADDING="0" BORDER="0">
 <tr>

<%-- código de barras --%>
<jsp:include page="codigoBarras.jsp" flush="true" />
<%-- código de barras --%>
   
   <br>
  </td>
  <td valign="top" align="center" width="300">
   <font face="arial" SIZE="1"><center>Autenticação Mecânica</center></font>
  </td>
 </tr><tr>
  <td>&nbsp;</td>
 </tr><tr>
  <td colspan="2">
   <img SRC="images/cortar.gif" BORDER="0" WIDTH="640" HEIGHT="21">
  </td>
 </tr>
</table>

<br>
<font color="#FFFFFF">
<a href="Javascript:close()">
 <img src="<html:rewrite page='/images/sair.gif' />" border="0"></a>
<a href="Javascript:self.print()">
 <img src="<html:rewrite page='/images/imprimir.gif' />" border="0"></a>
</font>
<br><br> 

</center>
</logic:present>
</body>
</html>