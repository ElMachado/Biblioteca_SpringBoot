package com.sura.bibloteca.service.impl;

import com.sura.bibloteca.dto.EmpleadoDTO;
import com.sura.bibloteca.entity.EmpleadoEntity;
import com.sura.bibloteca.mapping.ElementoPrestableBaseMapping;
import com.sura.bibloteca.mapping.EmpleadoMapping;
import com.sura.bibloteca.repository.IempleadoRepository;
import com.sura.bibloteca.service.IempleadoService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
@AllArgsConstructor
@Getter
@Setter

public class EmpleadoImpl implements IempleadoService {
    private final IempleadoRepository empleadoRepository;

    @Override
    public EmpleadoDTO crearEmpleado(EmpleadoDTO empleadoDTO) {
        Optional<EmpleadoEntity> buscarEmpleado = empleadoRepository.findById(empleadoDTO.getIdEmpleado());
        if (buscarEmpleado.isEmpty())
        {
            EmpleadoEntity empleadoEntity= empleadoRepository.saveAndFlush(
                    new EmpleadoMapping()
                            .empleadoDtoToEmpleadoEntity(empleadoDTO));
            if (Objects.nonNull(empleadoEntity))
            {
                return new EmpleadoMapping().empleadoEntityToDto(empleadoEntity);
            }
        }
        return null;
    }


}
