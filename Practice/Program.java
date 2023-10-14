package Practice;

import Practice.com.business.itf.*;
import Practice.com.business.models.*;
public class Program {
    public static void main(String[] args) {
        IDichVuBanHang d = new BanLe();

        IGio g = new Gio(10,30);
        IKhachHang k = new KhachVangLai(g);
        IHangHoa h = new HangHoa(1, "Dien thoai", 100.0); // corrected the HangHoa creation
        IHangHoa h2 = new HangHoa(2, "May tinh", 200.0); // corrected the HangHoa creation

        d.themHang(h);
        d.themHang(h2);

        k.mua(d, h, 10);
        k.mua(d, h2, 10);

        k.huy(d, h);
        IHoaDon hd = d.taoHoaDon(k);

        System.out.println(hd.tongTien());
    }
}
