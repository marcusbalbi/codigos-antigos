<?php

require_once("../conexao.php");


$conexao = new conexao();


$categorias = $conexao->executarQuery("select * from categorias");


			if(isset($_POST['novacategoria']))
			{
				$conexao->executar("insert into categorias(categoria) values('".$_POST['categoria']."')");
				header("Location:index.php?conteudo=categorias");
				
			}
			
			if(isset($_POST["alterarcategoria"]))
			{
				$conexao->executar("update categorias set categoria='".$_POST['categoria']."' where id = ".$_POST['idcategoria']);
				header("Location:index.php?conteudo=categorias");
			}
			
			if(isset($_GET['excluir']))
			{
				$conexao->executar("delete from categorias where id=".$_GET['idcategoria']);
				header("Location:index.php?conteudo=categorias");
			}
			
			


?>

<h3 align="center">CRUD de categorias</h3>
<table border="1" align="center">
	<tr>
    	<td>ID</td>
     	<td>Categoria</td>
        <td colspan="2"><a href="index.php?conteudo=novacategoria">nova categoria</a></td>   
      </tr>
      <?php foreach($categorias as $categoria){?>
     <tr>
     	<td><?php echo $categoria["id"]; ?></td>
     	<td><?php echo $categoria["categoria"]; ?></td>
        <td><a href="index.php?conteudo=alterarcategoria&idcategoria=<?php echo $categoria["id"]; ?>">Alterar</a></td>
       <td><a href="index.php?conteudo=categorias&idcategoria=<?php echo $categoria["id"]; ?>&excluir=1">Excluir</a></td>
     </tr>
     <?php } ?>
</table>
