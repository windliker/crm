package com.windlike.crm.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class TestTextIO {

    public static void main(String[] args) {
        System.out.println("hello");
        try {
            PrintWriter out = new PrintWriter(
                new BufferedWriter(
                    new OutputStreamWriter(
                        new FileOutputStream("a.txt"))));
            int i = 123456;
            out.println(i);
            out.close();
            
            BufferedReader in = new BufferedReader(
                new InputStreamReader(// 读取的文件使用UTF-8编码写入的，请用UTF-8解码读取
                    new FileInputStream("D:\\WorkSpaces\\eclipse-workspace-1\\crm\\crm-service\\UTF-8.txt"), "utf8"));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
