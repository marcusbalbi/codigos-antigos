<?php

	require_once("fornecedor_manutencao.php");
	
	$oquefazer = new fornecedor_manutencao();
	
	$acao = $_REQUEST['acao'];
	//echo $acao;
	
	
	 if($acao == "listar")
	 {   
	 
	  $ordem = isset($_REQUEST['ordem'])? $_REQUEST['ordem'] : null;
	  
	  $pesquisa = isset($_REQUEST['pesquisa'])? $_REQUEST['pesquisa'] : null;
	  
	  
		 $oquefazer->listar_fornecedor($ordem,$pesquisa);
		 require_once("fornecedor_lista.php");
	 }
	 
	 if($acao == "excluir")
	 {
		 $oquefazer->excluir($_REQUEST['for_codigo']);
		  $oquefazer->listar_fornecedor();
		 require_once("fornecedor_lista.php");
	 }
	 
	  if($acao == "gravar")
	 {
		 
		 
		 $FOR_CODIGO = isset($_POST['for_codigo']) ? $_POST['for_codigo'] : null; 
		 	
		
		 
		 $oquefazer->gravar($_POST['cid_codigo'],$_POST['for_razaosocial'],$_POST['for_nome_fantasia'],$_POST['for_endereco'],$_POST['for_bairro'],$_POST['for_fone'],$_POST['for_responsavel'],$_POST['for_email'],$_POST['for_cnpj'],$_POST['for_cep'],$FOR_CODIGO);
		  $oquefazer->listar_fornecedor();
		 require_once("fornecedor_lista.php");
	 }
	 
	 if($acao == "incluir")
	 {
		 require_once("fornecedor_form.php");
	 }
	 
	 if($acao == "alterar")
	 {
		 $oquefazer->alterar($_REQUEST['for_codigo']); 
		 require_once("fornecedor_form.php");
	 }
	 


?>