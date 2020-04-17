package com.zuipin.interview.chenzhongqiang.controller;

import com.zuipin.interview.chenzhongqiang.base.MyDate;
import com.zuipin.interview.chenzhongqiang.base.TimeProcess;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        List<MyDate> dateList = new ArrayList<MyDate>();

        MyDate myDate1 = new MyDate();
        myDate1.setStartTime(sdf.parse("08:00"));
        myDate1.setEndTime(sdf.parse("10:00"));

        MyDate myDate2 = new MyDate();
        myDate2.setStartTime(sdf.parse("09:00"));
        myDate2.setEndTime(sdf.parse("19:00"));

        dateList.add(myDate1);
        dateList.add(myDate2);
        TimeProcess timeProcess = new TimeProcess();

        String dateFormat = timeProcess.getDateFormat(dateList);

        System.out.println(dateFormat);
    }
 
}
