package com.uam.egresados.egresadosuam.model;

public class Administrador {
    private String nombreDeUsuario;
    private String contrasena;
    public Administrador() {
    }

    public Administrador(String nombreDeUsuario, String contrasena) {
        this.nombreDeUsuario = nombreDeUsuario;
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "nombreDeUsuario='" + nombreDeUsuario + '\'' +
                ", contrasena='" + contrasena + '\'' +
                '}';
    }
}
