package SOUND_SYSTEM;

public class AudioAdapter implements AudioInterface {
    PlayerBridgeInterface playerBridgeInterface;

    public AudioAdapter(String mediaType) {
        if (mediaType.equalsIgnoreCase("disk")) {
            playerBridgeInterface = new PlayerBridgeInterface(new DiskFileSource());
        } else if (mediaType.equalsIgnoreCase("live")) {
            playerBridgeInterface = new PlayerBridgeInterface(new LiveBroadcastSource());
        } else {
            playerBridgeInterface = new PlayerBridgeInterface(new OnlineStreamingSource());
        }
    }

    @Override
    public void playAudio(String mediaType, String title) {
        playerBridgeInterface.playSound(title);
    }
}
