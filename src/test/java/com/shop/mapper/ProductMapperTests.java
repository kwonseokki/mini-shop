package com.shop.mapper;

import com.shop.vo.ProductVO;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class ProductMapperTests {

    @Resource
    private  ProductMapper productMapper;

    @Test
    public void testSelectAll() {
        List<ProductVO> productList = productMapper.selectAll();

        log.info("-----------상품 목록-----------");

        productList.forEach(product -> {
            log.info(product.getName());
            log.info(product.getDescription());
            log.info(product.getFilePath());
        });
    }

    @Test
    public void testSelectOne() {
        Long id = 1L;

        ProductVO productVO = productMapper.selectById(id);

        log.info("-----------상품 조회 결과-----------");

        log.info(productVO.getName());
    }
}
