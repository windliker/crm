package com.windlike.crm.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class StreamApply {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            // nc -l 12345
            Socket socket = new Socket(InetAddress.getByName("localhost"), 12345);
            PrintWriter out = new PrintWriter(
                new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream())));
            BufferedReader in = new BufferedReader(
                new InputStreamReader(
                    socket.getInputStream()));
            
            String line;
            line = in.readLine();
            System.out.println(line);
            out.println("hello");
            out.flush();
            
            in.close();
            out.close();
            socket.close();
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
