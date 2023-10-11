package NewVideo;

import java.util.ArrayList;
import java.util.List;

public class YouTuber {
    private String name;
    private List<Viewer> viewers = new ArrayList<>();

    public YouTuber(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addViewer(Viewer viewer) {
        viewers.add(viewer);
    }

    public void removeViewer(Viewer viewer) {
        viewers.remove(viewer);
    }

    public void postNewVideo(String videoTitle) {
        System.out.println("YouTuber " + name + " đã đăng video mới: " + videoTitle);
        notifyViewers(videoTitle);
    }

    private void notifyViewers(String videoTitle) {
        for (Viewer viewer : viewers) {
            viewer.update(videoTitle);
        }
    }
}

