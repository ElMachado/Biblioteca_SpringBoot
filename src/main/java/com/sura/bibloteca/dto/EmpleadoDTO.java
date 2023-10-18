package com.sura.bibloteca.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmpleadoDTO {
    @JsonProperty("id_empleado")
    private Integer idEmpleado;
    private String nombre;
}
