package com.sura.bibloteca.entity;

import com.sura.bibloteca.dto.ElementoPrestableBaseDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "libro")
public class LibroEntity  {
    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.AUTO)
    private LibroIdEntity libroIdEntity;

    @Column(name = "autor",nullable = false)
    private String autor;

    @Column(name = "edicion",nullable = false)
    private String edicion;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_elemento_prestable_base",nullable = false)
    private ElementoPrestableBaseEntity idEelementoPrestableBase;
}
