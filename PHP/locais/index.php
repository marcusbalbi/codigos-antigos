<?php

include "bootstrap.php";

$bootstrap = new Bootstrap("dev");

$bootstrap->configureFrontController();

$bootstrap->runApp();

?>