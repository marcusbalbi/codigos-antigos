<?php

$data = array(
    "name"=>"Marcus",
    "job"=>"Developer",
    "favorite_numbers"=>array(1,5,7,12)
    
);

$data2 = [
    "name"=>"Marcus",
    "job"=>"Developer",
    "favorite_numbers"=>[1,5,7,12]
    
];


function getArray()
{
    return  [
    "name"=>"Marcus",
    "job"=>"Developer",
    "favorite_numbers"=>[1,5,7,12]
    
];
    
}


var_dump($data);
echo "<br>";
var_dump($data2);

echo "<br>";

var_dump(getArray()["favorite_numbers"]);
echo "<br>";
var_dump((object)$data2);


?>
