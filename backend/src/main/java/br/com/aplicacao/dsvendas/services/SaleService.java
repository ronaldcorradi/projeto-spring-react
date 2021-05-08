package br.com.aplicacao.dsvendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.aplicacao.dsvendas.dto.SaleDTO;
import br.com.aplicacao.dsvendas.repositories.SaleRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	public List<SaleDTO> listAll(){
		return null;
	}
	
}
