package com.sura.bibloteca.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import lombok.*;

import java.time.LocalDate;
@Getter
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ElementoPrestableBaseDTO {

    @JsonProperty("id_elemento_prestable_base")
    private Integer idElementoPrestableBase;
    @JsonProperty("tipo_elemento_prestable")
    private String tipoElementoPrestable;
    private String titulo;
    private String genero;
    private Integer inventario;
    @JsonProperty("ano_publicacion")
    private String anoPublicacion;
    private String categoria;
}
