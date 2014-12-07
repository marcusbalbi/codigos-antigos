<?php

class PraticeTest extends PHPUnit_Framework_TestCase {
	
	public function testHelloWorld()
{
	$greeting = "Hello World";
	
	$this->assertTrue($greeting === "Hello World");
	
	$this->assertEquals($greeting,"Hello World");

	$this->assertNotEquals($greeting,"HAHA");	

}

    public function testFetchesItemsInArray()
    {
        //Arrange
        $items = ['Taylor','Jeff','Matt'];
        
        //act
        $result = $items[0];
        
        //Assert
        $expected = 'Taylor';
        $this->assertEquals($expected, $result);
    }
    
    /**
     * @expectedException InvalidArgumentException
     */
    public function testThrowsExceptionIfKeyDoesNotExist()
    {
        
        //GIven an array
        $fruits = ["apple","orange","banana"];
        
        //when i access a key that dont exists
        $result = array_get(3,$fruits);
        
        
        
        
    }
   

}

    function  array_get($index,$array)
    {
        if(empty($array[$index]))
            throw new InvalidArgumentException("Chave Inexistente");
        
        return $array[$index];
    }

?>
