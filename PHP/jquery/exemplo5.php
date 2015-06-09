<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
       <script type="text/javascript"  src="jquery-1.7.1.js"></script>
    </head>
    <body>
        <a>Jquery.com</a>

        
    </body>

     <script type="text/javascript" >

        alert($('a').attr("href","http://www.jquery.com").attr("href"));


        $("a").attr({"href":"http://www.google.com.br","title":"GOOGLE"}).html("GOOGLE").removeAttr("title");
         

    </script>
</html>
