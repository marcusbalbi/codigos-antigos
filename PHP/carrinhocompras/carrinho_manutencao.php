  <?php
  
  require_once("util/conecta.php");
  class carrinho_manutencao
  {
	  
	  public $resultado;
	  public $registros;
	  private $con;
	  public function __construct()
	  {
  			$this->con = new conexao();
		  
	   }
	   
	   
	  public function listar_categoria($ordem = null,$like  = null)
	  {
		    $sql = "select * from tbl_categoria";
			
			if(!is_null($like))
			$sql.= " where CAT_DESCRICAO like '%{$like}%'";
			
			
			if(!is_null($ordem))
			$sql.= " order by {$ordem}";
		  
  			$this->resultado = $this->con->banco->Execute($sql);
		  
	   }
	   
	    public function listar_produtos_categoria($cod_Categoria)
	  {
		    $sql = "select * from tbl_produto where cat_codigo = {$cod_Categoria}";
			
  			$this->resultado = $this->con->banco->Execute($sql);
		  
	   }
	     public function listar_imagens($cod_produto)
	  {
		    $sql = "select * from tbl_imagem where COD_PRIDUTO = {$cod_produto} order by IMG_DESCRICAO";
			
  			$this->resultado = $this->con->banco->Execute($sql);
			
			 return $this->resultado->FetchNextObject();
		  
	   }
	   

  }
	
	?>