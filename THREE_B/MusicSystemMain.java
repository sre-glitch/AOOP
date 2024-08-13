package SOUND_SYSTEM;

public class MusicSystemMain {
    public static void main(String[] args) {
        // Using the SoundSystem with AudioAdapter (which now uses the Bridge Pattern)
        SoundSystem soundSystem = new SoundSystem();

        soundSystem.playAudio("online", "ocean waves.mp3");
        soundSystem.playAudio("disk", "serenity.mp3");
        soundSystem.playAudio("live", "festival.mp3");
        soundSystem.playAudio("disk", "calmness.mp3");

        // Demonstrating the use of decorators with the bridge
        PlayerBridgeInterface decoratedDiskPlayer = new PlayerBridgeInterface(new DiskFileSource());
        SoundPlayer decoratedWithTrebleBoost = new TrebleBoostDecorator(new StandardMusicPlayer(decoratedDiskPlayer));
        VolumeAdjustmentDecorator decoratedWithVolumeAdjustment = new VolumeAdjustmentDecorator(decoratedWithTrebleBoost);
        decoratedWithVolumeAdjustment.play("serenity.mp3");
    }
}
