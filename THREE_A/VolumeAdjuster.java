package Audio;

public class VolumeAdjuster extends PlaybackDecorator {

    public VolumeAdjuster(AudioPlayback wrappedPlayer) {
        super(wrappedPlayer);
    }

    @Override
    public void playFromFile(String title) {
        super.playFromFile(title);
        adjustVolume();
    }

    @Override
    public void playFromWeb(String title) {
        super.playFromWeb(title);
        adjustVolume();
    }

    @Override
    public void playFromStation(String title) {
        super.playFromStation(title);
        adjustVolume();
    }

    private void adjustVolume() {
        System.out.println("Volume adjusted to preferred level.");
    }
}
