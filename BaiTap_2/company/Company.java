package BaiTap_2.company;

import BaiTap_2.person.Person;

public class Company {
    public static void main(String[] args) {
        Person person3 = new Person("Tuấn", 24, "Nam","Hà Nội","04993896886");
        System.out.println(person3.getName());
        System.out.println(person3.getAge());
        System.out.println(person3.getGender());
    }
}
