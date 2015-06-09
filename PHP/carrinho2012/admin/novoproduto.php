<?php

require_once("../conexao.php");


$conexao = new conexao();


$categorias = $conexao->executarQuery("select * from categorias");


?>

<div align="center">
<h3>Nova SubCategoria</h3>
<form action="index.php?conteudo=subcategorias" method="post" name="formnovasubcategoria">
	<table>
    		<tr>
            	<td>SubCategoria:</td>
            	<td><input type="text" name="subcategoria"/></td>
            </tr>
            <tr>
            	<td>Categoria:</td>
            	<td><select name="idcategoria">
                	<?php
						foreach($categorias as $categoria)
						echo "<option value='".$categoria['id']."'>".$categoria["categoria"]."</option>";
					 ?>
                </select> </td>
            </tr>
            <tr>
            	<td><input type="submit" value="Gravar Categoria" name="novasubcategoria"/> </td>
           	</tr>
    </table>

</form>
</div>