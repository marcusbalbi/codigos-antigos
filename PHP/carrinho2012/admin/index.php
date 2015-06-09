<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>TESTE</title>
<link href="estilo.css" rel="stylesheet" />
</head>

<body>

<div id="raiz">
<div id="topo"><h1 align="center">TESTE ADMIN  2</h1></div>
<div id="menuv"><?php include_once("menuv.php"); ?></div>



        <div id="conteudo">
        
        <?php  if(isset($_GET['conteudo']))
				{
					include_once($_GET['conteudo'].".php");
				}
		 ?>
        
        
        </div>
		<br style="clear:both" />


</div>





</body>
</html>