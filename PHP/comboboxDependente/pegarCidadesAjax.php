<?php
 require_once "conexao.php";  
  
 $con = new conexao("localhost", "estados", "root", "");
 
    $result = $con->executarQuery("select * from tb_cidades where estado =".$_POST["id"])->fetchAll();
    
        
    foreach($result as $cidade)
    {
        echo  $cidade["id"]."|".$cidade["nome"]."\n";
    }

?>
