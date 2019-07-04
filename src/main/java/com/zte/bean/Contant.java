package com.zte.bean;

import java.util.ArrayList;
import java.util.List;

public class Contant {
    //城市
    public static final String CITY_ONE = "北京";
    public static final String CITY_TWO = "上海";
    public static final String CITY_THREE = "南京";
    public static List<String> getCitys(){
        List<String> list = new ArrayList<String>();
        list.add(CITY_ONE);
        list.add(CITY_TWO);
        list.add(CITY_THREE);
        return list;
    }


    //类别
    public static final String CATEGORY_ZZ="政治";
    public static final String CATEGORY_JJ="经济";
    public static final String CATEGORY_YL="娱乐";
    public static final String CATEGORY_TY="体育";
    public static List<String> getCategory(){
        List<String> list = new ArrayList<String>();
        list.add(CATEGORY_ZZ);
        list.add(CATEGORY_JJ);
        list.add(CATEGORY_YL);
        list.add(CATEGORY_TY);
        return list;
    }
}
