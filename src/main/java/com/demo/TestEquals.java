package com.demo;

import java.util.HashSet;
import java.util.Set;

public class TestEquals {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        Set<String> stringSet1 = new HashSet<String>();
        stringSet1.add(str1);
        stringSet1.add(str2);
        System.out.println(stringSet1.size());

        System.out.println("===========================");

//        Persion persion01 = new Persion("abc");
//        Persion persion02 = new Persion("abc");
//        System.out.println(persion01 == persion02);
//        System.out.println(persion01.equals(persion02));
//        Set<Persion> stringSet2 = new HashSet<Persion>();
//        stringSet2.add(persion01);
//        stringSet2.add(persion02);
//        System.out.println(stringSet2.size());

    }
}
