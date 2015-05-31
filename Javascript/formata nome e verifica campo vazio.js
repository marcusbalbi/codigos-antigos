/*Funções desenvolvidas por Marcus V. Balbi no dia 17/04/2010 para utilizar em sites a primeira função é utilizada para colocar o nome de uma pessoa padronizado para salvar no banco de dados
a segunda realça um campo text em uma cor definida , e é utilizada pela terceira que tem como objetivo verificar se todos os campos estao preenchidos */




function formatanome(elemento)
{ // Essa função tem como finalidade colocar apenas a primeira letra de cada nome como maiuscula


var nomeArray = elemento.value.split(" "); //função split é uma função para strings que retorna um vetor dividindo a string de acoro com o termo encontrado no parametro
var resultado = "";//variavel que vai guardar o resultado;

	for(var i=0;i<nomeArray.length;i++)
	{
		if(nomeArray[i].length > 2) //caso a palavra encontrada no nome dor maior do que 2 tendo a premissa que nao existe sobrenomes maiores que 2 caracteres
		{
			resultado+= nomeArray[i].substr(0,1).toUpperCase()+ nomeArray[i].substr(1,nomeArray[i].length);
		
		
		}	
		else
		{
			resultado+=nomeArray[i];
			
		}
		resultado += " ";
	
	
	}
	return elemento.value = resultado;



}
function realcarcampo(elemento, cor)
	{
		//função para colocar um determinado campo elemento em uma determinada cor 
	
	
		 elemento.style.background = cor;
	
	
	}
function verifica_Campos_vazios()
{	
	var inputs = document.getElementsByTagName("input");
	var resultado =  true;
	
	for(var i=0;i<inputs.length;i++)
		{
			if(inputs[i].value == null  ||  inputs[i].value == "" )
			{
				realcarcampo(inputs[i], "yellow");
				resultado = false;
				
			}
			
		
		
		}
		
		return resultado;

}