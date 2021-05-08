package br.com.aplicacao.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.aplicacao.dsvendas.dto.SaleSuccessDTO;
import br.com.aplicacao.dsvendas.dto.SaleSumDTO;
import br.com.aplicacao.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale,Long>{
	
	@Query("SELECT new br.com.aplicacao.dsvendas.dto.SaleSumDTO(sale.seller,SUM(sale.amount)) "
			+ "FROM Sale AS sale GROUP BY sale.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new br.com.aplicacao.dsvendas.dto.SaleSuccessDTO(sale.seller,SUM(sale.visited),SUM(sale.deals)) "
			+ "FROM Sale AS sale GROUP BY sale.seller")
	List<SaleSuccessDTO> successGroupedBySeller();

}
