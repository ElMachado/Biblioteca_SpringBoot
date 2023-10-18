package com.sura.bibloteca.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class UsuarioIdEntity {
    @Column(name = "id_usuario",nullable = false)
    private int idEmpleado;
    @Column(name = "limite_prestamos")
    private Integer limitePrestamos;

}
