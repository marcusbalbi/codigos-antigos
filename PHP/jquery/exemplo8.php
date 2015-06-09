<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
       <script type="text/javascript"  src="jquery-1.7.1.js"></script>
    </head>
    <body>
        <ul id="nav">
            <li><a href="#">Ancora 1</a></li>
            <li><a href="#">Ancora 2</a></li>
            <li><span><a href="#">Ancora 3</a></span></li>
        </ul>

        
    </body>

     <script type="text/javascript" >

        alert("este exemplo possui "+$("#nav li > a").length+" ancoras filhos diretos de item de lista");


    alert("este exemplo possui "+$("#nav li").children('span').length+" span filhos diretos de item de lista")
         
        

    </script>
</html>
