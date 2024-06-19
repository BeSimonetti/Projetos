<?php
include_once "conexao.php";
class Cadastro{
    private $email;
    private $senha;
    function getEmail(){
        return $this->email;
    }
    function setEmail($email){
        $this->email = $email;
    }

    function getSenha(){
        return $this->senha;
    }
    function setSenha($senha){
        $this->senha = $senha;
    }
    function inserirUsuario() {
        $database = new Conexao(); 
        $db = $database->getConnection(); 
        
        $sql = "INSERT INTO usuario (email, senha) VALUES (:email, :senha)";
        try {
            $stmt = $db->prepare($sql);

            $stmt->bindParam(':email', $this->email);
            $stmt->bindParam(':senha', $this->senha);
            
            $stmt->execute();
            return true;
            
        } catch (PDOExeption $e) {
            echo "Erro ao inserir usuario: " . $e->getMessage();
            return false;
        }
    }
}