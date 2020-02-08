package com.windlike.crm.util;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test20200208 {

    public static void main(String[] args) {
        /***** 1 ****/
        List<String> stooges = Arrays.asList("Larry", "Moe", "Curly");
        System.out.println(stooges.getClass());
        
        /***** 2 ****/
        int[][] a = new int[3][5];
        // 二维数组的第一个元素int[] hello = a[0]是一个一维数组：
        // hello[0],hello[1],...,hello[4]
        // 遍历二维数组a
        for (int i = 0; i < a.length; i++) {
            // 遍历数组a的第i个元素，即遍历一维数组
            for (int j=0; j<a[i].length; j++) {
                System.out.print("a[" + i + "][" + j + "]=" + a[i][j] + " ");
            }
            // 遍历完二维数组的一个元素就换行
            System.out.println();
        }
        
        int[][] b = {
                        {1,2,3,4},
                        {5,6,},
                        {},
                   }; // 多了逗号不算错,这是为了方便新增元素
        System.out.println("二维数组共有元素个数：" + b.length); // 3
        System.out.println(b[2] == null); // false
        
        /***** 3 tic-tac-toe 井字棋 ****/
        System.out.println("*********tic-tac-toe********");
        // 不要在while循环内定义变量！！！！
        Scanner stdin = new Scanner(System.in);
        final int SIZE = 3;
        int[][] board = new int[SIZE][SIZE];
        int numOfORow = 0;
        int numOfXRow = 0;
        int numOfOCol = 0;
        int numOfXCol = 0;
        int numOfODiagonal = 0;
        int numOfXDiagonal = 0;
        int numOfOBackDiag = 0;
        int numOfXBackDiag = 0;
        boolean gotResult = false;
        String winner = null;
        
        while (true) {
            System.out.print("continue?[y/n]: ");
            if ("n".equals(stdin.next())) {
                System.out.println("exit...");
                break;
            }else {
                // 开始新一轮游戏，变量重置
                numOfORow = 0;
                numOfXRow = 0;
                numOfOCol = 0;
                numOfXCol = 0;
                numOfODiagonal = 0;
                numOfXDiagonal = 0;
                numOfOBackDiag = 0;
                numOfXBackDiag = 0;
                gotResult = false;
                winner = null;
                System.out.println("开始新一轮游戏");
            }
            
            // 读入矩阵
            for (int i = 0; i < board.length; i++) {
                System.out.print("input line " + (i+1) + ": ");
                for (int j = 0; j < board[i].length; j++) {
                    board[i][j] = stdin.nextInt();
                }
            }
            
            // 遍历矩阵
            for (int i = 0; i < board.length; i++) {
                // 判断对角线
                if (board[i][SIZE-1-i] == 0) {//board[2][0],board[1][1],board[0][2]
                    numOfODiagonal++;
                    // debug
//                    System.out.println("对角线O数加1,对角线O数=" + numOfODiagonal);
                }
                else if (board[i][SIZE-1-i] == 1) {
                    numOfXDiagonal++;
                    // debug
//                    System.out.println("对角线X数加1,对角线X数=" + numOfXDiagonal);
                }
                
                // 判断反对角线
                if (board[i][i] == 0) {//board[0][0],board[1][1],board[2][2]
                    numOfOBackDiag++;
                    // debug
//                    System.out.println("反对角线O数加1,反对角线O数=" + numOfOBackDiag);
                }
                else if(board[i][i] == 1) {
                    numOfXBackDiag++;
                    // debug
//                    System.out.println("反对角线X数加1,反对角线X数=" + numOfXBackDiag);
                }
                for (int j = 0; j < board[i].length; j++) {
                    // 判断行
                    if (board[i][j] == 0) {//board[0][0],board[0][1],board[0][2]
                        numOfORow++;
                        // debug
//                        System.out.println("行" + i + "O数加1,行O数=" + numOfORow);
                    }
                    else if (board[i][j] == 1) {
                        numOfXRow++;
                        // debug
//                        System.out.println("行" + i + "X数加1,行X数=" + numOfXRow);
                    }
                    
                    // 判断列
                    if (board[j][i] == 0) {//board[0][0],board[1][0],board[2][0]
                        numOfOCol++;
                        // debug
//                        System.out.println("列" + j + "O数加1,列O数=" + numOfOCol);
                    }
                    else if (board[j][i] == 1) {
                        numOfXCol++;
                        // debug
//                        System.out.println("列" + j + "X数加1,列X数=" + numOfXCol);
                    }
                }
                
                // 判断结果
                if (numOfORow == SIZE
                                || numOfOCol == SIZE
                                || numOfODiagonal == SIZE
                                || numOfOBackDiag == SIZE) {
                    gotResult = true;
                    winner = "O";
                    break;
                }
                else if (numOfXRow == SIZE
                                || numOfXCol == SIZE
                                || numOfXDiagonal == SIZE
                                || numOfXBackDiag == SIZE) {
                    gotResult = true;
                    winner = "X";
                    break;
                }
                else {
                    // 准备判断下一行
                    numOfORow = 0;
                    numOfXRow = 0;
                    // 准备判断下一列
                    numOfOCol = 0;
                    numOfXCol = 0;
                    // debug
//                    System.out.println("行列计数置零");
                }
            }
            // 输出
            if (gotResult) {
                System.out.println("Winner is " + winner);
            }else {
                System.out.println("Winner is no one");
            }
        }
        stdin.close();

    }

}
