package songscloud;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileData {

    public ArrayList addAllInfo() {

        //                      *** ACCESS FILE ***
        Scanner sc = new Scanner(System.in);
        String fileLocation = System.getProperty("user.dir");
        // System.out.println("Enter file name. Example(songs.txt)");
        // String fileName = sc.nextLine();
        String filePath = fileLocation + File.separator + "songs.txt"; //To make dynamic file path
        File file = new File(filePath); //To access file of given path
        ArrayList<Song> data = new ArrayList<>();
        int index = 0;

        try {
            Scanner in = new Scanner(file);

            //Creating 25 companies object to 
            while (in.hasNext()) {

                String w = in.nextLine();
                w = w.trim().replaceAll(" +", ":");
                String[] parts = w.split("\\s");
                parts[0] = parts[0].trim().replaceAll(":", " ");
                parts[1] = parts[1].trim().replaceAll(":", " ");
                Song songs = new Song(parts[0], parts[1], parts[2], parts[3]);
                data.add(index, songs);
                index++;
            }

        } catch (FileNotFoundException ex) {
            System.out.println("File not found please check path -> " + ex);
        }
        return data;

    }
}
