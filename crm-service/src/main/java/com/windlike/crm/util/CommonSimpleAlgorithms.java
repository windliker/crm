package com.windlike.crm.util;

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
}
