package com.devCook.cook.controller;


import com.devCook.cook.model.vo.CookVo;
import com.devCook.cook.service.CookService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class CookController {

    private final CookService cookService;

    @RequestMapping("/list")
    public ModelAndView cookList(HttpServletRequest req, CookVo cookVo) throws Exception{
        ModelAndView mv = new ModelAndView();

        int totalCnt = this.cookService.selectCookListCnt(req, cookVo);

        List<CookVo> list = null;
        if(totalCnt > 0) {
            list = this.cookService.selectCookList(req, cookVo);
        }

        mv.addObject("totalCnt", totalCnt);
        mv.addObject("list", list);
        mv.addObject("cookVo", cookVo);

        return mv;
    }
}
