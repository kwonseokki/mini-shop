package com.shop.mapper;

import com.shop.vo.CartVO;
import com.shop.vo.MemberVO;
import com.shop.vo.ProductVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class CartMapperTests {

    @Autowired
    private CartMapper cartMapper;

    @Autowired
    MemberMapper memberMapper;

    @Autowired
    ProductMapper productMapper;

    @Test
    public void testInsertOne() {
        List<ProductVO> productList = productMapper.selectAll();
        MemberVO memberVO = memberMapper.findMember("test@test.com", "1234");

        CartVO cartVO = CartVO.builder()
                .customerId(memberVO.getId())
                .productId(productList.get(1).getId())
                .build();

        cartMapper.insert(cartVO);
    }

    @Test
    public void testDelete() {
        Long id = 1L;

        cartMapper.delete(id);
    }
}
