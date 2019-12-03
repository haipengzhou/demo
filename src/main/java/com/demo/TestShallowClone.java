package com.demo;

import com.demo.entity.Student;

/**
 * @author wyc1856
 * @date 2019/12/2
 **/
public class TestShallowClone {

    public static void main(String[] args) throws Exception {
        Student student = new Student(20, "wyc1856", new int[]{59, 80, 70});
        System.out.println("=========clone之前========");
        System.out.println("student对象age的地址："+ System.identityHashCode(student.getAge()) + "值" + student.getAge());
        System.out.println("student对象name的地址："+ System.identityHashCode(student.getName()) + "值" + student.getName());
        System.out.println("student对象score的地址："+ System.identityHashCode(student.getScores()) + "值" + student.getScores()[0]);
        System.out.println("=========clone之前========");
        //通过Object.clone()方法进行clone
        Student clone = student.clone();

        System.out.println("=========clone之后========");
        System.out.println("student对象age的地址："+ System.identityHashCode(student.getAge()) + "值" + student.getAge());
        System.out.println("student对象name的地址："+ System.identityHashCode(student.getName()) + "值" + student.getName());
        System.out.println("student对象score的地址："+ System.identityHashCode(student.getScores()) + "值" + student.getScores()[0]);

        System.out.println("clone对象age的地址："+ System.identityHashCode(clone.getAge()) + "值" + clone.getAge());
        System.out.println("clone对象name的地址："+ System.identityHashCode(clone.getName()) + "值" + clone.getName());
        System.out.println("clone对象score的地址："+ System.identityHashCode(clone.getScores()) + "值" + clone.getScores()[0]);
        System.out.println("=========clone之后========");

        //修改克隆的对象属性
        clone.change();

        //打印原始student对象
        System.out.println("=========clone改变之后========");
        System.out.println("student对象age的地址："+ System.identityHashCode(student.getAge()) + "值" + student.getAge());
        System.out.println("student对象name的地址："+ System.identityHashCode(student.getName()) + "值" + student.getName());
        System.out.println("student对象score的地址："+ System.identityHashCode(student.getScores()) + "值" + student.getScores()[0]);

        System.out.println("clone对象age的地址："+ System.identityHashCode(clone.getAge()) + "值" + clone.getAge());
        System.out.println("clone对象name的地址："+ System.identityHashCode(clone.getName()) + "值" + clone.getName());
        System.out.println("clone对象score的地址："+ System.identityHashCode(clone.getScores()) + "值" + clone.getScores()[0]);
        System.out.println("=========clone改变之后========");

    }

}


