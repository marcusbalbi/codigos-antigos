<?php
/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of conexao
 *
 * @author Marcus
 */
class conexao {

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
?>
