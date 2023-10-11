package YoutubeViewerEvent;

public class YoutubeApp {

    public static void main(String[] args) {
        Youtuber youtuber = new Youtuber ();
        Video video1 = new Video ("Video1 "," https://www.youtube.com");
        youtuber.uploadVideo(video1);

        YoutubeViewer viewer = new YoutubeViewer("viewer456");
        viewer.watchVideo(video1);
        viewer.saveVideo(video1);

        System.out.println(viewer.getUsername() + "s watched videos: ");
        for ( Video watchedVideo : viewer.getWatchedVideos()){
            System.out.println(" - "+ watchedVideo.getTitle());
        }

        System.out.println(viewer.getUsername() + "'saved videos ");
        for(Video savedVideo : viewer.getSavedVideos()){
            System.out.println("-" + savedVideo.getTitle());
        }
    }
}
