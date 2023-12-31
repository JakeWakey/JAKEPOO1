package com.uam.egresados.egresadosuam.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Egresado")
@NamedQueries({
    @NamedQuery(name = "Egresado.all", query = "select e from Egresado e")
})
public class Egresado {

    @Id
    private Integer id;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private Date fechaNacimiento;
    private Date fechaGraduacion;
    @ElementCollection
    @CollectionTable(
            name = "TelefonosEgresado",
            joinColumns = @JoinColumn(name = "egresado_id")
    )
    private List<TelefonosEgresado> contactos;
    @ElementCollection
    @CollectionTable(
            name= "CorreosEgresado",
            joinColumns = @JoinColumn(name = "egresado_id")
    )
    private List<CorreosEgresado> correos;
    @ElementCollection
    @CollectionTable(
            name = "RegistroLaboral",
            joinColumns = @JoinColumn(name = "egresado_id")
    )
    private List<RegistroLaboral> cargoActual;
    @ElementCollection
    @CollectionTable(
            name = "CarrerasEgresado",
            joinColumns = @JoinColumn(name = "egresado_id")
    )
    private List<String> carreraEstudiada;
    private String etnia;
    private String tipoBeca;

    public Egresado() {
    }

    public Egresado(String primerNombre, String segundoNombre, String primerApellido,
                    String segundoApellido, Integer id, Date fechaNacimiento, Date fechaGraduacion,
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public List<TelefonosEgresado> getContactos() {
        return contactos;
    }

    public void setContactos(List<TelefonosEgresado> contactos) {
        this.contactos = contactos;
    }

    public List<CorreosEgresado> getCorreos() {
        return correos;
    }

    public void setCorreos(List<CorreosEgresado> correos) {
        this.correos = correos;
    }

    public List<RegistroLaboral> getCargoActual() {
        return cargoActual;
    }

    public void setCargoActual(List<RegistroLaboral> cargoActual) {
        this.cargoActual = cargoActual;
    }

    public List<String> getCarreraEstudiada() {
        return carreraEstudiada;
    }

    public void setCarreraEstudiada(List<String> carreraEstudiada) {
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
