package com.prueba.Prueba.repo;

import com.prueba.Prueba.Modelos.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Anotacion que le dice a Sprint que esta clase es un repositorio
public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {

}

