<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
       <script type="text/javascript"  src="jquery-1.7.1.js"></script>
    </head>
    <body>

        <div id="teste" style="width:150px;height: 150px;background-color: blueviolet;">TESTE</div>

        
    </body>

     <script type="text/javascript" >



    alert("Altura da Janela:"+ $(window).height('300px'));
    alert("Larguda da Janela:"+ $(window).width('300px'));
    alert("Altura do Documento" + $(document).height('300px'));
    alert("Largura do Documento"+ $(document).width('300px'));


    $("#teste").width($(document).width());

         

    </script>
</html>
