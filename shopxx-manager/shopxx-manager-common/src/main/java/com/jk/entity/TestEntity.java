package com.jk.entity;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
@ToString
public class TestEntity implements Serializable {

    private Integer id;

    private String name;


}
