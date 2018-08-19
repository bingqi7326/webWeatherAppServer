package com.bingqi7326.webWeatherAppServer.test;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
/*
*description:
*@author:bingqi7326
*date:2018年7月29日
*time:下午11:59:14
*/

@Controller
@EnableAutoConfiguration
public class SampleController {
 
    @RequestMapping("/test")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
 
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}
