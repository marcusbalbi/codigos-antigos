<?php

require_once("../conexao.php");


$conexao = new conexao();


$subcategorias = $conexao->executarQuery("select * from produtos");


			if(isset($_POST['novoproduto']))
			{
				$conexao->executar("insert into produtos(produto,idCategoria,idSubcategoria,descricao ) values('".$_POST['produto']."',".$_POST['idcategoria'].")");
				header("Location:index.php?conteudo=subcategorias");
				
			}
			
			if(isset($_POST["alterarsubcategoria"]))
			{
				$conexao->executar("update subcategorias set subcategoria='".$_POST['subcategoria']."', idCategoria=".$_POST['idcategoria']." where id = ".$_POST['idsubcategoria']);
				header("Location:index.php?conteudo=subcategorias");
			}
			
			if(isset($_GET['excluir']))
			{
				$conexao->executar("delete from subcategorias where id=".$_GET['idsubcategoria']);
				header("Location:index.php?conteudo=subcategorias");
			}
			
			


?>

<h3 align="center">CRUD de Subcategorias</h3>
<table border="1" align="center">
	<tr>
    	<td>ID</td>
     	<td>SubCategoria</td>
        	<td>Categoria</td>
        <td colspan="2"><a href="index.php?conteudo=novasubcategoria">nova Subcategoria</a></td>   
      </tr>
      <?php foreach($subcategorias as $subcategoria){
		  $nomecategoria = $conexao->executarQuery("select categoria from categorias where id=".$subcategoria["idCategoria"])->fetchColumn();
		  ?>
     <tr>
     	<td><?php echo $subcategoria["id"]; ?></td>
     	<td><?php echo $subcategoria["subcategoria"]; ?></td>
        <td><?php echo $nomecategoria; ?></td>
        <td><a href="index.php?conteudo=alterarsubcategoria&idsubcategoria=<?php echo $subcategoria["id"]; ?>">Alterar</a></td>
       <td><a href="index.php?conteudo=subcategorias&idsubcategoria=<?php echo $subcategoria["id"]; ?>&excluir=1">Excluir</a></td>
     </tr>
     <?php } ?>
</table>
