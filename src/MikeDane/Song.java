package MikeDane;

public class Song {
    public String title;
    private String artist;
    private int length;

    public Song(String title, String artist, int length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }


    public void playSong() {
        System.out.println("Playing: " + this.title + " By: " + this.artist);
    }
    // GETTERS & SETTERS
    public String getTitle() {
        return title;
    }

    public void setTitle() {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist() {
        this.artist = artist;
    }

    public int getLength() {
        return length;
    }

}
