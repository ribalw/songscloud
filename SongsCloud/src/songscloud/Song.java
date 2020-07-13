
package songscloud;

public class Song {
    String title;
    String artist;
    String time;
    String videoFile;

    public Song(String title, String artist, String time, String videoFile) {
        this.title = title;
        this.artist = artist;
        this.time = time;
        this.videoFile = videoFile;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getTime() {
        return time;
    }

    public String getVideoFile() {
        return videoFile;
    }

    @Override
    public String toString() {
        return "Data{" + "title=" + title + ", artist=" + artist + ", time=" + time + ", videoFile=" + videoFile + '}';
    }
}
