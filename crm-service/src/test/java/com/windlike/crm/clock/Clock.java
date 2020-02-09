package com.windlike.crm.clock;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Date;

public class Clock {

    private Display hour = new Display(24);
    private Display minute = new Display(60);
    private Display second = new Display(60);
    
    public void start() {
        // 设置成当前时间
        // debug
//        System.out.println(ZoneId.systemDefault());
        String now = new SimpleDateFormat("HH:mm:ss").format(new Date());
        // debug
//        System.out.println(now);
        hour.setValue(Integer.valueOf(now.substring(0, 2)));
        minute.setValue(Integer.valueOf(now.substring(3, 5)));
        second.setValue(Integer.valueOf(now.substring(6, 8)));
        
        // 开始计时
        while (true) {
            System.out.printf("%02d:%02d:%02d\n",
                            hour.getValue(), minute.getValue(), second.getValue());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            second.increase();
            if (second.getValue() == 0) {
                minute.increase();
            }
            if (minute.getValue() == 0) {
                hour.increase();
            }
        }
    }
    
    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.start();
    }

}
