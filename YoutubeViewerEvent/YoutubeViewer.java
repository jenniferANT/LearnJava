package YoutubeViewerEvent;

import java.util.ArrayList;
import java.util.List;
public class YoutubeViewer {
    private String username;
    private List<Video> watchedVideos = new ArrayList<>();
    private List<Video> savedVideos = new ArrayList<>();

    public String getUsername() {
        return username;
    }

    public YoutubeViewer(String username) {
        this.username = username;
    }

    public void watchVideo(Video video) {
        watchedVideos.add(video);
        System.out.println(username + " watched video: " + video.getTitle());
    }

    public void saveVideo(Video video) {
        savedVideos.add(video);
        System.out.println(username + " saved video: " + video.getTitle());
    }

    public List<Video> getWatchedVideos() {
        return watchedVideos;
    }

    public List<Video> getSavedVideos() {
        return savedVideos;
    }
}
