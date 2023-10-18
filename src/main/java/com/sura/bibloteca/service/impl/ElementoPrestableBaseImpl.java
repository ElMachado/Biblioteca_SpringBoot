package com.sura.bibloteca.service.impl;

import com.sura.bibloteca.dto.ElementoPrestableBaseDTO;
import com.sura.bibloteca.entity.ElementoPrestableBaseEntity;
import com.sura.bibloteca.mapping.ElementoPrestableBaseMapping;
import com.sura.bibloteca.repository.IelementoPrestableBaseRepository;
import com.sura.bibloteca.service.IelementoPrestableBaseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@AllArgsConstructor

public class ElementoPrestableBaseImpl implements IelementoPrestableBaseService {

    private final IelementoPrestableBaseRepository ielementoPrestableBaseRepository;

    @Override
    public ElementoPrestableBaseDTO crearElementoPrestableBase(ElementoPrestableBaseDTO elementoPrestableBaseDTO) {
        ElementoPrestableBaseEntity buscarTitulo = ielementoPrestableBaseRepository.findByTitulo(elementoPrestableBaseDTO.getTitulo());
        if (Objects.isNull(buscarTitulo)) {
            ElementoPrestableBaseEntity elementoPrestableBaseEntity = ielementoPrestableBaseRepository
                    .saveAndFlush(new ElementoPrestableBaseMapping()
                            .ElementoPrestableBaseDtoToELementoPrestableEntity(elementoPrestableBaseDTO));
            if (Objects.nonNull(elementoPrestableBaseEntity)) {
                return new ElementoPrestableBaseMapping().elementoPrestableEntityToElementoPrestableDTO(elementoPrestableBaseEntity);
            }
        }
        return null;
    }

    @Override
    public ElementoPrestableBaseDTO actualizarEelementoPrestableBase(ElementoPrestableBaseDTO elementoPrestableBaseDTO) {
        Optional<ElementoPrestableBaseEntity> buscarElemento = ielementoPrestableBaseRepository.findById(elementoPrestableBaseDTO.getIdElementoPrestableBase());
        if (Objects.nonNull(buscarElemento.get()))
        {
            ElementoPrestableBaseEntity actualizarElemento = ielementoPrestableBaseRepository.saveAndFlush(new ElementoPrestableBaseMapping().ElementoPrestableBaseDtoToELementoPrestableEntity(elementoPrestableBaseDTO));

            if (Objects.nonNull(actualizarElemento))
            {
                ElementoPrestableBaseDTO actualizarElementoPrestableDTO = new ElementoPrestableBaseMapping().elementoPrestableEntityToElementoPrestableDTO(actualizarElemento);
                return actualizarElementoPrestableDTO;
            }
        }
        return null;
    }

    @Override
    public ElementoPrestableBaseDTO buscarElementoPrestableBase(Integer idelementoPrestableBaseDTO) {
      Optional<ElementoPrestableBaseEntity> buscarElemento = ielementoPrestableBaseRepository.findById(idelementoPrestableBaseDTO);
      if (Objects.nonNull(buscarElemento.get()))
      {
      ElementoPrestableBaseDTO buscarElementoPrestableDTO = new ElementoPrestableBaseMapping().elementoPrestableEntityToElementoPrestableDTO(buscarElemento.get());
      return buscarElementoPrestableDTO;
      }

        return null;
    }

    @Override
    public String BorrarEelementoPrestableBase(ElementoPrestableBaseDTO elementoPrestableBaseDTO) {
        ElementoPrestableBaseDTO buscarElementoPrestableDTO = buscarElementoPrestableBase(elementoPrestableBaseDTO.getIdElementoPrestableBase());
        if (Objects.nonNull(buscarElementoPrestableDTO))
        {
             ielementoPrestableBaseRepository.delete(new ElementoPrestableBaseMapping().ElementoPrestableBaseDtoToELementoPrestableEntity(elementoPrestableBaseDTO));
            return "El elemento fue borrado exitosamente";
        }
        return null;
    }

    @Override
    public List<ElementoPrestableBaseDTO> buscarTodosEelementosPrestableBase() {
        List<ElementoPrestableBaseEntity> elementoPrestableBaseEntity = ielementoPrestableBaseRepository.findAll();
        if (!elementoPrestableBaseEntity.isEmpty() && elementoPrestableBaseEntity.size()>0){
            List<ElementoPrestableBaseDTO> elementoPrestableBaseDTOS = new ElementoPrestableBaseMapping().
                    listElementoPrestableBaseEntityToElementoPrestableBaseDto(elementoPrestableBaseEntity);
            return elementoPrestableBaseDTOS;
        }
        return null;

    }

}
