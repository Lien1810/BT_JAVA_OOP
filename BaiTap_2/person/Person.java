package BaiTap_2.person;

public class Person {
    // gọi là thuộc tính
    String name;
    int age;
    String gender;
    String adress;
    String phone;

    // hàm tạo
    public Person(String name, int age, String gender, String adress, String phone) { //Ham xay dung co tham so
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.adress = adress;
        this.phone = phone;
    }

    //SD ham get
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAdress() {
        return adress;
    }

    public String getGender() {
        return gender;
    }
}
