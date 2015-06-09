  <?php
  
  require_once("../util/conecta.php");
  class usuario_manutencao
  {
	  
	  public $resultado;
	  public $registros;
	  private $con;
	  public function __construct()
	  {
  			$this->con = new conexao();
		  
	   }
	   
	   
	  public function listar_usuario($ordem = null,$like  = null)
	  {
		    $sql = "select * from tbl_usuario";
			
			if(!is_null($like))
			$sql.= " where USU_NOME like '%{$like}%'";
			
			
			if(!is_null($ordem))
			$sql.= " order by {$ordem}";
		  
  			$this->resultado = $this->con->banco->Execute($sql);
		  
	   }
	   
	  public function excluir($USU_CODIGO)
	  {
				if($this->con->banco->Execute("delete from tbl_usuario where USU_CODIGO = ".$USU_CODIGO))
				{
					alerta("Registro excluido com sucesso");
				}
				else
				{
					alerta("Não foi possivel excluir o registro");
				}
		  
	   }
	   
	    public function gravar($USU_NOME,$USU_LOGIN,$USU_SENHA,$USU_NIVEL,$USU_CODIGO = null)
	  {
		  
			  $USU_SENHA = md5($USU_SENHA);
		  
		  
		  if(is_null($USU_CODIGO))
		  {	  
  				if($this->con->banco->Execute("insert into tbl_usuario(USU_NOME,USU_LOGIN,USU_SENHA,USU_NIVEL) value('{$USU_NOME}','{$USU_LOGIN}','{$USU_SENHA}','{$USU_NIVEL}')"))
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
			  //echo $USU_LOGIN;exit;
			  
			  if($this->con->banco->Execute("update tbl_usuario set USU_NOME = '{$USU_NOME}',USU_LOGIN = '{$USU_LOGIN}', USU_SENHA='{$USU_SENHA}', USU_NIVEL='{$USU_NIVEL}' where USU_CODIGO = {$USU_CODIGO} "))
			  {
					alerta("Registro alterado com sucesso");
				}
				else
				{
					alerta("Não foi possivel alterar o registro");
				}
		  }
		  
	   }
	   
	   public function alterar($USU_CODIGO)
	   {
		   $this->resultado = $this->con->banco->Execute("select * from tbl_usuario where USU_CODIGO={$USU_CODIGO}");
		   
	   }
	   
	   public function total_registros()
	   {
		   $this->resultado = $this->con->banco->Execute("select count(*) as total from tbl_usuario");
		   
		   return $this->resultado->FetchNextObject()->TOTAL;
		   
	   }
	   
	   

  }
	
	?>