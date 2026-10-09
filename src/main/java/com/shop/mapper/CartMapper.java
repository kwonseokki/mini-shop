package com.shop.mapper;

import com.shop.vo.CartVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CartMapper {

    public void insert(CartVO cartVO);
}
