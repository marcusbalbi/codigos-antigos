<?php 
require_once("produto_manutencao.php");
$produto_manutencao = new produto_manutencao();
 if(isset($_REQUEST['prod_codigo'])){  $registro = $oquefazer->resultado->FetchNextObject();} ?>
<link href="../util/estilos.css" rel="stylesheet" type="text/css" />

<form id="form1" name="form_cadastro" method="post" action="index.php">
  <div align="center">
    <table width="500" height="217" border="1" class="borda_tabela">
      <tr>
        <td colspan="2"><div align="center">
          <h1 class="titulos_listas">Manutenção de Produtos</h1>
        </div></td>
      </tr>
      <tr>
        <td width="124">Descrição</td>
        <td width="360"><label for="prod_valor"></label>
        <input name="prod_descricao" type="text" id="textfield" size="50" value="<?php echo isset($registro) ? $registro->PROD_DESCRICAO : "" ; ?>" /></td>
      </tr>
      <tr>
        <td>Valor</td>
        <td><input name="prod_valor" type="text" id="textfield2" size="50" value="<?php echo isset($registro) ? $registro->PROD_VALOR : "" ; ?>" /></td>
      </tr>
      <tr>
        <td>Quantidade</td>
        <td><input name="prod_quantidade" type="text" id="textfield3" size="50" value="<?php echo isset($registro) ? $registro->PROD_QUANTIDADE : "" ; ?>" /></td>
      </tr>
      <tr>
        <td>Categoria</td>
        <td><select  name="cat_codigo" id="cat_codigo" >
          <option value="">SELECIONAR</option>
          <?php 
								$produto_manutencao->listar_categoria();
								
								if(!isset($registro))
								{
									while($produto_manutencao->registros = $produto_manutencao->resultado->FetchNextObject())
									{
										echo "<option value='{$produto_manutencao->registros->CAT_CODIGO}'>{$produto_manutencao->registros->CAT_DESCRICAO}</option>\n"; 
									}
								}
								else
								{
									while($produto_manutencao->registros = $produto_manutencao->resultado->FetchNextObject())
									{
										 $selecionado = $produto_manutencao->registros->CAT_CODIGO == $registro->CAT_CODIGO? "selected" : "";
										echo "<option value='{$produto_manutencao->registros->CAT_CODIGO} ' ".$selecionado.">{$produto_manutencao->registros->CAT_DESCRICAO}</option>\n"; 
									}
									
								}
								
									
							 ?>
        </select></td>
      </tr>
      <tr>
        <td>Fornecedor</td>
        <td><select  name="for_codigo" id="for_codigo" >
          <option value="">SELECIONAR</option>
          <?php 
								$produto_manutencao->listar_fornecedor();
								
								if(!isset($registro))
								{
									while($produto_manutencao->registros = $produto_manutencao->resultado->FetchNextObject())
									{
										echo "<option value='{$produto_manutencao->registros->FOR_CODIGO}'>{$produto_manutencao->registros->FOR_RAZAOSOCIAL}</option>\n"; 
									}
								}
								else
								{
									while($produto_manutencao->registros = $produto_manutencao->resultado->FetchNextObject())
									{
										 $selecionado = $produto_manutencao->registros->FOR_CODIGO == $registro->FOR_CODIGO? "selected" : "";
										echo "<option value='{$produto_manutencao->registros->FOR_CODIGO} ' ".$selecionado.">{$produto_manutencao->registros->FOR_RAZAOSOCIAL}</option>\n"; 
									}
									
								}
								
									
							 ?>
        </select></td>
      </tr>
      <tr>
        <td>Tipo</td>
        <td><select  name="prod_tipo" id="prod_tipo" >
          <option value="">SELECIONAR</option>
          
          	<?php if(isset($registro)){ ?>
          <option value="Unid" <?php echo $registro->PROD_TIPO == "Unid"? "selected" : "" ?>>Unid</option>
          <option value="Kg" <?php echo $registro->PROD_TIPO == "Kg"? "selected" : "" ?>>Kg</option>
          <option value="Lt" <?php echo $registro->PROD_TIPO == "Lt"? "selected" : "" ?>>Lt</option>
          <option value="gr" <?php echo $registro->PROD_TIPO == "gr"? "selected" : "" ?>>gr</option>
          <option value="caixa" <?php echo $registro->PROD_TIPO == "caixa"? "selected" : "" ?>>caixa</option>
          <?php  }else {?>
          
			   <option value="Unid" >Unid</option>
              <option value="Kg" >Kg</option>
              <option value="Lt" >Lt</option>
              <option value="gr" >gr</option>
              <option value="caixa" >caixa</option>
			  <?php }?>
         
        </select></td>
      </tr>
      <tr>
        <td>Observação:</td>
        <td><textarea name="prod_obs" cols="50" rows="5" id="textfield7"><?php echo isset($registro) ? $registro->PROD_OBS : "" ; ?></textarea></td>
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
  <input type="hidden" name="prod_codigo" value="<?php echo $registro->PROD_CODIGO; ?>" />
  <?php } ?>
  <input type="hidden" name="tabela" value="produto" />
  <input type="hidden" name="acao" value="gravar" />
  
</form>