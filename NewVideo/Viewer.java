package NewVideo;

public class Viewer {
    private String name;

    public Viewer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void update(String videoTitle) {
        System.out.println("Người xem " + name + " đã nhận thông báo: Video mới: " + videoTitle);
    }
}
