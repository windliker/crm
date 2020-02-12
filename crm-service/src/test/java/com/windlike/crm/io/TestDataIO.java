package com.windlike.crm.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataIO {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("hello");
        try {
            DataOutputStream out = new DataOutputStream(
                new BufferedOutputStream(
                    new FileOutputStream("a.dat")));
//            int i = 0xcafebabe;
            int i = 123456;
            out.writeInt(i);
            out.close();
            
            DataInputStream in = new DataInputStream(
                new BufferedInputStream(
                    new FileInputStream("a.dat")));
            int j = in.readInt();
            System.out.println(j);
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
            
    }

}
