package com.sura.bibloteca.service.impl;

import com.sura.bibloteca.dto.EmpleadoDTO;
import com.sura.bibloteca.dto.UsuarioDTO;
import com.sura.bibloteca.entity.UsuarioEntity;
import com.sura.bibloteca.mapping.UsuarioMapping;
import com.sura.bibloteca.repository.IusuarioRepository;
import com.sura.bibloteca.service.IusuarioService;
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
public class UsuarioImpl implements IusuarioService {
    private final IusuarioRepository usuarioRepository;
    @Override
    public UsuarioDTO crearUsuario(UsuarioDTO usuarioDTO) {
        Optional<UsuarioEntity> buscarEmpleado = usuarioRepository.findById(usuarioDTO.getIdUsuario());
        if (Optional.empty().isEmpty())
        {
            UsuarioEntity usuarioEntity= usuarioRepository.saveAndFlush(
                    new UsuarioMapping()
                            .usuarioDtoToEntity(usuarioDTO));
            if (Objects.nonNull(usuarioEntity))
            {
                return new UsuarioMapping().usuarioEntityToDto(usuarioEntity);
            }
        }
        return null;
    }


}
