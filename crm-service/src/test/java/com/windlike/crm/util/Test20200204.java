package com.windlike.crm.util;

public class Test20200204 {

    public static void main(String[] args) {
        // 逻辑运算符优先级: !>&&>||
        int a = 0;
        int b = 1;
        int c = 2;
        if(!(a>b) && b>c || c>a) {
            /* !false && false || true
             * true && false || true
             * false || true
             * true
             */
            // 原样输出
            System.out.println(Math.E);
            // 格式化输出
            System.out.printf("%.2f", Math.E);
            System.out.println();
            
            // 正负交替 sign = -sign
            int n = 100;
            int sign = 1;
            double result = 0.0;
            for (int i = 1; i < n; i++, sign = -sign) {
                result += sign*1.0/i;
            }
            System.out.println(result);
        }
    }


}
