package org.ricardoacevedo.kalumn.kalumn.core.eir.bo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@Entity
@Table(name = "puesto")
public class Puesto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "puesto_Id")
    private Long puestoId;
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "puesto")
    private Set<Empleado> empleados;
}
