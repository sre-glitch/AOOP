package sixfive;

public class Track {
    private String title;
    private String performer;

    public Track(String title, String performer) {
        this.title = title;
        this.performer = performer;
    }

    public String getTitle() {
        return title;
    }

    public String getPerformer() {
        return performer;
    }

    @Override
    public String toString() {
        return title + " by " + performer;
    }
}
