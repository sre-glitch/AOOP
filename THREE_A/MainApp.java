package Audio;

public class MainApp {
    public static void main(String[] args) {
        AudioPlayback localPlayer = new LocalPlayer();
        AudioPlayback webPlayer = new WebStream();
        AudioPlayback radioPlayer = new RadioStation();

        // Adding Equalizer and Volume Adjuster to Local Player
        AudioPlayback decoratedLocalPlayer = new VolumeAdjuster(new Equalizer(localPlayer));
        decoratedLocalPlayer.playFromFile("solo.mp3");

        // Adding Equalizer to Web Player
        AudioPlayback decoratedWebPlayer = new Equalizer(webPlayer);
        decoratedWebPlayer.playFromWeb("expedition.mp3");

        // Adding Volume Adjuster to Radio Player
        AudioPlayback decoratedRadioPlayer = new VolumeAdjuster(radioPlayer);
        decoratedRadioPlayer.playFromStation("journey.mp3");

        // Using PlayMusic class
        PlayMusic player = new PlayMusic();
        player.playTrack("web", "expedition.mp3");
        player.playTrack("file", "solo.mp3");
        player.playTrack("station", "journey.mp3");
        player.playTrack("file", "thoughts.mp3");
    }
    }