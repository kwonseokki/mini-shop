package com.shop.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class ProductServiceTests {

    @Autowired
    private ProductService productService;

    @Test
    public void testGetProducts() {

        log.info("--------상품 목록 조회---------");

        productService.getProductList().forEach(productDTO -> log.info(productDTO.getName()));
    }
}
