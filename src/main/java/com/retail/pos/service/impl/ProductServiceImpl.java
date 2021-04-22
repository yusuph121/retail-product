package com.retail.pos.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.retail.pos.model.ProductResponseDTO;
import com.retail.pos.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService  {

	@Override
	public List<ProductResponseDTO> saveProductByClientId(String clientId, String productId,
			ProductResponseDTO productResponseDTO) {
		// TODO Auto-generated method stub
		return null;
	}

}
