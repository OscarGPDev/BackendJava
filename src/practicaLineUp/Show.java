package practicaLineUp;

public class Show {
    private String artist;
    private String scene;
    private int duration;

    public Show() {

    }

    public Show(String artist,
                String scene,
                int duration) {
        this.artist = artist;
        this.scene = scene;
        this.duration = duration;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
