package sixfour;

import java.util.ArrayDeque;
import java.util.Deque;

public class SiteExplorer {
	private Deque<String> backwardHistory;
    private Deque<String> forwardHistory;
    private String currentView;

    public SiteExplorer() {
        backwardHistory = new ArrayDeque<>();
        forwardHistory = new ArrayDeque<>();
        currentView = null;
    }

    public void loadPage(String url) {
        if (currentView != null) {
            backwardHistory.push(currentView);
        }
        currentView = url;
        forwardHistory.clear();
        System.out.println("Loading: " + currentView);
    }

    public void back() {
        if (!backwardHistory.isEmpty()) {
            forwardHistory.push(currentView);
            currentView = backwardHistory.pop();
            System.out.println("Back to: " + currentView);
        } else {
            System.out.println("No earlier page to return to.");
        }
    }

    public void forward() {
        if (!forwardHistory.isEmpty()) {
            backwardHistory.push(currentView);
            currentView = forwardHistory.pop();
            System.out.println("Forward to: " + currentView);
        } else {
            System.out.println("No forward page available.");
        }
    }
    public void showCurrentPage() {
        if (currentView != null) {
            System.out.println("Currently on: " + currentView);
        } else {
            System.out.println("No page loaded.");
        }
    }
}
