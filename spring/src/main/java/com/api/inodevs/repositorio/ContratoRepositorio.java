package com.api.inodevs.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.api.inodevs.entidades.Contrato;

//Repositório da Contrato para acessar dados do banco:
@Repository
public interface ContratoRepositorio extends JpaRepository<Contrato, Long>{
    @Query("SELECT c FROM Contrato c WHERE c.unidade.nome LIKE %?1% "
    		+ "OR c.concessionaria.nome LIKE %?1% "
    		+ "OR c.codigo LIKE %?1%"
    		+ "OR c.status LIKE %?1%")
    public List<Contrato> pesquisarContrato(String palavraChave);
}
