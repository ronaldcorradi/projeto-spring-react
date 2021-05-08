package br.com.aplicacao.dsvendas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.aplicacao.dsvendas.dto.SaleDTO;
import br.com.aplicacao.dsvendas.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	private SaleService saleService;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> listAll(Pageable pageable){
		Page<SaleDTO> pages = saleService.listAll(pageable);
		return ResponseEntity.ok(pages);
	}

}
