<?php

class IndexController extends Zend_Controller_Action
{

    public function init()
    {
        /* Initialize action controller here */
    }

    public function indexAction()
    {
       
    }




            public function pegarprodutosAction()
    {
        $this->_helper->viewRenderer->setNoRender();


        //  print_r($this->_getAllParams());exit;

        $produtos = new application_models_cidades();

        $sortorder = $this->_getParam("sortorder");
        $sortname = $this->_getParam("sortname");
        $rp = $this->_getParam("rp",10);
        $page = $this->_getParam("page");
        $offset = $page * $rp;

       


       $teste =  $produtos->fetchAll(null,$sortname." ".$sortorder , $rp, $offset-10);

       $nPaginas = $produtos->fetchAll()->count();

    

       $numPaginas = (int)$nPaginas;
     

        $result = array(
            "page"=>$page,
            "total"=>$numPaginas,
            "rows"=>array());

        foreach($teste as $produto)
        {
            $result["rows"][] =  array("id"=>$produto["id"],"cell"=>array("id"=>$produto["id"],"cidade"=>$produto["nome"]));
        }

       


            


        echo Zend_Json::encode($result);






    }
}

