<?php

	require_once("imagem_manutencao.php");
	
	$oquefazer = new imagem_manutencao();
	
	$acao = $_REQUEST['acao'];
	//echo $acao;
	
	
	 if($acao == "listar")
	 {   
	 	
	  $ordem = isset($_REQUEST['ordem'])? $_REQUEST['ordem'] : null;
	  
	  $pesquisa = isset($_REQUEST['pesquisa'])? $_REQUEST['pesquisa'] : null;
	  
	  
		 $oquefazer->listar_imagem($_REQUEST["prod_codigo"],$ordem,$pesquisa);
		 require_once("imagem_lista.php");
	 }
	 
	 if($acao == "excluir")
	 {
		 $oquefazer->excluir($_REQUEST['img_codigo']);
		  $oquefazer->listar_imagem($_REQUEST['prod_codigo']);
		 require_once("imagem_lista.php");
	 }
	 
	  if($acao == "gravar")
	 {
		$tipos_arquivos = array(".jpg",".JPG",".gif",".GIF",".png",".PNG");
		
		$nome_arquivo = $_FILES['img_descricao']['name'];
		
			$tipo = 	strstr($nome_arquivo,".");
	
			if(in_array($tipo,$tipos_arquivos))
			{
			
				
				var_dump(move_uploaded_file($_FILES["img_descricao"]['tmp_name'],"../imagens/".$_FILES["img_descricao"]["name"]));
			
	
				 $oquefazer->gravar($_POST["prod_codigo"],$_FILES['img_descricao']['name']);
				 
				 $oquefazer->listar_imagem($_REQUEST['prod_codigo']);
				  
				 require_once("imagem_lista.php");
		 }
	 }
	 
	 if($acao == "incluir")
	 {
		 require_once("imagem_form.php");
	 }
	 


?>