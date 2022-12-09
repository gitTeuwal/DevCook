package com.devCook.cook.service;

import com.devCook.cook.mapper.CookMapper;
import com.devCook.cook.model.vo.CookVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class CookServiceImpl implements CookService {

    @Autowired
    private CookMapper cookMapper;

    public int selectCookListCnt(HttpServletRequest req, CookVo cookVo) throws Exception{
        return cookMapper.selectCookListCnt();
    }

    @Override
    public List<CookVo> selectCookList(HttpServletRequest req, CookVo cookVo) throws Exception {
        return cookMapper.selectCookList();
    }
}
