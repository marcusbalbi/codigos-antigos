<?php
session_start();


	unset($_SESSION['sessao_usuario']);
	
	
	session_destroy();
	header("Location:login_form.php");
	
	


?>