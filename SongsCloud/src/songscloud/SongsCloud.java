package songscloud;

import java.util.ArrayList;

public class SongsCloud {

    ArrayList<Song> library;

    public void addSongs() {

        FileData file = new FileData();
        //Add songs to library. 
        library = file.addAllInfo();

    }

    public String searchSong(String title) {
        String mySong = null;
        for (Song s : library) {
            if (title.equals(s.title)) {
                System.out.println("Song " + s.artist);
                mySong = s.title;
            }
        }
        return mySong;
    }
}
