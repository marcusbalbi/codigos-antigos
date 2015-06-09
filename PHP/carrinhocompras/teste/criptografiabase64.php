<?php


//CRIPTOGRAFIA BASE64  64bits MAO DUPLA
$senha = "marcusbalbi";
$criptografada = base64_encode($senha);

echo "<br><br>SENHA DIDIGATA:".$senha;
echo "<br><br>SENHA CRIPTOGRAFADA COM SHA1:  ".$criptografada."<br><br>";

	
	$senhadigitada = "marcusbalbi";
	if($criptografada == base64_encode($senhadigitada))
	{
		echo "VOCE TEM ACESSO AO SISTEMA";
	}
	else
	{
		echo "VC NAO TEM ACESSO BYE!";
	}
	
	
	echo "<br><br>A senha descriptografada e:         ".base64_decode($criptografada);



?>