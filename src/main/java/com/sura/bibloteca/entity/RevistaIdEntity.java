package com.sura.bibloteca.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class RevistaIdEntity {

    @Column(name = "idRevista",nullable = false)
    private Integer idRevista;

    @Column(name = "idElementoPrestableBase",nullable = false)
    private Integer idElementoPrestableBase;



}
