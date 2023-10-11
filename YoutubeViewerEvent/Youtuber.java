package YoutubeViewerEvent;

import java.util.ArrayList;
import java.util.List;

public class Youtuber {
    private String username;
    private List<Video> uploadedVideos = new ArrayList<>();

    public void uploadVideo(Video video){
        uploadedVideos.add(video);
        System.out.println(username + "uploaded a new video: " + video.getTitle());
    }
    public List<Video>getUploadedVideos(){
        return uploadedVideos;
    }
}
