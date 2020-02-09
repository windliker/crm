package com.windlike.crm.util;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test20200209 {

    public static void main(String[] args) {
        /********* 1 *********/
        // Java字符是Unicode字符集，单个字符可以是汉字
        char character = '刘';
        System.out.println(character); // 刘
        character++;
        System.out.println(character); // 则
        System.out.println('a'-'Z'-1); // 6: [\]^_`
        System.out.println('a'-'A'); // 32
        System.out.println('a');
        System.out.println((int)'a'); // 97
        character = '\u0041'; // 十六进制
        System.out.println(character); // A
        character = 65;
        System.out.println(character); // A
        character = 97;
        System.out.println(character); // a
        
        // 小写字母转大写
        char letter = 'b';
        char captialLetter = (char) (letter + 'A'-'a'); // uppercase,majuscule
        System.out.println(captialLetter);
        // 大写字母转小写
        char alphabet = 'Y';
        char lowercase = (char) (alphabet + 'a'-'A'); // minuscule
        System.out.println(lowercase);
        
        /*
         * 转义字符：
         * \b: 下次输入先回退一格，eclipse无效  "abc\bd" "abc\b"
         * \t: 下一表格位
         * \n: 换行 LF
         * \r: 回车CR
         * CRLF 回车换行起源于打字机的两个动作
         * \": "
         * \': '
         * \\: \
         */
        
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Character.isDigit('5'));
        System.out.println(Character.isLetterOrDigit('0'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.toLowerCase('Y'));
        
        System.out.println(Math.abs(-12));
        System.out.println(Math.round(7.618));
        System.out.println(Math.random());
        System.out.println(Math.pow(2,10));
        
        /********* 2 *********/
        System.out.println();
        // String也是管理者（本质指针），但比较特殊
        String a;
//        System.out.println(a); // 局部变量未初始化错误
        a = "hello"; // 推荐
        String b = new String("hello"); // 不推荐使用
        System.out.println(a == b); // false
        String c = new String("hello"); // 不推荐使用
        System.out.println(b == c); // false
        String d = new String(c); // 不推荐使用
        System.out.println(c == d); // false
        String e = "hello"; // 推荐
        System.out.println(a == e); // true
        
        System.out.println("2020-02-09".compareTo("2019-06-29") >= 0); // true
        
        System.out.println("2020-02-09".length());
        for (int i = 0; i<a.length(); i++) {
            System.out.println(a.charAt(i));
        }
        
        String str1 = "0123456789汉字123";
        System.out.println(str1.substring(1));
        System.out.println(str1.substring(10, 12)); // [)
        System.out.println(str1.substring(0, 10)); // [)
        System.out.println(str1.indexOf('字')); // 11
        System.out.println(str1.indexOf("123", str1.indexOf("123")+1)); // 12 第二次出现

        String str2 = str1.substring(str1.indexOf('汉'));
        System.out.println(str1);
        System.out.println(str2);
        
        String[] courses = {"Java", "Java Web", "Computer Network",
                        "Data Struct", "Algorithmns", "Spring", 
                        "Mybatis", "Git", "Linux", "Docker",
        };
        Set<String> learnedCourses = new HashSet<String>();
        int count = 0;
        for (int randomIndex; learnedCourses.size()<courses.length; count++) {
            randomIndex = (int) (Math.random()*courses.length);
            switch(courses[randomIndex]) {
            case "Java":
            case "Java Web":
            case "Computer Network":
            case "Data Struct":
            case "Algorithmns":
            case "Spring":
            case "Mybatis":
            case "Git":
            case "Linux":
            case "Docker":
                System.out.println(courses[randomIndex]);
                learnedCourses.add(courses[randomIndex]);
                break;
            default:
                System.out.println("Error");
                break;
            }
        }
        System.out.println(learnedCourses);
        System.out.println(count);

        /********* 3 *********/
        System.out.println();
        Scanner stdin = new Scanner(System.in);
        String word = stdin.next(); // 读入一个单词，单词的标志是空白符包括空格、tab、换行、回车
        System.out.println(word);
        String str = stdin.nextLine(); // 读入一行 ，行的标志是换行、回车
        System.out.println(str);
        stdin.close();
    }

}
