<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
       <script type="text/javascript"  src="jquery-1.7.1.js"></script>
    </head>
    <body>
        <a href="#" id="btn">SCROLL</a>
        <div id="teste" style="width:150px;height: 150px;background-color: blueviolet; position: absolute; top: 1500px;">TESTE</div>


        
    </body>

     <script type="text/javascript" >

    $("#btn").click(function(){

        var offsetteste = $("#teste").offset();

        destination = $(offsetteste).top;

        $(document).scrollTop(destination);


    });

    </script>
</html>
