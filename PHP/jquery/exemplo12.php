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
         <a href="#">LINK a remoer!!!</a>
           <a href="#">LINK!!!</a>
           <a href="#">LINK a remover!!!</a>
             <a href="#">LINK!!!</a>

        
    </body>

    <style type="text/css">

        .not-clicked
        {
            color: black;
            
        }
        .clicked
        {
            color: red;
}

    </style>

     <script type="text/javascript" >

    $('a').click(function(){

        $('a').removeClass();
        $("a").not(this).addClass("not-clicked");
        $(this).addClass('clicked');
    });
         

    </script>
</html>
