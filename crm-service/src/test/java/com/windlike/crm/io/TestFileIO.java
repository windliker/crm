package com.windlike.crm.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileIO {

    public static void main(String[] args) {
        System.out.println("hello");
        byte[] buf = new byte[10];
        for (int i = 0; i < buf.length; i++) {
            buf[i] = (byte)i;
        }
            FileOutputStream out;
            try {
               // 工程所在根目录 D:\WorkSpaces\eclipse-workspace-1\crm\crm-service
                out = new FileOutputStream("hello.dat"); // hexdump 0xED
                out.write(buf);
                out.close();
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        
    }

}
