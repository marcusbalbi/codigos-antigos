<?php

require_once("conexao.php");

$conexao = new conexao();


$categorias = $conexao->executarQuery("select * from categorias");



?>

<ul>
<?php foreach($categorias as $categoria){ ?>
<li><a href="index.php?categoria=<?php echo $categoria["id"]; ?>"><?php echo $categoria["categoria"]; ?></a>
	<?php if(isset($_GET['categoria']) && $_GET['categoria'] == $categoria["id"]){ 
		
		$subcategorias = $conexao->executar("select * from subcategorias where idcategoria=".$categoria["id"]);
		?>
        <ul>
        
		<?php foreach($subcategorias as $subcategoria)
		{
	?>
    		<li><a href="index.php?categoria=<?php echo $categoria["id"]."&subcategoria=".$subcategoria["id"]."&conteudo=produtos";  ?>"><?php echo $subcategoria["subcategoria"]; ?></a></li>
    		
    	
		
		
    <?php }  ?>
 	</ul>
    
    <?php } ?>
	
	
	
		
</li>
<?php } ?>
</ul>
