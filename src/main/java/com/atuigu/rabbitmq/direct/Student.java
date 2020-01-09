package com.atuigu.rabbitmq.direct;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zhangjun
 * @create 2020-01-09 12:22
 */
public class Student  {

    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put(1,"zhang");
        map.put(2,"wang");
        map.put(3,"li");

        String str = "zhongguo";
        byte[] bytes = str.getBytes();

        for (int i = 0; i < bytes.length; i++) {
            System.out.println((char)bytes[i]);
        }
        System.out.println(bytes.toString());

    }
}
