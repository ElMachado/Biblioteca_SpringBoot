package com.sura.bibloteca.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sura.bibloteca.dto.UsuarioDTO;
import com.sura.bibloteca.entity.UsuarioEntity;
import com.sura.bibloteca.service.IusuarioService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@AllArgsConstructor
@RestController
@RequestMapping("/biblioteca/usuarios")
@CrossOrigin(origins = "*")
@Log4j2
public class UsuarioController {

        private final IusuarioService iusuarioService;

        @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
        public ResponseEntity<String> guardarUsuario(@RequestBody @Validated UsuarioDTO usuarioDTO)
        {
            UsuarioDTO usuarioResponse = iusuarioService.crearUsuario(usuarioDTO);
            try {
                return ResponseEntity.status(HttpStatus.OK).body(new ObjectMapper().writeValueAsString(usuarioResponse));
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        }
}
