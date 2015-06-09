<link href="../util/estilos.css" rel="stylesheet" type="text/css" />

<table width="545" height="176" border="1" class="borda_tabela" cellspacing="2">
  <tr class="titulos_listas">
    <td colspan="3"><div align="center">
      <h3>Lista de Imagens</h3>
    </div></td>
  </tr>
  <tr class="ordenacao_novo_registro">
    <td width="209">Produto</td>
    <td width="118"><a href="index.php?tabela=produto&acao=listar&amp;ordem=COD_PRODUTO">Imagem</a></td>
    <td><a href="index.php?tabela=imagem&acao=incluir&prod_codigo=<?php echo $_GET['prod_codigo']; ?>">Novo Registro</a></td>
  </tr>
  <?php
  	require_once("imagem_acao.php");
	while($oquefazer->registros = $oquefazer->resultado->FetchNextObject())
	{?>
  <tr class="linha">
  		
    <td><?php echo $oquefazer->registros->PROD_CODIGO; ?></td>
    <td><img src="../imagens/<?php echo $oquefazer->registros->IMG_DESCRICAO; ?>" width="100" height="100" /></td>
    <td class="alterar_excluir" width="276"><a href="?tabela=imagem&acao=excluir&img_codigo=<?php echo $oquefazer->registros->IMG_CODIGO ?>&prod_codigo=<?php echo $oquefazer->registros->PROD_CODIGO ?>" onclick="if(confirm('Deseja Realmente excluir este registro?'))return true;else return false;">Excluir</a></td>
  </tr>
  <?php } ?>
  <tr>
    <td colspan="3" class="titulos_listas">Número de Registros:<?php echo $oquefazer->total_registros(); ?></td>
  </tr>
</table> 