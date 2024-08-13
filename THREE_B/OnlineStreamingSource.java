package SOUND_SYSTEM;

public class OnlineStreamingSource implements AudioSource {
    @Override
    public void playSound(String title) {
        System.out.println("Playing from Online stream. Name: " + title);
    }
}
