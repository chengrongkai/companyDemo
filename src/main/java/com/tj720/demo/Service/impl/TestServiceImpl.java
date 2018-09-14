package com.tj720.demo.Service.impl;

import com.tj720.demo.Dao.DemoMapper;
import com.tj720.demo.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class TestServiceImpl implements TestService{
    @Autowired
    DemoMapper demoMapper;
    @Override
    public String getStr() {
        return "hello,myName";
    }

    public List<HashMap<String,Object>> getTest() {
        return demoMapper.getTest();
    }
}
