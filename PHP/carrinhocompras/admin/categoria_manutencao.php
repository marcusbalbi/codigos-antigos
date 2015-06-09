  <?php
  
  require_once("../util/conecta.php");
  class categoria_manutencao
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
	   
	  public function excluir($CAT_CODIGO)
	  {
				if($this->con->banco->Execute("delete from tbl_categoria where CAT_CODIGO = ".$CAT_CODIGO))
				{
					alerta("Registro excluido com sucesso");
				}
				else
				{
					alerta("Não foi possivel excluir o registro");
				}
		  
	   }
	   
	    public function gravar($CAT_DESCRICAO,$CAT_CODIGO = null)
	  {
		  if(is_null($CAT_CODIGO))
		  {	  
  				if($this->con->banco->Execute("insert into tbl_categoria(CAT_DESCRICAO) value('{$CAT_DESCRICAO}')"))
				{
					alerta("Registro incluido com sucesso");
				}
				else
				{
					alerta("Não foi possivel incluir o registro");
				}
				
		  }
		  else
		  {
			  if($this->con->banco->Execute("update tbl_categoria set CAT_DESCRICAO = '{$CAT_DESCRICAO}' where CAT_CODIGO = {$CAT_CODIGO} "))
			  {
					alerta("Registro alterado com sucesso");
				}
				else
				{
					alerta("Não foi possivel alterar o registro");
				}
		  }
		  
	   }
	   
	   public function alterar($CAT_CODIGO)
	   {
		   $this->resultado = $this->con->banco->Execute("select * from tbl_categoria where CAT_CODIGO={$CAT_CODIGO}");
		   
	   }
	   
	   public function total_registros()
	   {
		   $this->resultado = $this->con->banco->Execute("select count(*) as total from tbl_categoria");
		   
		   return $this->resultado->FetchNextObject()->TOTAL;
		   
	   }
	   
	   

  }
	
	?>