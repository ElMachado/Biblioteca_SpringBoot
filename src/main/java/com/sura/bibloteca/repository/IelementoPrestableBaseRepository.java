package com.sura.bibloteca.repository;

import com.sura.bibloteca.entity.ElementoPrestableBaseEntity;
import com.sura.bibloteca.service.impl.ElementoPrestableBaseImpl;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IelementoPrestableBaseRepository extends JpaRepository<ElementoPrestableBaseEntity,Integer> {
    @Query("select e from ElementoPrestableBaseEntity e where e.titulo=:titulo")
    ElementoPrestableBaseEntity findByTitulo(String titulo);




}
