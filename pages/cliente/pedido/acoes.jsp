<script type="text/javascript">
<!--

function carrinho() {

 location.href = "<%=request.getContextPath()%>/pedido.do?acao=exibirCarrinho";

}

function sair() {
 
 location.href = "<%=request.getContextPath()%>/pedido.do?acao=listar";
 
}

function principal() {

 location.href = "<%=request.getContextPath()%>/menu.do?acao=principal";

}

//-->
</script>