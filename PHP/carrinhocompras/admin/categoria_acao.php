<?php

	require_once("categoria_manutencao.php");
	
	$oquefazer = new categoria_manutencao();
	
	$acao = $_REQUEST['acao'];
	//echo $acao;
	
	
	 if($acao == "listar")
	 {   
	 
	  $ordem = isset($_REQUEST['ordem'])? $_REQUEST['ordem'] : null;
	  
	  $pesquisa = isset($_REQUEST['pesquisa'])? $_REQUEST['pesquisa'] : null;
	  
	  
		 $oquefazer->listar_categoria($ordem,$pesquisa);
		 require_once("categoria_lista.php");
	 }
	 
	 if($acao == "excluir")
	 {
		 $oquefazer->excluir($_REQUEST['cat_codigo']);
		  $oquefazer->listar_categoria();
		 require_once("categoria_lista.php");
	 }
	 
	  if($acao == "gravar")
	 {
		 
		 
		 $CAT_CODIGO = isset($_REQUEST['cat_codigo']) ? $_REQUEST['cat_codigo'] : null; 
		 $oquefazer->gravar($_REQUEST["cat_descricao"],$CAT_CODIGO);
		  $oquefazer->listar_categoria();
		 require_once("categoria_lista.php");
	 }
	 
	 if($acao == "incluir")
	 {
		 require_once("categoria_form.php");
	 }
	 
	 if($acao == "alterar")
	 {
		 $oquefazer->alterar($_REQUEST['cat_codigo']); 
		 require_once("categoria_form.php");
	 }
	 


?>