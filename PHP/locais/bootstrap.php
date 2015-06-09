<?php
/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of bootstrap
 *
 * @author Marcus
 */
class Bootstrap {


        public function  __construct($configSection) {

        $rootdir = dirname(__FILE__);
        define('ROOT_DIR',$rootdir);

        set_include_path(get_include_path()
                .PATH_SEPARATOR.ROOT_DIR."/library/"
                .PATH_SEPARATOR.ROOT_DIR."/application/models");

        include 'Zend/Loader/Autoloader.php';
        Zend_Loader_Autoloader::getInstance()->setFallbackAutoloader(true);

        //Load Configurarion
        Zend_Registry::set("configSection",$configSection);

        $config = new Zend_Config_Ini(ROOT_DIR."/application/config.ini", $configSection);

        Zend_Registry::set('config', $config);


        date_default_timezone_set($config->date_default_timezone);

        //Configure Database and store to the registry
        $db = Zend_Db::factory($config->db);
        Zend_Db_Table_Abstract::setDefaultAdapter($db);
        Zend_Registry::set("db", $db);   

    }

    public function configureFrontController()
    {
        $frontController = Zend_Controller_Front::getInstance();
        $frontController->setControllerDirectory(ROOT_DIR."/application/controllers");
    }

    public function runApp()
    {
        //Run!
        $frontController = Zend_Controller_Front::getInstance();
        $frontController->dispatch();
    }

    
}
?>
