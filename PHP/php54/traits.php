<?php


trait Bar
{
    function sayHello(){
        echo "I'm saying hello from trair Bar";
        
    }
}

trait teste
{
    function sayHello2() {
        echo "I'm saying hello from trait teste";
        
    }
}

trait BarTeste {
    
    use Bar,teste;
    
}

class base {

    public function sayHello()
    {
        echo "I'm saying hello  from base class";
    }

}

class foo extends base {

    use BarTeste;
    
    private $proprieade = "ABCD";
    
    public function getPropriedade()
    {
        return $this->proprieade;
    }
    
//    public function sayHello()
//    {
//       echo "I'm saying hello from class"; 
//    }
    

}

$obj =  new foo();

echo $obj->getPropriedade();
$obj->sayHello();

?>
