package com.windlike.crm.courseTable;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class CourseTable {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JTable table = new JTable(new CourseTableData());
        JScrollPane panel = new JScrollPane(table);
        frame.add(panel);
        frame.pack(); // frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
