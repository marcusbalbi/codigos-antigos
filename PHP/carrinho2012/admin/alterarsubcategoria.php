<?php 

if(isset($_GET['idsubcategoria']))
{
	require_once("../conexao.php");
	
	$conexao = new conexao();
	
	$subcategoria = 	$conexao->executarQuery("select * from subcategorias where id=".$_GET["idsubcategoria"])->fetch();
	
	$categorias = $conexao->executarQuery("select * from categorias");
	
}


?>
<div align="center">
<h3>Alterar SubCategoria</h3>
<form action="index.php?conteudo=subcategorias" method="post" name="formalterarsubcategoria">
	<table>
    	<input type="hidden" value="<?php echo $subcategoria["id"]; ?>" name="idsubcategoria"/>
    		<tr>
            	<td>SubCategoria:</td>
            	<td><input type="text" name="subcategoria" value="<?php echo $subcategoria["subcategoria"]  ?>"/></td>
            </tr>
            <tr>
            	<td>Categoria:</td>
            	<td><select name="idcategoria">
                	<?php
						foreach($categorias as $categoria){
							if($categoria["id"] == $subcategoria["idCategoria"])
							echo "<option selected='selected' value='".$categoria['id']."'>".$categoria["categoria"]."</option>";
							else
							echo "<option value='".$categoria['id']."'>".$categoria["categoria"]."</option>";
						}
					 ?>
                </select> </td>
            </tr>
            <tr>
            	<td><input type="submit" value="Gravar SubCategoria" name="alterarsubcategoria"/> </td>
           	</tr>
    </table>

</form>
</div>