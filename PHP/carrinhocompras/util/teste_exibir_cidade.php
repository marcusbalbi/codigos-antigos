<?php 

	require_once("conecta.php");
	
	
	$sql = "select * from tbl_cidade";
	
	
	$resultado = $conexao->banco->Execute($sql);
	
	while(!$resultado->EOF)
	{
		echo "cidade = " . $resultado->Fields("cid_descricao")."<br>";
		$resultado->MoveNext();
	}


?>