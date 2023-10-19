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
            name = "Carreras",
            joinColumns = @JoinColumn(name = "egresado_id")
    )
    private List<Carreras> carreraEstudiada;
    private String etnia;
    private String tipoBeca;


    public Egresado() {
    }

    public Egresado(Integer id, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, Date fechaNacimiento, Date fechaGraduacion, List<TelefonosEgresado> contactos, List<CorreosEgresado> correos, List<RegistroLaboral> cargoActual, List<Carreras> carreraEstudiada, String etnia, String tipoBeca) {
        this.id = id;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
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


    public void setPrimerNombre(String primerNombre) throws Exception {


        //Exception del primer nombre
        if (primerNombre == null || primerNombre.isEmpty() || primerNombre.length() > 30) {
            throw new Exception("El primer nombre no es válido");
        }
        this.primerNombre = primerNombre;
    }


    public String getSegundoNombre() {
        return segundoNombre;
    }


    public void setSegundoNombre(String segundoNombre) throws Exception {


        //Exception del segundo nombre
        if (segundoNombre == null || segundoNombre.isEmpty() || segundoNombre.length() > 30) {
            throw new Exception("El segundo nombre no es válido");
        }
        this.segundoNombre = segundoNombre;
    }


    public String getPrimerApellido() {
        return primerApellido;
    }


    public void setPrimerApellido(String primerApellido) throws Exception {


        //Exception del primer apellido
        if (primerApellido == null || primerApellido.isEmpty() || primerApellido.length() > 30) {
            throw new Exception("El primer apellido no es válido");
        }
        this.primerApellido = primerApellido;
    }


    public String getSegundoApellido() {
        return segundoApellido;
    }


    public void setSegundoApellido(String segundoApellido) throws Exception{


        //Exception del segundo apellido
        if (segundoApellido == null || segundoApellido.isEmpty() || segundoApellido.length() > 30) {
            throw new Exception("El primer apellido no es válido");
        }
        this.segundoApellido = segundoApellido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public List<Carreras> getCarreraEstudiada() {
        return carreraEstudiada;
    }

    public void setCarreraEstudiada(List<Carreras> carreraEstudiada) {
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
                "id=" + id +
                ", primerNombre='" + primerNombre + '\'' +
                ", segundoNombre='" + segundoNombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
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
