<?php

include './mongo.php';

if(isset($_GET['id']))
{
    $people->remove(array(
        '_id'=> new MongoId($_GET['id'])
    ));
    
    header("Location: index.php");
}