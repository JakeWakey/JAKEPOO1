package com.uam.egresados.egresadosuam.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Administrador")
@NamedQueries(
        @NamedQuery(name = "Administrador.all", query = "select e from Administrador e")
)
public class Administrador {
    @Id
    private Integer id;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "nombreDeUsuario='" + nombreDeUsuario + '\'' +
                ", contrasena='" + contrasena + '\'' +
                '}';
    }
}
