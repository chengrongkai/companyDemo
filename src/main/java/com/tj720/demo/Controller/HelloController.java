package com.tj720.demo.Controller;

import com.tj720.demo.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    TestService testService;
    @RequestMapping("/sayHello")
    public String sayHello(){
        return testService.getStr();
    }
    @RequestMapping("/getTest")
    public List<HashMap<String,Object>> getTest(){
        return testService.getTest();
    }
}
