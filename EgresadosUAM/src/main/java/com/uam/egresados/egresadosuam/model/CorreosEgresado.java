package com.uam.egresados.egresadosuam.model;

public class CorreosEgresado {
    private String correo;

    public CorreosEgresado() {
    }

    public CorreosEgresado(String correo) {
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "CorreosEgresado{" +
                "correo='" + correo + '\'' +
                '}';
    }
}
