<script type="text/javascript">
<!--

function novo() {

 location.href = "<%=request.getContextPath()%>/condicao.do?acao=telaInserir";

}

function limpar() {

 limparCampos( document.forms[0].dias );
 limparCampos( document.forms[0].juros );
 limparCampos( document.forms[0].multa );
 limparCampos( document.forms[0].parcelas );

}

function enviar() {
 
 acao( document.forms[0] );
 
}

function listar() {

 location.href = "<%=request.getContextPath()%>/condicao.do?acao=listar";

}

function sair() {
 
 location.href = "<%=request.getContextPath()%>/condicao.do?acao=listar";
 
}

function principal() {

 location.href = "<%=request.getContextPath()%>/menu.do?acao=principal";

}

//-->
</script>