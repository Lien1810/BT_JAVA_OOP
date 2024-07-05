package BaiTap_2.person;

public class Person {
    // gọi là thuộc tính
    private String name;
    private int age;
    private String gender;
    private String adress;
    private String phone;

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

    protected String getPhone() {
        return phone;
    }

    protected String getAdress() {
        return adress;
    }

    public String getGender() {
        return gender;
    }

    protected void getInfo(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getGender());
        System.out.println(getAdress());
        System.out.println(getPhone());
    }
}
