<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
       <script type="text/javascript"  src="jquery-1.7.1.js"></script>
    </head>
    <body>
        <div id="content">

            <h1>Main title</h1>
            <h2>Second Title</h2>
            <p>Some content</p>
            <h2>Section Title</h2>
            <p>More COntent</p>

        </div>

        
    </body>

     <script type="text/javascript" >

    
     alert("Existe "+$("h1 +h2").length+" irmao h1 direto de h2");

    alert("Existe "+$("h1").siblings('h2,h3,p').length+" h2 h3 e p que sao irmaos de h1");


    </script>
</html>
