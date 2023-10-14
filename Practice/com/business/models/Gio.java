package Practice.com.business.models;
import Practice.com.business.itf.IGio;

public class Gio implements IGio {
    private int gio;
    private int phut;

    public Gio(int gio, int phut) {
        this.gio = gio;
        this.phut = phut;
    }

    @Override
    public void hienThiGio() {
        System.out.println("Bây giờ là " + gio + " giờ " + phut + " phút");
    }
}
