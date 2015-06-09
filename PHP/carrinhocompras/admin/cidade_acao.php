<?php

	require_once("cidade_manutencao.php");
	
	$oquefazer = new cidade_manutencao();
	
	$acao = $_REQUEST['acao'];
	//echo $acao;
	
	
	 if($acao == "listar")
	 {   
	 
	  $ordem = isset($_REQUEST['ordem'])? $_REQUEST['ordem'] : null;
	  
	  $pesquisa = isset($_REQUEST['pesquisa'])? $_REQUEST['pesquisa'] : null;
	  
	  
		 $oquefazer->listar_cidade($ordem,$pesquisa);
		 require_once("cidade_lista.php");
	 }
	 
	 if($acao == "excluir")
	 {
		 $oquefazer->excluir($_REQUEST['cid_codigo']);
		  $oquefazer->listar_cidade();
		 require_once("cidade_lista.php");
	 }
	 
	  if($acao == "gravar")
	 {
		 
		 
		 $CID_CODIGO = isset($_REQUEST['cid_codigo']) ? $_REQUEST['cid_codigo'] : null; 
		 
		 $oquefazer->gravar($_REQUEST["cid_descricao"],$_REQUEST["cid_uf"],$CID_CODIGO);
		  $oquefazer->listar_cidade();
		 require_once("cidade_lista.php");
	 }
	 
	 if($acao == "incluir")
	 {
		 require_once("cidade_form.php");
	 }
	 
	 if($acao == "alterar")
	 {
		 $oquefazer->alterar($_REQUEST['cid_codigo']); 
		 require_once("cidade_form.php");
	 }
	 


?>