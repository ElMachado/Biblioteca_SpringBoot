package com.sura.bibloteca.entity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "elemento_prestable_base")
public class ElementoPrestableBaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_elemento_prestable_base", nullable = false)
    private Integer idElementoPrestableBase;

    @Column(name = "tipo_elemento_prestable",nullable = false)
    private String tipoElementoPrestable;

    @Column(name = "titulo",nullable = false)
    private String titulo;

    @Column(name = "genero",nullable = false)
    private String genero;

    @Column(name = "inventario",nullable = false)
    private Integer inventario;

    @Column(name = "ano_publicacion",nullable = false)
    private LocalDate anoPublicacion;

    @Column(name = "categoria",nullable = false)
    private String categoria;

}
