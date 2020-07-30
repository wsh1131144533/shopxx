package com.jk.interfaces;

import com.jk.entity.TestEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public interface TestApi {
    @RequestMapping(value = "/findAll")
    List<TestEntity> findAll();
}
