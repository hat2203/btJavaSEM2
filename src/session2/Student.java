package session2;

import session1.Car;

import java.security.PublicKey;

public class Student {
    public String name;
    public String tel;
    public String address;
    public int age;
    public String[] fiends;// khai bao du lieu la mang
    public Car myCar;

    public Student() {

    }

    public Student(String name, String tel, String address, int age, Car myCar) {
        this.name = name;
        this.tel = tel;
        this.address = address;
        this.age = age;
        fiends = new String[10];// gio moi co o nho
        this.myCar = myCar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
