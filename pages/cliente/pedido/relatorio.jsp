<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/tld/struts-logic.tld" prefix="logic" %>
<html:form action="pedido.do?acao=notaFiscal" >

 <logic:notEmpty name="notaPedido"> 
 <table>
  <tr>
   <td class="tabelaTituloOperacao"><bean:message key="rot.dados.empresa" /></td>
  </tr>
 </table>
 <table>  
  <tr>
   <td class="tabelaTitulo"><bean:message key="dm.codigo" /></td>
   <td class="tabelaTitulo"><bean:message key="dm.nome.razaosocial" /></td>
   <td class="tabelaTitulo"><bean:message key="dm.responsavel" /></td>
   <td class="tabelaTitulo"><bean:message key="dm.cnpj.cpf" /></td>
  </tr>
  <tr>
   <td class="tabelaCelula"><bean:write name="notaPedido" property="empresa" /></td>
   <td class="tabelaCelula"><bean:write name="notaPedido" property="empresaNome" /></td>
   <td class="tabelaCelula"><bean:write name="notaPedido" property="empresaResponsavel" /></td>
   <td class="tabelaCelula"><bean:write name="notaPedido" property="empresaCnpjCpf" /></td>
  </tr>
 </table> 
 <table>
  <tr>
   <td class="tabelaTituloOperacao"><bean:message key="rot.dados.pedido" /></td>
  </tr>
 </table>
 <table>
  <tr>
   <td class="tabelaTitulo"><bean:message key="dm.codigo" /></td>
   <td class="tabelaTitulo"><bean:message key="dm.data.emissao" /></td>
   <td class="tabelaTitulo"><bean:message key="dm.data.entrega" /></td>
   <td class="tabelaTitulo"><bean:message key="dm.valor" /></td>
  </tr>
  <tr>
   <td class="tabelaCelula"><bean:write name="notaPedido" property="codigo" /></td>
   <td class="tabelaCelulaCentro"><bean:write name="notaPedido" property="dataEmissao" /></td>
   <td class="tabelaCelulaCentro"><bean:write name="notaPedido" property="dataEntrega" /></td>
   <td class="tabelaCelula"><bean:write name="notaPedido" property="valor" /></td>
  </tr>
 </table>
 </logic:notEmpty>

<script>
<!--

function visualizar() {
 
 location.href = "<%=request.getContextPath()%>/pedido.do?acao=printNotaFiscal&codigo=<bean:write name="notaPedido" property="codigo" />";
 
}

function sair() {
 
 location.href = "<%=request.getContextPath()%>/pedido.do?acao=listar";
 
}

//-->
</script>

 <logic:notEmpty name="notaPagamentos">
 <table>
   <tr>
    <td class="tabelaTituloOperacao"><bean:message key="rot.dados.pagamento" /></td>
   </tr>
 </table>
 <table>
   <tr>
    <td class="tabelaTitulo"><bean:message key="dm.codigo" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.descricao" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.data.vencimento" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.valor" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.data.pagamento" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.valor.pago" /></td>
   </tr> 
   <logic:iterate name="notaPagamentos" id="pagamentos" >
    <tr>
     <td class="tabelaCelula"><bean:write name="pagamentos" property="codigo" /></td>
     <td class="tabelaCelula"><bean:write name="pagamentos" property="descricao" /></td>
     <td class="tabelaCelulaCentro"><bean:write name="pagamentos" property="dataVencimento" /></td>
     <td class="tabelaCelula"><bean:write name="pagamentos" property="valor" /></td>
     <td class="tabelaCelulaCentro"><bean:write name="pagamentos" property="dataPagamento" /></td>
     <td class="tabelaCelula"><bean:write name="pagamentos" property="valorPago" /></td>
    </tr>
   </logic:iterate>
 </table>
 </logic:notEmpty>
 <logic:empty name="notaPagamentos">
  <p class="estrangeiro"><bean:message key="msg.vazio.pagamento" /></p>
 </logic:empty>

 <logic:notEmpty name="notaItens">
 <table>
   <tr>
    <td class="tabelaTituloOperacao"><bean:message key="rot.dados.itens" /></td>
   </tr>
 </table>
 <table>
   <tr>
    <td class="tabelaTitulo"><bean:message key="dm.item" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.produto" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.nome" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.preco" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.quantidade.pedida" /></td>
   </tr> 
  <logic:iterate name="notaItens" id="itens" >
   <tr>
    <td class="tabelaCelula"><bean:write name="itens" property="codigo" /></td>
    <td class="tabelaCelula"><bean:write name="itens" property="produto" /></td>
    <td class="tabelaCelula"><bean:write name="itens" property="produtoNome" /></td>
    <td class="tabelaCelula"><bean:write name="itens" property="produtoPreco" /></td>
    <td class="tabelaCelula"><bean:write name="itens" property="quantidade" /></td>
   </tr>
  </logic:iterate>
 </table>	
 </logic:notEmpty>

 <logic:notEmpty name="notaItensLotes">
 <table>
   <tr>
    <td class="tabelaTituloOperacao"><bean:message key="rot.dados.itenslotes" /></td>
   </tr>
 </table>
 <table>
   <tr>
    <td class="tabelaTitulo"><bean:message key="dm.item" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.produto" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.preco" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.quantidade.pedida" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.lote" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.descricao" /></td>
    <td class="tabelaTitulo"><bean:message key="dm.quantidade.atendida" /></td>
   </tr> 
  <logic:iterate name="notaItensLotes" id="itensLotes" >
   <tr>
    <td class="tabelaCelula"><bean:write name="itensLotes" property="item" /></td>
    <td class="tabelaCelula"><bean:write name="itensLotes" property="produtoNome" /></td>
    <td class="tabelaCelula"><bean:write name="itensLotes" property="produtoPreco" /></td>
    <td class="tabelaCelula"><bean:write name="itensLotes" property="itemQuantidade" /></td>
    <td class="tabelaCelula"><bean:write name="itensLotes" property="lote" /></td>
    <td class="tabelaCelula"><bean:write name="itensLotes" property="loteDescricao" /></td>
    <td class="tabelaCelula"><bean:write name="itensLotes" property="quantidade" /></td>
   </tr>
  </logic:iterate>
 </table>	
 </logic:notEmpty>
 <logic:empty name="notaItensLotes">
  <p class="estrangeiro"><bean:message key="msg.vazio.itemlote" /></p>
 </logic:empty>

</html:form>