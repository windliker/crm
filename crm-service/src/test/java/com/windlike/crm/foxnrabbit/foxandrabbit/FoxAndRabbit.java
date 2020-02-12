package com.windlike.crm.foxnrabbit.foxandrabbit;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.windlike.crm.foxnrabbit.animal.Animal;
import com.windlike.crm.foxnrabbit.animal.Fox;
import com.windlike.crm.foxnrabbit.animal.Rabbit;
import com.windlike.crm.foxnrabbit.cell.Cell;
import com.windlike.crm.foxnrabbit.field.Field;
import com.windlike.crm.foxnrabbit.field.Location;
import com.windlike.crm.foxnrabbit.field.View;

// 外部类
//class StepListener implements ActionListener {
//
//    private FoxAndRabbit aa;
//    public StepListener(FoxAndRabbit a) {
//        aa = a;
//    }
//    
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        aa.step();
//        aa.repaint();
//  }
//  
//}

public class FoxAndRabbit {

    private Field theField;
    private View theView;
    private JFrame frame;

//    // 配合外部类
//    public void repaint() {
//        frame.repaint();
//    }

    // 成员（内部）类
//    private class StepListener implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            step();
//            frame.repaint();
//        }
//        
//    }

    public FoxAndRabbit(int size) {
        theField = new Field(size, size);
        
        for (int row = 0; row < theField.getHeight(); row++) {
            for (int col = 0; col < theField.getWidth(); col++) {
                double probability = Math.random();
                if (probability < 0.05) {
                    theField.place(row, col, new Fox());
                }
                else if (probability < 0.15) {
                    theField.place(row, col, new Rabbit());
                }
            }
        }
        // 容器、部件（组件）
        theView = new View(theField);
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("Fox and Rabbit");
        frame.add(theView, BorderLayout.CENTER);
        JButton btnStep = new JButton("单步执行");
        // 传统习惯方式
//      btnStep.addActionListener(new StepListener());

        // 监听器  运行时 swing消息机制 注册 反转控制/注入反转 思想先进
        // 匿名（内部）类
        btnStep.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // debug
                System.out.println("hello");
                step();
                frame.repaint();
            }
        });
        frame.add(btnStep, BorderLayout.NORTH);
        frame.pack();
        frame.setVisible(true);
    }
    
    public void start(int steps) {
        for (int i = 0; i < steps; i++) {
            this.step();
            theView.repaint();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void step() {
        for (int row = 0; row < theField.getHeight(); row++) {
            for (int col = 0; col < theField.getWidth(); col++) {
                Cell cell = theField.get(row, col);
                if (cell != null) {
                    Animal animal = (Animal)cell;
                    animal.grow();
                    // 活着
                    if (animal.isAlive()) {
                        // move
                        Location loc = animal.move(theField.getFreeNeighbour(row, col));
                        if (loc != null) {
                            theField.move(row, col, loc);
                        }
                        // eat
                        Cell[] neighbour = theField.getNeighbour(row, col);
                        List<Animal> rabbits = new ArrayList<Animal>();
                        for (Cell ani : neighbour) {
                            if (ani instanceof Rabbit) {
                                rabbits.add((Rabbit)ani);
                            }
                        }
                        if (!rabbits.isEmpty()) {
                            Animal fed = animal.feed(rabbits);
                            if (fed != null) {
                                theField.remove((Cell)fed);
                            }
                        }
                        // breed
                        Animal baby = animal.breed();
                        if (baby != null) {
                            theField.placeRandomAdj(row, col, (Cell)baby);
                        }
                    }
                    // 死亡
                    else {
                        theField.remove(row, col);
                    }
                }
            }
        }
        
    }
    
    public static void main(String[] args) {
        FoxAndRabbit foxAndRabbit = new FoxAndRabbit(50);
        foxAndRabbit.start(100);
    }
    
}
