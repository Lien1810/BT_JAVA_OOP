package BaiTap_2.person;

public class Information {
    public static void main(String[] args) {
        Person person1 = new Person("Hoàng Anh", 27, "Nam","Ninh Bình","094887585");
        Person person2 = new Person("Hùng", 28, "Nam","Hòa Bình","09488284585");

        person1.getInfo();
        System.out.println("====================================");
        person2.getInfo();
    }
}
