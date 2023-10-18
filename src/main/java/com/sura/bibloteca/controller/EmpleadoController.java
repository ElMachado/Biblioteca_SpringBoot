package com.sura.bibloteca.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sura.bibloteca.dto.EmpleadoDTO;
import com.sura.bibloteca.service.IempleadoService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/biblioteca/empleados")
@CrossOrigin(origins = "*")
@Log4j2
public class EmpleadoController {
    private final IempleadoService iempleadoService;

    @ApiResponses( value = {
            @ApiResponse(code = 200,message = "ok. se guardo correctamente el elemento", response = EmpleadoDTO.class),
            @ApiResponse(code = 400, message = "No llenaste los datos correctamente", response = String.class),
            @ApiResponse(code = 500, message = "Error inesperado del sistema")
    })
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> guardarEmpleado(@RequestBody @Validated EmpleadoDTO empleadoDTO){
        EmpleadoDTO epleadoResponse = iempleadoService.crearEmpleado(empleadoDTO);
        try {
            return ResponseEntity.status(HttpStatus.OK).body(new ObjectMapper().writeValueAsString(epleadoResponse));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }


}
