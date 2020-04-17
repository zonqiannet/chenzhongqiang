package com.zuipin.interview.chenzhongqiang.base;

import java.util.ArrayList;
import java.util.List;

public class Sunjs {
     
    public static void main(String[] args) {
        List<String> list1 =new ArrayList<String>();
        list1.add("08:00");
        list1.add("10:00");
        List<String> list2 =new ArrayList<String>();
        list2.add("05:00");
        list2.add("18:00");
        /** 并集 **/
//      list1.addAll(list2);
//      System.out.println(list1);//运行结果：[A, B, B, C]
         
        /** 无重复并集 **/
//      list2.removeAll(list1);
//      list1.addAll(list2);
//      System.out.println(list1);//运行结果：[A, B, C]
         
        /** 交集 **/
      list1.retainAll(list2);
      System.out.println(list1);//运行结果：[B]
         
        /** 差集 **/
//        list1.removeAll(list2);
//        System.out.println(list1);//运行结果：[A]
    }
}