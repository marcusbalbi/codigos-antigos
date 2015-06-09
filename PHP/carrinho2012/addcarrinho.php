<?php
session_start();

require_once("conexao.php");

$conexao= new conexao();

if(isset($_SESSION["carrinho"]))
{
	$carrinho = $_SESSION["carrinho"];
}
else
{
	$carrinho = array();
}



if(isset($_POST["addcarrinho"]))
{
	$jaexiste = false;
	for($i = 0;$i<count($carrinho);$i++)
	{
		if($carrinho[$i]["idproduto"] == $_POST["idproduto"])
		{
			$carrinho[$i]["valorTotal"]+=($carrinho[$i]["valorUnitario"] * $_POST["quantidade"]);
			$carrinho[$i]["quantidade"]+=$_POST["quantidade"];
			$jaexiste = true;
			break;
		}
	}
	
	if($jaexiste == false)
	{
		$produtoescolhido = $conexao->executarQuery("select * from produtos where id = ".$_POST['idproduto'])->fetch();
		
		
		$carrinho[] = array("idproduto"=>$_POST["idproduto"]
		,"nome"=>$produtoescolhido["produto"]
		,"valorUnitario"=>$produtoescolhido["valor"],
		"quantidade"=>$_POST["quantidade"],
		"valorTotal"=>($_POST['quantidade'] * $produtoescolhido["valor"]));
		
		
	}	
	
	$_SESSION['carrinho'] = $carrinho;
	
		
}
?>
Produto Adicionado ao Carrinho com sucesso