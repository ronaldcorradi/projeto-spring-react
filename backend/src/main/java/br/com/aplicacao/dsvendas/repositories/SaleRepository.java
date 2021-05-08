package br.com.aplicacao.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aplicacao.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale,Long>{

}
