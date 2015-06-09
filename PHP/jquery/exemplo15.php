<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CAPITULO 6</title>
       <script type="text/javascript"  src="jquery-1.7.1.js"></script>
       <link href="exemplo15.css" rel="stylesheet" type="text/css" />
    </head>
    <body id="single">

        <input type="button" id="animate" value="Animate" />

        <div class="box">
            <p>asu usah suah sauih usiahdhsu huashdhshdiuzshd uu shduhasu hushuh uisahu shdusah asuiashasdh  u sha idusahu s usah diusahdus ada
            asiuhdusah  ushduisahdiusahd uisahudsah dusaih duiash</p>
        </div>

        
    </body>

     <script type="text/javascript" >


    $("#animate").click(function(){


        //$(".box").slideToggle("slow");


              /*  var box = $(".box");

        if(box.is(":visible"))
            box.fadeOut("slow");
        else
            box.fadeIn("slow");*/


      //  $(".box").animate({opacity:'toggle'},'slow')


         $(".box").animate({opacity:'toggle',height:'toggle'},'slow');



    });
  

    </script>
</html>
