<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Carrinho de Compras</title>

<style>

#grade {
	border: 2px solid #4dabd6;
	width: 1000px;
	height: auto;
	padding: 10px;
	color: #4dabd6;
}

h3 {
	color: #4dabd6;
	font-size: 24px;
	padding: 5px 0 0 5px;
	font-weight: bold;
}

p  {
	font-size: 12px;
	font-family: Verdana, Geneva, sans-serif;
}

table {
	background: transparent;
	border: 1px medium #4dabd6;
	font-family: Verdana, Geneva, sans-serif;
	font-size: 12px;
	text-align: center;
}

tr, th, td { 
	border: 0px dashed transparent;
}

#linha {
	background: #49c0f0; /* Old browsers */
	background: -moz-linear-gradient(top, #49c0f0 0%, #2cafe3 100%); /* FF3.6+ */
	background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,#49c0f0), color-stop(100%,#2cafe3)); /* Chrome,Safari4+ */
	background: -webkit-linear-gradient(top, #49c0f0 0%,#2cafe3 100%); /* Chrome10+,Safari5.1+ */
	background: -o-linear-gradient(top, #49c0f0 0%,#2cafe3 100%); /* Opera 11.10+ */
	background: -ms-linear-gradient(top, #49c0f0 0%,#2cafe3 100%); /* IE10+ */
	background: linear-gradient(to bottom, #49c0f0 0%,#2cafe3 100%); /* W3C */
	filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#49c0f0', endColorstr='#2cafe3',GradientType=0 ); /* IE6-9 */
	border: 1px solid #fff;
	width: auto;
	height: 30px;
	color: #fff;
	padding-left: 20px;
	padding-top: 10px;
}

h4 {
	font-size: 13px;
	font-weight: 300;
}

.botoes {
	background: transparent;
	border: 1px solid #3366cc;
	/*overflow: auto;*/
	padding: 6px;
	width: auto;
	height: auto;
}

.esquerda {
	float: left;
	text-align: left;
	padding-left: 3px;
	text-decoration: none;
	cursor: pointer;
}

.centro {
	text-align: center;
	margin-left: 200px;
	margin-right: auto;
	display: inline-block;
	padding-left: 3px;
	text-decoration: none;
	cursor: pointer;
}

.direita {
	float: right;
	text-align: right;
	margin-left: auto;
	margin-right: auto;
	padding-left: 3px;
	text-decoration: none;
	cursor: pointer;
}

#calcularCep {
	float:left;
	width: 500px;
}

#total {
	float: right;
	width: 500px;
	text-align: right;
}

#caixa {
	height: 200px;;
	width: 1000px;;
}

/*.atualizar a {
	background: url(images/atualizar.png) top left no-repeat;
}

.atualizar a:hover {
	background: url(images/atualizar-hover.png) top left no-repeat;
}*/

</style>

<?php 
	$total = 5 * 45;
?>

<script>
	function formatar(mascara, documento)
	{
		var i = documento.value.length;
		var saida = mascara.substring(0,1);
		var texto = mascara.substring(i)
	  
		  if(texto.substring(0,1) != saida)
		  {
		  	 documento.value += texto.substring(0,1);
	  	  }
	}
</script>

</head>

	<body>

		<div id="grade">
        		<h3>Meu Carrinho de Compras <!--($pesoDosProdutos)--></h3>
                <table style="border: 1px solid #4dabd6" width="1000" border="1" cellspacing="5" cellpadding="5">
                      <tr>
                        <th width="25" scope="col">Remover</th>
                        <th width="200" scope="col">Imagem</th>
                        <th width="200" scope="col">Nome</th>
                        <th scope="col">Modelo</th>
                        <th width="50" scope="col">Quantidade</th>
                        <th scope="col">Valor Unit&aacute;rio</th>
                        <th scope="col">Total</th>
                      </tr>
                      <tr>
                        <td><input type="checkbox" name="remover" value"removeProduto" /></td>
                        <td><img src="" width="" height=""/></td>
                        <td>Produto 1</td>
                        <td>x35</td>
                        <td><input type="text" name="qtdProduto" value="5" /></td>
                        <td>R$ 45,00</td>
                        <td><?php echo "$total"; ?></td>
                      </tr>
                </table>
                
                <br />
                
                
                    <div id="linha">
                        Frete e Taxas Estimados
                    </div>
                    
                    <div id="caixa">
                    
                    <div id="calcularCep">
                    
                        <p>Coloque o Destino para Simular o Frete:</p>
                        
                        <p>*País  <select size="1" name="pais">
                                  <option selected value="Selecione">Escolha o Páis</option>
                                  <option value="Brasil">Brasil</option>
                                  </select>
                        </p>
                                      
                        <p>*Estado  <select name="id_estados" id="id_estados">
                                        <option selected value="escolha">Escolha o Estado</option>
                                        <option value="AC">Acre</option>
                                        <option value="AL">Alagoas</option>
                                        <option value="AP">Amapá</option>
                                        <option value="AM">Amazonas</option>
                                        <option value="BA">Bahia</option>
                                        <option value="CE">Ceará</option>
                                        <option value="DF">Distrito Federal</option>
                                        <option value="ES">Espirito Santo</option>
                                        <option value="GO">Goiás</option>
                                        <option value="MA">Maranhão</option>
                                        <option value="MT">Mato Grosso</option>
                                        <option value="MS">Mato Grosso do Sul</option>
                                        <option value="MG">Minas Gerais</option>
                                        <option value="PA">Pará</option>
                                        <option value="PB">Paraiba</option>
                                        <option value="PR">Paraná</option>
                                        <option value="PE">Pernambuco</option>
                                        <option value="PI">Piauí</option>
                                        <option value="RJ">Rio de Janeiro</option>
                                        <option value="RN">Rio Grande do Norte</option>
                                        <option value="RS">Rio Grande do Sul</option>
                                        <option value="RO">Rondônia</option>
                                        <option value="RR">Roraima</option>
                                        <option value="SC">Santa Catarina</option>
                                        <option value="SP">São Paulo</option>
                                        <option value="SE">Sergipe</option>
                                        <option value="TO">Tocantis</option>
                                    </select>       
                        </p>
                        
                        <p>*CEP: <input type="text" name="cep" maxlength="9" OnKeyPress="formatar('#####-###', this)"></p>
                        
                        <p>
                        	<a href="#">
                        		<img src="images/cep.png" width="141" height="35" />    
                            </a>R$ 22,00
                        </p>
                    
                    </div>
                    
                    <div id="total">
                    <p>Sub-Total: R$225,00</p>
                    <p>Frete: R$ 22,00</p>
                    <p>Total: R$ 247,00</p>
                    </div>
                
                    </div>
                       
          <div id="botoes">
				<div class="esquerda">
                    <a href="#">
                        <img src="images/atualizar.png" width="131" height="42" />
                    </a>
                </div>
                <div class="centro">
                    <a href="#">
                    <img src="images/comprando.png" width="245" height="41" />
                    </a>
             </div>
                <div class="direita">
                    <a href="#">
                        <img src="images/comprar.png" width="192" height="44" />
                    </a>
                </div>
          </div> 
		
        </div>

	</body>

</html>