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

    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
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
