<script type="text/javascript">
<!--

function novo() {

 location.href = "<%=request.getContextPath()%>/lote.do?acao=telaInserir";

}

function limpar() {

 limparCampos( document.forms[0].descricao );
 limparCampos( document.forms[0].dataFabricacao );
 limparCampos( document.forms[0].dataValidade );
 limparCampos( document.forms[0].quantidadeProduzida );
 limparCampos( document.forms[0].quantidadeDisponivel );
 limparCampos( document.forms[0].produto );
 limparCampos( document.forms[0].produtoNome );

}

function enviar() {
 
 acao( document.forms[0] );
 
}

function listar() {

 location.href = "<%=request.getContextPath()%>/lote.do?acao=listar";

}

function sair() {
 
 location.href = "<%=request.getContextPath()%>/lote.do?acao=listar";
 
}

function principal() {

 location.href = "<%=request.getContextPath()%>/menu.do?acao=principal";

}

//-->
</script>