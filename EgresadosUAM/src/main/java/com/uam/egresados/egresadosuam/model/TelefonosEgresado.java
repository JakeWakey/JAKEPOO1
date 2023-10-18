package com.uam.egresados.egresadosuam.model;

public class TelefonosEgresado {
    private String telefonos;


    public TelefonosEgresado() {
    }

    public TelefonosEgresado(String telefonos) {
        this.telefonos = telefonos;
    }

    public String getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }

    @Override
    public String toString() {
        return "ContactosDeEgresado{" +
                "telefonos='" + telefonos + '\'' +
                '}';
    }
}
