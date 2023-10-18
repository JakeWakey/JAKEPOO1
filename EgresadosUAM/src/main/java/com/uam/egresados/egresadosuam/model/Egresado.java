package com.uam.egresados.egresadosuam.model;

import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "Egresado")
@NamedQueries({
    @NamedQuery(name = "Egresado.all", query = "select e from Egresado e")
})
public class Egresado {
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private UUID id;
    private Date fechaNacimiento;
    private Date fechaGraduacion;

    private ArrayList<TelefonosEgresado> contactos;
    private ArrayList<CorreosEgresado> correos;
    private ArrayList<RegistroLaboral> cargoActual;
    private ArrayList<String> carreraEstudiada;
    private String etnia;
    private String tipoBeca;

    public Egresado() {
    }

    public Egresado(String primerNombre, String segundoNombre, String primerApellido,
                    String segundoApellido, UUID id, Date fechaNacimiento, Date fechaGraduacion,
                    ArrayList<TelefonosEgresado> contactos, ArrayList<CorreosEgresado> correos,
                    ArrayList<RegistroLaboral> cargoActual, ArrayList<String> carreraEstudiada, String etnia,
                    String tipoBeca) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.id = id;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaGraduacion = fechaGraduacion;
        this.contactos = contactos;
        this.correos = correos;
        this.cargoActual = cargoActual;
        this.carreraEstudiada = carreraEstudiada;
        this.etnia = etnia;
        this.tipoBeca = tipoBeca;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaGraduacion() {
        return fechaGraduacion;
    }

    public void setFechaGraduacion(Date fechaGraduacion) {
        this.fechaGraduacion = fechaGraduacion;
    }


    public ArrayList<TelefonosEgresado> getContactos() {
        return contactos;
    }

    public void setContactos(ArrayList<TelefonosEgresado> contactos) {
        this.contactos = contactos;
    }

    public ArrayList<CorreosEgresado> getCorreos() {
        return correos;
    }

    public void setCorreos(ArrayList<CorreosEgresado> correos) {
        this.correos = correos;
    }

    public ArrayList<RegistroLaboral> getCargoActual() {
        return cargoActual;
    }

    public void setCargoActual(ArrayList<RegistroLaboral> cargoActual) {
        this.cargoActual = cargoActual;
    }

    public ArrayList<String> getCarreraEstudiada() {
        return carreraEstudiada;
    }

    public void setCarreraEstudiada(ArrayList<String> carreraEstudiada) {
        this.carreraEstudiada = carreraEstudiada;
    }

    public String getEtnia() {
        return etnia;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }

    public String getTipoBeca() {
        return tipoBeca;
    }

    public void setTipoBeca(String tipoBeca) {
        this.tipoBeca = tipoBeca;
    }


    @Override
    public String toString() {
        return "Egresado{" +
                "primerNombre='" + primerNombre + '\'' +
                ", segundoNombre='" + segundoNombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", id=" + id +
                ", fechaNacimiento=" + fechaNacimiento +
                ", fechaGraduacion=" + fechaGraduacion +
                ", contactos=" + contactos +
                ", correos=" + correos +
                ", cargoActual=" + cargoActual +
                ", carreraEstudiada=" + carreraEstudiada +
                ", etnia='" + etnia + '\'' +
                ", tipoBeca='" + tipoBeca + '\'' +
                '}';
    }
}
