package com.sura.bibloteca.mapping;

import com.sura.bibloteca.dto.ElementoPrestableBaseDTO;
import com.sura.bibloteca.entity.ElementoPrestableBaseEntity;
import com.sura.bibloteca.util.LocalDateFormatter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


public class ElementoPrestableBaseMapping {



    public ElementoPrestableBaseEntity ElementoPrestableBaseDtoToELementoPrestableEntity(ElementoPrestableBaseDTO elementoPrestableBaseDTO){
        return ElementoPrestableBaseEntity.builder()
                .idElementoPrestableBase(elementoPrestableBaseDTO.getIdElementoPrestableBase())
                .tipoElementoPrestable(elementoPrestableBaseDTO.getTipoElementoPrestable())
                .titulo(elementoPrestableBaseDTO.getTitulo())
                .genero(elementoPrestableBaseDTO.getGenero())
                .anoPublicacion(new LocalDateFormatter().dateStringToLocalDate(elementoPrestableBaseDTO.getAnoPublicacion()))
                .inventario(elementoPrestableBaseDTO.getInventario())
                .categoria(elementoPrestableBaseDTO.getCategoria())
                .build();
    }

    public ElementoPrestableBaseDTO elementoPrestableEntityToElementoPrestableDTO(ElementoPrestableBaseEntity elementoPrestableBaseEntity){
        return ElementoPrestableBaseDTO.builder()
                .idElementoPrestableBase(elementoPrestableBaseEntity.getIdElementoPrestableBase())
                .tipoElementoPrestable(elementoPrestableBaseEntity.getTipoElementoPrestable())
                .genero(elementoPrestableBaseEntity.getGenero())
                .anoPublicacion(new LocalDateFormatter().localDatetoDateString(elementoPrestableBaseEntity.getAnoPublicacion()))
                .titulo(elementoPrestableBaseEntity.getTitulo())
                .inventario(elementoPrestableBaseEntity.getInventario())
                .categoria(elementoPrestableBaseEntity.getCategoria())
                .build();
    }

    public List<ElementoPrestableBaseDTO> listElementoPrestableBaseEntityToElementoPrestableBaseDto(List<ElementoPrestableBaseEntity> entities)
    {
        List<ElementoPrestableBaseDTO> elementoPrestableBaseDTOS = new ArrayList<>();
        entities.forEach(elementoPrestableBaseEntity -> {
            ElementoPrestableBaseDTO prestableBaseDTO = elementoPrestableEntityToElementoPrestableDTO(elementoPrestableBaseEntity);
            elementoPrestableBaseDTOS.add(prestableBaseDTO);

        });
        return null;
    }

}
