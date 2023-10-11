package NewVideo;

public class YouTubeApp {
    public static void main(String[] args) {
        YouTuber youtuber = new YouTuber("Youtuber A");

        Viewer viewer1 = new Viewer("Viewer 1");
        Viewer viewer2 = new Viewer("Viewer 2");

        youtuber.addViewer(viewer1);
        youtuber.addViewer(viewer2);

        youtuber.postNewVideo("Video 1");

        youtuber.removeViewer(viewer1);

        youtuber.postNewVideo("Video 2");
    }
}
