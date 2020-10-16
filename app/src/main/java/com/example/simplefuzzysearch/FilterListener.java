package com.example.simplefuzzysearch;

import java.util.List;

/**
 * Created by fan.zhengxi on 2020/6/2
 * Describe:
 */
public interface FilterListener {
    void getFilterData(List<String> list);// 获取过滤后的数据
}
