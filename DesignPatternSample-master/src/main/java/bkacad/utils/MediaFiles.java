package bkacad.utils;

import bkacad.Main;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

/*
 * You are not allowed to modify this file
 * Author: NNT 2022
 */

public final class MediaFiles {

    // Constructor
    private MediaFiles() {
    }

    public static File[] getMedia() throws URISyntaxException {
        URL url = MediaFiles.class.getClassLoader().getResource("samples");
        File[] files = new File(url.toURI()).listFiles();
        return files;
    }


}
