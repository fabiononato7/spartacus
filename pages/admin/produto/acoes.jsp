<script type="text/javascript">
<!--

function novo() {

 location.href = "<%=request.getContextPath()%>/produto.do?acao=telaInserir";

}

function limpar() {

 limparCampos( document.forms[0].nome );
 limparCampos( document.forms[0].preco );
 limparCampos( document.forms[0].empresa );
 limparCampos( document.forms[0].empresaNome );

}

function enviar() {
 
 acao( document.forms[0] );
 
}

function listar() {

 location.href = "<%=request.getContextPath()%>/produto.do?acao=listar";

}

function sair() {
 
 location.href = "<%=request.getContextPath()%>/produto.do?acao=listar";
 
}

function principal() {

 location.href = "<%=request.getContextPath()%>/menu.do?acao=principal";

}

//-->
</script>