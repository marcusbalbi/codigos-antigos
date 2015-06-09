<?php

class Bootstrap extends Zend_Application_Bootstrap_Bootstrap
{
    protected function _bootstrap($resource = null) {

        self::setupDatabase();
        Zend_Loader_Autoloader::getInstance()->setFallbackAutoloader(true);
        parent::_bootstrap($resource);
    }

       public static function setupDatabase()
       {
           $config = new Zend_Config_Ini(APPLICATION_PATH."/configs/application.ini", APPLICATION_ENV);
           $db = Zend_db::factory($config->db->adapter,$config->db);

           Zend_Db_Table::setDefaultAdapter($db);
       }

}

