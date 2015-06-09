<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
       <script type="text/javascript"  src="jquery-1.7.1.js"></script>
    </head>
    <body>
        <h3>Ancoras</h3>
        <a href="#">LINK!!!</a>
         <a href="#">LINK!!!</a>
         <a href="#" class="remover">LINK a remoer!!!</a>
           <a href="#">LINK!!!</a>
           <a href="#" class="remover">LINK a remover!!!</a>
             <a href="#">LINK!!!</a>

        
    </body>

     <script type="text/javascript" >

        $('a').remove(".remover");
         

    </script>
</html>
