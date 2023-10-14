package Practice.com.business.models;

import Practice.com.business.itf.IHangHoa;
import Practice.com.business.itf.IHoaDon;

import java.util.List;

public class HoaDon implements IHoaDon {
    private List<IHangHoa> danhSachHangHoa;

    public HoaDon(List<IHangHoa> danhSachHangHoa) {
        this.danhSachHangHoa = danhSachHangHoa;
    }

    @Override
    public double tongTien() {
        // Triển khai logic tính tổng tiền dựa trên danh sách hàng hóa trong hóa đơn.
        double tongTien = 0.0;
        for (IHangHoa hangHoa : danhSachHangHoa) {
            tongTien += hangHoa.getGia();
        }
        return tongTien;
    }
}
