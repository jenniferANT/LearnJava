package Practice.com.business.models;

import Practice.com.business.itf.IDichVuBanHang;
import Practice.com.business.itf.IGio;
import Practice.com.business.itf.IHangHoa;
import Practice.com.business.itf.IKhachHang;

public class KhachVangLai implements IKhachHang {
    private IGio gio;

    public KhachVangLai(IGio gio) {
        this.gio = gio;
    }

    @Override
    public void mua(IDichVuBanHang dichVu, IHangHoa hangHoa, int soLuong) {
        // Triển khai logic để thực hiện việc mua hàng ở đây.
    }

    @Override
    public void huy(IDichVuBanHang dichVu, IHangHoa hangHoa) {
        // Triển khai logic để thực hiện việc hủy mua hàng ở đây.
    }
}
