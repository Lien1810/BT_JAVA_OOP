package BaiTap_1;

/*
    De bai:
- Tạo project mới làm bài tập phần Java OOP
- Tạo package để phân chia rõ ràng các bài tập cho phù hợp (tuỳ ý)
- Tạo class NhanVien và các biến, hàm cho phù hợp để lưu lại thông tin nhân viên cơ bản (họ tên, tuổi,...)
- Tạo class ThongTin để gọi lại thông tin nhân viên từ class NhanVien trên

*/
public class NhanVien {
    String name;
    int age;
    String position;

    // Ham xay dung co tham so
    public NhanVien(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    //Ham truy xuat thong tin
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }
    // Phương thức để hiển thị thông tin nhân viên
    public void hienThiThongTin() {
        System.out.println("Ten nhan vien: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Chuc vu: " + position);
    }
}
