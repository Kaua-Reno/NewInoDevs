package com.api.inodevs.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.inodevs.entidades.Contrato;

//Repositório da Contrato para acessar dados do banco:
@Repository
public interface ContratoRepositorio extends JpaRepository<Contrato, Long>{
}
