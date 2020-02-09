package com.windlike.crm.util;

import java.util.HashMap;

public class TestContainer {

    public static void testHashMap() {
        HashMap<Integer, String> coins = new HashMap<Integer, String>();
        coins.put(1, "penny");
        coins.put(5, "nickel");
        coins.put(10, "dime");
        coins.put(25, "quarter");
        coins.put(50, "half-dollar");
        System.out.println(coins);
        for (Integer i : coins.keySet()) {
            System.out.println(coins.get(i));
        }
        System.out.println(coins.keySet().size());
        System.out.println(coins.containsKey(5));
        System.out.println(coins.containsValue("half-dollar"));
    }
    
    public static void main(String[] args) {
        
        TestContainer.testHashMap();
    }

}
