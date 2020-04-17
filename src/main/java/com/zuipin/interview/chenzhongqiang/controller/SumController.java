package com.zuipin.interview.chenzhongqiang.controller;

import com.zuipin.interview.chenzhongqiang.base.ResponseData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class SumController {


    @GetMapping("/calcuate")
    public ResponseData calcuate(@RequestParam String tp1, @RequestParam String tp2) {


        String[] split = tp1.split("~");
        String[] split2 = tp2.split("~");
        List<String> list = Arrays.asList(split[0], split[1]);
        List<String> list2 = Arrays.asList(split2[0], split2[1]);


        System.out.println(list.toString() + "," + list2.toString());
        ResponseData responseData = new ResponseData();
        responseData.setError_code(200);
        responseData.setData(null);

        return responseData;

    }
}
