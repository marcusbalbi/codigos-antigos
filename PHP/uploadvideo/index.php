<?php
echo $_SERVER["DOCUMENT_ROOT"]."/uploadvideo/";
?>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <link href="uploadify/uploadify.css" rel="stylesheet"/>
        <script src="jquery-1.9.0.js"></script>
            <script type="text/javascript" src="uploadify/jquery.uploadify-3.1.js"></script>
    </head>
    <body>
        <form name="enviavideo" method="POST" enctype="multipart/form-data">
          <input type="file" name="file_upload" id="file_upload" />
        </form>
    </body>
    <script>
                $('#file_upload').uploadify({
            'swf'      : 'uploadify/uploadify.swf',
            'uploader' : 'uploadify/uploadify.php',
             height        : 30,
             width         : 120,
             'multi' : false,
             'buttonText' : 'Selecione sua foto',
             'fileSizeLimit':'2500000',
             'formData':{'<?php echo session_name() ?>':'<?php echo session_id()  ?>'},
             onUploadComplete:function(a){
                console.log(a);
             }
        });
    </script>
</html>
