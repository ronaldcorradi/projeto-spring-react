package br.com.aplicacao.dsvendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.aplicacao.dsvendas.dto.SellerDTO;
import br.com.aplicacao.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {
	
	@Autowired
	private SellerRepository sellerRepository;
	
	public List<SellerDTO> listAll(){
		return sellerRepository.findAll().stream().map(seller->new SellerDTO(seller)).collect(Collectors.toList());
	}

}
