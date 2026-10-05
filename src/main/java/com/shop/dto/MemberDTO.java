package com.shop.dto;

import lombok.Data;

@Data
public class MemberDTO {

    private Long id;

    private String name;

    private String email;

    private String address;

    private String pwd;
}
