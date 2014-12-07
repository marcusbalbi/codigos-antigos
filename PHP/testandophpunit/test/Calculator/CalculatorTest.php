<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 * Description of CalculatorTest
 *
 * @author Marcus
 */
class CalculatorTest extends PHPUnit_Framework_TestCase {
    
    protected $calc;


    public function setUp() {
        parent::setUp();
        
        $this->calc = new Calculator();
    }
    
    public function testResultDefaultsToNull()
    {
        $this->assertNull($this->calc->getResult());
    }
    
    public function testAddsNumbers()
    {
        $this->calc->setOperands(5);
        $this->calc->setOperation(new Addition);
        $result = $this->calc->calculate();
        
        $this->assertEquals(5, $result);
    }
    
    public function testMultipliesNumbers()
    {
        $this->calc->setOperands(2,3,5);
        $this->calc->setOperation(new Multiplication);
        $result = $this->calc->calculate();
        
        
        $this->assertEquals(30, $result);
           
    }
    
    /**
     * @expectedException InvalidArgumentException
     */
    public function testRequiresNumericValue()
    {
        $this->calc->setOperands('five');
        $this->calc->setOperation(new Addition);
        
        $this->calc->calculate();
    }
    
    public function testAcceptsMultipleArgs()
    {
        $this->calc->setOperands(1,2,3,4);
        
        $this->calc->setOperation(new Addition);
        
        $result = $this->calc->calculate();
        
        $this->assertEquals(10,$result);
        
        $this->assertNotEquals('snoopy doggy and Dr. Dre is at door', $result); //jokes 
        
    }
    
    public function testSubtractsNumbers()
    {
        $this->calc->setOperands(4);
        $this->calc->setOperation(new Subtraction);
        $result = $this->calc->calculate();
        
        $this->assertEquals(-4,$result);
        
        
    }
    
    
}
