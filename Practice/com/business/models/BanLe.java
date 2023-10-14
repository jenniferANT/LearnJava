package Practice.com.business.models;


import Practice.com.business.itf.IDichVuBanHang;
import Practice.com.business.itf.IHangHoa;
import Practice.com.business.itf.IHoaDon;
import Practice.com.business.itf.IKhachHang;

import java.util.List;
import java.util.ArrayList;
public class BanLe implements IDichVuBanHang {
    private List<IHangHoa> danhSachHangHoa = new ArrayList<>();

    @Override
    public void themHang(IHangHoa hangHoa) {
        danhSachHangHoa.add(hangHoa);
    }

    @Override
    public void huyHang(IHangHoa hangHoa) {
        danhSachHangHoa.remove(hangHoa);
    }

    @Override
    public IHoaDon taoHoaDon(IKhachHang khachHang) {
        // Triển khai logic để tạo hóa đơn và tính tổng tiền ở đây.
        IHoaDon hoaDon = new HoaDon(danhSachHangHoa);
        return hoaDon;
    }
}
