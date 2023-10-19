package com.uam.egresados.egresadosuam.model;


import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


import java.util.Date;

@Embeddable
public class RegistroLaboral {

    @Id
    private Integer id;


    private String cargo;
    private Date fechaInicio;
    private Date fechaFinal;
}
