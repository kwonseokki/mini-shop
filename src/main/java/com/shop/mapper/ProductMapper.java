package com.shop.mapper;

import com.shop.vo.ProductVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {

    public List<ProductVO> selectAll();

}
