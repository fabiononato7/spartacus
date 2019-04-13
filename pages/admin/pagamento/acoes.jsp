<script type="text/javascript">
<!--

// desabilita função de novo pedido
novo.disabled = true;

function novo() {

 location.href = "<%=request.getContextPath()%>/pagamento.do?acao=telaInserir";

}

function limpar() {

 limparCampos( document.forms[0].descricao );
 limparCampos( document.forms[0].dataVencimento );
 limparCampos( document.forms[0].valor );
 limparCampos( document.forms[0].dataPagamento );
 limparCampos( document.forms[0].valorPago );

}

function enviar() {
 
 acao( document.forms[0] );
 
}

function listar() {

 location.href = "<%=request.getContextPath()%>/pagamento.do?acao=listar";

}

function sair() {
 
 location.href = "<%=request.getContextPath()%>/pagamento.do?acao=listar";
 
}

function principal() {

 location.href = "<%=request.getContextPath()%>/menu.do?acao=principal";

}

//-->
</script>