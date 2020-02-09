package com.windlike.crm.mediabase;

public class CD extends Item {

    private String artist;
    private int numOfTracks;
    
    public CD(String title, String artist, int numOfTracks, int playingTime,
                    String comment) {
        super(title, playingTime, false, comment);
        this.artist = artist;
        this.numOfTracks = numOfTracks;
    }
    
    @Override
    public void print() {
        System.out.println("CD:" + super.getTitle() + ":" + artist);
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getNumOfTracks() {
        return numOfTracks;
    }

    public void setNumOfTracks(int numOfTracks) {
        this.numOfTracks = numOfTracks;
    }

    @Override
    public String toString() {
        return "CD [artist=" + artist + ", numOfTracks=" + numOfTracks
                        + ", toString()=" + super.toString() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        CD cd = null;
        if (obj instanceof CD) {
            cd = (CD)obj;
            result =  this.artist.equals(cd.artist);
        }
        return result;
    }
}
