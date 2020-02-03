package com.windlike.crm.util;

public class Test {

    public static void main(String[] args) {
//1.    浮点数运算注意精度问题
        System.out.println(1.2-1.1); // 0.09999999999999987
        
//2.         单目负号
        int a = 8;
        int b = 9;
        System.out.println(a *- b);
        
//3. 基本数据类型类型== & 浮点数运算精度
        System.out.println(9 == 9.0); // identical 完全相同的
        double x = 1.0;
        double y = 0.1 * 10;
        double z = 0.1 + 0.1 + 0.1 + 0.1 + 0.1
                        + 0.1 + 0.1 + 0.1 + 0.1 + 0.1; // 0.9999999999999999
        System.out.println(x + " " + y + " " + z);
        System.out.println(x == y);
        System.out.println(x == z);
//4. 浮点数比较         浮点数比较一般只要在误差范围内即可
        System.out.println(Math.abs(x-z) < 2e-6);
        System.out.println(2e-6 == 0.000002);
        
//5. 随机1-99 double[0,1)->int[1,99]
        final int totalNum = 99;
        final int offest = 1;
        int randomNum = 0;
        do {
            randomNum = (int) (Math.random() * totalNum + offest);
            System.out.println(randomNum);
        }while(randomNum != 100);

    }
}
