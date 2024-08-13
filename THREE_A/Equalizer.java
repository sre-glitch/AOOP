package Audio;

public class Equalizer extends PlaybackDecorator {

    public Equalizer(AudioPlayback wrappedPlayer) {
        super(wrappedPlayer);
    }

    @Override
    public void playFromFile(String title) {
        super.playFromFile(title);
        applyEqualizer();
    }

    @Override
    public void playFromWeb(String title) {
        super.playFromWeb(title);
        applyEqualizer();
    }

    @Override
    public void playFromStation(String title) {
        super.playFromStation(title);
        applyEqualizer();
    }

    private void applyEqualizer() {
        System.out.println("Equalizer settings applied.");
    }
}
