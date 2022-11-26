package com.devCook.cook.mapper;

import com.devCook.cook.model.vo.RecipeVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeMapper{

    List<RecipeVo> selectAll();
    RecipeVo selectOne(Long rID);

    void insertOne(RecipeVo rVo);
    void updateOne(RecipeVo rVo);

}
