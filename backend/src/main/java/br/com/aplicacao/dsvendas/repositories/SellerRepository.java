package br.com.aplicacao.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.aplicacao.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}
