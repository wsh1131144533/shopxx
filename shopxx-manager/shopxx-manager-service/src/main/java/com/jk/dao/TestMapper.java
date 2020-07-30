package com.jk.dao;

import com.jk.entity.TestEntity;

import java.util.List;

public interface TestMapper {
    List<TestEntity> findAll();
}
