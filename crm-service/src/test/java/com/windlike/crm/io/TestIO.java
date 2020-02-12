package com.windlike.crm.io;

import java.io.IOException;

public class TestIO {

    public static void main(String[] args) {
        System.out.println("hello");
        byte[] buffer = new byte[20];
        try {
            int len = System.in.read(buffer); // 123一二三abc 包括\r\n两个字节
            String s = new String(buffer, 0, len);
            System.out.println("读到" + len + "个字节"); // 3+3*3+3+2，一个汉字三个字节UTF-8
            System.out.println(s);
            System.out.println("s的长度是" + s.length()); //1,2,3,一,二,三,a,b,c,\r,\n 11个字符

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
