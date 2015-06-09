<?php
		
		function alerta($msensagem)
		{
			echo "<script>alert('".$msensagem."')</script>";
			
		}
		
		function voltar()
		{
			echo "<script>history.back();</script>";
		}
		
		function direciona($praonde)
		{
			echo "<script>window.location='".$praonde."'</script>";
		}



?>