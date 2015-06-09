<?php

require_once("conexao.php");
$conexao = new conexao();
if(isset($_GET['produto']))
{
 $produto = 	$conexao->executarQuery("select * from produtos where id=".$_GET["produto"])->fetch();
	
}


?>
<form method="post" name="form" action="index.php?conteudo=addcarrinho"/>
<h3 align="center"><?php echo $produto["produto"]; ?></h3>
<div id="imagem2">IMAGEM</div>
<p><?php echo $produto["Descricao"]; ?></p>
<div align="right">Preço:<?php echo $produto["valor"] ?><br>
<input type="hidden" name="idproduto" value="<?php echo $produto["id"] ?>"/>
Quantidade:<input value="1" type="text" name="quantidade"/>
<input  value="Comprar" type="submit" name="addcarrinho"/></div>
</form>