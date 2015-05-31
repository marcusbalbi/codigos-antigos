ValidarCPF// JavaScript Document
	function mascaraMoeda(objTextBox, SeparadorMilesimo, SeparadorDecimal, e) {
	var sep = 0;
	var key = '';
	var i = j = 0;
	var len = len2 = 0;
	var strCheck = '0123456789';
	var aux = aux2 = '';
	var whichCode = (window.Event) ? e.which : e.keyCode;
	// 13=enter, 8=backspace as demais retornam 0(zero)
	// whichCode==0 faz com que seja possivel usar todas as teclas como delete, setas, etc
	if ((whichCode == 13) || (whichCode == 0) || (whichCode == 8)) return true;
	key = String.fromCharCode(whichCode); // Valor para o código da Chave
	if (strCheck.indexOf(key) == -1) return false; // Chave inválida
	len = objTextBox.value.length;
	for(i = 0; i < len; i++) if ((objTextBox.value.charAt(i) != '0') && (objTextBox.value.charAt(i) != SeparadorDecimal)) break;
	aux = '';
	for(; i < len; i++) if (strCheck.indexOf(objTextBox.value.charAt(i))!=-1) aux += objTextBox.value.charAt(i);
	aux += key;
	len = aux.length;
	if (len == 0) objTextBox.value = '';
	if (len == 1) objTextBox.value = '0'+ SeparadorDecimal + '0' + aux;
	if (len == 2) objTextBox.value = '0'+ SeparadorDecimal + aux;
	if (len > 2) {
		aux2 = '';
		for (j = 0, i = len - 3; i >= 0; i--) {
			if (j == 3) {
				aux2 += SeparadorMilesimo;
				j = 0;
			}
			aux2 += aux.charAt(i);
			j++;
		}
		objTextBox.value = '';
		len2 = aux2.length;
		for (i = len2 - 1; i >= 0; i--) objTextBox.value += aux2.charAt(i);
		objTextBox.value += SeparadorDecimal + aux.substr(len - 2, len);
	}
	return false;
}
/*
*       Script: Mascaras em Javascript
*       Autor:  Matheus Biagini de Lima Dias
*       Data:   26/08/2008
*       Obs:    
*/
        /*Função Pai de Mascaras*/
        function Mascara(o,f){
                v_obj=o
                v_fun=f
                setTimeout("execmascara()",1)
        }
        
        /*Função que Executa os objetos*/
        function execmascara(){
                v_obj.value=v_fun(v_obj.value)
        }
        
        /*Função que Determina as expressões regulares dos objetos*/
        function leech(v){
                v=v.replace(/o/gi,"0")
                v=v.replace(/i/gi,"1")
                v=v.replace(/z/gi,"2")
                v=v.replace(/e/gi,"3")
                v=v.replace(/a/gi,"4")
                v=v.replace(/s/gi,"5")
                v=v.replace(/t/gi,"7")
                return v
        }
        
        /*Função que permite apenas numeros*/
        function Integer(v){
                return v.replace(/\D/g,"")
        }
        
        /*Função que padroniza telefone (11) 4184-1241*/
        function Telefone(v){
                v=v.replace(/\D/g,"")                            
                v=v.replace(/^(\d\d)(\d)/g,"($1) $2") 
                v=v.replace(/(\d{4})(\d)/,"$1-$2")      
                return v
        }
        
        /*Função que padroniza telefone (11) 41841241*/
        function TelefoneCall(v){
                v=v.replace(/\D/g,"")                            
                v=v.replace(/^(\d\d)(\d)/g,"($1) $2")   
                return v
        }
        
        /*Função que padroniza CPF*/
        function Cpf(v){
                v=v.replace(/\D/g,"")                                   
                v=v.replace(/(\d{3})(\d)/,"$1.$2")         
                v=v.replace(/(\d{3})(\d)/,"$1.$2")         
                                                                                                 
                v=v.replace(/(\d{3})(\d{1,2})$/,"$1-$2")
 
                return v
        }
        
        /*Função que padroniza CEP*/
        function Cep(v){
                v=v.replace(/D/g,"")                            
                v=v.replace(/^(\d{5})(\d)/,"$1-$2") 
                return v
        }
        
        /*Função que padroniza CNPJ*/
        function Cnpj(v){
                v=v.replace(/\D/g,"")                              
                v=v.replace(/^(\d{2})(\d)/,"$1.$2")      
                v=v.replace(/^(\d{2})\.(\d{3})(\d)/,"$1.$2.$3") 
                v=v.replace(/\.(\d{3})(\d)/,".$1/$2")              
                v=v.replace(/(\d{4})(\d)/,"$1-$2")                        
                return v
        }
        
        /*Função que permite apenas numeros Romanos*/
        function Romanos(v){
                v=v.toUpperCase()                        
                v=v.replace(/[^IVXLCDM]/g,"") 
                
                while(v.replace(/^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$/,"")!="")
                        v=v.replace(/.$/,"")
                return v
        }
        
        /*Função que padroniza o Site*/
        function Site(v){
                v=v.replace(/^http:\/\/?/,"")
                dominio=v
                caminho=""
                if(v.indexOf("/")>-1)
                        dominio=v.split("/")[0]
                        caminho=v.replace(/[^\/]*/,"")
                        dominio=dominio.replace(/[^\w\.\+-:@]/g,"")
                        caminho=caminho.replace(/[^\w\d\+-@:\?&=%\(\)\.]/g,"")
                        caminho=caminho.replace(/([\?&])=/,"$1")
                if(caminho!="")dominio=dominio.replace(/\.+$/,"")
                        v="http://"+dominio+caminho
                return v
        }

        /*Função que padroniza DATA*/
        function Data(v){
                v=v.replace(/\D/g,"") 
                v=v.replace(/(\d{2})(\d)/,"$1/$2") 
                v=v.replace(/(\d{2})(\d)/,"$1/$2") 
                return v
        }
        
        /*Função que padroniza DATA*/
        function Hora(v){
                v=v.replace(/\D/g,"") 
                v=v.replace(/(\d{2})(\d)/,"$1:$2")  
                return v
        }
        
        /*Função que padroniza valor monétario*/
        function Valor(v){
                v=v.replace(/\D/g,"") //Remove tudo o que não é dígito
                v=v.replace(/^([0-9]{3}\.?){3}-[0-9]{2}$/,"$1.$2");
                //v=v.replace(/(\d{3})(\d)/g,"$1,$2")
                v=v.replace(/(\d)(\d{2})$/,"$1.$2") //Coloca ponto antes dos 2 últimos digitos
                return v
        }
        
        /*Função que padroniza Area*/
        function Area(v){
                v=v.replace(/\D/g,"") 
                v=v.replace(/(\d)(\d{2})$/,"$1.$2") 
                return v
                
        }


//valida telefone Atualizado para Jquery
function ValidaTelefone(tel){
        exp = /\d{4}\-\d{4}/
		
	
        if( ($(tel).attr('value').length != 0) && (!exp.test($(tel).attr('value'))) )
		{
                alert('Numero de Telefone Invalido!');
				$(tel).attr('value', '');
		}
}

//valida CEP
function ValidaCep(cep){
        exp = /\d{2}\d{3}\-\d{3}/
		var cep1 = cep.value;
		cep1 = cep1.toString().replace( exp, "" );

		if ( cep1 != '')
		{
			if(!exp.test(cep.value))
			{
					alert('Numero de Cep Invalido!');               
					cep.value = "";
			}
		}
}

//valida data
function ValidaData(data){
        exp = /\d{2}\/\d{2}\/\d{4}/
        if(!exp.test(data.value))
		{
                alert('Data Invalida!');
				data.select();
		}
}


     function ValidarCPF(objcpf)
        {
            
           var  cpf = $(objcpf).attr('value');

         

            // if (cpf.Equals("   ,   ,   -"))
            if (cpf == "")
                return true;

            var  multiplicador1 = new Array (10, 9, 8, 7, 6, 5, 4, 3, 2 );

            var multiplicador2 = new Array( 11, 10, 9, 8, 7, 6, 5, 4, 3, 2 );

            var tempCpf;

            var digito;

            var soma;

            var resto;

            //cpf = cpf.Trim();

            for(i=0;i<cpf.length;i++)
            {
                cpf = cpf.replace(".", "");
                cpf = cpf.replace("-", "");
            }

          
           
                   
            if (cpf.length != 11)
            {
                alert('CPF Invalido!');
                $(Objcpf).attr('value',"");
                $(Objcpf).focus();
                return false;
            }


            if (cpf == ("00000000000") || cpf == ("11111111111") || cpf == ("22222222222") || cpf == ("33333333333") || cpf == ("44444444444") || cpf == ("55555555555") || cpf == ("66666666666") || cpf == ("77777777777") || cpf == ("88888888888") || cpf == ("99999999999"))
              {
                  alert('CPF Invalido!');
                  $(Objcpf).attr('value',"");
                  $(Objcpf).focus();
                  return false;
              
                }



            tempCpf = cpf.substring(0, 9);

            soma = 0;



            for (i = 0; i < 9; i++)

                soma += parseInt(tempCpf.charAt(i).toString()) * multiplicador1[i];

            resto = soma % 11;

            if (resto < 2)

                resto = 0;

            else

                resto = 11 - resto;

            digito = resto.toString();

            tempCpf = tempCpf + digito;

            soma = 0;

            for (i = 0; i < 10; i++)

                soma += parseInt(tempCpf.charAt(i).toString()) * multiplicador2[i];

            resto = soma % 11;

            if (resto < 2)

                resto = 0;

            else

                resto = 11 - resto;

            digito = digito + resto.toString();



             //String.lastIndexOf(searchValue, fromIndex)

            if(cpf.substr(9,2) != digito)
            {
                                    alert('CPF Invalido!');
                                    $(Objcpf).attr('value',"");
                                    $(Objcpf).focus();
                                    return false;

            }

            return true;

        }

//valida numero inteiro com mascara
function mascaraInteiro(dom){
	  dom.value=dom.value.replace(/\D/g,'');

}

//valida o CNPJ digitado
function ValidarCNPJ(ObjCnpj){
        var cnpj =$(ObjCnpj).attr('value');
        var valida = new Array(6,5,4,3,2,9,8,7,6,5,4,3,2);
        var dig1= new Number;
        var dig2= new Number;
        
        exp = /\.|\-|\//g
        cnpj = cnpj.toString().replace( exp, "" ); 
        var digito = new Number(eval(cnpj.charAt(12)+cnpj.charAt(13)));
                
        for(i = 0; i<valida.length; i++){
                dig1 += (i>0? (cnpj.charAt(i-1)*valida[i]):0);  
                dig2 += cnpj.charAt(i)*valida[i];       
        }
        dig1 = (((dig1%11)<2)? 0:(11-(dig1%11)));
        dig2 = (((dig2%11)<2)? 0:(11-(dig2%11)));
        
        if (cnpj != "")
        {
            if(((dig1*10)+dig2) != digito)
		    {
                    alert('CNPJ Invalido!');
					$(ObjCnpj).attr('value',"");
				    $(ObjCnpj).focus();
		    }
        }        
}
function MascaraCpfCnpj(data,evento) 
{
	if (document.getElementById('cpfCnpj').innerHTML == 'CPF')
	{
		maskIt(data,evento,'###.###.###-##');
	}
	else
	{
		maskIt(data,evento,'##.###.###/####-##');
	}
}



function verifica_data(campo) 
{
	if(campo.value == "")
	{
		return ;
	}
	
	
	    	dia = (campo.value.substring(0,2)); 
            mes = (campo.value.substring(3,5)); 
            ano = (campo.value.substring(6,10)); 

            situacao = ""; 
            // verifica o dia valido para cada mes 
            if ((dia < 01)||(dia < 01 || dia > 30) && (  mes == 04 || mes == 06 || mes == 09 || mes == 11 ) || dia > 31) { 
                situacao = "falsa"; 
            } 

            // verifica se o mes e valido 
            if (mes < 01 || mes > 12 ) { 
                situacao = "falsa"; 
            } 

            // verifica se e ano bissexto 
            if (mes == 2 && ( dia < 01 || dia > 29 || ( dia > 28 && (parseInt(ano / 4) != ano / 4)))) { 
                situacao = "falsa"; 
            } 
    
            if (campo.value == "") { 
                situacao = "falsa"; 
            } 
			if(campo.value.length <10)
			{
				situacao = "falsa"; 
			}
			
			
            if (situacao == "falsa") { 
                alert("Data inválida!"); 
               campo.value = "";
            }  

         
} 
function ValidaEmail(email)
{
        var exp = /^[a-zA-Z0-9]+[a-zA-Z0-9_.-]+@[a-zA-Z0-9_.-]*\.+[a-z]{2,4}$/;
     
        if ( !exp.test(email))
        {
         return false;
        }
        return true;

}

function setar_obj(eln)
	{
			if(document.all){
				return document.all[eln];
			}else{
					if(document){
						return document[eln];
					}else{
						return getElementById(eln);
					}
			}
	
	}
	
	//Valida Senha
	function ValidaSenha(campo)
	{
		alphaRegExp = /^[0-9a-z]+$/i
		var senha = campo.value;
		if(alphaRegExp.test(senha) && senha.length>=6)
		{
			return true;
		}
		else
		{
		alert("A senha deve conter letras e/ou numeros e no minimo 6 caracteres");
		campo.value = "";
		return false;
		}
	}
	
	function ExibirMsg(id, msg, tipo,tempo)
	{
		if(tipo == "mensagem_erro")
                {
                    $(id).removeClass().addClass("alert alert-error");
                }
                
                    $(id).append(msg).show().alert();
	}
	
	function VerificaExiste(campo,elemento,numero_ocorrencias,acao,elementoAntigo,tabela)
	{
		$.ajax({type:"post"
		,url:"includes/VerificarExisteajax.php"
		,data:{"numero_ocorrencias":numero_ocorrencias,"elemento":elemento,"acao":acao,"elementoAntigo":elementoAntigo,"tabela":tabela}
		,success:function(a){

		if(a == "Existe" && (tabela == "Clientes"  || tabela == "Fornecedores"))
		{
			alert("Este Cpf/Cnpj já existe na base de dados");
			$(campo).attr('value',"");
				
		}
		else if(a == "Existe" && tabela == "Produtos")
		{
			alert("Esta Referencia já existe na base de dados");
				$(campo).attr('value',"");
			
		}
		
	}
	
});
		
	}
	
	function IniciarCarrinho(idCliente,idFuncionario)
	{
		var resposta = "merda";
		$.ajax({type:"post"
		,url:"includes/Carrinho.php",
		async: false
		,data:{"idCliente":idCliente,"idFuncionario":idFuncionario,"acao":"iniciarCarrinho"}
		,success:function(a){
			
			resposta = a;
			
			
			}
		
		});
		return resposta;
			
	
		
		
	}
	
	function VerificaEstoqueReal(idProduto)
	{
		var resposta = "merda";
		$.ajax({type:"post"
		,url:"includes/Carrinho.php",
		async: false
		,data:{"idProduto":idProduto,"acao":"EstoqueAtual"}
		,success:function(a){
			
			resposta = a;
			
			
			}
		
		});
		return resposta;
		
	}