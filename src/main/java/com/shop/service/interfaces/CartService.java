package com.shop.service.interfaces;

import com.shop.dto.ProductDTO;

import java.util.List;

public interface CartService {

    public void addCart();

    public void removeCart();

    public List<ProductDTO> getCartList();

}
