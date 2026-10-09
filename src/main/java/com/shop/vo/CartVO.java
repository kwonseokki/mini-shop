package com.shop.vo;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CartVO {

    public Long id;

    public Long quantity;

    public Long productId;

    public Long customerId;

}
