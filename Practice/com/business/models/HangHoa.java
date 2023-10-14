package Practice.com.business.models;

import Practice.com.business.itf.IHangHoa;

public class HangHoa implements IHangHoa {
    private int id;
    private String ten;
    private double gia;

    public HangHoa(int id, String ten, double gia) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getTen() {
        return ten;
    }

    @Override
    public double getGia() {
        return gia;
    }
}
