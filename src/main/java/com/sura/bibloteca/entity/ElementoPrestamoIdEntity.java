package com.sura.bibloteca.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class ElementoPrestamoIdEntity {

    @Column(name = "id_prestamo",nullable = false)
    private Integer idPrestamo;

    @Column(name = "id_elemento_prestable_base",nullable = false)
    private Integer IdElementoPrestableBae;

    @Column(name = "id_empleado",nullable = false)
    private Integer IdEmpleado;
    @Column(name = "fecha_prestamo",nullable = false)
    private LocalDate fechaPrestamo;
    @Column(name = "fecha_devolucion",nullable = false)
    private LocalDate fechaDevolucion;



}
