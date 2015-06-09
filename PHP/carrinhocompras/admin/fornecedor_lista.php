<link href="../util/estilos.css" rel="stylesheet" type="text/css" />

<table width="632" height="176" border="1" class="borda_tabela" cellspacing="2">
  <tr class="titulos_listas">
    <td colspan="5"><div align="center">
      <h3>Lista de Fornecedores</h3>
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
    <td width="214"><a href="index.php?tabela=fornecedor&acao=listar&ordem=FOR_RAZAOSOCIAL">Razão social</a></td>
    <td width="147"><a href="index.php?tabela=fornecedor&acao=listar&ordem=FOR_NOME_FANTASIA">Nome Fantasia</a></td>
    <td width="84"><a href="index.php?tabela=fornecedor&acao=listar&ordem=FOR_CNPJ">Cnpj</a></td>
    <td colspan="2"><a href="index.php?tabela=fornecedor&acao=incluir">Novo Registro</a></td>
  </tr>
  <?php
  	require_once("fornecedor_acao.php");
	while($oquefazer->registros = $oquefazer->resultado->FetchNextObject())
	{?>
  <tr class="linha">
    <td><?php echo $oquefazer->registros->FOR_RAZAOSOCIAL; ?></td>
    <td><?php echo $oquefazer->registros->FOR_NOME_FANTASIA; ?></td>
    <td><?php echo $oquefazer->registros->FOR_CNPJ; ?></td>
    <td class="alterar_excluir" width="63"><a href="?tabela=fornecedor&acao=alterar&for_codigo=<?php echo $oquefazer->registros->FOR_CODIGO ?>">Alterar</a></td>
    <td class="alterar_excluir" width="61"><a href="?tabela=fornecedor&acao=excluir&for_codigo=<?php echo $oquefazer->registros->FOR_CODIGO ?>" onclick="if(confirm('Deseja Realmente excluir este registro?'))return true;else return false;">Excluir</a></td>
  </tr>
  <?php } ?>
  <tr>
    <td colspan="5" class="titulos_listas">Número de Registros:<?php echo $oquefazer->total_registros(); ?></td>
  </tr>
</table> 