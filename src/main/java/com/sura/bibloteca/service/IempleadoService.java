package com.sura.bibloteca.service;

import com.sura.bibloteca.dto.EmpleadoDTO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;


public interface IempleadoService {
    EmpleadoDTO crearEmpleado(EmpleadoDTO empleadoDTO);

}
