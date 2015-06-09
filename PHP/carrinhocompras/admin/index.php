<?php
session_start();

	if(!isset($_SESSION["sessao_usuario"]))
	{
		require_once("../util/funcoes.php");
		direciona("login_form.php");
		exit;
	}
?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
<head>
<link href="../util/estilos.css" rel="stylesheet" />
</head>

<body>
<table width="1254" height="382" border="0">
  <tr>
    <td height="46" colspan="2" class="titulo_sistema">Administração Carrinho de Compras</td>
  </tr>
  <tr>
    <td width="71" height="306" valign="top" class="menu">
      <p><a href="index.php">Home</a> <br />
        <a href="index.php?tabela=categoria&acao=listar">Categoria</a><br />
        <a href="index.php?tabela=cidade&acao=listar">Cidade</a><br />
    Clientes<br />
      <a href="index.php?tabela=fornecedor&acao=listar">Fornecedor</a><br />
    Pedidos<br />
     <a href="index.php?tabela=produto&acao=listar">Produtos</a><br />
    Promocao<br />
    <a  href="index.php?tabela=usuario&acao=listar">Usuario</a><br />
    <a href="logoff.php">Saida</a></p></td>
    <td width="1020" align="center" valign="top">
    <?php
		
		require_once("../util/conecta.php");
		require_once("../util/funcoes.php");
		$tabela = isset($_REQUEST["tabela"])? $_REQUEST["tabela"] : "";
		if($tabela == "cidade")
		{
			require_once('cidade_acao.php');
		}
		else if($tabela == "categoria")
		{
			require_once('categoria_acao.php');
		}
		else if($tabela == "usuario")
		{
			require_once('usuario_acao.php');
		}
		else if($tabela == "fornecedor")
		{
			require_once('fornecedor_acao.php');
		}
		else if($tabela == "produto")
		{
			require_once('produto_acao.php');
		}
		else if($tabela == "imagem")
		{
			require_once('imagem_acao.php');
		}
		else
		    require_once("principal.php");
		
	
	?>
    
    </td>
  </tr>
  <tr>
    <td height="21" colspan="2" align="center">Rodapé</td>
  </tr>
</table>
</body>
</html>