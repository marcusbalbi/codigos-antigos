<?php
session_start();

require_once("conexao.php");

$conexao = new conexao();


if(isset($_POST["logar"]))
{
	
	
	$usuario = 	$conexao->executarQuery("select * from clientes where login = '".$_POST["login"]."' and senha = '".$_POST["senha"]."'")->fetch();

	if($usuario == false)
	{
		echo "Login ou senha incorretos";
	}
	else
	{
		$_SESSION['usuario'] = $usuario;
		echo "Login efetuado com sucesso";
		
	}
	
	
	
}


?>
<div align="center">

<?php if(!isset($_SESSION['usuario'])){ ?>
<h1>Efetuar Login</h1>
<form action="index.php?conteudo=login" name="formlogin" method="post">
<table>
	<tr>

    	<td>Login</td>
        <td><input type="text" name="login"/></td>
    </tr>
    <tr>
    	<td>senha</td>
        <td><input type="password" name="senha"/></td>
    </tr>
    <tr>
    	<td colspan="2"><input type="submit" name="logar" value="Efetuar Login" /></td>
    </tr>
</table>

</form>
<?php } ?>
</div>