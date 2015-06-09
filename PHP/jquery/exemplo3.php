<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
       <script type="text/javascript"  src="jquery-1.7.1.js"></script>
    </head>
    <body>
        <ul>
            <li>Name</li>
            <li class="remover">Name</li>
            <li>Name</li>
            <li class="remover">Name</li>
            <li>Name</li>
            <li class="remover">Name</li>
        </ul>

        
    </body>

     <script type="text/javascript" >

        $('li.remover').replaceWith("<li>REMOVIDA</li>");
         

    </script>
</html>
