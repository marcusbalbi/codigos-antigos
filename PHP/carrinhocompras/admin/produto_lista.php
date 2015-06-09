<link href="../util/estilos.css" rel="stylesheet" type="text/css" />

<table width="825" height="176" border="1" class="borda_tabela" cellspacing="2">
  <tr class="titulos_listas">
    <td colspan="7"><div align="center">
      <h3>Lista de Produtos</h3>
    </div>
      <form id="form1" name="form1" method="post" action="">
        <div align="center"></div>
        <label for="pesquisa"></label>
        <div align="center">Pesquisa:

          <input name="pesquisa" type="text" id="pesquisa" size="50" />
          <input type="submit" name="pesquisar" id="pesquisar" value="Pesquisar" />
        </div>
    </form></td>
  </tr>
  <tr class="ordenacao_novo_registro">
    <td width="214"><a href="index.php?tabela=produto&acao=listar&ordem=PROD_DESCRICAO">Descrição</a></td>
    <td width="147"><a href="index.php?tabela=produto&acao=listar&amp;ordem=CAT_CODIGO">Categoria</a></td>
    <td width="147"><a href="index.php?tabela=produto&acao=listar&ordem=PROD_VALOR">Valor</a></td>
    <td width="84"><a href="index.php?tabela=produto&acao=listar&ordem=PROD_QUANTIDADE">Quantidade</a></td>
    <td colspan="3"><a href="index.php?tabela=produto&acao=incluir">Novo Registro</a></td>
  </tr>
  <?php
  	require_once("produto_acao.php");
	while($oquefazer->registros = $oquefazer->resultado->FetchNextObject())
	{?>
  <tr class="linha">
    <td><?php echo $oquefazer->registros->PROD_DESCRICAO; ?></td>
    <td><?php echo $oquefazer->registros->CAT_CODIGO; ?></td>
    <td><?php echo $oquefazer->registros->PROD_VALOR; ?></td>
    <td><?php echo $oquefazer->registros->PROD_QUANTIDADE; ?></td>
    <td class="alterar_excluir" width="63"><a href="?tabela=imagem&acao=listar&prod_codigo=<?php echo $oquefazer->registros->PROD_CODIGO ?>">Imagens</a></td>
    <td class="alterar_excluir" width="63"><a href="?tabela=produto&acao=alterar&prod_codigo=<?php echo $oquefazer->registros->PROD_CODIGO ?>">Alterar</a></td>
    <td class="alterar_excluir" width="61"><a href="?tabela=produto&acao=excluir&prod_codigo=<?php echo $oquefazer->registros->PROD_CODIGO ?>" onclick="if(confirm('Deseja Realmente excluir este registro?'))return true;else return false;">Excluir</a></td>
  </tr>
  <?php } ?>
  <tr>
    <td colspan="7" class="titulos_listas">Número de Registros:<?php echo $oquefazer->total_registros(); ?></td>
  </tr>
</table> 