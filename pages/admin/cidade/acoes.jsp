<script type="text/javascript">
<!--

function novo() {

 location.href = "<%=request.getContextPath()%>/cidade.do?acao=telaInserir";

}

function limpar() {

 limparCampos( document.forms[0].nome );
 limparCampos( document.forms[0].cep );

}

function enviar() {
 
 acao( document.forms[0] );
 
}

function listar() {

 location.href = "<%=request.getContextPath()%>/cidade.do?acao=listar";

}

function sair() {
 
 location.href = "<%=request.getContextPath()%>/cidade.do?acao=listar";
 
}

function principal() {

 location.href = "<%=request.getContextPath()%>/menu.do?acao=principal";

}

//-->
</script>