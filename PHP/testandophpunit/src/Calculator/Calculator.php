<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

interface operation {
    public function run($num, $current);
}


class Addition implements operation {
     public function run($num,$current) {
        return $current + $num;
    }

}

class Multiplication implements operation{
    
    
    public function run($num, $current) {
        if(is_null($current)) {
            return $num;
        }
        return $current * $num;
        
        
    }

}

class Subtraction implements operation {
    
    public function run($num, $current) {
        return $current-$num;
    }

}


class Calculator {
   
    protected $result = null;
    
    protected $operands = [];

    protected $operation;

    public function getResult()
    {
        return $this->result;
    }
    
    public function setOperands()
    {
        $this->operands = func_get_args();
    }
    
    public function setOperation(operation $operation)
    {
        $this->operation = $operation;
    }
    
    public function calculate()
    {
        foreach ($this->operands as $num) {
        
            
            if(!is_numeric($num))
            {
                throw new InvalidArgumentException;
            }
            
            $this->result =  $this->operation->run($num, $this->result);
        
            
            
        }
        return $this->result;
    }
    
}
