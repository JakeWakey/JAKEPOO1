package com.uam.egresados.egresadosuam.model;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jdk.jfr.DataAmount;
@Embeddable
public class CorreosEgresado {
    private String correo;

    private Egresado egresado;
}
