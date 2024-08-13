package SOUND_SYSTEM;

public class PlayerBridgeInterface {
    private AudioSource audioSource;

    public PlayerBridgeInterface(AudioSource audioSource) {
        this.audioSource = audioSource;
    }

    public void playSound(String title) {
        audioSource.playSound(title);
    }
}

