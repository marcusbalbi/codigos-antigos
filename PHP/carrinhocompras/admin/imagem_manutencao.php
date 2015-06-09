  <?php
  
  require_once("../util/conecta.php");
  require_once("categoria_manutencao.php");
  require_once("produto_manutencao.php");
  
  class imagem_manutencao
  {
	  
	  public $resultado;
	  public $registros;
	  private $con;
	  public function __construct()
	  {
  			$this->con = new conexao();
		  
	   }
	   
	   
	  public function listar_imagem($prod_codigo,$ordem = null,$like  = null)
	  {
		  
		    $sql = "select * from tbl_imagem where PROD_CODIGO=".$prod_codigo;
			
			if(!is_null($like))
			$sql.= " where IMG_DESCRICAO like '%{$like}%'";
			
			
			if(!is_null($ordem))
			$sql.= " order by {$ordem}";
		  
  			$this->resultado = $this->con->banco->Execute($sql);
		  
	   }
	   
	  public function excluir($IMG_CODIGO)
	  {
				if($this->con->banco->Execute("delete from tbl_imagem where IMG_CODIGO = ".$IMG_CODIGO))
				{
					alerta("Registro excluido com sucesso");
				}
				else
				{
					alerta("Não foi possivel excluir o registro");
				}
		  
	   }
	   
	    public function gravar($PROD_CODIGO,$IMG_DESCRICAO)
	  {
		  
		  
  				if($this->con->banco->Execute("insert into tbl_imagem(PROD_CODIGO,IMG_DESCRICAO) VALUES({$PROD_CODIGO},'{$IMG_DESCRICAO}')"))
				{
					alerta("Registro incluido com sucesso");
				}
				else
				{
					alerta("Não foi possivel incluir o registro");
				}
				
		  
		  
	   }
	   
	 
	   
	   public function total_registros()
	   {
		   $this->resultado = $this->con->banco->Execute("select count(*) as total from tbl_imagem");
		   
		   return $this->resultado->FetchNextObject()->TOTAL;
		   
	   }
	   
	  public function listar_categoria()
	   {
		   $categoria_manutencao  = new categoria_manutencao();
		   $categoria_manutencao->listar_categoria();
		   
		   $this->resultado = $categoria_manutencao->resultado;
		   
		   
	    }
		
		 public function listar_fornecedor()
	   {
		   $fornecedor_manutencao  = new fornecedor_manutencao();
		   $fornecedor_manutencao->listar_fornecedor();
		   
		   $this->resultado = $fornecedor_manutencao->resultado;
		   
		   
	    }
	   
	   

  }
	
	?>