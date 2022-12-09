package com.devCook.cook.service;

import com.devCook.cook.model.vo.CookVo;
import com.devCook.cook.mapper.CookMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public interface CookService {
    public int selectCookListCnt(HttpServletRequest req, CookVo cookVo) throws Exception;

    public List<CookVo> selectCookList(HttpServletRequest req, CookVo cookVo) throws Exception;
}
