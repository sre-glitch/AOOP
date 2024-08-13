package Audio;

public class WebStream implements AudioPlayback {
    public void playFromFile(String title) {
        //System.out.println("Playing from local file.");
    }

    public void playFromWeb(String title) {
        System.out.println("Playing from web stream. Title: " + title);
    }

    public void playFromStation(String title) {
        //System.out.println("Playing from radio station.");
    }
}
