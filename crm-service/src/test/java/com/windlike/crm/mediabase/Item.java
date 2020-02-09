package com.windlike.crm.mediabase;

public class Item {

    private String title;
    private int playingTime;
    private boolean gotIt;
    private String comment;
    
    public Item(String title, int playingTime, boolean gotIt, String comment) {
        super();
        this.title = title;
        this.playingTime = playingTime;
        this.gotIt = gotIt;
        this.comment = comment;
    }

    public void print() {
        System.out.println("Item:" + title);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPlayingTime() {
        return playingTime;
    }

    public void setPlayingTime(int playingTime) {
        this.playingTime = playingTime;
    }

    public boolean isGotIt() {
        return gotIt;
    }

    public void setGotIt(boolean gotIt) {
        this.gotIt = gotIt;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Item [title=" + title + ", playingTime=" + playingTime
                        + ", gotIt=" + gotIt + ", comment=" + comment + "]";
    }
}
