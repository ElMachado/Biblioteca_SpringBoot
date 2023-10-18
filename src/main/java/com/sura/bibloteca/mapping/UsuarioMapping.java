package com.sura.bibloteca.mapping;

import com.sura.bibloteca.dto.UsuarioDTO;
import com.sura.bibloteca.entity.UsuarioEntity;

public class UsuarioMapping {
    public UsuarioEntity usuarioDtoToEntity (UsuarioDTO usuarioDTO){
       return UsuarioEntity.builder()
               .idUsuario(usuarioDTO.getIdUsuario())
               .limitePrestamos(usuarioDTO.getLimitePrestamos())
               .build();
    }
    public UsuarioDTO usuarioEntityToDto(UsuarioEntity usuarioEntity)
    {
        return  UsuarioDTO.builder()
                .idUsuario(usuarioEntity.getIdUsuario())
                .limitePrestamos(usuarioEntity.getLimitePrestamos())
                .build();
    }
}
