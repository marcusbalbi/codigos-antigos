<?php 

	require_once('adodb/adodb.inc.php'); //BIBLIOTECA NECESSARIA PARA ATRABALHAR COM ADODB
	
	class conexao
	{
		private $tipo_banco = "mysql";
		private $servidor = "localhost";
		private $usuario = "root";
		private $senha = "";
		public $banco;
		
		
		public function __construct()
		{
			$this->banco = NewADOConnection($this->tipo_banco);
			$this->banco->dialect = 3;
			$this->banco->debug = true;
			$this->banco->Connect($this->servidor,$this->usuario,$this->senha,"carrinho_compras");
			
		}
		
		
		
	}
	
	$conexao = new conexao();
	
	//mysql_select_db("carrinho_compras");
	
	/*if($conexao)
		echo "conectou";
	else
		echo "nao conectou";*/
	
	
	



?>