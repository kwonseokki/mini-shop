package com.shop.service.interfaces;

import com.shop.dto.CartDTO;
import com.shop.dto.ProductDTO;

import java.util.List;

public interface CartService {

    public void addCart(CartDTO cartDTO);

    public void removeCart(Long id);

    public List<ProductDTO> getCartList(Long memberId);

}
