package com.devCook.cook.controller;

import com.devCook.cook.model.vo.RecipeVo;
import com.devCook.cook.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/recipe")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;


    @GetMapping("/write.do")
    public String recipeAdd(RecipeVo recipeVo){
        recipeService.insert(recipeVo);
        return "write";
    }

}
