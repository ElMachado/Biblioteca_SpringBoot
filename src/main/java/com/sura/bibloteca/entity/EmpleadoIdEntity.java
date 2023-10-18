package com.sura.bibloteca.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class EmpleadoIdEntity {

    @Column(name = "id_empleado",nullable = false)
    private Integer idEmpleado;

    @Column(name = "nombre",nullable = false)
    private String nombre;


}
