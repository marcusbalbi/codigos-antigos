<?php
/**
 * Classe com diversos metodos utilizados pelo programador/Analista de sistemas Marcus V. Balbi
 * Criada em 07/10/2011 com o intuito de ajuda-lo em seus projetos com o framework Zend
 * 100% dos metodos aqui são estaticos ou seja , não é necessario criar um objeto para utiliza-los, pelo simples
 * motivo de serem corriqueiros.
 * para qualquer um desses metodos funcionarem no Zend é necessario colocar  no arquivo de bootstrap mais precisamente no
 * set_include_path() o caminho para esta classe pois só assim é possivel carrega-la dentro do Zend
 * Classe alterada no dia 18/11/2011 foram adicionados novos metodos para trabalhar com conversões mascaras etc.
 * @author Marcus V. Balbi
 * @version 1.1
 * 
 */
class ZendUtils {

    protected $filtro;

        /*CONSTANTES*/
    const MENSAGEM_ACERTO = "mensagem_acerto";
    const MENSAGEM_ERRO = "mensagem_erro";



    /**
     * @return mixed|null
     * Retornar um objeto contendo o usuario logado no sistema, caso nao tenha nenhum retorna NULL
     * */
     public static  function pegarUsuarioLogado()
    {
          $usuario = Zend_Auth::getInstance();

          return $usuario->getIdentity();
    }
    
            /**
         * @return String
         * Retornar a mesma String porem sem caracteres especiais
         * sem espaços antes e depois da string e sem tags HTML, Evitando possivel brecha de segurança**/
        public static  function limparString($value)
        {
            $filtro = new Zend_Filter();
            
            $filtro->addFilter(new Zend_Filter_Alnum(true))
                         ->addFilter(new Zend_Filter_StripTags())
                         ->addFilter(new Zend_Filter_StringTrim());

            return $filtro->filter($value);
        }


    /**
             * @return Boolean
             * Retorna True se conseguir limpar a Session e False caso nao consiga
             * Para funcionar a sessão deverá estar incluida dentro do Zend_Registry com o nome de 'session' após a exclusão a session é
             * gravada no zend_registry novamente
             * @param   String|Array     $nomeItemSession        Nome do Item da Session a ser excluido,Caso Seja um Array deletara os nomes das sessions
             * de acordo com os nomes dados pelo array, a chaves do Array deverão ser numeradas **/
           public static  function limparItemSession($nomeItemSession)
            {
                if(is_null($nomeItemSession) || trim($nomeItemSession) == "")
                    return false;

                 $session = Zend_Registry::get("session");
                if(!is_array($nomeItemSession))
                {
                    if(isset($session->$nomeItemSession))
                    {
                        unset($session->$nomeItemSession);
                        Zend_Registry::set("session",$session);
                        return true;
                    }
                    else
                        return false;
                }
                else
                {
                    foreach($nomeItemSession as $itemSession)
                    {
                        if(isset($session->$itemSession))
                        {
                            unset($session->$itemSession);

                        }

                    }
                      Zend_Registry::set("session",$session);
                      return true;
                }
            }


            /**
             * @return Boolean
             * Retorna True caso exclua o arquivo e false caso nao consiga
             * @param  String   $path   O Caminho do arquivo  **/
             public static  function apagarArquivo($path)
            {
                    return  @unlink($path);

            }

            /**
             * @return String
             * Retorna uma String contendo a extensão do arquivo
             * @param String $nomeArquivo  O nome do Arquivo**/
         public   function Pegaextensao($nomeArquivo)
          {
        $nomeArquivo = strtolower($nomeArquivo) ;

        $exts = explode(".", $nomeArquivo) ;

        return end($exts);
    }
                /**
                 * @return Array
                 * @param $tamanhoMaximo | Devera ser passado em KB
                 *
                 *
                 * **/
    public   function uploadArquivo($uploadDir = null, $renomearArquivo = true, $extensoesPermitidas = array(), $tamanhoMaximo = 0)
                {
                    if(!file_exists($uploadDir))
                    {
                        mkdir($uploadDir,0777,true);
                    }

                    $adaptador = new Zend_File_Transfer_Adapter_Http();
                    $adaptador->setDestination($uploadDir);

                    $arquivos = $adaptador->getFileInfo();

                    //PEGA O NOMES DOS CAMPOS
                    $campos = array_keys($arquivos);

                    //Variavel contendo os TIpos
                    $i = 0;


                    $arquivosEnviados = array();

                    foreach($arquivos as $arquivo)
                    {
                        $ext = $this->Pegaextensao($arquivo['name']);
                        if($arquivo['name'] != "")
                        {

                            if(count($extensoesPermitidas) > 0)
                            {
                                //VERIFICA SE A EXTENSAO DO ARQUIVO É VALIDA
                                if(!array_keys($extensoesPermitidas, $ext))
                                {
                                    $arquivosEnviados['mensagem'][] = "ERRO: O arquivo ".$arquivo['name']." não pode ser enviado pois não é um arquivo Válido<br>";
                                    continue;

                                }

                                if($tamanhoMaximo != 0)
                                {
                                    $tamanhoArquivo = (int)($arquivo['size'] / 1024);

                                    if( $tamanhoArquivo > $tamanhoMaximo)
                                    {
                                        $arquivosEnviados['mensagem'][] = "ERRO: O arquivo ".$arquivo['name']." não pode ser enviado pois seu Tamanho é muito grande<br>";
                                        continue;
                                    }

                                }




                                //RENOMEA O ARQUIVO
                                //CASO O ARQUIVO TENHA SIDO CARREGADO , INSERE O NOME DO ARQUIVO NO ARRAY
                                //ELE TENDO  SIDO SOBRESCRITO
                                if($renomearArquivo)
                                {
                                    $nomeArquivo = md5(uniqid(time())).".".$ext;

                                    $adaptador->addFilter("Rename", array("target"=>$uploadDir.DIRECTORY_SEPARATOR.$nomeArquivo,'overwrite'=>true));
                                    $arquivosEnviados['mensagem'][] = "ARQUIVO ".$arquivo['name']." Enviado com sucesso.";
                                    $arquivosEnviados["nomesArquivos"][] = $nomeArquivo;

                                }
                                else
                                {
                                      $arquivosEnviados[] = "ARQUIVO ".$arquivo['name']." Enviado com sucesso.";
                                }

                                $adaptador->receive($arquivo['name']);
                            }
                        }
                            $i++;
                    }

                    return $arquivosEnviados;



                }




                /**
                 * @return void
                 * Metodo Responsavel por enviar ao layout uma mensagem e exibi-la para o usuario
                 * ele simplismente pega a session gravada no Zend_registry com o nome de 'session' e  coloca dentro dela
                 * um array contendo as variaveis passadas por parametro e salva novamente no Zend_registry
                 * para este metodo funcionar é necessario  ter o meroto receptorMsg em uma pagina que sempre sera carrega com o sistema
                 * @param  String   $mensagem    A mensagem que se quer enviar
                 * @param  String   $tipo   O tipo de mensagem que se deseja enviar, na classe existem duas constantes contendo os possiveis tipos MENSAGEM_ACERTO e MENSAGEM_ERRO caso nenhuma seja selecionada ou o $tipo seja invalido sera atribuido o primeiro
                 * @param  Int      $tempo   O tempo que a msg ficará sendo exibida ao usuario em milisegundos   **/
            public static  function transmissorMsg($mensagem = "",$tipo = "",$tempo = 6000)
            {
               
                if($mensagem == "")
                {return;}

                    if($tipo == "")
                   $tipo = ZendUtils::MENSAGEM_ACERTO;

                if(!is_int($tempo))
                    $tempo = 6000;


                $session = Zend_Registry::get("session");

                $session->msg = array("mensagem"=>$mensagem,"tipo"=>$tipo,"tempo"=>$tempo);


                 Zend_Registry::set('session', $session);


            }


            /**
             *  @static
             * @return void
             * Este metodo deve ficar em uma parte do sistema em que sempre será carregada
             * Para o funcionamento deste metodo é necessario o arquivo funcoes.js e tambem a biblioteca javaScript JQuery
             * o metodo JavaScript Utilizado é o ExibirMsg Tambem se faz necessario o uso do seguinte codigo html em uma parte do sistema
             * que sempre será carregada " <div id="mensagem" style="display:none"></div> " tudo isso antes deste metodo. Qualquer duvida sobre os requerimentos
             * contactar Marcus Vinicius balbi criador da classe.
             *
             * O funcionamento desta Classe se resume Recuperar A session dentro do Zend_registry chamada session  desmenbrar o array $msg que
             * o metodo  TransmissorMsg() grava e  manda-lo para a função ExibirMsg no arquivo js e depois remover o array $msg  e gravar a session novamente
             *
             *  **/
            public  static function  receptorMsg()
            {
                 $session = Zend_Registry::get("session");


                    if(isset($session->msg))
                    {
                       
                        echo '<script>ExibirMsg("#mensagem","'.$session->msg['mensagem'].'","'.$session->msg['tipo'].'",'.$session->msg['tempo'].');</script>';

                        unset($session->msg);

                        Zend_Registry::set("session", $session);

                    }
                  


            }




            /**
             *Retorna uma string contendo somente os numeros
             * @param string $telefone telefone com mascara: (22)2222-2222
             * @return string
             */
          public static  function retiraMascaraTelefone($telefone)
            {


                    $telefone = str_replace("(","",$telefone);
                    $telefone = str_replace(")","",$telefone);
                    $telefone = str_replace("-","",$telefone);
                    $telefone = str_replace(" ","",$telefone);

                    return $telefone;
            }


            /**
             *retorna um cnpj sem mascara
             * @param string $cnpj cnpj mascarado
             * @return string
             */
            public static  function retiraMascaraCpfCnpj($cnpj)
            {

                 $cnpj = str_replace(".","",$cnpj);
                 $cnpj =str_replace("/","",$cnpj);
                  $cnpj =str_replace("-","",$cnpj);

                 return $cnpj;

            }

            /**
             *
             * Retorna uma string com formato aaaa-mm-dd
             * @param string $data uma data com o formato dd/mm/aaaa
             * @return string
             */
             public static function ConverteDataMysql($data)
            {
                    if($data == "")
                    {
                            return NULL;
                    }

                    $dia = substr($data,0,2);
                    $mes = substr($data,3,2);
                    $ano = substr($data,6,4);

                    return $ano.'-'.$mes.'-'.$dia;
            }


            /**
             *retorna um variavel do tipo float
             * @param string $valor uma string contendo o valor a ser convertido
             * @return float
             */
           public static   function ConverteBancoDouble($valor)
            {
                    if($valor == "")
                    return 0;


                    return (float)$valor;

            }

            /**
             *Retorna uma string com uma data no formato dd/mm/aaaa
             * @param string $data uma data no formato aaaa-mm-dd
             * @return string
             */
           public static   function ConverteDataTela($data)
            {
                    if($data == "0000-00-00")
                    return "";

                    if($data == "")
                    return "";

                    $ano = substr($data,0,4);
                    $mes = substr($data,5,2);
                    $dia = substr($data,8,10);

                    return $dia.'/'.$mes.'/'.$ano;

            }

            /**
             *Retorna um variavel do tipo inteiro
             * @param string $valor uma string com um valor a ser convertido
             * @return int
             */
             public static function ConverteInteiro($valor)
            {
                    if($valor == "")
                    {
                            return 0;
                    }
                    else
                    {
                            return (int)$valor;
                    }
            }


            /**
             *Retorna uma string contendo  o telefone com a seguinte mascara :(22)2222-2222
             * caso o parametro passado seja vazio ou nao tenha exatamente 10 caracteres ele retorna vazio
             * @param string $telefone o telefone contendo somente numero e 10 caracteres
             * @return string
             */
            public static  function ColocaMascaraTelefone($telefone)
            {
                    if($telefone == "" || strlen($telefone) != 10)
                    return "";

                    $ddd = substr($telefone,0,2);
                    $parte1 = substr($telefone,2,4);
                    $parte2 = substr($telefone,6,4);

                    return '('.$ddd.')'.$parte1.'-'.$parte2;
            }

            /**
             *Retorna uma string contendo somente os numeros do cep
             * @param string $cep uma string contendo um cep mascarado 00000-000
             * @return string
             */
           public static   function RetiramascaraCep($cep)
            {
                    $cep = str_replace("-","",$cep);
                    $cep = str_replace(".","",$cep);

                    return $cep;
            }

        /**
         * Retorna uma string com o cep mascarao da seguinte forma: 28625-530
         * @param string $cep uma string contendo o cep
         * @return string
         */
      public static    function ColocaMascaraCep($cep)
        {
                if($cep == "" || strlen($cep) != 8)
                {
                        return "";
                }

                $parte1 = substr($cep,0,5);
                $parte2 = substr($cep,5,3);

                return $parte1.'-'.$parte2;
        }
        
       public static  function pluck($key,$array) {
	       $a = array();
	       foreach($array as $item) $a[] = $item[$key];
	       return $a;
	    }



}
?>
