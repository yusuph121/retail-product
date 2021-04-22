package com.retail.pos.controller;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.ResponseEntity.status;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.retail.pos.model.ProductResponseDTO;
import com.retail.pos.service.ProductService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

	@Autowired
	ProductService productService;

	@PostMapping("/v1/{productId}/save-product")
	public ResponseEntity<List<ProductResponseDTO>> saveProductByClientId(
			@RequestHeader(required = true) String clientId,
			@PathVariable(required = true) String productId,
			@RequestBody(required = true) ProductResponseDTO productResponseDTO) {

		List<ProductResponseDTO> result = null;// productService.saveProductByCategory(clientId, productResponseDTO);
		return status(OK).body(result);
	}
}
