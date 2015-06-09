<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
<link href="../util/estilos.css" rel="stylesheet" type="text/css" />
</head>

<body>
<?php  if(isset($_REQUEST['cat_codigo'])){  $registro = $oquefazer->resultado->FetchNextObject();} ?>
<form id="form1" name="form_cadastro" method="post" action="index.php">
  <div align="center">
    <table width="500" height="217" border="1" class="borda_tabela">
      <tr>
        <td colspan="2"><div align="center">
          <h1 class="titulos_listas">Manutenção de Categoria</h1>
        </div></td>
      </tr>
      <tr>
        <td width="124">Nome:</td>
        <td width="360"><label for="textfield"></label>
        <input name="cat_descricao" type="text" id="textfield" size="50" value="<?php echo isset($registro) ? $registro->CAT_DESCRICAO : "" ; ?>" /></td>
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
  <input type="hidden" name="cat_codigo" value="<?php echo $registro->CAT_CODIGO; ?>" />
  <?php } ?>
  <input type="hidden" name="tabela" value="categoria" />
  <input type="hidden" name="acao" value="gravar" />
  
</form>
</body>
</html>