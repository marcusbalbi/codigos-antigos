<?php


class conexao 
{
	
	private $dsn = "mysql:host=localhost;dbname=teste";
	private $user = "root";
	private $pass = "";
	private $con;
	
	
	public function __construct()
	{
		$this->con = new PDO($this->dsn,$this->user,$this->pass);
	}
	
	
	/**
	*@return PDOStatement
	**/
	public function executarQuery($sql)
	{
		
		return $this->con->query($sql);
		
		
	}
	
	
	/**
	*@return int
	**/
	public function executar($sql)
	{
		
		return $this->con->query($sql);
		
		
	}
	
		
	
	
}




?>