package com.shop.mapper;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductMapperTests {

    @Resource
    private  ProductMapper productMapper;

    @Test
    public void testConnection() {
        int result =  productMapper.testConnection();
        Assertions.assertEquals(1, result);
    }
}
