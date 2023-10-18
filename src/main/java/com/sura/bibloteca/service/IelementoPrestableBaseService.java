package com.sura.bibloteca.service;

import com.sura.bibloteca.dto.ElementoPrestableBaseDTO;
import com.sura.bibloteca.entity.ElementoPrestableBaseEntity;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IelementoPrestableBaseService {
    ElementoPrestableBaseDTO crearElementoPrestableBase(ElementoPrestableBaseDTO elementoPrestableBaseDTO);

    ElementoPrestableBaseDTO actualizarEelementoPrestableBase(ElementoPrestableBaseDTO elementoPrestableBaseDTO);

    ElementoPrestableBaseDTO buscarElementoPrestableBase(Integer idelementoPrestableBaseDTO);

    String BorrarEelementoPrestableBase(ElementoPrestableBaseDTO elementoPrestableBaseDTO);

    List<ElementoPrestableBaseDTO> buscarTodosEelementosPrestableBase();

}
