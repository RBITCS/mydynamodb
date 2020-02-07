package com.rbit.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductInfoService {

	@Autowired
	ProductInfoRepository infoRepository;

	public Optional<ProductInfo> findById(String id) {
		return infoRepository.findById(id);
	}
	
}
