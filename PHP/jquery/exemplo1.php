<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
       <script type="text/javascript"  src="jquery-1.7.1.js"></script>
    </head>
    <body>
        <div id="teste">BLA BLA BAL</div>

        
    </body>

     <script type="text/javascript" >

        $('<p><a>Jquery</a></p>').find('a').attr("href",'http://www.jquery.com').end().appendTo('#teste');
         

    </script>
</html>
