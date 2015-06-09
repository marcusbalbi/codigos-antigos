<?php

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of conexao
 *
 * @author Marcus
 */
class conexao {
    
    private $con;
    
    public function __construct($host,$dbname,$user,$pass) {
       
        $this->con = new PDO("mysql:host=$host;dbname=$dbname", $user, $pass); 
    }
    
    /**
     * Metodo responsavel por executar querys de consultas apenas
     * @param string $sql o sql que se deseja executar
     * @return PDOStatement 
     */
    public function executarQuery($sql)
    {
        return $this->con->query($sql);
        
    }
    
    /**
     * Retorna o numero de linhas afetadas
     * @param string $sql
     * @return int
     */
    public function executar($sql)
    {
        return $this->con->exec($sql);
    }
    
    
    

    
}

?>
