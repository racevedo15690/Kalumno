package org.ricardoacevedo.kalumn.kalumn.core.eir.bo;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Entity
@DiscriminatorValue(value = "alumno")
public class Alumno extends Persona{
    private String carne;
    @ManyToOne
    @JoinColumn(name = "carrera_Id")
    private Carrera carrera;
}
