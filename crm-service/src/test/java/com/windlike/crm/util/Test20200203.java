package com.windlike.crm.util;

public class Test20200203 {

    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        // 复合赋值运算符,赋值优先级低
        a *= b + 2; // a = a * (b + 2), a=60
        System.out.println("a = " + a);
        
        // 循环上面添加标号,就可使break,continue作用于指定的循环,
        // 可参考CommonSimpleAlgorithms枚举拼凑法
    }

}
