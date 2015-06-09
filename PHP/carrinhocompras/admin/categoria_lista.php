<link href="../util/estilos.css" rel="stylesheet" type="text/css" />

<table width="603" height="176" border="1" class="borda_tabela" cellspacing="2">
  <tr class="titulos_listas">
    <td colspan="3"><div align="center">
      <h3>Lista de Categorias</h3>
    </div>
      <form id="form1" name="form1" method="post" action="index.php?tabela=categoria&acao=listar">
        <div align="center"></div>
        <label for="pesquisa"></label>
        <div align="center">Pesquisa:

          <input name="pesquisa" type="text" id="pesquisa" size="50" />
          <input type="submit" name="pesquisar" id="pesquisar" value="Pesquisar" />
        </div>
    </form></td>
  </tr>
  <tr class="ordenacao_novo_registro">
    <td width="297"><a href="index.php?tabela=categoria&acao=listar&ordem=CAT_DESCRICAO">Descrição</a></td>
    <td colspan="2"><a href="index.php?tabela=categoria&acao=incluir">Novo Registro</a></td>
  </tr>
  <?php
  	require_once("categoria_acao.php");
	while($oquefazer->registros = $oquefazer->resultado->FetchNextObject())
	{?>
  <tr class="linha">
    <td><?php echo $oquefazer->registros->CAT_DESCRICAO; ?></td>
    <td class="alterar_excluir" width="62"><a href="?tabela=categoria&acao=alterar&cat_codigo=<?php echo $oquefazer->registros->CAT_CODIGO ?>">Alterar</a></td>
    <td class="alterar_excluir" width="53"><a href="?tabela=categoria&acao=excluir&cat_codigo=<?php echo $oquefazer->registros->CAT_CODIGO ?>" onclick="if(confirm('Deseja Realmente excluir este registro?'))return true;else return false;">Excluir</a></td>
  </tr>
  <?php } ?>
  <tr>
    <td colspan="3" class="titulos_listas">Número de Registros:<?php echo $oquefazer->total_registros(); ?></td>
  </tr>
</table> 