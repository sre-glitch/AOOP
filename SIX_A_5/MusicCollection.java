package sixfive;

import java.util.LinkedList;
import java.util.List;

public class MusicCollection {
    private List<Track> tracks;

    public MusicCollection() {
        tracks = new LinkedList<>();
    }

    public void addTrack(String title, String performer) {
        tracks.add(new Track(title, performer));
    }

    public void removeTrack(String title) {
        boolean found = false;
        for (int i = 0; i < tracks.size(); i++) {
            if (tracks.get(i).getTitle().equalsIgnoreCase(title)) {
                tracks.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Track not found: " + title);
        }
    }
    public void relocateTrack(int currentPosition, int targetPosition) {
        if (currentPosition >= 1 && currentPosition <= tracks.size() &&
            targetPosition >= 1 && targetPosition <= tracks.size()) {
            Track track = tracks.remove(currentPosition - 1);
            tracks.add(targetPosition - 1, track);
        } else {
            System.out.println("Invalid track positions.");
        }
    }

    public void showTracks() {
        if (tracks.isEmpty()) {
            System.out.println("No tracks in the collection.");
        } else {
            for (int i = 0; i < tracks.size(); i++) {
                System.out.println((i + 1) + ". " + tracks.get(i));
            }
        }
    }
}
