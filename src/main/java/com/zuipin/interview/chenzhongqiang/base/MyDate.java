package com.zuipin.interview.chenzhongqiang.base;

import cn.hutool.core.map.MapUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MyDate {
    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    private Date startTime;
    private Date endTime;


}


