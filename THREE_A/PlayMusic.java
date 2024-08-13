package Audio;

public class PlayMusic implements AudioPlayerInterface {
    PlaybackAdapter adapter;

    public void playTrack(String format, String title) {
        if (format.equalsIgnoreCase("file")) {
            System.out.println("Playing from local file. Title: " + title);
        } else if (format.equalsIgnoreCase("station") || format.equalsIgnoreCase("web")) {
            adapter = new PlaybackAdapter(format);
            adapter.playTrack(format, title);
        } else {
            System.out.println("Unsupported format: " + format);
        }
    }
}
