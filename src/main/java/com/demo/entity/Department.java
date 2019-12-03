package com.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Department implements Cloneable, Serializable {
    int deptNo;

    String deptName;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
