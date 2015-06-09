<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
<link href="../util/estilos.css" rel="stylesheet" type="text/css" />
</head>

<body>
<?php  if(isset($_REQUEST['cid_codigo'])){  $registro = $oquefazer->resultado->FetchNextObject();} ?>
<form id="form1" name="form_cadastro" method="post" action="index.php">
  <div align="center">
    <table width="500" height="217" border="1" class="borda_tabela">
      <tr>
        <td colspan="2"><div align="center">
          <h1 class="titulos_listas">Manutenção de Cidades</h1>
        </div></td>
      </tr>
      <tr>
        <td width="124">Nome:</td>
        <td width="360"><label for="textfield"></label>
        <input name="cid_descricao" type="text" id="textfield" size="50" value="<?php echo isset($registro) ? $registro->CID_DESCRICAO : "" ; ?>" /></td>
      </tr>
      <tr>
        <td>UF:</td>
        <td><label for="uf"></label>
          <select  name="cid_uf" id="estado" >
          						<?php if(isset($registro)){ ?>
							<option value="AC" <?php echo $registro->CID_UF == "AC"? "selected" : "" ?>>AC</option>
							<option value="AL" <?php echo $registro->CID_UF == "AL"? "selected" : "" ?>>AL</option>
							<option value="AP" <?php echo $registro->CID_UF == "AP"? "selected" : "" ?>>AP</option>
							<option value="AM" <?php echo $registro->CID_UF == "AM"? "selected" : "" ?>>AM</option>
							<option value="BA" <?php echo $registro->CID_UF == "BA"? "selected" : "" ?>>BA</option>
							<option value="DF" <?php echo $registro->CID_UF == "DF"? "selected" : "" ?>>DF</option>
							<option value="CE" <?php echo $registro->CID_UF == "CE"? "selected" : "" ?>>CE</option>
							<option value="ES" <?php echo $registro->CID_UF == "ES"? "selected" : "" ?>>ES</option>
							<option value="GO" <?php echo $registro->CID_UF == "GO"? "selected" : "" ?>>GO</option>
							<option value="MA" <?php echo $registro->CID_UF == "MA"? "selected" : "" ?>>MA</option>
							<option value="MT" <?php echo $registro->CID_UF == "MT"? "selected" : "" ?>>MT</option>
							<option value="MS" <?php echo $registro->CID_UF == "MS"? "selected" : "" ?>>MS</option>
							<option value="MG" <?php echo $registro->CID_UF == "MG"? "selected" : "" ?>>MG</option>
							<option value="PA" <?php echo $registro->CID_UF == "PA"? "selected" : "" ?>>PA</option>
							<option value="PB" <?php echo $registro->CID_UF == "PB"? "selected" : "" ?>>PB</option>
							<option value="PR" <?php echo $registro->CID_UF == "PR"? "selected" : "" ?>>PR</option>
							<option value="PE" <?php echo $registro->CID_UF == "PE"? "selected" : "" ?>>PE</option>
							<option value="PI" <?php echo $registro->CID_UF == "PI"? "selected" : "" ?>>PI</option>
							<option value="RJ" <?php echo $registro->CID_UF == "RJ"? "selected" : "" ?>>RJ</option>
							<option value="RS" <?php echo $registro->CID_UF == "RS"? "selected" : "" ?>>RS</option>
							<option value="RN" <?php echo $registro->CID_UF == "RN"? "selected" : "" ?>>RN</option>
							<option value="RO" <?php echo $registro->CID_UF == "RO"? "selected" : "" ?>>RO</option>
							<option value="RR" <?php echo $registro->CID_UF == "RR"? "selected" : "" ?>>RR</option>
							<option value="SC" <?php echo $registro->CID_UF == "SC"? "selected" : "" ?>>SC</option>
							<option value="SP" <?php echo $registro->CID_UF == "SP"? "selected" : "" ?>>SP</option>
							<option value="SE" <?php echo $registro->CID_UF == "SE"? "selected" : "" ?>>SE</option>
							<option value="TO" <?php echo $registro->CID_UF == "TO"? "selected" : "" ?>>TO</option>
                        <?php } else { ?>
                        <option value="AC">AC</option>
							<option value="AL">AL</option>
							<option value="AP">AP</option>
							<option value="AM">AM</option>
							<option value="BA">BA</option>
							<option value="DF">DF</option>
							<option value="CE">CE</option>
							<option value="ES">ES</option>
							<option value="GO">GO</option>
							<option value="MA">MA</option>
							<option value="MT">MT</option>
							<option value="MS">MS</option>
							<option value="MG">MG</option>
							<option value="PA">PA</option>
							<option value="PB">PB</option>
							<option value="PR">PR</option>
							<option value="PE">PE</option>
							<option value="PI">PI</option>
							<option value="RJ"  >RJ</option>
							<option value="RS">RS</option>
							<option value="RN">RN</option>
							<option value="RO">RO</option>
							<option value="RR">RR</option>
							<option value="SC">SC</option>
							<option value="SP">SP</option>
							<option value="SE">SE</option>
							<option value="TO">TO</option>
						
                        <?php }  ?>
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
  <input type="hidden" name="cid_codigo" value="<?php echo $registro->CID_CODIGO; ?>" />
  <?php } ?>
  <input type="hidden" name="tabela" value="cidade" />
  <input type="hidden" name="acao" value="gravar" />
  
</form>
</body>
</html>