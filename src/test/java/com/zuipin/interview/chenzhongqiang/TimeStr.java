package com.zuipin.interview.chenzhongqiang;

public class TimeStr {
    private String strTime;

    public TimeStr(String s) {

        strTime = s;
    }

    public Object first() {
        return strTime.split("~")[0];
    }
    public Object second() {
        return strTime.split("~")[1];
    }
}
