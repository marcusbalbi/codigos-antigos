<?php

$date = new DateTime();

echo $date->format("Y-m-d");

echo "<br>";

echo (new DateTime())->format("Y-m-d");

echo "<br>";


echo (new DateTime())->add(new DateInterval("P5Y3M2D"))->format("Y-m-d");

?>
