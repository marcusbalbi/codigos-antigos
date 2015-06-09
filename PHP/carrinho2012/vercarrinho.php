<?php session_start(); 

$carrinho = $_SESSION['carrinho'];

require_once("conexao.php");
$conexao = new conexao();

?>
<h1 align="center">Carrinho</h1>

<table border="1" align="center">
        <tr>
        	<td>ID</td>
            <td>NOME</td>
            <td>VALOR UNIT</td>
            <td>QUANTIDADE</td>
            <td>VALOR TOTAL</td>
        </tr>
        <?php foreach($carrinho as $produtos){
			 ?>
        <tr>
        
        	<td><?php echo $produtos["idproduto"]; ?></td>
            <td><?php echo $produtos["nome"]; ?></td>
            <td><?php echo $produtos["valorUnitario"] ?></td>
            <td><?php echo $produtos["quantidade"] ?></td>
            <td><?php echo $produtos["valorTotal"] ?></td>
        </tr>
        <?php }?>
</table>
<div align="center">
<form  action="index.php?conteudo=finalizarcarrinho" name="formfinalizarcarrinho" method="post">
<input type="submit" name="finalizarcarrinho" value="Finalizar Pedido"/>

</form>
</div>