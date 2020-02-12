package com.windlike.crm.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// 对象串行化 方便Java从流中读取对象
class Student implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -7422824549080668980L;
    private String name;
    private int age;
    private int grade;
    
    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", grade=" + grade
                        + "]";
    }

}

public class ObjSerializiation {

    public static void main(String[] args) {
        Student s1 = new Student("John", 18, 5);
        System.out.println(s1);
            ObjectOutputStream out;
            try {
                out = new ObjectOutputStream(
                    new FileOutputStream("obj.dat"));
                out.writeObject(s1);
                out.close();
                
                ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream("obj.dat"));
                Student s2 = (Student) in.readObject();
                in.close();
                System.out.println(s2);
                System.out.println(s1 == s2); // false
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

    }

}
