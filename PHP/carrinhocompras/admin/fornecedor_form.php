<?php 
require_once("fornecedor_manutencao.php");
$fornecedor_manutencao = new fornecedor_manutencao();
 if(isset($_REQUEST['for_codigo'])){  $registro = $oquefazer->resultado->FetchNextObject();} ?>
<link href="../util/estilos.css" rel="stylesheet" type="text/css" />

<form id="form1" name="form_cadastro" method="post" action="index.php">
  <div align="center">
    <table width="500" height="217" border="1" class="borda_tabela">
      <tr>
        <td colspan="2"><div align="center">
          <h1 class="titulos_listas">Manutenção de Fornecedor</h1>
        </div></td>
      </tr>
      <tr>
        <td width="124">Razão Social</td>
        <td width="360"><label for="for_nome_fantasia"></label>
        <input name="for_razaosocial" type="text" id="textfield" size="50" value="<?php echo isset($registro) ? $registro->FOR_RAZAOSOCIAL : "" ; ?>" /></td>
      </tr>
      <tr>
        <td>Nome Fantasia</td>
        <td><input name="for_nome_fantasia" type="text" id="textfield2" size="50" value="<?php echo isset($registro) ? $registro->FOR_NOME_FANTASIA : "" ; ?>" /></td>
      </tr>
      <tr>
        <td>Endereço</td>
        <td><input name="for_endereco" type="text" id="textfield3" size="50" value="<?php echo isset($registro) ? $registro->FOR_ENDERECO : "" ; ?>" /></td>
      </tr>
      <tr>
        <td>Bairro</td>
        <td><input name="for_bairro" type="text" id="textfield4" size="50" value="<?php echo isset($registro) ? $registro->FOR_BAIRRO : "" ; ?>" /></td>
      </tr>
      <tr>
        <td>Fone</td>
        <td><input name="for_fone" type="text" id="textfield5" size="50" value="<?php echo isset($registro) ? $registro->FOR_FONE : "" ; ?>" /></td>
      </tr>
      <tr>
        <td>Resonsavel</td>
        <td><input name="for_responsavel" type="text" id="textfield6" size="50" value="<?php echo isset($registro) ? $registro->FOR_RESPONSAVEL : "" ; ?>" /></td>
      </tr>
      <tr>
        <td>E-mail</td>
        <td><input name="for_email" type="text" id="textfield7" size="50" value="<?php echo isset($registro) ? $registro->FOR_EMAIL : "" ; ?>" /></td>
      </tr>
      <tr>
        <td>CNPJ</td>
        <td><input name="for_cnpj" type="text" id="textfield8" size="50" value="<?php echo isset($registro) ? $registro->FOR_CNPJ : "" ; ?>" /></td>
      </tr>
      <tr>
        <td>Cep</td>
        <td><input name="for_cep" type="text" id="textfield9" size="50" value="<?php echo isset($registro) ? $registro->FOR_CEP : "" ; ?>" /></td>
      </tr>
      <tr>
        <td>Cidade</td>
        <td><label for="cid_codigo"></label>
          <select  name="cid_codigo" id="cid_codigo" >
							<option value="">SELECIONAR</option>
							<?php 
								$fornecedor_manutencao->listar_cidade();
								
								if(!isset($registro))
								{
									while($fornecedor_manutencao->registros = $fornecedor_manutencao->resultado->FetchNextObject())
									{
										echo "<option value='{$fornecedor_manutencao->registros->CID_CODIGO}'>{$fornecedor_manutencao->registros->CID_DESCRICAO}</option>\n"; 
									}
								}
								else
								{
									while($fornecedor_manutencao->registros = $fornecedor_manutencao->resultado->FetchNextObject())
									{
										 $selecionado = $fornecedor_manutencao->registros->CID_CODIGO == $registro->CID_CODIGO? "selected" : "";
										echo "<option value='{$fornecedor_manutencao->registros->CID_CODIGO} ' ".$selecionado.">{$fornecedor_manutencao->registros->CID_DESCRICAO}</option>\n"; 
									}
									
								}
								
									
							 ?>
                        </select></td>
      </tr>
      <tr>
        <td colspan="2" align="center" class="titulos_listas"><input type="submit" name="Salvar" id="Salvar" value="Salvar" />
        <input type="reset" name="limpar" id="limpar" value="Limpar" />
        <input type="button" name="cancelar" id="cancelar" value="cancelar" /></td>
      </tr>
      <tr>
        <td colspan="2" class="titulos_listas">Rodapé</td>
      </tr>
    </table>
  </div>
  <?php if(isset($registro)){ ?>
  <input type="hidden" name="for_codigo" value="<?php echo $registro->FOR_CODIGO; ?>" />
  <?php } ?>
  <input type="hidden" name="tabela" value="fornecedor" />
  <input type="hidden" name="acao" value="gravar" />
  
</form>