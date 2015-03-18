/**
 *     Cod erro.
 * 1 - Campo nulo.
 * 2 - Telefone invalido.
 * 3 - E-mail invalido.
 * 4 - Nome invalido.
 * 5 - Data invalida.
 * 6 - CPF/CNPJ invalido.
 * 7 - Endereço invalido.
 * @author Marcelo
 */


function validaFormulario(){
	
	var campos = ["nome","cpf","endereco","telefone"];
	var result = true;
	for(i = 0; i < campos.length; i++){
				result = validacao(campos[i], true);
		if (!result){
			return false;
		}
		
	}
}


function validacao() {

    var campos = ["nome","cpf","rg", "nascimento", "endereco", "celular", "telefone", "email","bairro","cidade"];
    var senha1 = document.getElementById("password").value;
    var senha2 = document.getElementById("checkedPassword").value;
    if(senha1 != senha2){
        erro("checkedPassword",9);
        return false;
    }else{
        erro("checkedPassword",0);
    }

    for (i = 0; i < campos.length; i++) {

        var valor = document.getElementById(campos[i]).value;

        if (valor == "" || valor == null) {
            erro(campos[i], 1);
            return false;
        } else {
            erro(campos[i], 0);
        }

        if (campos[i] == "nome") {

            if(!validaNome(valor, campos[i])){
                return false;
            }
        } else if (campos[i] == "nascimento") {
             if(!validata(valor, campos[i])){
                 return false;
             }
        } else if (campos[i] == "email") {
            if(!validaEmail(valor, campos[i])){
                return false;
            }
        } else if (campos[i] == "telefone" || campos[i] == "celular") {
            if(!validafone(valor, campos[i])){
                return false;
            }
        } else if (campos[i] == "cpf") {
            if(!validaCPF(valor, campos[i])){
                return false;
            }
        } else if (campos[i] == "endereco") {
            if(!validaEndereco(valor, campos[i])){
                return false;
            }
        }else
        if (campos[i] == "rg") {
            if(!validaRg(valor, campos[i])){
                return false;
            }
        }else{

        }
    }
    return true;
}


function validafone(numero, campo){
    var exprecao = /^\(\d{2}\)( |)(\d{5}|\d{4})\-\d{4}$/ig;
    var resultado = exprecao.test(numero);
    if(!resultado){
        erro(campo,2);
        return false;
    }else{
    	erro(campo,0);
        return true;

    }
}



function validaNome(nome, campo){
    var exprecao = /^[a-zA-ZçÇ]+\ [a-zA-ZçÇ]+[ a-zA-ZçÇ]+$/ig;
    var resultado = exprecao.test(nome);
    if(!resultado){
     erro(campo,4);
        return false;
    }else{
    	erro(campo,0);
        return true;
    }
    
}


function validata(data, campo){
    alert(data);
    var exprecao = /^([1-9]|0[1-9]|[1,2][0-9]|3[0,1])\/([1-9]|1[0,1,2])\/(\d{2}|\d{4})|([1-9]|0[1-9]|[1,2][0-9]|3[0,1])\-([1-9]|1[0,1,2])\-(\d{2}|\d{4})$/ig;
    var resultado = exprecao.test(data);
    if(!resultado){
        erro(campo,5);
        return false;
    }else{
    	erro(campo,0);
        return true;
    }
}

function validaCPF(valor,campo){
    
    var exprecao = /^([0-9]{3}\.?[0-9]{3}\.?[0-9]{3}\-?[0-9]{2}|[0-9]{2}\.?[0-9]{3}\.?[0-9]{3}\/?[0-9]{4}\-?[0-9]{2})$/ig;
    var resultado = exprecao.test(valor);
    if(!resultado){
        erro(campo,6);
        return false;
    }else{
    	erro(campo,0);
        return true;
    }

}

function validaRg(valor,campo){

    var exprecao = /^([0-9]{6}\-[0-9]{1})$/ig;
    var resultado = exprecao.test(valor);
    if(!resultado){
        erro(campo,8);
        return false;
    }else{
        erro(campo,0);
        return true;
    }

}

function validaEmail(email, campo){
    var exprecao = /^(([a-zA-Z]+[0-9_.-]*)+@[a-zA-Z]{2,}\.[a-zA-Z]{2,4})+(\.?[a-zA-Z]{3})?$/ig;
    var resultado = exprecao.test(email);
    if(!resultado){
        erro(campo,3)
        return false;
    }else{
        erro(campo,0)
        return true;
    }
}
function validaEndereco(valor,campo){
	var exprecao = /^[a-z]*\ [a-z0-9,.]*\ [a-z0-9,.]*\ [a-z0-9,.]*\ [a-z0-9,.]*\ [a-z0-9,. ]*$/ig;
	var resultado = exprecao.test(valor);
	
	if(!resultado){
        erro(campo,7);
        return false;
    }else{
    	erro(campo,0);
        return true;
    }
}

function erro(campo,coderro) {
        var  insere = document.getElementById(campo);
        var conteudo = insere.value;
        
        if(coderro != 0){

            if(coderro == 1){
                var erros= document.getElementById("erros").innerHTML = "* O campo "+ campo+" é de preenchimento obrigatorio";
            }else
            if(coderro == 2){
                document.getElementById("erros").innerHTML = "* Telefone invalido";

            }else
            if(coderro == 3){
                document.getElementById("erros").innerHTML = "* E-mail invalido";

            }else
            if(coderro == 4){
                document.getElementById("erros").innerHTML = "* Nome invalido ou incompleto";

            }else
            if(coderro == 5){
                document.getElementById("erros").innerHTML = "* Data invalido";

            }else
            if(coderro == 6){
                document.getElementById("erros").innerHTML = "* CPF/CNPJ invalido";

            }else
                if(coderro == 7){
                    document.getElementById("erros").innerHTML = "* Endereço invalido";


        	}else
                if(coderro == 8){
                    document.getElementById("erros").innerHTML = "* RG invalido";
                }
                else
                if(coderro == 9){
                    document.getElementById("erros").innerHTML = "* As senhas estao diferentes";
                }

        	insere.className -= insere.className ? ' form-control' : 'form-control';
            insere.className += insere.className ? ' form-control-error' : 'form-control-error';
            return false;
        }else{
            insere.className -= insere.className ? ' form-control-error' : 'form-control-error';
            insere.className += insere.className ? ' form-control' : 'form-control';
        
        }

}