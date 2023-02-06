package com.example.ohelitPrueba.Repositorios;

import org.springframework.data.repository.CrudRepository;//CrudRepository ORM 
import org.springframework.stereotype.Repository;

import com.example.ohelitPrueba.Modelos.usuarioModel;

@Repository
public interface usuarioRepository extends CrudRepository<usuarioModel, Long> {

}
