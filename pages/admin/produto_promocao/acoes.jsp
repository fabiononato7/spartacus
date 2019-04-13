<script type="text/javascript">
<!--

function adicionar() {

 location.href = "<%=request.getContextPath()%>/produtoPromocao.do?acao=telaAdicionar";

}

function enviar() {
 
 acao( document.forms[0] );
 
}

function listar() {

 location.href = "<%=request.getContextPath()%>/produtoPromocao.do?acao=listarProdutos&codigo=<%= request.getParameter( "codigo" ) %>";

}

function sair() {
 
 location.href = "<%=request.getContextPath()%>/promocao.do?acao=listar";
 
}

function principal() {

 location.href = "<%=request.getContextPath()%>/menu.do?acao=principal";

}

//-->
</script>