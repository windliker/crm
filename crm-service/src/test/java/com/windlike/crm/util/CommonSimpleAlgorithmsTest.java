package com.windlike.crm.util;

import java.util.Scanner;

import org.junit.Test;

public class CommonSimpleAlgorithmsTest {

    @Test
    public void testGcd() {
        System.out.println("进入测试欧几里得算法求最大公约数程序...");
        Scanner stdin = new Scanner(System.in);
        while(true) {
            System.out.print("继续？y/n:");
            if("n".equals(stdin.next())) {
                System.out.print("退出...");
                break;
            }
            System.out.print("请输入两个整数\r\n:");
            int m = stdin.nextInt();
            int n = stdin.nextInt();
            int gcd = CommonSimpleAlgorithms.getGcdEuclid(m, n);
            System.out.println(m + "和" + n + "的最大公约数是" + gcd);
        }
        stdin.close();
    }
    
    @Test
    public void testReverseNum() {
        System.out.println("entry the testing reverse number program...");
        Scanner stdin = new Scanner(System.in);
        while(true) {
            System.out.print("continue?(y/n):");
            if("n".equals(stdin.next())) {
                System.out.println("exit...");
                break;
            }
            System.out.print("please input a number:");
            int digital = stdin.nextInt();
            System.out.println(digital + "'s reverse digital is "
                            + CommonSimpleAlgorithms.reverseNum(digital));
        }
        stdin.close();
    }

}
