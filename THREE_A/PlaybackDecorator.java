package Audio;

public abstract class PlaybackDecorator implements AudioPlayback {
    protected AudioPlayback wrappedPlayer;

    public PlaybackDecorator(AudioPlayback wrappedPlayer) {
        this.wrappedPlayer = wrappedPlayer;
    }

    public void playFromFile(String title) {
        wrappedPlayer.playFromFile(title);
    }

    public void playFromWeb(String title) {
        wrappedPlayer.playFromWeb(title);
    }

    public void playFromStation(String title) {
        wrappedPlayer.playFromStation(title);
    }
}
