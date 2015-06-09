  <?php
  
  require_once("../util/conecta.php");
  class cidade_manutencao
  {
	  
	  public $resultado;
	  public $registros;
	  private $con;
	  public function __construct()
	  {
  			$this->con = new conexao();
		  
	   }
	   
	   
	  public function listar_cidade($ordem = null,$like  = null)
	  {
		    $sql = "select * from tbl_cidade";
			
			if(!is_null($like))
			$sql.= " where CID_DESCRICAO like '%{$like}%'";
			
			
			if(!is_null($ordem))
			$sql.= " order by {$ordem}";
		  
  			$this->resultado = $this->con->banco->Execute($sql);
		  
	   }
	   
	  public function excluir($CID_CODIGO)
	  {
				if($this->con->banco->Execute("delete from tbl_cidade where CID_CODIGO = ".$CID_CODIGO))
				{
					alerta("Registro excluido com sucesso");
				}
				else
				{
					alerta("Não foi possivel excluir o registro");
				}
		  
	   }
	   
	    public function gravar($CID_DESCRICAO,$CID_UF,$CID_CODIGO = null)
	  {
		  if(is_null($CID_CODIGO))
		  {	  
  				if($this->con->banco->Execute("insert into tbl_cidade(CID_DESCRICAO,CID_UF) value('{$CID_DESCRICAO}','{$CID_UF}')"))
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
			  if($this->con->banco->Execute("update tbl_cidade set CID_DESCRICAO = '{$CID_DESCRICAO}',CID_UF = '{$CID_UF}' where CID_CODIGO = {$CID_CODIGO} "))
			  {
					alerta("Registro alterado com sucesso");
				}
				else
				{
					alerta("Não foi possivel alterar o registro");
				}
		  }
		  
	   }
	   
	   public function alterar($CID_CODIGO)
	   {
		   $this->resultado = $this->con->banco->Execute("select * from tbl_cidade where CID_CODIGO={$CID_CODIGO}");
		   
	   }
	   
	   public function total_registros()
	   {
		   $this->resultado = $this->con->banco->Execute("select count(*) as total from tbl_cidade");
		   
		   return $this->resultado->FetchNextObject()->TOTAL;
		   
	   }
	   
	   

  }
	
	?>