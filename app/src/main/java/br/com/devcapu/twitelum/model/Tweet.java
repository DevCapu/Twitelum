package br.com.devcapu.twitelum.model;

import java.io.Serializable;

public class Tweet implements Serializable {

    private int id = 0;
    private final Usuario usuario;
    private final String texto;

    public Tweet(Usuario usuario, String texto) {
        this.usuario = usuario;
        this.texto = texto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getTexto() {
        return texto;
    }
}
