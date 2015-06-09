<?php

class Post implements JsonSerializable {

    private $tittle,$body;
    
    public function setTittle($value)
    {
        $this->tittle = $value;
    }
    
    public function setBody($value)
    {
        $this->body = $value;
    }

    public function jsonSerialize() {
        return ["titulo"=>  $this->tittle,"body"=>  $this->body];
    }

}

$obj = new Post();

$obj->setBody("BODY");
$obj->setTittle("TITULO");

echo json_encode($obj,JSON_PRETTY_PRINT);

?>
