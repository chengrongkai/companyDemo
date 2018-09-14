package com.tj720.demo.Dao;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
@Component
public interface DemoMapper {
    List<HashMap<String,Object>> getTest();
}
