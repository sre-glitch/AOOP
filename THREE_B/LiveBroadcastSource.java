package SOUND_SYSTEM;

public class LiveBroadcastSource implements AudioSource {
    @Override
    public void playSound(String title) {
        System.out.println("Playing from Live Broadcast. Name: " + title);
    }
}
