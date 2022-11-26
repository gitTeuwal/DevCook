package com.devCook.cook.model.vo;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Data
public class RecipeVo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rId;
    private String rTitle;
    private String rFile;
    private Timestamp rCrtDt;
    private int good;
    private int bad;
    private int viewPt;
    private String rLink;
}
