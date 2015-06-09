<?php 

if(isset($_GET['idcategoria']))
{
	require_once("../conexao.php");
	
	$conexao = new conexao();
	
$categoria = 	$conexao->executarQuery("select * from categorias where id=".$_GET["idcategoria"])->fetch();
	
}


?>
<div align="center">
<h3>Alterar Categoria</h3>
<form action="index.php?conteudo=categorias" method="post" name="formnovacategoria">
	<table>
    	<input type="hidden" value="<?php echo $categoria["id"]; ?>" name="idcategoria"/>
    		<tr>
            	<td>Categoria:</td>
            	<td><input type="text" name="categoria" value="<?php echo $categoria["categoria"]  ?>"/></td>
            </tr>
            <tr>
            	<td><input type="submit" value="Gravar Categoria" name="alterarcategoria"/> </td>
           	</tr>
    </table>

</form>
</div>