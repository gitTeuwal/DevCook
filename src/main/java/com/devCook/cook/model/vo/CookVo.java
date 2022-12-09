package com.devCook.cook.model.vo;

import lombok.Data;

@Data
public class CookVo {
    private Long rId;
    private String rTitle;
    private String rFile;
    private Data rCrt;
    private int rView;
    private int rGood;
    private int rBad;
    private String rOrder;
    private String rLink;
}
