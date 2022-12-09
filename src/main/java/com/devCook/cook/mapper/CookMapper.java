package com.devCook.cook.mapper;

import com.devCook.cook.model.vo.CookVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CookMapper {
    int selectCookListCnt() throws Exception;

    List<CookVo> selectCookList() throws Exception;
}
