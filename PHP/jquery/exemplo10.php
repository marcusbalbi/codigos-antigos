<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
       <script type="text/javascript"  src="jquery-1.7.1.js"></script>
    </head>
    <body>
        <ul>
            <li>First Item</li>
            <li class="selected">Second Item</li>
            <li>Third Item</li>
            <li>Fourth Item</li>
            <li>Fith Item</li>
            
        </ul>

        <ul>
            <li>TESTE</li>
        </ul>

        
    </body>

     <script type="text/javascript" >

    alert("Existem "+$("li.selected").nextAll('li').length+"itens depois do item com a classe selected");
         

    </script>
</html>
