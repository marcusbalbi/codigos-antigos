<?php

	require_once("usuario_manutencao.php");
	
	$oquefazer = new usuario_manutencao();
	
	$acao = $_REQUEST['acao'];
	//echo $acao;
	
	
	 if($acao == "listar")
	 {   
	 
	  $ordem = isset($_REQUEST['ordem'])? $_REQUEST['ordem'] : null;
	  
	  $pesquisa = isset($_REQUEST['pesquisa'])? $_REQUEST['pesquisa'] : null;
	  
	  
		 $oquefazer->listar_usuario($ordem,$pesquisa);
		 require_once("usuario_lista.php");
	 }
	 
	 if($acao == "excluir")
	 {
		 $oquefazer->excluir($_REQUEST['usu_codigo']);
		  $oquefazer->listar_usuario();
		 require_once("usuario_lista.php");
	 }
	 
	  if($acao == "gravar")
	 {
		 
		 
		 $USU_CODIGO = isset($_REQUEST['usu_codigo']) ? $_REQUEST['usu_codigo'] : null; 
		 	
		
		 
		 $oquefazer->gravar($_REQUEST['usu_nome'],$_REQUEST['usu_login'],$_REQUEST['usu_senha'],$_REQUEST['usu_nivel'],$USU_CODIGO);
		  $oquefazer->listar_usuario();
		 require_once("usuario_lista.php");
	 }
	 
	 if($acao == "incluir")
	 {
		 require_once("usuario_form.php");
	 }
	 
	 if($acao == "alterar")
	 {
		 $oquefazer->alterar($_REQUEST['usu_codigo']); 
		 require_once("usuario_form.php");
	 }
	 


?>