<script type="text/javascript">
<!--

function novo() {

 location.href = "<%=request.getContextPath()%>/empresa.do?acao=telaInserir";

}

function limpar() {

 limparCampos( document.forms[0].nomeRazaoSocial );
 limparCampos( document.forms[0].responsavel );
 limparCampos( document.forms[0].cnpjCpf );
 limparCampos( document.forms[0].email );
 limparCampos( document.forms[0].endereco );
 limparCampos( document.forms[0].bairroDistrito );
 limparCampos( document.forms[0].foneFax );
 limparCampos( document.forms[0].alvara );
 limparCampos( document.forms[0].inscricaoEstadual );
 limparCampos( document.forms[0].loginUsuario );
 limparCampos( document.forms[0].loginSenha );
 limparCampos( document.forms[0].observacao );

 limparCampos( document.forms[0].cidade );
 limparCampos( document.forms[0].cidadeNome );
 limparCampos( document.forms[0].cidadeEstadoSigla );
 limparCampos( document.forms[0].cidadeCep );
 
 limparCampos( document.forms[0].condicao );
 limparCampos( document.forms[0].condicaoDias );
 limparCampos( document.forms[0].condicaoJuros );
 limparCampos( document.forms[0].condicaoMulta );
 limparCampos( document.forms[0].condicaoParcelas );

}

function enviar() {
 
 acao( document.forms[0] );
 
}

function listar() {

 location.href = "<%=request.getContextPath()%>/empresa.do?acao=listar";

}

function sair() {
 
 location.href = "<%=request.getContextPath()%>/empresa.do?acao=listar";
 
}

function principal() {

 location.href = "<%=request.getContextPath()%>/menu.do?acao=principal";

}

//-->
</script>