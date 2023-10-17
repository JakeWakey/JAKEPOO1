package com.uam.egresados.egresadosuam.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "RegistroLaboral")
public class RegistroLaboral {
    private String cargo;
    private Date fechaInicio;
    private Date fechaFinal;

    public RegistroLaboral() {
    }

    public RegistroLaboral(String cargo, Date fechaInicio, Date fechaFinal) {
        this.cargo = cargo;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    @Override
    public String toString() {
        return "RegistroLaboral{" +
                "cargo='" + cargo + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFinal=" + fechaFinal +
                '}';
    }
}
