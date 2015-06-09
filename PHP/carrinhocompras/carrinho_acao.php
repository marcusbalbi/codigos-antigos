<?php

require_once("carrinho_manutencao.php");
	
	$oquefazer = new carrinho_manutencao();
	
	$acao = $_REQUEST['acao'];
	echo $acao;
	
	
	 if($acao == "listar_produtos")
	 {   
	 
	  $cod_categoria = $_REQUEST['codcategoria'];
	  
	  
		 $oquefazer->listar_produtos_categoria($cod_categoria);
		 require_once("mostrar_produtos_categoria.php");
		
	 }



?>