package Audio;

public class LocalPlayer implements AudioPlayback {
    public void playFromFile(String title) {
        System.out.println("Playing from local file. Title: " + title);
    }

    public void playFromWeb(String title) {
        //System.out.println("Playing from web stream.");
    }

    public void playFromStation(String title) {
        //System.out.println("Playing from radio station.");
    }
}
