package com.shop.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MemberVO {

    private Long id;

    private String name;

    private String email;

    private String address;

    private String pwd;

}
