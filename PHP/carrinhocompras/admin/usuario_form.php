<?php  if(isset($_REQUEST['usu_codigo'])){  $registro = $oquefazer->resultado->FetchNextObject();} ?>
<form id="form1" name="form_cadastro" method="post" action="index.php">
  <div align="center">
    <table width="500" height="217" border="1" class="borda_tabela">
      <tr>
        <td colspan="2"><div align="center">
          <h1 class="titulos_listas">Manutenção de Usuario</h1>
        </div></td>
      </tr>
      <tr>
        <td width="124">Nome:</td>
        <td width="360"><label for="usu_login"></label>
        <input name="usu_nome" type="text" id="textfield" size="50" value="<?php echo isset($registro) ? $registro->USU_NOME : "" ; ?>" /></td>
      </tr>
      <tr>
        <td>Login</td>
        <td><input name="usu_login" type="text" id="textfield2" size="50" value="<?php echo isset($registro) ? $registro->USU_LOGIN : "" ; ?>" /></td>
      </tr>
      <tr>
        <td>Senha</td>
        <td><input name="usu_senha" type="password" id="textfield3" size="50" value="<?php echo isset($registro) ? $registro->USU_SENHA : "" ; ?>" /></td>
      </tr>
      <tr>
        <td>Nivel</td>
        <td><label for="usu_nivel"></label>
          <select  name="usu_nivel" id="usu_nivel" >
          						<?php if(isset($registro)){ ?>
							<option value="A" <?php echo $registro->USU_NIVEL == "A"? "selected" : "" ?>>Administrador</option>
							<option value="L" <?php echo $registro->USU_NIVEL == "L"? "selected" : "" ?>>Usuario</option>
                        <?php } else { ?>
                        <option value="A" selected="selected">Administrador</option>
							<option value="L">Usuario</option>
						
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
  <input type="hidden" name="usu_codigo" value="<?php echo $registro->USU_CODIGO; ?>" />
  <?php } ?>
  <input type="hidden" name="tabela" value="usuario" />
  <input type="hidden" name="acao" value="gravar" />
  
</form>