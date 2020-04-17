package com.zuipin.interview.chenzhongqiang.controller;

import com.zuipin.interview.chenzhongqiang.base.ResponseData;
import com.zuipin.interview.chenzhongqiang.base.TimeProcess;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
public class SumController {



    @GetMapping("/calcuate")
    public ResponseData calcuate(@RequestParam String tp1, @RequestParam String tp2) {



        TimeProcess timeProcess = new TimeProcess(tp1, tp2);

//        System.out.println(list.toString() + "," + list.toString());
        ResponseData responseData = new ResponseData();
//        responseData.setError_code(200);
//        responseData.setData(list.toString());

        return responseData;

    }
}
