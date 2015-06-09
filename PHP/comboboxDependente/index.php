<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="jquery-1.5.2.js"></script>
        <title>COMBO BOX DEPENDENTES</title>
        
      
    </head>
    <body>
        <?php
        
        require_once "conexao.php";
        
        
        $con = new conexao("localhost", "estados", "root", "");
        
        $result = $con->executarQuery("select * from tb_estados")->fetchAll();
        
        
     
        ?>
        Estado:
        <select id="estados" name="estados">
            <option value="0">::SELECIONE::</option>
        <?php 
                foreach($result as $uf)
                    echo "<option value='".$uf["id"]."'>".$uf["uf"]."</option> ";
            ?>
        </select><br/>
        Cidade:
       <select id="cidade" name="cidade">
            <option value="0">::SELECIONE::</option>
        </select><br/>
        
        
        
    </body>
    <script type="text/javascript">
        $(document).ready(function(){
            
            
            $("#estados").change(function(){
                
            $.post("pegarCidadesAjax.php",
            {"id":$("#estados").val()},
            function(a){
                
            var cidades = a.toString().split("\n")
            
            var html = " <option value='0'>::SELECIONE::</option>";
            
            for(i=0;i<cidades.length-1;i++)
            {
                var linha = cidades[i].split("|");
                
           html+= ("<option value='"+linha[0]+"'>"+linha[1]+"</option>");
               
            }
          
            $("#cidade").html(html);
            
            });
                
            });
            
            
            
        });
    
    </script>
</html>
