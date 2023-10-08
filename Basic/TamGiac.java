package Basic;

public class TamGiac {
    private double a, b, c;

    public TamGiac(double side1, double side2, double side3) {
        a = side1;
        b = side2;
        c = side3;
    }

    public boolean KiemTraHopLe() {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public double TinhDienTich() {
        if (KiemTraHopLe()) {
            double p = (a + b + c) / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        } else {
            throw new IllegalArgumentException("Tam giac khong hop le!");
        }
    }

    public double TinhChuVi() {
        if (KiemTraHopLe()) {
            return a + b + c;
        } else {
            throw new IllegalArgumentException("Tam giac khong hop le!");
        }
    }

    public static void main(String[] args) {
        try {
            TamGiac tamGiac = new TamGiac(3.0, 4.0, 5.0);

            System.out.println("Dien tich tam giac: " + tamGiac.TinhDienTich());
            System.out.println("Chu vi tam giac: " + tamGiac.TinhChuVi());
        } catch (IllegalArgumentException e) {
            System.out.println("Loi: " + e.getMessage());
        }
    }
}
