package Practice.com.business.itf;

public interface IKhachHang {
    void mua(IDichVuBanHang dichVu, IHangHoa hangHoa, int soLuong);
    void huy(IDichVuBanHang dichVu, IHangHoa hangHoa);
}
