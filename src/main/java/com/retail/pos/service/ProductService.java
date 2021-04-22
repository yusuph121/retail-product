package com.retail.pos.service;

import java.util.List;

import com.retail.pos.model.ProductResponseDTO;

public interface ProductService {

	List<ProductResponseDTO> saveProductByClientId(String clientId,String productId,ProductResponseDTO productResponseDTO);
	
	
//	@Autowired
//	public ProductService(FaresRepository faresRepository){
//		this.faresRepository = faresRepository;
//	}
//
//	public Fare getFare(String flightNumber, String flightDate){ 
//		logger.info("Looking for fares flightNumber "+ flightNumber + " flightDate "+ flightDate);
//		return faresRepository.getFareByFlightNumberAndFlightDate(flightNumber, flightDate);
//	}
}





