package BaiTap_1;

public class ThongTin {
    public static void main(String[] args) {
        // Tạo đối tượng NhanVien
        NhanVien nhanVien1 = new NhanVien("Lien Gabi", 25, "Tester");
        NhanVien nhanVien2 = new NhanVien("Tuan", 28, "Developer");
        NhanVien nhanVien3 = new NhanVien("Hoa", 27, "BA");

        // Gọi phương thức để hiển thị thông tin nhân viên
        nhanVien1.hienThiThongTin();
        nhanVien2.hienThiThongTin();
        nhanVien3.hienThiThongTin();
    }
}
