package com.shop.service;

import com.shop.dto.CartDTO;
import com.shop.dto.ProductDTO;
import com.shop.service.interfaces.CartService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class CartServiceTests {

    @Autowired
    private CartService cartService;

    @Test
    public void testAddCart() {
        CartDTO cartDTO = CartDTO.builder()
                        .memberId(1L)
                        .productId(2L)
                        .build();

        cartService.addCart(cartDTO);
    }

    @Test
    public void testDeleteCart() {
        Long cartId = 3L;

        cartService.removeCart(cartId);
    }

    @Test
    public void testGetCartList() {
        Long memberId = 1L;

        List<ProductDTO> products = cartService.getCartList(memberId);

        log.info("--------상품 목록 출력--------");
        products.forEach(product -> log.info(product.getName()));
    }

}
