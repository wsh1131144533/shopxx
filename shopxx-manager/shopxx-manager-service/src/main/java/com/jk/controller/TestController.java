package com.jk.controller;

import com.jk.entity.TestEntity;
import com.jk.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/findAll")
    public List<TestEntity> findAll(){

        return testService.findAll();
    }

}
