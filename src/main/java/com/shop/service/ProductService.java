package com.shop.service;

import com.shop.dto.ProductDTO;

import java.util.List;

public interface ProductService {

    public List<ProductDTO> getProductList();

    public ProductDTO getProductById(Long id);

}
