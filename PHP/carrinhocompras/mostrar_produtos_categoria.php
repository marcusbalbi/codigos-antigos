<link href="util/estilos.css" rel="stylesheet" type="text/css">
<table align="center" width="100%" cellspacing="4" border="2">
	
    <tr>
   	  <td>	
      	
        <?php 
				while($oquefazer->registros = $oquefazer->resultado->FetchNextObject())
				{?>
        
       	<div class="mostraproduto">
        
        	<img src="imagens/<?php echo $oquefazer->registros->IMG_DESCRICAO; ?>" width="100" height="100"/>
        
        
        </div>
        
        <?php  } ?>
      
      </td>
    </tr>
    
</table>