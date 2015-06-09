<link href="../util/estilos.css" rel="stylesheet" type="text/css" />

<table width="603" height="176" border="1" class="borda_tabela" cellspacing="2">
  <tr class="titulos_listas">
    <td colspan="5"><div align="center">
      <h3>Lista de Usuarios</h3>
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
    <td width="220"><a href="index.php?tabela=usuario&acao=listar&ordem=USU_NOME">Nome</a></td>
    <td width="86"><a href="index.php?tabela=usuario&acao=listar&ordem=USU_LOGIN">Login</a></td>
    <td width="71"><a href="index.php?tabela=usuario&acao=listar&ordem=USU_NIVEL">Nivel</a></td>
    <td colspan="2"><a href="index.php?tabela=usuario&acao=incluir">Novo Registro</a></td>
  </tr>
  <?php
  	require_once("usuario_acao.php");
	while($oquefazer->registros = $oquefazer->resultado->FetchNextObject())
	{?>
  <tr class="linha">
    <td><?php echo $oquefazer->registros->USU_NOME; ?></td>
    <td><?php echo $oquefazer->registros->USU_LOGIN; ?></td>
    <td><?php echo $oquefazer->registros->USU_NIVEL; ?></td>
    <td class="alterar_excluir" width="53"><a href="?tabela=usuario&acao=alterar&usu_codigo=<?php echo $oquefazer->registros->USU_CODIGO ?>">Alterar</a></td>
    <td class="alterar_excluir" width="49"><a href="?tabela=usuario&acao=excluir&usu_codigo=<?php echo $oquefazer->registros->USU_CODIGO ?>" onclick="if(confirm('Deseja Realmente excluir este registro?'))return true;else return false;">Excluir</a></td>
  </tr>
  <?php } ?>
  <tr>
    <td colspan="5" class="titulos_listas">Número de Registros:<?php echo $oquefazer->total_registros(); ?></td>
  </tr>
</table> 