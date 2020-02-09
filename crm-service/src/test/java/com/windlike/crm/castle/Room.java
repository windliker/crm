package com.windlike.crm.castle;

import java.util.HashMap;

public class Room {
    // 成员变量私有化
    private String description;
    // 高扩展性
    private HashMap<String, Room> exits = new HashMap<String, Room>();

    public Room(String description) 
    {
        this.description = description;
    }

    // 高可扩展性
    public void setExit(String dir, Room room) {
        exits.put(dir, room);
    }

    @Override
    public String toString()
    {
        return description;
    }
    
    public String getExitDesc() {
        StringBuffer sb = new StringBuffer();
        
        for (String direction : exits.keySet()) {
            sb.append(direction);
            sb.append(' ');
        }
        
        return sb.toString();
    }
    
    // 维持这个接口
    public Room getExit(String direction) {
        
        return exits.get(direction);
    }
}
