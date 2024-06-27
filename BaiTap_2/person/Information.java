package BaiTap_2.person;

public class Information {
    public static void main(String[] args) {
        Person person1 = new Person("Hoàng Anh", 27, "Nam","Ninh Bình","094887585");
        //Goi lai tat ca cac thong tin tu class Person
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getGender());
    }
}
