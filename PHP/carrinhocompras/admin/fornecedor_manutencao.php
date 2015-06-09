  <?php
  
  require_once("../util/conecta.php");
  require_once("cidade_manutencao.php");
  class fornecedor_manutencao
  {
	  
	  public $resultado;
	  public $registros;
	  private $con;
	  public function __construct()
	  {
  			$this->con = new conexao();
		  
	   }
	   
	   
	  public function listar_fornecedor($ordem = null,$like  = null)
	  {
		    $sql = "select * from tbl_fornecedor";
			
			if(!is_null($like))
			$sql.= " where FOR_RAZAOSOCIAL like '%{$like}%'";
			
			
			if(!is_null($ordem))
			$sql.= " order by {$ordem}";
		  
  			$this->resultado = $this->con->banco->Execute($sql);
		  
	   }
	   
	  public function excluir($FOR_CODIGO)
	  {
				if($this->con->banco->Execute("delete from tbl_fornecedor where FOR_CODIGO = ".$FOR_CODIGO))
				{
					alerta("Registro excluido com sucesso");
				}
				else
				{
					alerta("Não foi possivel excluir o registro");
				}
		  
	   }
	   
	    public function gravar($CID_CODIGO,$FOR_RAZAOSOCIAL,$FOR_NOME_FANTASIA,$FOR_ENDERECO,$FOR_BAIRRO,$FOR_FONE,$FOR_RESPONSAVEL,$FOR_EMAIL,$FOR_CNPJ,$FOR_CEP,$FOR_CODIGO = null)
	  {
		  
		  if(is_null($FOR_CODIGO))
		  {	  
  				if($this->con->banco->Execute("insert into tbl_fornecedor(CID_CODIGO,FOR_RAZAOSOCIAL,FOR_NOME_FANTASIA,FOR_ENDERECO,FOR_BAIRRO,FOR_FONE,FOR_RESPONSAVEL,FOR_EMAIL,FOR_CNPJ,FOR_CEP) value({$CID_CODIGO},'{$FOR_RAZAOSOCIAL}','{$FOR_NOME_FANTASIA}','{$FOR_ENDERECO}','{$FOR_BAIRRO}','{$FOR_FONE}','{$FOR_RESPONSAVEL}','{$FOR_EMAIL}','{$FOR_CNPJ}','{$FOR_CEP}')"))
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
			  
			  if($this->con->banco->Execute("update tbl_fornecedor set CID_CODIGO = {$CID_CODIGO},FOR_RAZAOSOCIAL = '{$FOR_RAZAOSOCIAL}', FOR_NOME_FANTASIA='{$FOR_NOME_FANTASIA}', FOR_ENDERECO='{$FOR_ENDERECO}',FOR_BAIRRO = '{$FOR_BAIRRO}', FOR_FONE='{$FOR_FONE}', FOR_RESPONSAVEL='{$FOR_RESPONSAVEL}', FOR_FONE='{$FOR_FONE}', FOR_EMAIL='{$FOR_EMAIL}', FOR_CNPJ='{$FOR_CNPJ}', FOR_CEP='{$FOR_CEP}' where FOR_CODIGO = {$FOR_CODIGO} "))
			  {
					alerta("Registro alterado com sucesso");
				}
				else
				{
					alerta("Não foi possivel alterar o registro");
				}
		  }
		  
	   }
	   
	   public function alterar($FOR_CODIGO)
	   {
		   $this->resultado = $this->con->banco->Execute("select * from tbl_fornecedor where FOR_CODIGO={$FOR_CODIGO}");
		   
	   }
	   
	   public function total_registros()
	   {
		   $this->resultado = $this->con->banco->Execute("select count(*) as total from tbl_fornecedor");
		   
		   return $this->resultado->FetchNextObject()->TOTAL;
		   
	   }
	   
	   public function listar_cidade()
	   {
		   $cidade_manutencao  = new cidade_manutencao();
		   $cidade_manutencao->listar_cidade();
		   
		   $this->resultado = $cidade_manutencao->resultado;
		   
		   
	    }
	   
	   

  }
	
	?>