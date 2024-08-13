package Audio;

public class RadioStation implements AudioPlayback {
    public void playFromFile(String title) {
        // System.out.println("Playing from local file.");
    }

    public void playFromWeb(String title) {
        // System.out.println("Playing from web stream.");
    }

    public void playFromStation(String title) {
        System.out.println("Playing from radio station. Title: " + title);
    }
}
