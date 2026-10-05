package com.shop.service;

import com.shop.dto.MemberDTO;

public interface MemberService {

    public MemberDTO login(String email, String pwd);

}
