package com.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Persion implements Cloneable, Serializable {
    int age;

    String name;

    Department department;

    @Override
    public Object clone() throws CloneNotSupportedException {
        Persion persion = (Persion)super.clone();
        Department clone = (Department) this.department.clone();
        persion.setDepartment(clone);
//        persion.department = (Department)persion.getDepartment().clone();
//        persion.setDepartment((Department)persion.getDepartment().clone());
        return persion;
    }
}
