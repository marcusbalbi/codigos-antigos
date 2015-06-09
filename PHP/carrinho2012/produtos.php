<?php
include_once("conexao.php");
$conexao = new conexao();


if(isset($_GET['subcategoria']))
{
	$produtos = $conexao->executarQuery("select * from produtos where idsubcategoria = ".$_GET['subcategoria']);
	
}


?>
<?php

foreach($produtos as $produto)
{?>
<div id="produto">
<h3><?php echo $produto["produto"]; ?></h3>
<div id="imagem">IMAGEM</div>
R$:<?php  echo  number_format($produto["valor"],2); ?><p align="right"><a  href="index.php?conteudo=detalhes&produto=<?php echo $produto["id"];  ?>">Detalhes</a></p>
</div>

<?php } ?>