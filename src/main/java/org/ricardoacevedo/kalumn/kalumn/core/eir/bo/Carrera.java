package org.ricardoacevedo.kalumn.kalumn.core.eir.bo;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@Entity
@Table(name = "carrera")
public class Carrera implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "carrera_Id")
    private Long carreraId;
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "carrera")
    private Set<Alumno> alumnos;
}
