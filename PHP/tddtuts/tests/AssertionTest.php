<?php

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of AssertionTest
 *
 * @author marcus
 */
class AssertionTest extends PHPUnit_Framework_TestCase {
    
    public function testBasicAssertion()
    {
        $this->assertTrue(5+3 === 7,"DEVERIA SER 8");
        
        $this->assertEquals(5+3, 8);
    }
    
    
}

?>
