package org.ricardoacevedo.kalumn.kalumn.core.eir.bo;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@DiscriminatorValue(value = "empleado")
public class Empleado extends Persona{
    private String dpi;
    @ManyToOne
    @JoinColumn(name = "puesto_Id")
    private Puesto puesto;
}
