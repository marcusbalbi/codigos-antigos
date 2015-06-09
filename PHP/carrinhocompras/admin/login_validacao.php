<?php
		session_start();

	if(($_POST["login"] != "") && ($_POST['senha'] != ""))
	{
		//echo "ok";
		require_once("../util/conecta.php");
		require_once("../util/funcoes.php");
		
		
		$senha = addslashes($_POST['senha']);
		
		
		
		$sql = "select * from tbl_usuario where USU_LOGIN = '".$_POST['login']."' and USU_SENHA = '". md5($senha)."'"; 
		
		$resultado = $conexao->banco->Execute($sql);
		
		if($registro = $resultado->FetchNextObject()){
		   //alerta("usuario valido");
		   
		   $_SESSION['sessao_usuario'] = $registro;
		   
		 	direciona('index.php');  
		   exit;
		}
		else
		   {
			   alerta("Usuario nao valido");
			   voltar();
			   exit;
		    }
		
	}
	else
	{
		echo "voce precisar digitar o usuario ou senha";
	}
	
 


?>