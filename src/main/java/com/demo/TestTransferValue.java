package com.demo;

import com.demo.entity.Dog;

public class TestTransferValue {
    public void changeValue1(int age){
        age = 30;
    }

    public void changeValue2(Dog dog){
        dog.setName("changeValue2");
    }

    public void changeValue3(String string){
        string = "changeValue3";
    }

    public static void main(String[] args) {
        TestTransferValue testTransferValue = new TestTransferValue();
        int age = 20;
        testTransferValue.changeValue1(30);
        System.out.println("age:" + age);

        Dog dog = new Dog("abc");
        testTransferValue.changeValue2(dog);
        System.out.println("persion name :" + dog.getName());

        String str = "abc";
        System.identityHashCode(str);
        testTransferValue.changeValue3(str);
        System.out.println("str:" + str);
    }
}
