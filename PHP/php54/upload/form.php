<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        
        <form name="form" method="post" action="form.php"  enctype='multipart/form-data'>
            <input type="hidden" name="<?php echo ini_get("session.upload_progress.name") ?>" value="my_files">
            <input type="file" name="arquivo" multiple="">
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
