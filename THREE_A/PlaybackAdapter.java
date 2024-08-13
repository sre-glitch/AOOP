package Audio;

public class PlaybackAdapter implements AudioPlayerInterface {
    AudioPlayback player;

    public PlaybackAdapter(String format) {
        if (format.equalsIgnoreCase("file")) {
            player = new LocalPlayer();
        } else if (format.equalsIgnoreCase("station")) {
            player = new RadioStation();
        } else {
            player = new WebStream();
        }
    }

    @Override
    public void playTrack(String format, String title) {
        if (format.equalsIgnoreCase("file")) {
            player.playFromFile(title);
        } else if (format.equalsIgnoreCase("station")) {
            player.playFromStation(title);
        } else {
            player.playFromWeb(title);
        }
    }
}
