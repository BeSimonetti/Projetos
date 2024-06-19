<?php

include "cadastro.class.php";
include_once "conexao.php";

    $u = new Cadastro();

    $email = $_POST['email'];
    $senha = $_POST['senha'];

    $u->setEmail($email);
    $u->setSenha($senha);

    $u->inserirUsuario();
