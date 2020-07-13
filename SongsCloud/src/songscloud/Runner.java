package songscloud;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SongsCloud s = new SongsCloud();
        System.out.println("Enter title");
        String title = in.nextLine();
        s.addSongs();
        String r = s.searchSong(title);
        System.out.println("final" + r);
    }

}
