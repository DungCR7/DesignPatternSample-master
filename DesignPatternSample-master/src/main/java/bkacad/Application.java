package bkacad;

import bkacad.player.DefaultPlayer;
import bkacad.utils.MediaFiles;
import bkacad.player.IPlayer;
import bkacad.player.AdapterPlayer;

import java.io.File;
import java.util.Scanner;

public final class Application {
    private static Application app = null;

    // Constructor
    private Application() {}

    public static Application getInstance() {
        if (app == null) {
            app = new Application();
        }
        return app;
    }

    private IPlayer player, defaultPlayer;

    public void start() throws Exception {
        Scanner in = new Scanner(System.in);
        File[] files = MediaFiles.getMedia();

        while (true) {
            // ---MENU--- //
            System.out.println("Select the media file you want to play?");
            for (int i = 0; i < files.length; i++) {
                System.out.println((i + 1) + ". " + files[i].getName());
            }
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            // ---MENU--- //
            int option = Integer.valueOf(in.nextLine());
            // Play media
            if (option > files.length || option < 0) {
                System.out.println("Invalid data");
                continue;
            } else if (option == 0) {
                System.out.println("Exit");
                break;
            }
            String path = files[option - 1].getAbsolutePath();
            this.play(path);
        }
        in.close();
    }

    public void play(String filePath) throws Exception {

        if (filePath.endsWith("aac")) {
            /*
            if (defaultPlayer == null) {
                defaultPlayer = new DefaultPlayer();
            }
            player = defaultPlayer;
             */
        } else if (filePath.endsWith("mp3")) {
            // adapterPlayer
            // Your code
        }
        // Play media
        player.play(filePath);
    }

}
