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

    @Test
    public void testIsPrimeNum() {
        System.out.println("entry the testing is prime number program...");
        int boundary = 50000;
        int count = 0;
        for (int i = -boundary; i <= boundary; i++) {
            if(CommonSimpleAlgorithms.isPrimeNum(i)) {
                count++;
                System.out.print(i + " ");
                if(count % 10 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println("\r\nThere are " + count + " prime numbers within "
                        + boundary);
        Scanner stdin = new Scanner(System.in);
        while(true) {
            System.out.print("continue?(y/n):");
            if("n".equals(stdin.next())) {
                System.out.println("exit...");
                break;
            }
            System.out.print("please input a number:");
            int digital = stdin.nextInt();
            System.out.println(digital + " is a prime number? "
                            + CommonSimpleAlgorithms.isPrimeNum(digital));
        }
        stdin.close();
    }
    
    @Test
    public void testIsPrimeNumV2() {
        System.out.println("entry the testing is prime number V2 program...");
        int boundary = 50000;
        int count = 0;
        for (int i = -boundary; i <= boundary; i++) {
            if(CommonSimpleAlgorithms.isPrimeNumV2(i)) {
                count++;
                System.out.print(i + " ");
                if(count % 10 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println("\r\nThere are " + count + " prime numbers within "
                        + boundary);
        Scanner stdin = new Scanner(System.in);
        while(true) {
            System.out.print("continue?(y/n):");
            if("n".equals(stdin.next())) {
                System.out.println("exit...");
                break;
            }
            System.out.print("please input a number:");
            int digital = stdin.nextInt();
            System.out.println(digital + " is a prime number? "
                            + CommonSimpleAlgorithms.isPrimeNumV2(digital));
        }
        stdin.close();
    }
    
    @Test
    public void testGetPrimeNumsV2() {
        System.out.println("entry the testing get prime numbers V2 program...");
        Scanner stdin = new Scanner(System.in);
        while(true) {
            System.out.print("continue?[y/n]:");
            if("n".equals(stdin.next())) {
                System.out.println("exit...");
                break;
            }
            System.out.print("please input the size:");
            int size = stdin.nextInt();
            int[] primeNums = CommonSimpleAlgorithms.getPrimeNumsV2(size);
            for (int i = 0; i < primeNums.length; i++) {
                System.out.print(primeNums[i] + " ");
                if ((i + 1) % 10 == 0) {
                    System.out.println();
                }
            }
        }
        stdin.close();
    }
    
    @Test
    public void testPieceTogetherEnumeration() {
        System.out.println("entry the testing piece Together Enumeration program...");
        Scanner stdin = new Scanner(System.in);
        while(true) {
            System.out.print("continue?(y/n):");
            if("n".equals(stdin.next())) {
                System.out.println("exit...");
                break;
            }
            System.out.print("please input a number:");
            int digital = stdin.nextInt();
            System.out.println(CommonSimpleAlgorithms
                            .pieceTogetherEnumeration(digital));
        }
        stdin.close();
    }
}
