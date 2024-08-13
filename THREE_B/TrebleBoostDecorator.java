package SOUND_SYSTEM;

public class TrebleBoostDecorator implements SoundPlayer {
    protected SoundPlayer wrappedPlayer;

    public TrebleBoostDecorator(SoundPlayer wrappedPlayer) {
        this.wrappedPlayer = wrappedPlayer;
    }

    @Override
    public void play(String title) {
        wrappedPlayer.play(title);
        applyTrebleBoost();
    }

    private void applyTrebleBoost() {
        System.out.println("Treble boost settings applied.");
    }
}
