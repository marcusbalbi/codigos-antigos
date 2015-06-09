<?php
session_start();


$carrinho = $_SESSION['carrinho'];

require_once("conexao.php");
$conexao = new conexao();



if(!isset($_SESSION["usuario"]))
{
	header("Location:http://localhost/teste/index.php?conteudo=login");
}



 $mensagem  = "<table border='1' align='center'>
        <tr>
        	<td>ID</td>
            <td>NOME</td>
            <td>VALOR UNIT</td>
            <td>QUANTIDADE</td>
            <td>VALOR TOTAL</td>
        </tr>";
		
         foreach($carrinho as $produtos){
			
          $itensPedido = " <tr>
        
        	<td>".$produtos["idproduto"]."</td>
            <td>".$produtos["nome"]."</td>
            <td>".$produtos["valorUnitario"]."</td>
            <td>".$produtos["quantidade"]."</td>
            <td>".$produtos["valorTotal"] ."</td>
        </tr>";
		 }
   $fin  = "</table>";

	


mail("marcusbalbi@hotmail.com","PEDIDO",$mensagem.$fin);


?>


