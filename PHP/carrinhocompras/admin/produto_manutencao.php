  <?php
  
  require_once("../util/conecta.php");
  require_once("categoria_manutencao.php");
  require_once("fornecedor_manutencao.php");
  
  class produto_manutencao
  {
	  
	  public $resultado;
	  public $registros;
	  private $con;
	  public function __construct()
	  {
  			$this->con = new conexao();
		  
	   }
	   
	   
	  public function listar_produto($ordem = null,$like  = null)
	  {
		    $sql = "select * from tbl_produto";
			
			if(!is_null($like))
			$sql.= " where PROD_DESCRICAO like '%{$like}%'";
			
			
			if(!is_null($ordem))
			$sql.= " order by {$ordem}";
		  
  			$this->resultado = $this->con->banco->Execute($sql);
		  
	   }
	   
	  public function excluir($PROD_CODIGO)
	  {
				if($this->con->banco->Execute("delete from tbl_produto where PROD_CODIGO = ".$PROD_CODIGO))
				{
					alerta("Registro excluido com sucesso");
				}
				else
				{
					alerta("Não foi possivel excluir o registro");
				}
		  
	   }
	   
	    public function gravar($FOR_CODIGO,$CAT_CODIGO,$PROD_DESCRICAO,$PROD_VALOR,$PROD_QUANTIDADE,$PROD_TIPO,$PROD_OBS,$PROD_CODIGO = null)
	  {
		  
		  if(is_null($PROD_CODIGO))
		  {	  
  				if($this->con->banco->Execute("insert into tbl_produto(FOR_CODIGO,CAT_CODIGO,PROD_DESCRICAO,PROD_VALOR,PROD_QUANTIDADE,PROD_TIPO,PROD_OBS) value({$FOR_CODIGO},{$CAT_CODIGO},'{$PROD_DESCRICAO}',{$PROD_VALOR},{$PROD_QUANTIDADE},'{$PROD_TIPO}','{$PROD_OBS}')"))
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
			 
			  
			  if($this->con->banco->Execute("update tbl_produto set FOR_CODIGO = {$FOR_CODIGO},CAT_CODIGO = {$CAT_CODIGO}, PROD_DESCRICAO='{$PROD_DESCRICAO}', PROD_VALOR={$PROD_VALOR},PROD_QUANTIDADE = {$PROD_QUANTIDADE}, PROD_TIPO='{$PROD_TIPO}', PROD_OBS='{$PROD_OBS}' where PROD_CODIGO = {$PROD_CODIGO} "))
			  {
					alerta("Registro alterado com sucesso");
				}
				else
				{
					alerta("Não foi possivel alterar o registro");
				}
		  }
		  
	   }
	   
	   public function alterar($PROD_CODIGO)
	   {
		   $this->resultado = $this->con->banco->Execute("select * from tbl_produto where PROD_CODIGO={$PROD_CODIGO}");
		   
	   }
	   
	   public function total_registros()
	   {
		   $this->resultado = $this->con->banco->Execute("select count(*) as total from tbl_produto");
		   
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