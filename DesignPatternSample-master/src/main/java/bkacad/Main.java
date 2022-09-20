package bkacad;

public class Main {
    /*
     * You are not allowed to modify this file
     * Author: NNT 2022
     */
    public static void main(String[] args) {
        Application app = Application.getInstance();
        try {
            app.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
