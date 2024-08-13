package SOUND_SYSTEM;

public class SoundSystem implements AudioInterface {
    AudioAdapter audioAdapter;

    public void playAudio(String mediaType, String title) {
        // Inbuilt support to play mp3 music files
        if (mediaType.equalsIgnoreCase("disk")) {
            System.out.println("Playing Disk file. Name: " + title);
        } 
        // AudioAdapter is providing support to play other file formats
        else if (mediaType.equalsIgnoreCase("live") || mediaType.equalsIgnoreCase("online")) {
            audioAdapter = new AudioAdapter(mediaType);
            audioAdapter.playAudio(mediaType, title);
        } 
        else {
            System.out.println("Invalid media. " + mediaType + " format not supported");
        }
    }
}
