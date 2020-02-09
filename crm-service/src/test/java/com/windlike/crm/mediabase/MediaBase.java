package com.windlike.crm.mediabase;

import java.util.ArrayList;
import java.util.List;

public class MediaBase {

    private List<Item> itemList = new ArrayList<Item>();
    
    public void add(Item item) {
        itemList.add(item);
    }
    
    public void list() {
        for (Item item : itemList) {
            item.print();
        }
    }
    
    public static void main(String[] args) {
        MediaBase mediaBase = new MediaBase();
        mediaBase.add(new CD("abc", "abc", 4, 60, "..."));
        mediaBase.add(new CD("def", "def", 4, 60, "..."));
        mediaBase.add(new DVD("xxx", "aaa", 120, "..."));
        mediaBase.list();
    }

}
