<script type="text/javascript">
<!--

function carrinho() {

 location.href = "<%=request.getContextPath()%>/promocao.do?acao=listarCarrinho";

}

function sair() {
 
 location.href = "<%=request.getContextPath()%>/promocao.do?acao=listar";
 
}

function principal() {

 location.href = "<%=request.getContextPath()%>/menu.do?acao=principal";

}

//-->
</script>