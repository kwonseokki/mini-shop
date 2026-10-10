package com.shop.mapper;

import com.shop.vo.CartVO;
import com.shop.vo.MemberVO;
import com.shop.vo.ProductVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
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
                .memberId(memberVO.getId())
                .productId(productList.get(1).getId())
                .build();

        cartMapper.insert(cartVO);
    }

    @Test
    public void testDelete() {
        Long id = 1L;

        cartMapper.delete(id);
    }

    @Test
    public void testSelectByMemberId() {
        Long memberId = 1L;

        List<ProductVO> products = cartMapper.selectAll(memberId);

        log.info("--------장바구니 목록--------");

        products.forEach(product -> {
            log.info(product.getName());
        });
    }
}
