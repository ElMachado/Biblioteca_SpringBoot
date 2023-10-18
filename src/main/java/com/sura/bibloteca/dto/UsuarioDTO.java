package com.sura.bibloteca.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UsuarioDTO {
    @JsonProperty("id_usuario")
    private Integer idUsuario;
    @JsonProperty("limite_prestamos")
    private Integer limitePrestamos;
}
