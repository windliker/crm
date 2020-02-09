package com.windlike.crm.clock;

public class Display {

    private int value;
    private int limit;
    
    Display(int limit){
        this.limit = limit;
        this.value = 0;
    }
    
    public void increase() {
        this.value++;
        if (value == limit) {
            this.value = 0;
        }
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
}
