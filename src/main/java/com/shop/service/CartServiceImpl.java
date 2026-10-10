package com.shop.service;

import com.shop.dto.CartDTO;
import com.shop.dto.ProductDTO;
import com.shop.mapper.CartMapper;
import com.shop.service.interfaces.CartService;
import com.shop.vo.CartVO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService {

    private final CartMapper cartMapper;

    private final ModelMapper modelMapper;

    @Override
    public void addCart(CartDTO cartDTO) {
        cartMapper.insert(modelMapper.map(cartDTO, CartVO.class));
    }

    @Override
    public void removeCart(Long id) {
        cartMapper.delete(id);
    }

    @Override
    public List<ProductDTO> getCartList(Long memberId) {
        return cartMapper
                .selectAll(memberId)
                .stream()
                .map(product ->
                        modelMapper.map(product, ProductDTO.class)
                ).toList();
    }
}
