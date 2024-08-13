package Audio;

public interface AudioPlayback {
    void playFromFile(String title);
    void playFromWeb(String title);
    void playFromStation(String title);
}
