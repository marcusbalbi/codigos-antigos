<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
       <script type="text/javascript"  src="jquery-1.7.1.js"></script>
    </head>
    <body>

        <table width="300" border="1">
            <tr>
                <td>0</td>
                <td>even</td>
            </tr>
            <tr>
                <td>1</td>
                <td>odd</td>
            </tr>
             <tr>
                <td>2</td>
                <td>even</td>
            </tr>
             <tr>
                <td>3</td>
                <td>odd</td>
            </tr>
             <tr>
                <td>4</td>
                <td>even</td>
            </tr>
        </table>

        
    </body>

    <style type="text/css">

        .even
        {
            background-color: gray;

        }

    </style>

     <script type="text/javascript" >


    $("tr:even").addClass("even");
         

    </script>
</html>
