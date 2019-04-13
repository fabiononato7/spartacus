<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<script type="text/javascript" src="<html:rewrite page='/pages/componentes/roteiros/menu_admin.js' />">
</script>
<script language="JavaScript">
<!--
function mmLoadMenus() {
  if (window.mm_menu_1108164010_0) return;
  window.mm_menu_1108164010_0 = new Menu("root",82,26,"Century Gothic",11,"#7671b0","#ffffff","#ffffff","#7671b0","left","middle",3,0,1000,-5,7,true,true,true,0,false,false);
  mm_menu_1108164010_0.addMenuItem("Nota&nbsp;Fiscal","window.open('/spartacus/menu.do?acao=listarPedidos', '_self');");
   mm_menu_1108164010_0.fontWeight="bold";
   mm_menu_1108164010_0.hideOnMouseOut=true;
   mm_menu_1108164010_0.menuBorder=1;
   mm_menu_1108164010_0.menuLiteBgColor='#7671b0';
   mm_menu_1108164010_0.menuBorderBgColor='#7671b0';
   mm_menu_1108164010_0.bgColor='#7671b0';
  window.mm_menu_1108163936_1 = new Menu("root",82,26,"Century Gothic",11,"#7671b0","#ffffff","#ffffff","#7671b0","left","middle",3,0,1000,-5,7,true,true,true,0,false,false);
  mm_menu_1108163936_1.addMenuItem("Cidades","window.open('/spartacus/cidade.do?acao=telaInserir', '_self');");
  mm_menu_1108163936_1.addMenuItem("Condi&ccedil;&otilde;es","window.open('/spartacus/condicao.do?acao=telaInserir', '_self');");
  mm_menu_1108163936_1.addMenuItem("Empresas","window.open('/spartacus/empresa.do?acao=telaInserir', '_self');");
  mm_menu_1108163936_1.addMenuItem("Lotes","window.open('/spartacus/lote.do?acao=telaInserir', '_self');");
  mm_menu_1108163936_1.addMenuItem("Produtos","window.open('/spartacus/produto.do?acao=telaInserir', '_self');");
  mm_menu_1108163936_1.addMenuItem("Promo&ccedil;&otilde;es","window.open('/spartacus/promocao.do?acao=telaInserir', '_self');");
  mm_menu_1108163936_1.addMenuItem("Regi&otilde;es","window.open('/spartacus/regiao.do?acao=telaInserir', '_self');");
   mm_menu_1108163936_1.fontWeight="bold";
   mm_menu_1108163936_1.hideOnMouseOut=true;
   mm_menu_1108163936_1.menuBorder=1;
   mm_menu_1108163936_1.menuLiteBgColor='#7671b0';
   mm_menu_1108163936_1.menuBorderBgColor='#7671b0';
   mm_menu_1108163936_1.bgColor='#7671b0';
  window.mm_menu_1025132848_1 = new Menu("root",82,26,"Century Gothic",11,"#7671b0","#ffffff","#ffffff","#7671b0","left","middle",3,0,1000,-5,7,true,true,true,0,false,false);
  mm_menu_1025132848_1.addMenuItem("Cidades","window.open('/spartacus/menu.do?acao=listarCidades', '_self');");
  mm_menu_1025132848_1.addMenuItem("Condi&ccedil;&otilde;es","window.open('/spartacus/menu.do?acao=listarCondicoes', '_self');");
  mm_menu_1025132848_1.addMenuItem("Empresas","window.open('/spartacus/menu.do?acao=listarEmpresas', '_self');");
  mm_menu_1025132848_1.addMenuItem("Lotes","window.open('/spartacus/menu.do?acao=listarLotes', '_self');");
  mm_menu_1025132848_1.addMenuItem("Pagamentos","location='/spartacus/menu.do?acao=listarPagamentos'");
  mm_menu_1025132848_1.addMenuItem("Produtos","window.open('/spartacus/menu.do?acao=listarProdutos', '_self');");
  mm_menu_1025132848_1.addMenuItem("Promo&ccedil;&otilde;es","window.open('/spartacus/menu.do?acao=listarPromocoes', '_self');");
  mm_menu_1025132848_1.addMenuItem("Regi&otilde;es","window.open('/spartacus/menu.do?acao=listarRegioes', '_self');");
   mm_menu_1025132848_1.fontWeight="bold";
   mm_menu_1025132848_1.hideOnMouseOut=true;
   mm_menu_1025132848_1.menuBorder=1;
   mm_menu_1025132848_1.menuLiteBgColor='#7671b0';
   mm_menu_1025132848_1.menuBorderBgColor='#7671b0';
   mm_menu_1025132848_1.bgColor='#7671b0';

  mm_menu_1025132848_1.writeMenus();
} // mmLoadMenus()
//-->
</script>
<table align="left">
 <tr>
  <td width="939" class="fundo"> 
    <script language="JavaScript1.2">
     mmLoadMenus();
    </script> 
    <img name="menu" src="<html:rewrite page='/images/menu_admin.gif' />" width="484" height="20" border="0" usemap="#m_menu" alt="">
     <map name="m_menu">
       <area shape="poly" coords="190,0,287,0,287,20,190,20,190,0" href="#" alt="" onMouseOut="MM_startTimeout();"  onMouseOver="MM_showMenu(window.mm_menu_1108164010_0,190,26,null,'menu');"  >
       <area shape="poly" coords="0,0,87,0,87,20,0,20,0,0" href="/spartacus/regiao.do?acao=telaInserir" alt="" onMouseOut="MM_startTimeout();"  onMouseOver="MM_showMenu(window.mm_menu_1108163936_1,0,26,null,'menu');"  >
       <area shape="poly" coords="91,0,188,0,188,20,91,20,91,0" href="#" alt="" onMouseOut="MM_startTimeout();"  onMouseOver="MM_showMenu(window.mm_menu_1025132848_1,91,26,null,'menu');"  >
     </map>
  </td>
 </tr>
</table>