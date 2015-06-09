<?php


//CRIPTOGRAFIA MD5  128bits MAO UNICA
$senha = "marcusbalbi";
$criptografada = md5($senha);

echo "<br><br>SENHA DIDIGATA:".$senha;
echo "<br><br>SENHA CRIPTOGRAFADA COM MD5:  ".$criptografada."<br><br>";

	
	$senhadigitada = "marcusvinicius";
	if($criptografada == md5($senhadigitada))
	{
		echo "VOCE TEM ACESSO AO SISTEMA";
	}
	else
	{
		echo "VC NAO TEM ACESSO BYE!";
	}



?>