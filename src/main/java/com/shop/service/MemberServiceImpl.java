package com.shop.service;

import com.shop.dto.MemberDTO;
import com.shop.mapper.MemberMapper;
import com.shop.vo.MemberVO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class MemberServiceImpl implements MemberService {

    private final MemberMapper memberMapper;

    private final ModelMapper modelMapper;

    @Override
    public MemberDTO login(String email, String pwd) {
        MemberVO memberVO = memberMapper.findMember(email, pwd);

        if (memberVO == null) {
            return null;
        }

        return modelMapper.map(memberVO, MemberDTO.class);
    }
}
