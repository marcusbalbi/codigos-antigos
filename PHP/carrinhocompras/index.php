<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
<head>
<link href="util/estilos.css" rel="stylesheet" />
</head>

<body>
<table width="1254" height="221" border="0">
  <tr>
    <td height="46" colspan="2" class="titulo_sistema">Site Principal</td>
  </tr>
  <tr>
    <td width="71" height="26" valign="top" class="menu">
      <p><a href="index.php">Carrinho:</a> <br />
      </p></td>
    <td width="1020" rowspan="3" align="center" valign="top">
    <?php
		
		require_once("util/conecta.php");
		require_once("util/funcoes.php");
		/*$tabela = isset($_REQUEST["tabela"])? $_REQUEST["tabela"] : "";

		    require_once("principal.php");*/
			
			require_once('carrinho_acao.php');
		
	
	?>
    
    </td>
  </tr>
  <tr>
    <td height="27" valign="top" class="menu">Categoria:</td>
  </tr>
  <tr>
    <td height="28" valign="top" class="menu">
     <?php 
	 	require_once("carrinho_manutencao.php");
		$carrinho = new carrinho_manutencao();	
		$carrinho->listar_categoria();
	 ?>
     <table width="100%" cellspacing="2" border="1px">
     		<?php 
				while($carrinho->registros = $carrinho->resultado->FetchNextObject())
				{?>
                
                <tr>
                	<td> <a href="index.php?codcategoria=<?php echo $carrinho->registros->CAT_CODIGO; ?>&acao=listar_produtos"><?php echo $carrinho->registros->CAT_DESCRICAO; ?></a></td>
                </tr>
            
            <?php }?>
        
     </table>
    </td>
  </tr>
  <tr>
    <td height="21" colspan="2" align="center">Rodapé</td>
  </tr>
</table>
</body>
</html>