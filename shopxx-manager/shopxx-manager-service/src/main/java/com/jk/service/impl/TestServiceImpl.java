package com.jk.service.impl;

import com.jk.dao.TestMapper;
import com.jk.entity.TestEntity;
import com.jk.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<TestEntity> findAll() {
        return testMapper.findAll();
    }
}
