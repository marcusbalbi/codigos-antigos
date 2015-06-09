
<link href="../util/estilos.css" rel="stylesheet" type="text/css" />

<form action="index.php" method="post" enctype="multipart/form-data" name="form_cadastro" id="form1">
  <div align="center">
    <table width="557" height="217" border="1" class="borda_tabela">
      <tr>
        <td colspan="2"><div align="center">
          <h1 class="titulos_listas">Manutenção de Imagens</h1>
        </div></td>
      </tr>
      <tr>
        <td width="149">Selecione uma imagem:</td>
        <td width="375"><label for="img_descricao"></label>
        <input name="img_descricao" type="file" id="img_descricao" size="50" /></td>
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
  <input type="hidden" name="prod_codigo" value="<?php echo $_GET['prod_codigo']; ?>" />
  <input type="hidden" name="tabela" value="imagem" />
  <input type="hidden" name="acao" value="gravar" />
  
</form>