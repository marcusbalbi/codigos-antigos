<?php

class teste {

    private $value = 10;
    
    public function mult()
    {
        $teste =  function() {
            $this->value * 5;
        }
    }

}
?>
