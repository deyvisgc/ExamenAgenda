package com.example.deyvis.myapplication.Modelo;

public class Usuario {
    private int idUsuario;
    private String nombre;
    private String pass;
    private int numero;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Usuario(int idUsuario, String nombre, String pass, int numero) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.pass = pass;
        this.numero = numero;
    }

    public Usuario() {
    }
}
