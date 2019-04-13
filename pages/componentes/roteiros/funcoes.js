/* envia o conteúdo do formulário, executa o action */
function acao( form ) {

 form.submit();

}

/* limpa o conteúdo do objeto text passado como argumento */
function limparCampos( objeto ) {

 objeto.value = "";

}

/* 
 pula campos text com enter ou com o maxlength alcançado.
 --> não permite alterar o valor depois de pular o campo text.
*/
function pular() {
  
  if ( window.event.srcElement.type == "text" ) {
  
   var elemento = window.event.srcElement;
   var indice = elemento.sourceIndex;
     
   if ( window.event.keyCode == 13 ) {
  
    document.all.item( indice + 2 ).focus();
    window.event.returnValue = false;
  
   } 
	   
   if ( elemento.value.length == elemento.getAttribute( "maxlength" ) ) {
  
    document.all.item( indice + 2).focus();
  
   }
      
  }
  
}

/* escreve data atual */
function escreverData() {
 
   var hoje, dia, mes, ano;
   
   hoje = new Date();
   
   dia = hoje.getDate();
   mes = hoje.getMonth() + 1;
   ano = hoje.getFullYear();
   
   document.write( dia + "/" + mes + "/" + ano );
 
 }

/* somente número inteiros */
function somenteNumeros() {

 var tecla = window.event.keyCode;
 
 if ( (tecla != 8) && (tecla != 46) && (tecla != 37) && (tecla != 39) ) {
  
  if ( (tecla < 48) || (tecla > 57) ) { 
 	  
  	 event.returnValue = false;
 
  }
  
 }
 
}

function voltar( history ) {

 history.back();

}

/* formata valores, passando uma máscara */
function formatar(src, mask) {
 
 var i = src.value.length;
 var saida = mask.substring(0,1);
 var texto = mask.substring(i);
 
 if (texto.substring(0,1) != saida) {
 
  src.value += texto.substring(0,1);
 
 }
 
}

function formatarCep(src) {
 
 if ( somenteNumeros() != true ) {
 
   var mask = "#####-###";
   
   formatar( src, mask )
 
 } else {
 
   event.returnValue = false;
 
 } 
 
}

function formatarPorcentagem(src) {
 
 if ( somenteNumeros() != true ) {
 
   var mask = "##,##";
   
   formatar( src, mask )
 
 } else {
 
   event.returnValue = false;
 
 } 
 
}

function formatarData(src) {
 
 if ( somenteNumeros() != true ) {
 
   var mask = "##/##/####";
   
   formatar( src, mask )
 
 } else {
 
   event.returnValue = false;
 
 } 
 
}

function formatarCpf(src) {
 
 if ( somenteNumeros() != true ) {
 
   var mask = "###.###.###-##";
   
   formatar( src, mask )
 
 } else {
 
   event.returnValue = false;
 
 } 
 
}

function formatarFoneFax(src) {
 
 if ( somenteNumeros() != true ) {
 
   var mask = "##-####-####";
   
   formatar( src, mask )
 
 } else {
 
   event.returnValue = false;
 
 } 
 
}

function formatarDinheiro(campo, tammax) {

 var tecla = window.event.keyCode;
 vr = campo.value;
 vr = vr.replace( "/", "" );
 vr = vr.replace( "/", "" );
 vr = vr.replace( ",", "" );
 vr = vr.replace( ".", "" );
 vr = vr.replace( ".", "" );
 vr = vr.replace( ".", "" );
 vr = vr.replace( ".", "" );
 tam = vr.length;
 
 if (tam < tammax && tecla != 8) {
  tam = vr.length + 1;
 }
 if (tecla == 8 ) {
  tam = tam - 1 ;
 }
 if ( tecla == 8 || tecla >= 48 && tecla <= 57 || tecla >= 96 && tecla <= 105 ) {
  if ( tam <= 2 ) {
   campo.value = vr;
  }
  if ( (tam > 2) && (tam <= 5) ) {
   campo.value = vr.substr( 0, tam - 2 ) + ',' +
     vr.substr( tam - 2, tam );
  }
  if ( (tam >= 6) && (tam <= 8) ) {
   campo.value = vr.substr( 0, tam - 5 ) + '.' +
     vr.substr( tam - 5, 3 ) + ',' + vr.substr( tam - 2, tam );
  }
  if ( (tam >= 9) && (tam <= 11) ) {
   campo.value = vr.substr( 0, tam - 8 ) + '.' +
     vr.substr( tam - 8, 3 ) + '.' + vr.substr( tam - 5, 3 ) + ',' +
     vr.substr( tam - 2, tam );
  }
  if ( (tam >= 12) && (tam <= 14) ) {
   campo.value = vr.substr( 0, tam - 11 ) + '.' +
    vr.substr( tam - 11, 3 ) + '.' + vr.substr( tam - 8, 3 ) + '.'
    + vr.substr( tam - 5, 3 ) + ',' + vr.substr( tam - 2, tam );
  }
  if ( (tam >= 15) && (tam <= 17) ) {
   campo.value = vr.substr( 0, tam - 14 ) + '.' +
    vr.substr( tam - 14, 3 ) + '.' + vr.substr( tam - 11, 3 ) + '.'
    + vr.substr( tam - 8, 3 ) + '.' + vr.substr( tam - 5, 3 ) + ','
    + vr.substr( tam - 2, tam );
  }
 }
 
}

function isEmpty( str ) {

 if ( (str == null) || (str = "") ) {
 
 	return true;
 
 }
 
 return false;

}

function trim( str ) {

 if ( str != null ) {
 
   while ( str.charAt( str.length - 1 ) == " " )
   	str = str.substring( 0, str.length - 1 );   
   
   while ( str.charAt(0) == " " )
    str = str.substring( 1, str.length );
 
 }
 
 return str;

}

function trimAll( str ) {

 if ( str != null ) {
 
  while ( (str.length > 0) && ("\n\r\t ".indexOf( str.charAt( str.length - 1 ) ) != -1) )
   str = str.substring( 0, str.length - 1 );
  
  while ( (str.length > 0) && ("\n\r\t ".indexOf( str.charAt(0) ) != -1) )
   str = str.substring( 1, str.length );
 
 }
 
 return str;

}

function isPositiveInteger( str ) {

 var pattern = "0123456789";
 var i = 0;
 
 do {
 
  var pos = 0;
  
  for ( var j = 0; j < pattern.length; j++ ) {
  
    if ( str.charAt( i ) == pattern.charAt(j) ) {
    
      post = 1;
      break;
    
    }
  
  }

  i++;
 
 } while ( (pos == 1) && (i < str.length) )
 
 if ( pos == 0 )
  return false;
  
 return true; 

}

function isValidPhoneNumber( str ) {

 var pattern = "0123456789( )-";
 var i = 0;
 
 do {
 
  var pos = 0;
  
  for ( var j = 0; j < pattern.length; j++ ) {
  
    if ( str.charAt( i ) == pattern.charAt(j) ) {
    
      post = 1;
      break;
    
    }
  
  }
  
  i++;
 
 } while ( (pos == 1) && (i < str.length) )
 
 if ( pos == 0 )
  return false;
  
 return true; 

}

function isMoney( str ) {

 var pattern = "0123456789,.";
 var i = 0;
 
 do {
 
  var pos = 0;
  
  for ( var j = 0; j < pattern.length; j++ ) {
  
   if ( str.charAt( i ) == pattern.charAt(j) ) {
    
      post = 1;
      break;
    
   }
  
  }

  i++;
 
 } while ( (pos == 1) && (i < str.length) )
 
 if ( pos == 0 )
  return false; 

 pos = str.indexOf( "." );
 
 if ( pos != -1 && pos != str.length-3 )
  return false;
  
 if ( pos == -1 )
  pos = str.length;
  
 while ( str.lastIndexOf( ",", pos - 1 ) != -1 ) {
 
  if ( str.lastIndexOf( ",", pos - 1 ) != pos -4 )
    return false;
  else
    pos -= 4; 
 
 } 
 
 return true;

}

function removeComma( str ) {

 var result = "";
 
 for ( var i = 0; i < str.length; i++ ) {
 
   if ( str.charAt(i) != "," )
    result += str.charAt( i ); 
 
 }
 
 return result;

}