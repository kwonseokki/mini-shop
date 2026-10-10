package com.shop.mapper;

import com.shop.vo.CartVO;
import com.shop.vo.ProductVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CartMapper {

    public void insert(CartVO cartVO);

    public void delete(Long id);

    public List<ProductVO> selectAll(Long memberId);

}
