package com.uam.egresados.egresadosuam.model;

import java.util.ArrayList;

public class ContactosDeEgresado {
    private ArrayList<String> telefonos;
    private ArrayList<String> correos;

    public ContactosDeEgresado() {
    }

    public ContactosDeEgresado(ArrayList<String> telefonos, ArrayList<String> correos) {
        this.telefonos = telefonos;
        this.correos = correos;
    }

    public ArrayList<String> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList<String> telefonos) {
        this.telefonos = telefonos;
    }

    public ArrayList<String> getCorreos() {
        return correos;
    }

    public void setCorreos(ArrayList<String> correos) {
        this.correos = correos;
    }

    @Override
    public String toString() {
        return "ContactosDeEgresado{" +
                "telefonos=" + telefonos +
                ", correos=" + correos +
                '}';
    }
}
