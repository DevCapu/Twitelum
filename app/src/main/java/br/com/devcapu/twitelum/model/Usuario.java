package br.com.devcapu.twitelum.model;

import java.io.Serializable;

public class Usuario implements Serializable {

    private final String nome;
    private final String usuario;
    private final String senha;

    public Usuario (String nome, String usuario, String senha) {
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }
}
