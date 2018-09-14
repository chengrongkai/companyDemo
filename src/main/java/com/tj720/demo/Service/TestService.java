package com.tj720.demo.Service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public interface TestService {
    public String getStr();
    public List<HashMap<String,Object>> getTest();
}
