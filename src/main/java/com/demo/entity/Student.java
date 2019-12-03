package com.demo.entity;

import java.util.Arrays;

/**
 * @author wyc1856
 * @date 2019/12/2
 **/
public class Student implements Cloneable {

    /**
     * 年龄
     */
    private Integer age;
    /**
     * 姓名
     */
    private String name;
    /**
     * 分数
     */
    private int[] scores;

    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student)super.clone();
    }

    @Override
    public String toString() {
        return String.format("age:%d, name:%s, scores:%s", age, name, Arrays.toString(scores));
    }

    public Student(Integer age, String name, int[] scores) {
        this.age = age;
        this.name = name;
        this.scores = scores;
    }

    public void change() {
        if (age != null) {
            age++;
        }
        if (scores.length > 0) {
            scores[0]++;
        }
        name = "changed";
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }
}
