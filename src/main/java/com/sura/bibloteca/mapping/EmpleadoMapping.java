package com.sura.bibloteca.mapping;

import com.sura.bibloteca.dto.EmpleadoDTO;
import com.sura.bibloteca.entity.EmpleadoEntity;

public class EmpleadoMapping {
    public EmpleadoEntity empleadoDtoToEmpleadoEntity (EmpleadoDTO empleadoDTO)
    {
        return EmpleadoEntity.builder()
                .idEmpleado(empleadoDTO.getIdEmpleado())
                .nombre(empleadoDTO.getNombre())
                .build();
    }

    public EmpleadoDTO empleadoEntityToDto(EmpleadoEntity empleadoEntity)
    {
        return EmpleadoDTO.builder()
                .idEmpleado(empleadoEntity.getIdEmpleado())
                .nombre(empleadoEntity.getNombre())
                .build();
    }
}
