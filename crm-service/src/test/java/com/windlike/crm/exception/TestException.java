package com.windlike.crm.exception;

class OpenException extends Throwable {
    
}

public class TestException {

    public static int open() {
        return -1;
    }

    public static void readFile() throws OpenException {// 陈述句
        if (TestException.open() == -1) {
            throw new OpenException();// 祈使句
        }
    }

    public static void main(String[] args) {
        try {
                TestException.readFile();
        } catch(OpenException e) {
            System.out.println(e.getMessage());
            System.out.println("------------");
            System.out.println(e.toString());
            System.out.println("------------");
            e.getStackTrace(); // stackTrace[2] stackTrace[1] stackTrace[0]
            System.out.println("------------");
        }
    }
}
