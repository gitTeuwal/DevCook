package com.devCook.cook.service;

import com.devCook.cook.mapper.RecipeMapper;
import com.devCook.cook.model.vo.RecipeVo;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeService {

    @Autowired
    private RecipeMapper recipeMapper;

    public void insert(RecipeVo rVo){
        recipeMapper.insertOne(rVo);
    }
}
