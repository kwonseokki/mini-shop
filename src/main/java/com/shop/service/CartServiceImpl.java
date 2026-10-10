package com.shop.service;

import com.shop.dto.ProductDTO;
import com.shop.mapper.CartMapper;
import com.shop.service.interfaces.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService {

    private final CartMapper cartMapper;

    @Override
    public void addCart() {

    }

    @Override
    public void removeCart() {

    }

    @Override
    public List<ProductDTO> getCartList() {
        return List.of();
    }
}
