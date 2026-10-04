package com.shop.mapper;

import com.shop.vo.MemberVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    public void insert(MemberVO memberVO);

}
