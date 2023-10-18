package com.sura.bibloteca.repository;

import com.sura.bibloteca.entity.EmpleadoEntity;
import com.sura.bibloteca.entity.UsuarioEntity;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface IusuarioRepository extends JpaRepository<UsuarioEntity, Integer> {

    @Query("select e from UsuarioEntity e where e.idUsuario=:idUsuario")
    Optional<UsuarioEntity> findById(Integer idUsuario);
}
