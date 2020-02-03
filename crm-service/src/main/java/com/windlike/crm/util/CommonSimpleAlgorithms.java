package com.windlike.crm.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonSimpleAlgorithms {

    private CommonSimpleAlgorithms() {}
    
    /**
     * Euclid algorithms get Greatest Common Divisor
     * 1、若a可以整除b，则最大公约数是b
     * 2、如果1不成立，最大公约数便是b与a%b的最大公约数
     * 欧几里德算法是计算两个数最大公约数的传统算法，无论从理论还是从实际效率上都是很好的。
     * 但是却有一个致命的缺陷，这个缺陷在素数比较小的时候一般是感觉不到的，只有在大素数时才会显现出来。
     * 
     * Least Common Multiple最小公倍数*最大公约数=m*n
     * @param m
     * @param n
     * @return
     * @author windlike 2020-2-2 16:47:52
     */
    public static int getGcdEuclid(int m, int n) {
        // 使m>=n
        if(m < n) {
            int tmp = m;
            m = n;
            n = tmp;
        }
        while (n != 0) {// while n > 0?
            int remainder = m % n;
            m = n;
            n = remainder;
        }

        return m;
    }
    
    /**
     * 对于大素数Stein算法将更有优势
     * @param a
     * @param b
     * @return
     */
    public static int getGcdStein(int a, int b) {
        return 0;
    }
    
    /**
     * 输入数字->输出逆序数字
     * @param number
     * @return
     */
    public static int reverseNum(int number) {
        int reverse = 0;
        do {// 1234 -> 4321
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }while(number != 0);
        return reverse;
    }
    
    /**
     * 判断素数（质数）
     * 在大于1的自然数中，除了1和它本身以外不再有其他因数的自然数。
     * @param number
     * @return
     */
    public static boolean isPrimeNum(int number) {
        boolean isPrimeNumber = true;
        if(number > 1) {
            // non-two even number is not primer number
            if (number != 2 && number % 2 == 0) {
                isPrimeNumber = false;
            }
            // owns non-one odd factor is not a primer number
            for (int i = 3; i <= Math.sqrt(number); i+=2) {
                if (number % i == 0) {
//                    System.out.println(number + "/" + i + "=" + number/i);
                    isPrimeNumber = false;
                    break;
                }
            }
        }
        else {
            isPrimeNumber = false;
        }
        return isPrimeNumber;
    }
    
    /**
     * 1元，5元，10元，20元拼凑amount元
     * @param amount
     * @return
     */
    public static List<Map<String, Integer>> pieceTogetherEnumeration(int amount) {
        List<Map<String, Integer>> results = new ArrayList<Map<String, Integer>>();
//        OUT:
        for(int twentyNum = 0; twentyNum <= amount / 20; twentyNum++) { // 20元的数量
            for(int tenNum = 0; tenNum <= amount / 10; tenNum++) { // 10元的数量
                for(int fiveNum = 0; fiveNum <= amount / 5; fiveNum++) { // 5元的数量
                    for(int oneNum = 0; oneNum <= amount; oneNum++) { // 1元的数量
                        if(oneNum + fiveNum * 5 + tenNum * 10 + twentyNum * 20
                                        == amount) {
                            Map<String, Integer> result
                                = new HashMap<String, Integer>();
                            result.put("oneNum", oneNum);
                            result.put("fiveNum", fiveNum);
                            result.put("tenNum", tenNum);
                            result.put("twentyNum", twentyNum);
                            results.add(result);
//                            break OUT;
                        }
                    }
                }
            }
        }
        return results;
    }
}
