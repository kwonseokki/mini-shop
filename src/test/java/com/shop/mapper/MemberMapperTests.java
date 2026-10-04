package com.shop.mapper;

import com.shop.vo.MemberVO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MemberMapperTests {

    @Autowired
    private  MemberMapper memberMapper;

    @Test
    public void testInsert() {
        MemberVO memberVO = MemberVO.builder()
                .name("testUser")
                .email("test@test.com")
                .pwd("1234")
                .address("용인시 기흥구")
                .build();

        memberMapper.insert(memberVO);
    }

    @Test
    public void testLoginSuccess() {
        MemberVO memberVO = MemberVO.builder()
                .name("testUser")
                .email("test@test.com")
                .pwd("1234")
                .address("용인시 기흥구")
                .build();

        MemberVO findMember = memberMapper.findMember(memberVO);

        Assertions.assertNotNull(findMember);
    }

    @Test
    public void testLoginFailed() {
        MemberVO memberVO = MemberVO.builder()
                .name("testUser")
                .email("test@test.com")
                .pwd("12345")
                .address("용인시 기흥구")
                .build();

        MemberVO findMember = memberMapper.findMember(memberVO);

        Assertions.assertNull(findMember);
    }
}
