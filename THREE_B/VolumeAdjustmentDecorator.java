package SOUND_SYSTEM;

public class VolumeAdjustmentDecorator implements SoundPlayer {
    protected SoundPlayer wrappedPlayer;

    public VolumeAdjustmentDecorator(SoundPlayer wrappedPlayer) {
        this.wrappedPlayer = wrappedPlayer;
    }

    @Override
    public void play(String title) {
        wrappedPlayer.play(title);
        setVolume();
    }

    private void setVolume() {
        System.out.println("Volume set to optimal level.");}}