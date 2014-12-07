function verifica_campo_em_branco(input) //recebe um input como parametro no caso o campo texto que quer ser verificado
{
var texto = input.value; //variavel para receber valor do campo

if(texto.length < 1) // caso nao tenha sido nada escrito no campo retorna falso
{
return false
}
	for(var i=0;i<texto.length;i++) // verifica caracter a caracter ate encontrar um  caso enconre pelo menos 1 caracter que nao seja espaço retorna verdadeiro
	{
		if(texto.charAt(i) != " ") // função charAt é uma função do objeto sctring que coloca o 'ponteiro no indece que esta no parametro'
		return true
			
	
	}
return false



}
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