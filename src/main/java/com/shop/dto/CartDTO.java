package com.shop.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CartDTO {

    private Long id;

    private Long productId;

    private Long memberId;

}
