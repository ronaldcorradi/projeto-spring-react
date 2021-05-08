package br.com.aplicacao.dsvendas.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.aplicacao.dsvendas.dto.SaleDTO;
import br.com.aplicacao.dsvendas.dto.SaleSuccessDTO;
import br.com.aplicacao.dsvendas.dto.SaleSumDTO;
import br.com.aplicacao.dsvendas.repositories.SaleRepository;
import br.com.aplicacao.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository saleRepository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> listAll(Pageable pageable){
		sellerRepository.findAll();
		return saleRepository.findAll(pageable).map(sale->new SaleDTO(sale));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedeBySeller(){		
		return saleRepository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupedBySeller(){		
		return saleRepository.successGroupedBySeller();
	}
	
	
}
