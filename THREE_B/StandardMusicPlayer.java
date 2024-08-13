package SOUND_SYSTEM;

public class StandardMusicPlayer implements SoundPlayer {
    private PlayerBridgeInterface playerBridgeInterface;

    public StandardMusicPlayer(PlayerBridgeInterface playerBridgeInterface) {
        this.playerBridgeInterface = playerBridgeInterface;
    }

    @Override
    public void play(String title) {
        playerBridgeInterface.playSound(title);
    }
}
