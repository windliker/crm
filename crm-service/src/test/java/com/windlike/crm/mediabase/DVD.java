package com.windlike.crm.mediabase;

public class DVD extends Item{

    private String director;

    public DVD(String title, String director, int playingTime, String comment) {
        super(title, playingTime, false, comment);
        this.director = director;
    }
    
    @Override
    public void print() {
        System.out.println("DVD:" + super.getTitle() + ":" + director);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
