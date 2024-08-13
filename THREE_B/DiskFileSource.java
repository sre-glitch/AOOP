package SOUND_SYSTEM;

public class DiskFileSource implements AudioSource {
    @Override
    public void playSound(String title) {
        System.out.println("Playing from Disk file. Name: " + title);
    }
}

