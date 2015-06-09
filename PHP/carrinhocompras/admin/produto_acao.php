<?php

	require_once("produto_manutencao.php");
	
	$oquefazer = new produto_manutencao();
	
	$acao = $_REQUEST['acao'];
	//echo $acao;
	
	
	 if($acao == "listar")
	 {   
	 	
	  $ordem = isset($_REQUEST['ordem'])? $_REQUEST['ordem'] : null;
	  
	  $pesquisa = isset($_REQUEST['pesquisa'])? $_REQUEST['pesquisa'] : null;
	  
	  
		 $oquefazer->listar_produto($ordem,$pesquisa);
		 require_once("produto_lista.php");
	 }
	 
	 if($acao == "excluir")
	 {
		 $oquefazer->excluir($_REQUEST['prod_codigo']);
		  $oquefazer->listar_produto();
		 require_once("produto_lista.php");
	 }
	 
	  if($acao == "gravar")
	 {
		 
		 
		 $PROD_CODIGO = isset($_POST['prod_codigo']) ? $_POST['prod_codigo'] : null; 
		 	
		
		 
		 $oquefazer->gravar($_POST['for_codigo'],$_POST['cat_codigo'],$_POST['prod_descricao'],$_POST['prod_valor'],$_POST['prod_quantidade'],$_POST['prod_tipo'],$_POST['prod_obs'],$PROD_CODIGO);
		 
		  $oquefazer->listar_produto();
		  
		 require_once("produto_lista.php");
	 }
	 
	 if($acao == "incluir")
	 {
		 require_once("produto_form.php");
	 }
	 
	 if($acao == "alterar")
	 {
		 $oquefazer->alterar($_REQUEST['prod_codigo']); 
		 require_once("produto_form.php");
	 }
	 


?>