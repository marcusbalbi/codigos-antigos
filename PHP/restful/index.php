<?php
/**
 * Step 1: Require the Slim Framework
 *
 * If you are not using Composer, you need to require the
 * Slim Framework and register its PSR-0 autoloader.
 *
 * If you are using Composer, you can skip this step.
 */
error_reporting(E_STRICT|E_ALL);
ini_set('display_errors', 1);
require 'Slim/Slim.php';

\Slim\Slim::registerAutoloader();

/**
 * Step 2: Instantiate a Slim application
 *
 * This example instantiates a Slim application using
 * its default settings. However, you will usually configure
 * your Slim application now by passing an associative array
 * of setting names and values into the application constructor.
 */
$app = new \Slim\Slim();

/**
 * Step 3: Define the Slim application routes
 *
 * Here we define several Slim application routes that respond
 * to appropriate HTTP request methods. In this example, the second
 * argument for `Slim::get`, `Slim::post`, `Slim::put`, and `Slim::delete`
 * is an anonymous function.
 */

// GET route
$app->get('/', function () {
    echo "This is a GET route";
});

$app->get('/friends',function(){
    echo "Fetch All Friends";
});

$app->get('/friends/new',function(){
     echo 'Show form to add a new friend';
});

$app->get('/friends/:friend',function($friend){
     echo 'Show single friend: ' . $friend;  
});

$app->get('/friends/:friend/edit',function(){
     echo 'Show form to edit friend';
    // Form should put to /friends/$friend  
});

$app->post('/friends',function(){
    echo "add a new Friend";
});

$app->put('/friends/:friend',function($friend){
    echo "Update A friend";
});

$app->delete('/friends/:friend',function($friend){
    echo "Delete friend";
});

/**
 * Step 4: Run the Slim application
 *
 * This method should be called last. This executes the Slim application
 * and returns the HTTP response to the HTTP client.
 */
$app->run();
