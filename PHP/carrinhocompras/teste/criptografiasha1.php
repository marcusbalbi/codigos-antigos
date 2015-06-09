<?php


//CRIPTOGRAFIA SHA1  160bits MAO UNICA
$senha = "marcusbalbi";
$criptografada = sha1($senha);

echo "<br><br>SENHA DIDIGATA:".$senha;
echo "<br><br>SENHA CRIPTOGRAFADA COM SHA1:  ".$criptografada."<br><br>";

	
	$senhadigitada = "marcusvinicius";
	if($criptografada == sha1($senhadigitada))
	{
		echo "VOCE TEM ACESSO AO SISTEMA";
	}
	else
	{
		echo "VC NAO TEM ACESSO BYE!";
	}



?>