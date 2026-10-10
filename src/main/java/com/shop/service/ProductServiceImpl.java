package com.shop.service;

import com.shop.dto.ProductDTO;
import com.shop.mapper.ProductMapper;
import com.shop.service.interfaces.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductMapper productMapper;

    private final ModelMapper modelMapper;

    @Override
    public List<ProductDTO> getProductList() {
        return productMapper
                .selectAll()
                .stream()
                .map(productVO -> modelMapper.map(productVO, ProductDTO.class))
                .toList();
    }

    @Override
    public ProductDTO getProductById(Long id) {
        return modelMapper.map(productMapper.selectById(id), ProductDTO.class);
    }
}
